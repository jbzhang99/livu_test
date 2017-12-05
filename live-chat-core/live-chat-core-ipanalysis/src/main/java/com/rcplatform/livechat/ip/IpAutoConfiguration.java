package com.rcplatform.livechat.ip;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by apple on 2017/6/18.
 */
@Configuration
@ConfigurationProperties(prefix = "ip")
public class IpAutoConfiguration {


    private String path;


    @Bean
    public IpAnalysis ipAnalysis(){
        return new IpAnalysis(path);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
