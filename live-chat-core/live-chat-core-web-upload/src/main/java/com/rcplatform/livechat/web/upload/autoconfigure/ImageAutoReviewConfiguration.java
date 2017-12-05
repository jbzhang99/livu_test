package com.rcplatform.livechat.web.upload.autoconfigure;

import com.rcplatform.livechat.web.upload.ImageAutoReview;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by admin on 2017/4/27.
 */
@Configuration
@ConfigurationProperties(prefix = ImageAutoReviewConfiguration.IMAGE_AUTO_REVIEW)
public class ImageAutoReviewConfiguration {

    public static  final String IMAGE_AUTO_REVIEW = "image-auto-review";


    private String apiUrl;

    private String secretId ;

    private String privateKey;


    @Bean
    @ConditionalOnMissingBean
    public ImageAutoReview imageAutoReview(){
        return new ImageAutoReview(apiUrl,secretId,privateKey);
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
}
