package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by 药耀源 on 2017/3/29.
 */
@Table(name = "rc_pay_rate_record")
@ApiModel
public class PayRateRecord {

    public PayRateRecord() {
    }

    public PayRateRecord(Date recordDate, Integer registUserCount, Integer payUserCount, Double payRate, Integer platformType, Date createTime) {
        this.recordDate = recordDate;
        this.registUserCount = registUserCount;
        this.payUserCount = payUserCount;
        this.payRate = payRate;
        this.platformType = platformType;
        this.createTime = createTime;
    }

    @ApiModelProperty(value = "主键id")
    @Column(name = "id")
    private Integer id;

    @Column(name = "app_id")
    private Integer appId;

    @ApiModelProperty(value = "付费率统计日期")
    @Column(name = "record_date")
    private Date recordDate;

    @ApiModelProperty(value = "注册用户总数")
    @Column(name = "regist_user_count")
    private Integer registUserCount;

    @ApiModelProperty(value = "付费用户总数")
    @Column(name = "pay_user_count")
    private Integer payUserCount;

    @ApiModelProperty(value = "付费率")
    @Column(name = "pay_rate")
    private Double payRate;

    @ApiModelProperty(value = "平台类型 1 ios, 2 android")
    @Column(name = "platform_type")
    private Integer platformType;

    @ApiModelProperty(value = "记录创建时间")
    @Column(name = "create_time")
    private Date createTime;

    @ApiModelProperty(value = "统计前一日的用户数量")
    @Column(name = "old_user_count")
    private Integer oldUserCount;

    @ApiModelProperty(value = "统计用户类型,1 是老用户,2 是新用户")
    @Column(name = "user_type")
    private Integer userType;

    @ApiModelProperty(value = "统计前一日老用户付费人数")
    @Column(name = "old_user_pay_count")
    private Integer oldUserPayCount;

    @ApiModelProperty(value = "老用户付费率")
    @Column(name = "old_user_pay_rate")
    private Double oldUserPayRate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Integer getRegistUserCount() {
        return registUserCount;
    }

    public void setRegistUserCount(Integer registUserCount) {
        this.registUserCount = registUserCount;
    }

    public Integer getPayUserCount() {
        return payUserCount;
    }

    public void setPayUserCount(Integer payUserCount) {
        this.payUserCount = payUserCount;
    }

    public Double getPayRate() {
        return payRate;
    }

    public void setPayRate(Double payRate) {
        this.payRate = payRate;
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOldUserCount() {
        return oldUserCount;
    }

    public void setOldUserCount(Integer oldUserCount) {
        this.oldUserCount = oldUserCount;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getOldUserPayCount() {
        return oldUserPayCount;
    }

    public void setOldUserPayCount(Integer oldUserPayCount) {
        this.oldUserPayCount = oldUserPayCount;
    }

    public Double getOldUserPayRate() {
        return oldUserPayRate;
    }

    public void setOldUserPayRate(Double oldUserPayRate) {
        this.oldUserPayRate = oldUserPayRate;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PayRateRecord{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", recordDate=").append(recordDate);
        sb.append(", registUserCount=").append(registUserCount);
        sb.append(", payUserCount=").append(payUserCount);
        sb.append(", payRate=").append(payRate);
        sb.append(", platformType=").append(platformType);
        sb.append(", createTime=").append(createTime);
        sb.append(", oldUserCount=").append(oldUserCount);
        sb.append(", userType=").append(userType);
        sb.append(", oldUserPayCount=").append(oldUserPayCount);
        sb.append(", oldUserPayRate=").append(oldUserPayRate);
        sb.append('}');
        return sb.toString();
    }
}
