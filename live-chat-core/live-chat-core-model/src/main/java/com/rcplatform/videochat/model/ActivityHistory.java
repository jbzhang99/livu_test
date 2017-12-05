package com.rcplatform.videochat.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaoyuan on 2017/8/22.
 */
@Table(name = "rc_activity_history")
public class ActivityHistory implements Serializable {

    public ActivityHistory() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "activity_id")
    private Integer activityId;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "head_img")
    private String headImg;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "smile_count")
    private Integer smileCount;

    @Column(name = "create_time")
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

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

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ActivityHistory{");
        sb.append("id=").append(id);
        sb.append(", activityId=").append(activityId);
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", headImg='").append(headImg).append('\'');
        sb.append(", countryId=").append(countryId);
        sb.append(", countryName=").append(countryName);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", smileCount=").append(smileCount);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
