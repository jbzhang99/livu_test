package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaoyuan on 2017/6/12.
 */
@Table(name = "rc_report_statistics")
@ApiModel
public class ReportStatistics implements Serializable {

    public ReportStatistics() {
    }

    /**
     * 主键
     */
    @Id
    private Integer id;

    @Column(name = "platform_type")
    private Integer platformType;

    @Column(name = "facebook_num")
    private Integer facebookNum;

    @Column(name = "vk_num")
    private Integer vkNum;

    @Column(name = "twitter_num")
    private Integer twitterNum;

    @Column(name = "google_num")
    private Integer googleNum;

    @Column(name = "email_num")
    private Integer emailNum;

    @Column(name = "create_time")
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public Integer getFacebookNum() {
        return facebookNum;
    }

    public void setFacebookNum(Integer facebookNum) {
        this.facebookNum = facebookNum;
    }

    public Integer getVkNum() {
        return vkNum;
    }

    public void setVkNum(Integer vkNum) {
        this.vkNum = vkNum;
    }

    public Integer getTwitterNum() {
        return twitterNum;
    }

    public void setTwitterNum(Integer twitterNum) {
        this.twitterNum = twitterNum;
    }

    public Integer getGoogleNum() {
        return googleNum;
    }

    public void setGoogleNum(Integer googleNum) {
        this.googleNum = googleNum;
    }

    public Integer getEmailNum() {
        return emailNum;
    }

    public void setEmailNum(Integer emailNum) {
        this.emailNum = emailNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
