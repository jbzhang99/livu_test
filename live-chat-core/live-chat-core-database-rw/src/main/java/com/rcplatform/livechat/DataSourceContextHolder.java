package com.rcplatform.livechat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by Yang Peng on 2017/6/14.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public class DataSourceContextHolder {

    private static Log log = LogFactory.getLog(DataSourceContextHolder.class);

    private static final ThreadLocal<String> local = new ThreadLocal<String>();

    public static ThreadLocal<String> getLocal() {
        return local;
    }

    /**
     * 读可能是多个库
     */
    public static void read() {
        local.set(DataSourceType.read.getType());
    }

    /**
     * 写只有一个库
     */
    public static void write() {
        log.info("getWrite");
        local.set(DataSourceType.write.getType());
    }

    public static String getJdbcType() {
        return local.get();
    }
}
