package com.rcplatform.livechat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yang Peng on 2017/6/14.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */

@Configuration
public class DataBaseConfiguration {


    @Value("${spring.datasource.type}")
    private Class<? extends DataSource> dataSourceType;


    private Log log = LogFactory.getLog(DataBaseConfiguration.class);

    @Bean(name="writeDataSource", destroyMethod = "close", initMethod="init")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource writeDataSource() {
        log.info("-------------------- writeDataSource init ---------------------");

        return DataSourceBuilder.create().type(dataSourceType).build();
    }

    /**
     * 有多少个从库就要配置多少个
     * @return
     */
    @Bean(name = "readDataSource1",destroyMethod = "close", initMethod="init")
    @ConfigurationProperties(prefix = "spring.datasource1")
    public DataSource readDataSourceOne(){
        log.info("-------------------- readDataSourceOne init ---------------------");
        return DataSourceBuilder.create().type(dataSourceType).build();
    }


    @Bean(name = "readDataSource2",destroyMethod = "close", initMethod="init")
    @ConfigurationProperties(prefix = "spring.datasource2")
    public DataSource readDataSourceTwo() {
        log.info("-------------------- readDataSourceTwo init ---------------------");
        return DataSourceBuilder.create().type(dataSourceType).build();
    }


    @Bean("readDataSources")
    public List<DataSource> readDataSources(){
        List<DataSource> dataSources=new ArrayList<>();
        dataSources.add(readDataSourceOne());
        dataSources.add(readDataSourceTwo());
        return dataSources;
    }



}
