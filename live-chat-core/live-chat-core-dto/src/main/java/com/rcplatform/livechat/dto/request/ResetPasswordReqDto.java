package com.rcplatform.livechat.dto.request;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by yang peng on 2016/9/21.
 */

public class ResetPasswordReqDto implements Serializable{

    public ResetPasswordReqDto() {
    }

    public ResetPasswordReqDto(String sid, String userAccount, Integer appId, String password) {
        this.sid = sid;
        this.userAccount = userAccount;
        this.appId = appId;
        this.password = password;
    }


    @NotNull
    private  String sid;


    @NotNull
    private  String userAccount;


    @NotNull
    private  Integer appId;


    @NotNull
    private String password;


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResetPasswordReqDto{");
        sb.append("sid='").append(sid).append('\'');
        sb.append(", userAccount='").append(userAccount).append('\'');
        sb.append(", appId=").append(appId);
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
