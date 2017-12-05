package com.rcplatform.videochat.model;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaoyuan on 2017/6/21.
 */
@Table(name = "rc_new_push_test")
public class NPush implements Serializable{

    public NPush() {
    }

    public NPush(Date createTime) {
        this.createTime = createTime;
    }

    @Id
    private Integer id;

    private Integer userStatus;

    private Integer appId;

    private Integer gender;

    private Integer minStone;

    private Integer platformType;

    private String description;

    private String pushInfo;

    private String iosPage;

    private String androidPage;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPushInfo() {
        return pushInfo;
    }

    public void setPushInfo(String pushInfo) {
        this.pushInfo = pushInfo;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NPush{");
        sb.append("id=").append(id);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", appId=").append(appId);
        sb.append(", gender=").append(gender);
        sb.append(", minStone=").append(minStone);
        sb.append(", platformType=").append(platformType);
        sb.append(", description='").append(description).append('\'');
        sb.append(", pushInfo='").append(pushInfo).append('\'');
        sb.append(", iosPage='").append(iosPage).append('\'');
        sb.append(", androidPage='").append(androidPage).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
