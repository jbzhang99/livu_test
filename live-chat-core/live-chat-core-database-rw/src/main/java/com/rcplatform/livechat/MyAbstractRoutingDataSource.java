package com.rcplatform.livechat;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by Yang Peng on 2017/6/14.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public class MyAbstractRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        String typeKey = DataSourceContextHolder.getJdbcType();
        if (typeKey.equals(DataSourceType.write.getType())){
            return DataSourceType.write.getType();
        }
        // 读 简单负载均衡
        return   (int)(Math.random() * 2);
    }
}
