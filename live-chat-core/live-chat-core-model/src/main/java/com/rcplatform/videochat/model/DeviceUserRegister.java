package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_device_user_register")
@ApiModel
public class DeviceUserRegister implements Serializable {



    public DeviceUserRegister() {
    }


    public DeviceUserRegister(Integer appId, String deviceId, Integer userId) {
        this.appId = appId;
        this.deviceId = deviceId;
        this.userId = userId;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;


    @Column(name = "app_id")
    private Integer appId;
    /**
     * 设备唯一id
     */
    @Column(name = "device_id")
    @ApiModelProperty(value="设备唯一id")
    private String deviceId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;



    private static final long serialVersionUID = 1L;


    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取设备唯一id
     *
     * @return device_id - 设备唯一id
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备唯一id
     *
     * @param deviceId 设备唯一id
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}