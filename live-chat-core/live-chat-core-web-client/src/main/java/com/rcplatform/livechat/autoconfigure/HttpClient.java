package com.rcplatform.livechat.autoconfigure;

import com.rcplatform.livechat.controller.*;
import com.rcplatform.livechat.http.Http;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;

/**
 * Created by admin on 2017/4/25.
 */
@Configuration
@EnableConfigurationProperties(HttpProperties.class)
public class HttpClient {


    private final HttpProperties httpProperties;


    public HttpClient(HttpProperties httpProperties) {
        this.httpProperties = httpProperties;
    }


    @Bean
    @ConditionalOnMissingBean
    public Retrofit retrofit(){
        return new Http(httpProperties.getBaseUrl(),httpProperties.getIfProd(),httpProperties.getDeviceId(),
                httpProperties.getUserId(),httpProperties.getNonce(),httpProperties.getAccessToken()).getRetrofit();
    }


    @Bean
    @ConditionalOnMissingBean
    public AdSwitchApi adSwitchApi(){
        return retrofit().create(AdSwitchApi.class);
    }

    @Bean
    @ConditionalOnMissingBean
    public AppConfigApi appConfigApi(){
        return retrofit().create(AppConfigApi.class);
    }


    @Bean
    @ConditionalOnMissingBean
    public BlackListApi blackListApi(){
        return retrofit().create(BlackListApi.class);
    }


    @Bean
    @ConditionalOnMissingBean
    public CommodityApi commodityApi(){
        return retrofit().create(CommodityApi.class);
    }


    @Bean
    @ConditionalOnMissingBean
    public ConsumeApi consumeApi(){
        return retrofit().create(ConsumeApi.class);
    }

    @Bean
    @ConditionalOnMissingBean
    public ExchangeCommodityApi exchangeCommodityApi(){
        return retrofit().create(ExchangeCommodityApi.class);
    }

    @Bean
    @ConditionalOnMissingBean
    public ExchangeOrderApi exchangeOrderApi(){
        return retrofit().create(ExchangeOrderApi.class);
    }

    @Bean
    @ConditionalOnMissingBean
    public OperationApi operationApi(){
        return retrofit().create(OperationApi.class);
    }

    @Bean
    @ConditionalOnMissingBean
    public PushApi pushApi(){
        return retrofit().create(PushApi.class);
    }

    @Bean
    @ConditionalOnMissingBean
    public UserApi userApi(){
        return  retrofit().create(UserApi.class);
    }


    @Bean
    @ConditionalOnMissingBean
    public UserFriendApi userFriendApi(){
        return retrofit().create(UserFriendApi.class);
    }

    @Bean
    @ConditionalOnMissingBean
    public UserGiftApi userGiftApi(){
        return retrofit().create(UserGiftApi.class);
    }

    @Bean
    @ConditionalOnMissingBean
    public UserMatchedApi userMatchedApi(){
        return retrofit().create(UserMatchedApi.class);
    }

    @Bean
    @ConditionalOnMissingBean
    public UserReportApi userReportApi(){
        return retrofit().create(UserReportApi.class);
    }

    @Bean
    @ConditionalOnMissingBean
    public VideoApi videoApi(){
        return retrofit().create(VideoApi.class);
    }


    @Bean
    @ConditionalOnMissingBean
    public WebPaymentApi webPaymentApi(){return retrofit().create(WebPaymentApi.class);}

    @Bean
    @ConditionalOnMissingBean
    public PromotionApi promotionApi(){return retrofit().create(PromotionApi.class);}

    @Bean
    @ConditionalOnMissingBean
    public PraiseGiftApi praiseGiftApi(){
        return   retrofit().create(PraiseGiftApi.class);
    }
}
