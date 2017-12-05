package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by yang peng on 2016/8/1.
 */
@ApiModel
public class UserThreePartyLoginDto implements Serializable{


    @ApiModelProperty(value = "手机号")
    private String phone;
    /**
     * 用户名
     */

    @ApiModelProperty(value = "用户名",required = false)
    private String userName;
    /**
     * 应用id
     */

    @NotNull
    @ApiModelProperty(value = "应用id")
    private Integer appId;

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

    /**
     * 用户头像
     */

    @ApiModelProperty(value = "用户头像",required = false)
    private String headImg;

    /**
     * 用户性别 1 男性 2 女性
     */
    @ApiModelProperty(value = "用户性别 1 男性 2 女性")
    private Integer gender;

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
     * 设备唯一标识码
     */
    @NotNull
    @ApiModelProperty(value = "设备唯一标识码",required = true)
    private String deviceId;


    /**
     * 设备类型
     */
    @NotNull
    @ApiModelProperty(value = "设备类型",required = true)
    private Integer deviceType;


    /**
     * 设备名称
     */
    @NotNull
    @ApiModelProperty(value = "设备名称",required = true)
    private String deviceName;

    /**
     * 语言名称，多个名称用，分割
     */
    @NotNull
    @ApiModelProperty(value = "语言名称，多个名称用，分割",required = true)
    private String languageId;


    /**
     * 语言名称
     */
    @NotNull
    @ApiModelProperty(value = "语言名称",required = true)
    private String languageName;


    /**
     * 用户出生日期
     */
    @ApiModelProperty(value = "用户出生日期")
    private Date birthday;


    /**
     * 平台类型
     */
    @NotNull
    @ApiModelProperty(value = "平台类型",required = true)
    private Integer platformType;

    /**
     * 屏幕大小
     */
    @NotNull
    @ApiModelProperty(value = "屏幕大小",required = true)
    private String screenSize;

    /**
     * 系统版本
     */

    @NotNull
    @ApiModelProperty(value = "系统版本",required = true)
    private String systemVersion;



    /**
     * 设备发送push的token
     */
    @ApiModelProperty(value = "设备发送push的token")
    private String pushToken;




    @ApiModelProperty(value = "第三方邮箱")
    private String threePartyEmail;



    @ApiModelProperty(value = "第三方用户id")
    @NotNull
    private String threePartyId;


    @ApiModelProperty(value = "时区")
    private Integer timeZone;



    @ApiModelProperty(value = "账号类型 2.facebook 3.谷歌+ 4.Twitter 5.VK 6.手机号",required = true)
    private Integer type;


    @ApiModelProperty(value = "facebook 同组用户id(与用户第三方id参数，两个参数必须存在，如提交该属性，服务端则忽略第三方id)")
    private List<GroupUserDto> facebookGroupUsers;

    @ApiModelProperty(value = "被邀请码")
    private String invitationCode;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
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

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
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

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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



    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getThreePartyEmail() {
        return threePartyEmail;
    }

    public void setThreePartyEmail(String threePartyEmail) {
        this.threePartyEmail = threePartyEmail;
    }

    public String getThreePartyId() {
        return threePartyId;
    }

    public void setThreePartyId(String threePartyId) {
        this.threePartyId = threePartyId;
    }

    public Integer getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(Integer timeZone) {
        this.timeZone = timeZone;
    }


    public List<GroupUserDto> getFacebookGroupUsers() {
        return facebookGroupUsers;
    }

    public void setFacebookGroupUsers(List<GroupUserDto> facebookGroupUsers) {
        this.facebookGroupUsers = facebookGroupUsers;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserThreePartyLoginDto{");
        sb.append("phone='").append(phone).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", appId=").append(appId);
        sb.append(", latitude='").append(latitude).append('\'');
        sb.append(", longitude='").append(longitude).append('\'');
        sb.append(", headImg='").append(headImg).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", countryId=").append(countryId);
        sb.append(", countryName='").append(countryName).append('\'');
        sb.append(", deviceId='").append(deviceId).append('\'');
        sb.append(", deviceType=").append(deviceType);
        sb.append(", deviceName='").append(deviceName).append('\'');
        sb.append(", languageId='").append(languageId).append('\'');
        sb.append(", languageName='").append(languageName).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", platformType=").append(platformType);
        sb.append(", screenSize='").append(screenSize).append('\'');
        sb.append(", systemVersion='").append(systemVersion).append('\'');
        sb.append(", pushToken='").append(pushToken).append('\'');
        sb.append(", threePartyEmail='").append(threePartyEmail).append('\'');
        sb.append(", threePartyId='").append(threePartyId).append('\'');
        sb.append(", timeZone=").append(timeZone);
        sb.append(", type=").append(type);
        sb.append(", facebookGroupUsers=").append(facebookGroupUsers);
        sb.append(", invitationCode='").append(invitationCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
