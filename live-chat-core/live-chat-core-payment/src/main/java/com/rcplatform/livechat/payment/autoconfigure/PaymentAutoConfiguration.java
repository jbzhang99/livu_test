package com.rcplatform.livechat.payment.autoconfigure;

import com.rcplatform.livechat.payment.service.AppStorePaymentService;
import com.rcplatform.livechat.payment.service.GooglePlayPaymentService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by Yang Peng on 2017/5/10.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@Configuration
@EnableConfigurationProperties(PaymentProperties.class)
public class PaymentAutoConfiguration {


    private PaymentProperties paymentProperties;


    public PaymentAutoConfiguration(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }


    @Bean
    @Primary
    public AppStorePaymentService appStorePaymentService() {
        return new AppStorePaymentService(paymentProperties.getAppStorePassword(), paymentProperties.getAppStoreUrl());
    }


    @Bean
    @ConditionalOnMissingBean
    public GooglePlayPaymentService googlePlayPaymentService() {
        return new GooglePlayPaymentService(paymentProperties.getGooglePlayUrl());
    }


    @Bean
    public AppStorePaymentService appStoreSandboxPaymentService() {
        return new AppStorePaymentService(paymentProperties.getAppStorePassword(), paymentProperties.getAppStoreSandboxUrl());
    }

}
