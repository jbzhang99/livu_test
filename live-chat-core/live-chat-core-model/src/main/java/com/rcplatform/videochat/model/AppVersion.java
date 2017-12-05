package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_app_version")
@ApiModel
public class AppVersion implements Serializable {


    public AppVersion() {
    }

    public AppVersion(Integer appId) {
        this.appId = appId;
    }

    @Id
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 应用id
     */
    @Column(name = "app_id")
    @ApiModelProperty(value="应用id")
    private Integer appId;

    /**
     * 应用的描述信息
     */
    @ApiModelProperty(value="应用的描述信息")
    private String description;

    /**
     * 安卓最近版本
     */
    @Column(name = "android_max_version_name")
    @ApiModelProperty(value="安卓最近版本")
    private String androidMaxVersionName;

    /**
     * 安卓版本
     */
    @Column(name = "android_max_version")
    @ApiModelProperty(value="安卓版本")
    private String androidMaxVersion;

    /**
     * 安卓最低兼容版本
     */
    @Column(name = "android_min_version")
    @ApiModelProperty(value="安卓最低兼容版本")
    private String androidMinVersion;

    /**
     * ios最近版本
     */
    @Column(name = "ios_max_version_name")
    @ApiModelProperty(value="ios最近版本")
    private String iosMaxVersionName;

    /**
     * iso最新版本
     */
    @Column(name = "ios_max_version")
    @ApiModelProperty(value="iso最新版本")
    private String iosMaxVersion;

    /**
     * ios最低兼容版本
     */
    @Column(name = "ios_min_version")
    @ApiModelProperty(value="ios最低兼容版本")
    private String iosMinVersion;

    /**
     * 0:审核前  1:审核后
     */
    @Column(name = "ios_status")
    @ApiModelProperty(value="0:审核前  1:审核后")
    private Integer iosStatus;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    /**
     * 升级提示标题
     */
    @ApiModelProperty(value="升级提示标题")
    private String title;

    /**
     * 确定文字
     */
    @ApiModelProperty(value="确定文字")
    private String sure;

    /**
     * 取消
     */
    @ApiModelProperty(value="取消")
    private String cancel;

    /**
     * 升级提示次数
     */
    @Column(name = "show_count")
    @ApiModelProperty(value="升级提示次数")
    private Integer showCount;

    /**
     * ios升级图片
     */
    @Column(name = "show_image_ios")
    @ApiModelProperty(value="ios升级图片")
    private String showImageIos;

    /**
     * android升级图片
     */
    @Column(name = "show_image_android")
    @ApiModelProperty(value="android升级图片")
    private String showImageAndroid;

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
     * 获取应用的描述信息
     *
     * @return description - 应用的描述信息
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置应用的描述信息
     *
     * @param description 应用的描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取安卓最近版本
     *
     * @return android_max_version_name - 安卓最近版本
     */
    public String getAndroidMaxVersionName() {
        return androidMaxVersionName;
    }

    /**
     * 设置安卓最近版本
     *
     * @param androidMaxVersionName 安卓最近版本
     */
    public void setAndroidMaxVersionName(String androidMaxVersionName) {
        this.androidMaxVersionName = androidMaxVersionName;
    }

    /**
     * 获取安卓版本
     *
     * @return android_max_version - 安卓版本
     */
    public String getAndroidMaxVersion() {
        return androidMaxVersion;
    }

    /**
     * 设置安卓版本
     *
     * @param androidMaxVersion 安卓版本
     */
    public void setAndroidMaxVersion(String androidMaxVersion) {
        this.androidMaxVersion = androidMaxVersion;
    }

    /**
     * 获取安卓最低兼容版本
     *
     * @return android_min_version - 安卓最低兼容版本
     */
    public String getAndroidMinVersion() {
        return androidMinVersion;
    }

    /**
     * 设置安卓最低兼容版本
     *
     * @param androidMinVersion 安卓最低兼容版本
     */
    public void setAndroidMinVersion(String androidMinVersion) {
        this.androidMinVersion = androidMinVersion;
    }

    /**
     * 获取ios最近版本
     *
     * @return ios_max_version_name - ios最近版本
     */
    public String getIosMaxVersionName() {
        return iosMaxVersionName;
    }

    /**
     * 设置ios最近版本
     *
     * @param iosMaxVersionName ios最近版本
     */
    public void setIosMaxVersionName(String iosMaxVersionName) {
        this.iosMaxVersionName = iosMaxVersionName;
    }

    /**
     * 获取iso最新版本
     *
     * @return ios_max_version - iso最新版本
     */
    public String getIosMaxVersion() {
        return iosMaxVersion;
    }

    /**
     * 设置iso最新版本
     *
     * @param iosMaxVersion iso最新版本
     */
    public void setIosMaxVersion(String iosMaxVersion) {
        this.iosMaxVersion = iosMaxVersion;
    }

    /**
     * 获取ios最低兼容版本
     *
     * @return ios_min_version - ios最低兼容版本
     */
    public String getIosMinVersion() {
        return iosMinVersion;
    }

    /**
     * 设置ios最低兼容版本
     *
     * @param iosMinVersion ios最低兼容版本
     */
    public void setIosMinVersion(String iosMinVersion) {
        this.iosMinVersion = iosMinVersion;
    }

    /**
     * 获取0:审核前  1:审核后
     *
     * @return ios_status - 0:审核前  1:审核后
     */
    public Integer getIosStatus() {
        return iosStatus;
    }

    /**
     * 设置0:审核前  1:审核后
     *
     * @param iosStatus 0:审核前  1:审核后
     */
    public void setIosStatus(Integer iosStatus) {
        this.iosStatus = iosStatus;
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

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取升级提示标题
     *
     * @return title - 升级提示标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置升级提示标题
     *
     * @param title 升级提示标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取确定文字
     *
     * @return sure - 确定文字
     */
    public String getSure() {
        return sure;
    }

    /**
     * 设置确定文字
     *
     * @param sure 确定文字
     */
    public void setSure(String sure) {
        this.sure = sure;
    }

    /**
     * 获取取消
     *
     * @return cancel - 取消
     */
    public String getCancel() {
        return cancel;
    }

    /**
     * 设置取消
     *
     * @param cancel 取消
     */
    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    /**
     * 获取升级提示次数
     *
     * @return show_count - 升级提示次数
     */
    public Integer getShowCount() {
        return showCount;
    }

    /**
     * 设置升级提示次数
     *
     * @param showCount 升级提示次数
     */
    public void setShowCount(Integer showCount) {
        this.showCount = showCount;
    }

    /**
     * 获取ios升级图片
     *
     * @return show_image_ios - ios升级图片
     */
    public String getShowImageIos() {
        return showImageIos;
    }

    /**
     * 设置ios升级图片
     *
     * @param showImageIos ios升级图片
     */
    public void setShowImageIos(String showImageIos) {
        this.showImageIos = showImageIos;
    }

    /**
     * 获取android升级图片
     *
     * @return show_image_android - android升级图片
     */
    public String getShowImageAndroid() {
        return showImageAndroid;
    }

    /**
     * 设置android升级图片
     *
     * @param showImageAndroid android升级图片
     */
    public void setShowImageAndroid(String showImageAndroid) {
        this.showImageAndroid = showImageAndroid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", description=").append(description);
        sb.append(", androidMaxVersionName=").append(androidMaxVersionName);
        sb.append(", androidMaxVersion=").append(androidMaxVersion);
        sb.append(", androidMinVersion=").append(androidMinVersion);
        sb.append(", iosMaxVersionName=").append(iosMaxVersionName);
        sb.append(", iosMaxVersion=").append(iosMaxVersion);
        sb.append(", iosMinVersion=").append(iosMinVersion);
        sb.append(", iosStatus=").append(iosStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", title=").append(title);
        sb.append(", sure=").append(sure);
        sb.append(", cancel=").append(cancel);
        sb.append(", showCount=").append(showCount);
        sb.append(", showImageIos=").append(showImageIos);
        sb.append(", showImageAndroid=").append(showImageAndroid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}