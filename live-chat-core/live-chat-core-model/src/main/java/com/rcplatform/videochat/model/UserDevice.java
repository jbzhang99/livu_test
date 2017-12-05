package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_device")
@ApiModel
public class UserDevice implements Serializable {



    @Id
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 用户的id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户的id")
    private Integer userId;

    /**
     * 用户设备类型 1.手机 2 pad
     */
    @Column(name = "device_type")
    @ApiModelProperty(value="用户设备类型 1.手机 2 pad")
    private Integer deviceType;

    /**
     * 1.ios 2.android
     */
    @Column(name = "platform_type")
    @ApiModelProperty(value="1.ios 2.android")
    private Integer platformType;

    /**
     * 用户的操作系统版本号
     */
    @Column(name = "system_version")
    @ApiModelProperty(value="用户的操作系统版本号")
    private String systemVersion;

    /**
     * 用户使用的设备名称
     */
    @Column(name = "device_name")
    @ApiModelProperty(value="用户使用的设备名称")
    private String deviceName;

    /**
     * 屏幕尺寸
     */
    @Column(name = "screen_size")
    @ApiModelProperty(value="屏幕尺寸")
    private String screenSize;

    /**
     * 设备语言
     */
    @Column(name = "device_language_id")
    @ApiModelProperty(value="设备语言")
    private Integer deviceLanguageId;

    /**
     * 设备的唯一标识
     */
    @Column(name = "device_id")
    @ApiModelProperty(value="设备的唯一标识")
    private String deviceId;

    /**
     * 设备的创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="设备的创建时间")
    private Date createTime;

    /**
     * 0 不在登陆，1 正在登录
     */
    @Column(name = "login_status")
    @ApiModelProperty(value="0 不在登陆，1 正在登录")
    private Integer loginStatus;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户的id
     *
     * @return user_id - 用户的id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户的id
     *
     * @param userId 用户的id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户设备类型 1.手机 2 pad
     *
     * @return device_type - 用户设备类型 1.手机 2 pad
     */
    public Integer getDeviceType() {
        return deviceType;
    }

    /**
     * 设置用户设备类型 1.手机 2 pad
     *
     * @param deviceType 用户设备类型 1.手机 2 pad
     */
    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 获取1.ios 2.android
     *
     * @return platform_type - 1.ios 2.android
     */
    public Integer getPlatformType() {
        return platformType;
    }

    /**
     * 设置1.ios 2.android
     *
     * @param platformType 1.ios 2.android
     */
    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    /**
     * 获取用户的操作系统版本号
     *
     * @return system_version - 用户的操作系统版本号
     */
    public String getSystemVersion() {
        return systemVersion;
    }

    /**
     * 设置用户的操作系统版本号
     *
     * @param systemVersion 用户的操作系统版本号
     */
    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    /**
     * 获取用户使用的设备名称
     *
     * @return device_name - 用户使用的设备名称
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * 设置用户使用的设备名称
     *
     * @param deviceName 用户使用的设备名称
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * 获取屏幕尺寸
     *
     * @return screen_size - 屏幕尺寸
     */
    public String getScreenSize() {
        return screenSize;
    }

    /**
     * 设置屏幕尺寸
     *
     * @param screenSize 屏幕尺寸
     */
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    /**
     * 获取设备语言
     *
     * @return device_language_id - 设备语言
     */
    public Integer getDeviceLanguageId() {
        return deviceLanguageId;
    }

    /**
     * 设置设备语言
     *
     * @param deviceLanguageId 设备语言
     */
    public void setDeviceLanguageId(Integer deviceLanguageId) {
        this.deviceLanguageId = deviceLanguageId;
    }

    /**
     * 获取设备的唯一标识
     *
     * @return device_id - 设备的唯一标识
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备的唯一标识
     *
     * @param deviceId 设备的唯一标识
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取设备的创建时间
     *
     * @return create_time - 设备的创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置设备的创建时间
     *
     * @param createTime 设备的创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取0 不在登陆，1 正在登录
     *
     * @return login_status - 0 不在登陆，1 正在登录
     */
    public Integer getLoginStatus() {
        return loginStatus;
    }

    /**
     * 设置0 不在登陆，1 正在登录
     *
     * @param loginStatus 0 不在登陆，1 正在登录
     */
    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", platformType=").append(platformType);
        sb.append(", systemVersion=").append(systemVersion);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", screenSize=").append(screenSize);
        sb.append(", deviceLanguageId=").append(deviceLanguageId);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", createTime=").append(createTime);
        sb.append(", loginStatus=").append(loginStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}