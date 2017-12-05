package com.rcplatform.livechat.dto.response;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaoyuan on 2017/6/12.
 */
public class ReportHistoryResp implements Serializable {

    public ReportHistoryResp() {
    }


    private Integer reportedUserId;

    private String reportedUserImg;

    private String reportedUserBackground;

    private Integer reportUserId;

    private Integer reportReason;

    private Date reportTime;

    private Integer sealingAccountCount;

    private Integer genderChange;

    private Integer payCount;

    public Integer getReportedUserId() {
        return reportedUserId;
    }

    public void setReportedUserId(Integer reportedUserId) {
        this.reportedUserId = reportedUserId;
    }

    public String getReportedUserImg() {
        return reportedUserImg;
    }

    public void setReportedUserImg(String reportedUserImg) {
        this.reportedUserImg = reportedUserImg;
    }

    public String getReportedUserBackground() {
        return reportedUserBackground;
    }

    public void setReportedUserBackground(String reportedUserBackground) {
        this.reportedUserBackground = reportedUserBackground;
    }

    public Integer getReportUserId() {
        return reportUserId;
    }

    public void setReportUserId(Integer reportUserId) {
        this.reportUserId = reportUserId;
    }

    public Integer getReportReason() {
        return reportReason;
    }

    public void setReportReason(Integer reportReason) {
        this.reportReason = reportReason;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Integer getSealingAccountCount() {
        return sealingAccountCount;
    }

    public void setSealingAccountCount(Integer sealingAccountCount) {
        this.sealingAccountCount = sealingAccountCount;
    }

    public Integer getGenderChange() {
        return genderChange;
    }

    public void setGenderChange(Integer genderChange) {
        this.genderChange = genderChange;
    }

    public Integer getPayCount() {
        return payCount;
    }

    public void setPayCount(Integer payCount) {
        this.payCount = payCount;
    }
}
