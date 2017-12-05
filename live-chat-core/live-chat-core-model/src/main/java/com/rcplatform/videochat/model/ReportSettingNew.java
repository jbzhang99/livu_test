package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by yaoyuan on 2017/7/3.
 */
@Table(name = "rc_report_setting_new")
@ApiModel
public class ReportSettingNew {


    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value = "主键")
    private Integer id;

    private Integer gender;

    @Column(name = "location")
    private Integer location;

    @Column(name = "version")
    private String version;

    @Column(name = "switch")
    private Integer reportSwitch;

    @Column(name = "report_reason")
    private Integer reportReason;

    @Column(name = "detail")
    private String detail;

    @Column(name = "app_id")
    private Integer appId;

    @Column(name = "create_time")
    private Date createTime;


    @Column(name = "user_type")
    private Integer userType;

    /**
     * 用户级别id
     */
    @Column(name = "user_level_id")
    private Integer userLevelId;

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getReportSwitch() {
        return reportSwitch;
    }

    public void setReportSwitch(Integer reportSwitch) {
        this.reportSwitch = reportSwitch;
    }

    public Integer getReportReason() {
        return reportReason;
    }

    public void setReportReason(Integer reportReason) {
        this.reportReason = reportReason;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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


    public Integer getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(Integer userLevelId) {
        this.userLevelId = userLevelId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReportSettingNew{");
        sb.append("id=").append(id);
        sb.append(", gender=").append(gender);
        sb.append(", location=").append(location);
        sb.append(", version='").append(version).append('\'');
        sb.append(", reportSwitch=").append(reportSwitch);
        sb.append(", reportReason=").append(reportReason);
        sb.append(", detail='").append(detail).append('\'');
        sb.append(", appId=").append(appId);
        sb.append(", createTime=").append(createTime);
        sb.append(", userType=").append(userType);
        sb.append(", userLevelId=").append(userLevelId);
        sb.append('}');
        return sb.toString();
    }
}
