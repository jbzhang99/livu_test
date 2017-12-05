package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by admin on 2016/12/7.
 */
@ApiModel
public class PushResp implements Serializable{


    /**
     * 用户id
     */
    @ApiModelProperty("用户id")
    private Integer userId;


    /**
     * 推送接收用户id
     */
    @ApiModelProperty("推送接收用户id")
    private Integer pushUserId;


    /**
     * 推送结果
     */
    @ApiModelProperty("推送结果")
    private Boolean result;


    /**
     * 消息内容
     */
    @ApiModelProperty("消息内容")
    private String text;


    /**
     * sinch串
     */
    @ApiModelProperty("sinch串")
    private String sinch;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPushUserId() {
        return pushUserId;
    }

    public void setPushUserId(Integer pushUserId) {
        this.pushUserId = pushUserId;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSinch() {
        return sinch;
    }

    public void setSinch(String sinch) {
        this.sinch = sinch;
    }


    @Override
    public String toString() {
        return "PushResp{" +
                "userId=" + userId +
                ", pushUserId=" + pushUserId +
                ", result=" + result +
                ", text='" + text + '\'' +
                ", sinch='" + sinch + '\'' +
                '}';
    }
}
