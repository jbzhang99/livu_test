package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@ApiModel
public class UserPraiseDto implements Serializable {


    @ApiModelProperty(value = "点赞用户id")
    @NotNull
    private Integer praiseUserId;


    @ApiModelProperty(value = "随机值")
    @NotNull
    private String nonce;


    @ApiModelProperty(value = "随机密钥 随机密钥算法：客户端生成的随机值nonce+loginToken MD5加密")
    @NotNull
    private String key;


    @ApiModelProperty(hidden = true)
    private Integer userId;


    @ApiModelProperty(hidden = true)
    private Integer appId;



    public Integer getPraiseUserId() {
        return praiseUserId;
    }

    public void setPraiseUserId(Integer praiseUserId) {
        this.praiseUserId = praiseUserId;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserPraiseDto{");
        sb.append("praiseUserId=").append(praiseUserId);
        sb.append(", nonce='").append(nonce).append('\'');
        sb.append(", key='").append(key).append('\'');
        sb.append(", userId=").append(userId);
        sb.append(", appId=").append(appId);
        sb.append('}');
        return sb.toString();
    }
}
