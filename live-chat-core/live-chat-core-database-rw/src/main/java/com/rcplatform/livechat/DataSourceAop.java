package com.rcplatform.livechat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Yang Peng on 2017/6/14.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@Aspect
@Component
public class DataSourceAop {

    private Log log = LogFactory.getLog(DataSourceAop.class);

    @Before("execution(* com.rcplatform.livechat.mapper..*.select*(..)) || execution(* com.rcplatform.livechat.mapper..*.get*(..))")
    public void setReadDataSourceType() {
        DataSourceContextHolder.read();
        log.info("dataSource切换到：Read");
    }

    @Before("execution(* com.rcplatform.livechat.mapper..*.insert*(..)) || execution(* com.rcplatform.livechat.mapper..*.update*(..)) || " +
            " execution(* com.rcplatform.livechat.mapper..*.delete*(..))")
    public void setWriteDataSourceType() {
        DataSourceContextHolder.write();
        log.info("dataSource切换到：write");
    }
}