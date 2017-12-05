package com.rcplatform.livechat;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yang Peng on 2017/6/14.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@Configuration
@ConditionalOnClass({EnableTransactionManagement.class})
@Import({DataBaseConfiguration.class})
@MapperScan(basePackages = {"com.rcplatform.livechat.mapper"})
public class MybatisConfiguration {

    @Value("${spring.datasource.type}")
    private Class<? extends DataSource> dataSourceType;


    @Resource(name = "writeDataSource")
    private DataSource dataSource;

    @Resource(name = "readDataSources")
    private List<DataSource> readDataSources;


    @Bean
    @ConditionalOnMissingBean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(roundRobinDataSourceProxy());
        bean.setTypeAliasesPackage("com.rcplatform.videochat.model");
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        bean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
        bean.setConfigLocation(resolver.getResource("classpath:mybatis-config.xml"));
        bean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return bean.getObject();
    }

    /**
     * 有多少个数据源就要配置多少个bean
     *
     * @return
     */
    @Bean
    public AbstractRoutingDataSource roundRobinDataSourceProxy() {
        MyAbstractRoutingDataSource proxy = new MyAbstractRoutingDataSource();
        Map<Object, Object> targetDataSources = new HashMap<Object, Object>();
        // 写
        targetDataSources.put(DataSourceType.write.getType(), dataSource);
        //多个读数据库时
        for (int i = 0; i < 2; i++) {
            targetDataSources.put(i, readDataSources.get(i));
        }
        proxy.setDefaultTargetDataSource(dataSource);
        proxy.setTargetDataSources(targetDataSources);
        return proxy;
    }
}
