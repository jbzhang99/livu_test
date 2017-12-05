package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by yaoyuan on 2017/8/22.
 */
@ApiModel
public class ActivityUserDto implements Serializable {

    public ActivityUserDto() {
    }

    @ApiModelProperty(value = "顺序")
    private Integer orderId;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "头像")
    private String headImg;

    @ApiModelProperty(value = "国家名字")
    private String countryName;

    @ApiModelProperty(value = "用户名字")
    private String userName;

    @ApiModelProperty(value = "笑脸数量")
    private Integer smileCount;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSmileCount() {
        return smileCount;
    }

    public void setSmileCount(Integer smileCount) {
        this.smileCount = smileCount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ActivityUserResponseDto{");
        sb.append("orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", headImg='").append(headImg).append('\'');
        sb.append(", countryName='").append(countryName).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", smileCount=").append(smileCount);
        sb.append('}');
        return sb.toString();
    }
}
