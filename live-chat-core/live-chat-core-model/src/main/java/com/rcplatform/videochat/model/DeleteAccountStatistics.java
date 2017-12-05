package com.rcplatform.videochat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaoyuan on 2017/8/7.
 */
@Table(name = "rc_delete_account_statistics")
public class DeleteAccountStatistics implements Serializable{

    public DeleteAccountStatistics() {
    }

    public DeleteAccountStatistics(Integer gender, Integer deleteReason, Integer deleteCount) {
        this.gender = gender;
        this.deleteReason = deleteReason;
        this.deleteCount = deleteCount;
    }

    @Id
    private Integer id;

    @Column(name = "app_id")
    private Integer appId;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "delete_reason")
    private Integer deleteReason;

    @Column(name = "delete_count")
    private Integer deleteCount;

    @Column(name = "create_time")
    private Date createTime;

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

    public Integer getDeleteReason() {
        return deleteReason;
    }

    public void setDeleteReason(Integer deleteReason) {
        this.deleteReason = deleteReason;
    }

    public Integer getDeleteCount() {
        return deleteCount;
    }

    public void setDeleteCount(Integer deleteCount) {
        this.deleteCount = deleteCount;
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
        final StringBuffer sb = new StringBuffer("DeleteAccountStatistics{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", gender=").append(gender);
        sb.append(", deleteReason=").append(deleteReason);
        sb.append(", deleteCount=").append(deleteCount);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
