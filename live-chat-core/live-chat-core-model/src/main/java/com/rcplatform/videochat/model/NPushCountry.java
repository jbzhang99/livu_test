package com.rcplatform.videochat.model;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaoyuan on 2017/6/21.
 */
@Table(name = "rc_new_push_country_test")
public class NPushCountry implements Serializable{

    public NPushCountry() {
    }

    public NPushCountry(Integer id, Integer pushNum) {
        this.id = id;
        this.pushNum = pushNum;
    }


    @Id
    private Integer id;

    private Integer pushId;

    private Integer countryId;

    private Date pushStartTime;

    private Date pushEndTime;

    private Integer pushStatus;

    private Integer shouldPushNum;

    private Integer pushNum;

    private Date createTime;

    @Transient
    private NPush nPush;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPushId() {
        return pushId;
    }

    public void setPushId(Integer pushId) {
        this.pushId = pushId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
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

    public Integer getPushStatus() {
        return pushStatus;
    }

    public void setPushStatus(Integer pushStatus) {
        this.pushStatus = pushStatus;
    }

    public Integer getShouldPushNum() {
        return shouldPushNum;
    }

    public void setShouldPushNum(Integer shouldPushNum) {
        this.shouldPushNum = shouldPushNum;
    }

    public Integer getPushNum() {
        return pushNum;
    }

    public void setPushNum(Integer pushNum) {
        this.pushNum = pushNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public NPush getnPush() {
        return nPush;
    }

    public void setnPush(NPush nPush) {
        this.nPush = nPush;
    }

    @Override
    public String toString() {
        return "NPushCountry{" +
                "id=" + id +
                ", pushId=" + pushId +
                ", countryId=" + countryId +
                ", pushStartTime=" + pushStartTime +
                ", pushEndTime=" + pushEndTime +
                ", pushStatus=" + pushStatus +
                ", shouldPushNum=" + shouldPushNum +
                ", pushNum=" + pushNum +
                ", createTime=" + createTime +
                '}';
    }
}
