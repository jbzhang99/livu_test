package com.rcplatform.livechat.dto.request;

/**
 * Created by admin on 2017/4/20.
 */

public class DelImageDto {

    public DelImageDto() {
    }

    public DelImageDto(String imageUrl, String token) {
        this.imageUrl = imageUrl;
        this.token = token;
    }

    private String imageUrl;


    private String token;


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DelImageDto{");
        sb.append("imageUrl='").append(imageUrl).append('\'');
        sb.append(", token='").append(token).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
