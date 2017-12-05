package com.rcplatform.livechat.dto.response;

import com.rcplatform.videochat.model.UserGift;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by admin on 2017/2/13.
 */
@ApiModel
public class UserGiftResp extends UserGift{


    @ApiModelProperty(value = "用户头像")
    private String headImg;


    @ApiModelProperty(value = "用户头像")
    private String userName;


    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserGiftResp{");
        sb.append("headImg='").append(headImg).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
