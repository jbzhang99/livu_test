package com.rcplatform.livechat.dto;

import java.io.Serializable;

/**
 * Created by Yang Peng on 2017/7/18.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public class PushMessageDto implements Serializable {

    public PushMessageDto() {
    }

    public PushMessageDto(Integer appId, Integer platformType, Integer languageId,String token) {
        this.appId = appId;
        this.platformType = platformType;
        this.languageId = languageId;
        this.token = token;
    }

    /**
     * 应用id
     */
    private Integer appId;


    /**
     * 推送token
     */
    private String token;

    /**
     * 平台类型
     */
    private Integer platformType;

    /**
     * 语言id
     */
    private Integer languageId;


    /**
     * 消息类型
     */
    private Integer type;


    /**
     * 其他数据
     */
    private Object extra;



    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PushMessageDto{");
        sb.append("appId=").append(appId);
        sb.append(", token='").append(token).append('\'');
        sb.append(", platformType=").append(platformType);
        sb.append(", languageId=").append(languageId);
        sb.append(", type=").append(type);
        sb.append(", extra=").append(extra);
        sb.append('}');
        return sb.toString();
    }
}
