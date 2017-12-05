package com.rcplatform.videochat.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_activity")
public class Activity  implements Serializable{

    public Activity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "activity_name")
    private String activityName;

    @Column(name = "activity_img")
    private String activityImg;

    @Column(name = "begin_time")
    private Date beginTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "app")
    private Integer app;

    @Column(name = "status")
    private Integer status;

    @Column(name = "aim_gender")
    private Integer aimGender;

    @Column(name = "aim_country_ids")
    private String aimCountryIds;

    @Column(name = "show_gender")
    private Integer showGender;

    @Column(name = "show_country_ids")
    private String showCountryIds;

    @Column(name = "activity_url")
    private String activityUrl;

    @Column(name = "create_time")
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityImg() {
        return activityImg;
    }

    public void setActivityImg(String activityImg) {
        this.activityImg = activityImg;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getApp() {
        return app;
    }

    public void setApp(Integer app) {
        this.app = app;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAimGender() {
        return aimGender;
    }

    public void setAimGender(Integer aimGender) {
        this.aimGender = aimGender;
    }

    public String getAimCountryIds() {
        return aimCountryIds;
    }

    public void setAimCountryIds(String aimCountryIds) {
        this.aimCountryIds = aimCountryIds;
    }

    public Integer getShowGender() {
        return showGender;
    }

    public void setShowGender(Integer showGender) {
        this.showGender = showGender;
    }

    public String getShowCountryIds() {
        return showCountryIds;
    }

    public void setShowCountryIds(String showCountryIds) {
        this.showCountryIds = showCountryIds;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Activity{");
        sb.append("id=").append(id);
        sb.append(", activityName='").append(activityName).append('\'');
        sb.append(", activityImg='").append(activityImg).append('\'');
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", app=").append(app);
        sb.append(", status=").append(status);
        sb.append(", aimGender=").append(aimGender);
        sb.append(", aimCountryIds='").append(aimCountryIds).append('\'');
        sb.append(", showGender=").append(showGender);
        sb.append(", showCountryIds='").append(showCountryIds).append('\'');
        sb.append(", activityUrl='").append(activityUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }
}