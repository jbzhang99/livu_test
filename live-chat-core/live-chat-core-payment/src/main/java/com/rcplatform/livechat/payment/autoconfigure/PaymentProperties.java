package com.rcplatform.livechat.payment.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Yang Peng on 2017/5/11.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@ConfigurationProperties(prefix = PaymentProperties.PAYMENT)
public class PaymentProperties {


    static final String PAYMENT = "payment";


    private String appStorePassword;


    private String appStoreUrl;


    private String appStoreSandboxUrl;


    private String googlePlayUrl;


    public String getAppStorePassword() {
        return appStorePassword;
    }

    public void setAppStorePassword(String appStorePassword) {
        this.appStorePassword = appStorePassword;
    }

    public String getAppStoreUrl() {
        return appStoreUrl;
    }

    public void setAppStoreUrl(String appStoreUrl) {
        this.appStoreUrl = appStoreUrl;
    }

    public String getGooglePlayUrl() {
        return googlePlayUrl;
    }

    public void setGooglePlayUrl(String googlePlayUrl) {
        this.googlePlayUrl = googlePlayUrl;
    }

    public String getAppStoreSandboxUrl() {
        return appStoreSandboxUrl;
    }

    public void setAppStoreSandboxUrl(String appStoreSandboxUrl) {
        this.appStoreSandboxUrl = appStoreSandboxUrl;
    }
}


