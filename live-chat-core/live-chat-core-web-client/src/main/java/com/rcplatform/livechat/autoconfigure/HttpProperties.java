package com.rcplatform.livechat.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by admin on 2017/4/25.
 */
@ConfigurationProperties(prefix = HttpProperties.HTTP_PREFIX)
public class HttpProperties {


    public static final String HTTP_PREFIX = "retrofit";


    private String baseUrl;


    private Boolean ifProd;


    private String deviceId;


    private String userId;


    private String nonce;


    private String accessToken;


    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Boolean getIfProd() {
        return ifProd;
    }

    public void setIfProd(Boolean ifProd) {
        this.ifProd = ifProd;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
