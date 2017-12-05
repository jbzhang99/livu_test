package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by yang peng on 2016/8/1.
 */
@ApiModel
public class UserEmailLoginDto implements Serializable {

    @ApiModelProperty(value = "应用id")
    private String appId;
    /**
     * 用户账号
     */

    @NotNull
    @ApiModelProperty(value = "用户账号")
    private String userAccount;


    /**
     * 用户密码
     */

    @NotNull
    @ApiModelProperty(value = "用户密码，rsa加密")
    private String password;



    /**
     * 设备唯一标识码
     */
    @NotNull
    @ApiModelProperty(value = "设备唯一标识码")
    private String deviceId;




    @NotNull
    @ApiModelProperty(value = "设备类型")
    private Integer deviceType;

    /**
     * 设备名称
     */

    @NotNull
    @ApiModelProperty(value = "用户账号")
    private String deviceName;

    /**
     * 平台类型
     */
    @NotNull
    @ApiModelProperty(value = "平台类型")
    private Integer platformType;

    /**
     * 屏幕大小
     */
    @NotNull
    @ApiModelProperty(value = "屏幕大小")
    private String screenSize;

    /**
     * 系统版本
     */
    @NotNull
    @ApiModelProperty(value = "系统版本")
    private String systemVersion;


    /**
     * 纬度
     */
    @ApiModelProperty(value = "纬度")
    private String latitude;

    /**
     * 经度
     */
    @ApiModelProperty(value = "经度")
    private String longitude;



    @ApiModelProperty(value = "语言id")
    private String languageId;



    @ApiModelProperty(value = "时区")
    private Integer timeZone;



    /**
     * 设备发送push的token
     */
    @ApiModelProperty(value = "设备发送push的token")
    private String pushToken;



    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }


    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(Integer timeZone) {
        this.timeZone = timeZone;
    }


    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    @Override
    public String toString() {
        return "UserEmailLoginDto{" +
                "appId='" + appId + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", password='" + password + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceType=" + deviceType +
                ", deviceName='" + deviceName + '\'' +
                ", platformType=" + platformType +
                ", screenSize='" + screenSize + '\'' +
                ", systemVersion='" + systemVersion + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", languageId='" + languageId + '\'' +
                ", timeZone=" + timeZone +
                '}';
    }
}
