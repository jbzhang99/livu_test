package com.rcplatform.livechat.dto.response.admin;

/**
 * Created by yang peng on 2016/11/8.
 */
public class PushUserDto {


    private Integer userId;


    private String pushToken;


    private String languageId;

    private Integer pages;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }


    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "PushUserDto{" +
                "userId=" + userId +
                ", pushToken='" + pushToken + '\'' +
                ", languageId='" + languageId + '\'' +
                ", pages=" + pages +
                '}';
    }
}
