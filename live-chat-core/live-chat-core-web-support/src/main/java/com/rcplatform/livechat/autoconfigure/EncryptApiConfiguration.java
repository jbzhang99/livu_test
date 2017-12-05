package com.rcplatform.livechat.autoconfigure;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.rcplatform.livechat.encrypt.EncryptHttpMessageConverter;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * Created by admin on 2017/2/16.
 */
@Profile({"prod","encrypt","foreign","encrypt1","encrypt2"})
@Configuration
public class EncryptApiConfiguration {

    @Bean
    public HttpMessageConverters messageConverters() {
        EncryptHttpMessageConverter encryptHttpMessageConverter = new EncryptHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        encryptHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        return new HttpMessageConverters((HttpMessageConverter<?>) encryptHttpMessageConverter);
    }
}
