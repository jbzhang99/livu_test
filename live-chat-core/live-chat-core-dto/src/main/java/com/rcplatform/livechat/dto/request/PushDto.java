package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by admin on 2016/12/7.
 */
@ApiModel
public class PushDto implements Serializable{



    /**
     * 推送接收用户id
     */
    @ApiModelProperty(value = "推送接收用户id")
    @NotNull
    private Integer pushUserId;


    /**
     * 消息内容
     */

    @NotEmpty
    @ApiModelProperty(value = "消息内容")
    private String text;


    /**
     * sinch串
     */

    @NotEmpty
    @ApiModelProperty(value = "sinch串")
    private String sinch;


    public Integer getPushUserId() {
        return pushUserId;
    }

    public void setPushUserId(Integer pushUserId) {
        this.pushUserId = pushUserId;
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
        return "PushDto{" +
                "pushUserId=" + pushUserId +
                ", text='" + text + '\'' +
                ", sinch='" + sinch + '\'' +
                '}';
    }
}
