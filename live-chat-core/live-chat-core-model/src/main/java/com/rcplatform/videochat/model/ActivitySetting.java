package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_activity_setting")
@ApiModel
public class ActivitySetting implements Serializable {

    public ActivitySetting(String name, Integer appId, Integer platformType, Integer location) {
        this.name = name;
        this.platformType = platformType;
        this.location = location;
        this.appId = appId;
    }

    public ActivitySetting() {
    }

    /**
     * id
     */
    @Id
    @ApiModelProperty(value = "id")
    private Integer id;

    /**
     * 应用id
     */
    @Column(name = "app_id")
    @ApiModelProperty(value = "应用id")
    private Integer appId;


    /**
     * 活动名称
     */
    @Column(name = "name")
    @ApiModelProperty(value = "活动名称")
    private String name;

    /**
     * 版本号
     */
    @ApiModelProperty(value = "版本号")
    private Integer version;

    /**
     * 平台类型
     */
    @Column(name = "platform_type")
    @ApiModelProperty(value = "平台类型")
    private Integer platformType;

    /**
     * 设置开关
     */
    @Column(name = "setting_switch")
    @ApiModelProperty(value = "设置开关")
    private Integer settingSwitch;

    /**
     * 活动地址
     */
    @ApiModelProperty(value = "活动地址")
    private String url;

    /**
     * 活动图标
     */
    @ApiModelProperty(value = "活动图标")
    private String icon;

    /**
     * 活动闪屏图
     */
    @ApiModelProperty(value = "活动闪屏图")
    private String screen;

    /**
     * 活动位置 0 首页, 1 闪屏 ,2 个人主页
     */
    @ApiModelProperty(value = "活动位置 0 首页, 1 闪屏 ,2 个人主页,3 消息列表页")
    private Integer location;


    @ApiModelProperty(value = "性别")
    private Integer gender;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取应用id
     *
     * @return app_id - 应用id
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * 设置应用id
     *
     * @param appId 应用id
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取平台类型
     *
     * @return platform_type - 平台类型
     */
    public Integer getPlatformType() {
        return platformType;
    }

    /**
     * 设置平台类型
     *
     * @param platformType 平台类型
     */
    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    /**
     * 获取设置开关
     *
     * @return setting_switch - 设置开关
     */
    public Integer getSettingSwitch() {
        return settingSwitch;
    }

    /**
     * 设置设置开关
     *
     * @param settingSwitch 设置开关
     */
    public void setSettingSwitch(Integer settingSwitch) {
        this.settingSwitch = settingSwitch;
    }

    /**
     * 获取活动地址
     *
     * @return url - 活动地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置活动地址
     *
     * @param url 活动地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取活动图标
     *
     * @return icon - 活动图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置活动图标
     *
     * @param icon 活动图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取活动闪屏图
     *
     * @return screen - 活动闪屏图
     */
    public String getScreen() {
        return screen;
    }

    /**
     * 设置活动闪屏图
     *
     * @param screen 活动闪屏图
     */
    public void setScreen(String screen) {
        this.screen = screen;
    }

    /**
     * 获取活动位置 0 首页, 1 闪屏 ,2 个人主页
     *
     * @return location - 活动位置 0 首页, 1 闪屏 ,2 个人主页
     */
    public Integer getLocation() {
        return location;
    }

    /**
     * 设置活动位置 0 首页, 1 闪屏 ,2 个人主页
     *
     * @param location 活动位置 0 首页, 1 闪屏 ,2 个人主页
     */
    public void setLocation(Integer location) {
        this.location = location;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ActivitySetting{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", version=").append(version);
        sb.append(", platformType=").append(platformType);
        sb.append(", settingSwitch=").append(settingSwitch);
        sb.append(", url='").append(url).append('\'');
        sb.append(", icon='").append(icon).append('\'');
        sb.append(", screen='").append(screen).append('\'');
        sb.append(", location=").append(location);
        sb.append(", gender=").append(gender);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}