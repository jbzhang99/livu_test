package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Yang Peng on 2017/5/5.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@ApiModel
public class UserVerifyInfoResp implements Serializable{


    public UserVerifyInfoResp() {
        this.faceBook = false;
        this.google = false;
        this.twitter = false;
        this.vk = false;
    }

    @ApiModelProperty(value = "true 为已认证,false 为未认证")
    private boolean faceBook;


    @ApiModelProperty(value = "true 为已认证,false 为未认证")
    private boolean google;


    @ApiModelProperty(value = "true 为已认证,false 为未认证")
    private boolean twitter;


    @ApiModelProperty(value = "true 为已认证,false 为未认证")
    private boolean vk;


    public boolean isFaceBook() {
        return faceBook;
    }

    public void setFaceBook(boolean faceBook) {
        this.faceBook = faceBook;
    }

    public boolean isGoogle() {
        return google;
    }

    public void setGoogle(boolean google) {
        this.google = google;
    }

    public boolean isTwitter() {
        return twitter;
    }

    public void setTwitter(boolean twitter) {
        this.twitter = twitter;
    }

    public boolean isVk() {
        return vk;
    }

    public void setVk(boolean vk) {
        this.vk = vk;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserVerifyInfoResp{");
        sb.append("faceBook=").append(faceBook);
        sb.append(", google=").append(google);
        sb.append(", twitter=").append(twitter);
        sb.append(", vk=").append(vk);
        sb.append('}');
        return sb.toString();
    }
}
