package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by yang peng on 2016/8/8.
 */
@ApiModel
public class UserModifyReqDto implements Serializable {


    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String userName;



    /**
     * 用户所在国家id
     */
    @ApiModelProperty(value = "用户所在国家id")
    private Integer countryId;

    /**
     * 国家名称
     */

    @ApiModelProperty(value = "国家名称")
    private String countryName;


    /**
     * 用户出生日期
     */
    @ApiModelProperty(value = "用户出生日期")
    private Date birthday;


    /**
     * 语言名称
     */
    @ApiModelProperty(value = "语言名称")
    private List<UserLanguageDto> language;


    /**
     * 设备id
     */
    @ApiModelProperty(value = "设备id")
    private String deviceId;




    @ApiModelProperty(value = "推送token")
    private String pushToken;


    @ApiModelProperty(value = "头像")
    private String headImg;



    @ApiModelProperty(value = "背景")
    private String background;


    @ApiModelProperty(value = "个人简介")
    private String  introduce;


    @ApiModelProperty(value = "推送开关 0 打开 1 关闭")
    private Integer pushSwitch;


    @ApiModelProperty(value = "视频消息开关 0 打开 1 关闭")
    private  Integer videoMessageSwitch;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<UserLanguageDto> getLanguage() {
        return language;
    }

    public void setLanguage(List<UserLanguageDto> language) {
        this.language = language;
    }



    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }


    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }


    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }


    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }


    public Integer getPushSwitch() {
        return pushSwitch;
    }

    public void setPushSwitch(Integer pushSwitch) {
        this.pushSwitch = pushSwitch;
    }

    public Integer getVideoMessageSwitch() {
        return videoMessageSwitch;
    }

    public void setVideoMessageSwitch(Integer videoMessageSwitch) {
        this.videoMessageSwitch = videoMessageSwitch;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserModifyReqDto{");
        sb.append("userName='").append(userName).append('\'');
        sb.append(", countryId=").append(countryId);
        sb.append(", countryName='").append(countryName).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", language=").append(language);
        sb.append(", deviceId='").append(deviceId).append('\'');
        sb.append(", pushToken='").append(pushToken).append('\'');
        sb.append(", headImg='").append(headImg).append('\'');
        sb.append(", background='").append(background).append('\'');
        sb.append(", introduce='").append(introduce).append('\'');
        sb.append(", pushSwitch=").append(pushSwitch);
        sb.append(", videoMessageSwitch=").append(videoMessageSwitch);
        sb.append('}');
        return sb.toString();
    }
}
