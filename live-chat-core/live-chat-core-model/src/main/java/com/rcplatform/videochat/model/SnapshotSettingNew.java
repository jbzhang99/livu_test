package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaoyuan on 2017/7/6.
 */
@Table(name = "rc_snapshot_setting_new")
@ApiModel
public class SnapshotSettingNew implements Serializable {


    public SnapshotSettingNew() {
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value = "主键")
    private Integer id;

    @Column(name = "switch")
    private Integer snapshotSwitch;

    @Column(name = "version")
    private String version;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "detail")
    private String detail;

    @Column(name = "create_time")
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSnapshotSwitch() {
        return snapshotSwitch;
    }

    public void setSnapshotSwitch(Integer snapshotSwitch) {
        this.snapshotSwitch = snapshotSwitch;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
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
}
