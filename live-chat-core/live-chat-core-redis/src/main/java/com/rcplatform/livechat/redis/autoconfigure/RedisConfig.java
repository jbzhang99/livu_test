package com.rcplatform.livechat.redis.autoconfigure;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by yang peng on 2016/11/8.
 */
@Configuration
@ImportResource(locations={"classpath:applicationContext-redis.xml"})
public class RedisConfig extends CachingConfigurerSupport {





}
