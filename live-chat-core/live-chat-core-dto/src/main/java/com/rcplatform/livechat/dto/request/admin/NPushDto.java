package com.rcplatform.livechat.dto.request.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by yaoyuan on 2017/6/21.
 */
public class NPushDto implements Serializable {

    public NPushDto() {
    }

    private Integer appId;

    private String countryIds;

    private Integer userStatus;

    private Integer gender;

    private Integer minStone;

    private Integer platformType;

    private String description;

    private List pushLanguages;

    private String iosPage;

    private String androidPage;

    private Date pushStartTime;

    private Date pushEndTime;


    public String getCountryIds() {
        return countryIds;
    }

    public void setCountryIds(String countryIds) {
        this.countryIds = countryIds;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getMinStone() {
        return minStone;
    }

    public void setMinStone(Integer minStone) {
        this.minStone = minStone;
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List getPushLanguages() {
        return pushLanguages;
    }

    public void setPushLanguages(List pushLanguages) {
        this.pushLanguages = pushLanguages;
    }

    public String getIosPage() {
        return iosPage;
    }

    public void setIosPage(String iosPage) {
        this.iosPage = iosPage;
    }

    public String getAndroidPage() {
        return androidPage;
    }

    public void setAndroidPage(String androidPage) {
        this.androidPage = androidPage;
    }

    public Date getPushStartTime() {
        return pushStartTime;
    }

    public void setPushStartTime(Date pushStartTime) {
        this.pushStartTime = pushStartTime;
    }

    public Date getPushEndTime() {
        return pushEndTime;
    }

    public void setPushEndTime(Date pushEndTime) {
        this.pushEndTime = pushEndTime;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NPushDto{");
        sb.append("appId=").append(appId);
        sb.append(", countryIds='").append(countryIds).append('\'');
        sb.append(", userStatus=").append(userStatus);
        sb.append(", gender=").append(gender);
        sb.append(", minStone=").append(minStone);
        sb.append(", platformType=").append(platformType);
        sb.append(", description='").append(description).append('\'');
        sb.append(", pushLanguages=").append(pushLanguages);
        sb.append(", iosPage='").append(iosPage).append('\'');
        sb.append(", androidPage='").append(androidPage).append('\'');
        sb.append(", pushStartTime=").append(pushStartTime);
        sb.append(", pushEndTime=").append(pushEndTime);
        sb.append('}');
        return sb.toString();
    }
}
