package com.rcplatform.livechat.dto.request;

import javax.validation.constraints.NotNull;

/**
 * Created by yang peng on 2016/8/5.
 */

public class MatchCheckReqDto {


    @NotNull
    private Integer appId;


    @NotNull
    private Integer chatPage;


    @NotNull
    private Integer matchId;


    @NotNull
    private Integer userId;

    /**
     * 设备id
     */

    private String deviceId;


    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getChatPage() {
        return chatPage;
    }

    public void setChatPage(Integer chatPage) {
        this.chatPage = chatPage;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MatchCheckReqDto{");
        sb.append("appId=").append(appId);
        sb.append(", chatPage=").append(chatPage);
        sb.append(", matchId=").append(matchId);
        sb.append(", userId=").append(userId);
        sb.append(", deviceId='").append(deviceId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
