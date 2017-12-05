package com.rcplatform.livechat.dto.request.admin;

import io.swagger.annotations.ApiModel;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 *
 */
@Table(name = "rc_dynamic_sticker")
@ApiModel
public class DynamicStickerDto implements Serializable {

    public DynamicStickerDto() {
    }

    public DynamicStickerDto(Integer orderId) {
        this.orderId = orderId;
    }

    @Id
    private Integer id;

    @Column(name = "dynamic_sticker_name")
    private String dynamicStickerName;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "preview_img")
    private String previewImg;

    @Column(name = "material_url")
    private String materialUrl;

    @Column(name = "status")
    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "sticker_type")
    private Integer stickerType;

    private String stickerTypeName;

    @Column(name = "del_status")
    private Integer delStatus;

    /**
     * 20000 :livu ,19999:livechat ,50000:bestme
     */
    @Column(name = "app_id")
    private Integer appId;

    /**
     * 1:android ,2: ios
     */
    @Column(name = "platform")
    private Integer platform;

    /**
     * 1:男 2:女
     */
    @Column(name = "gender")
    private Integer gender;

    /**
     * 版本
     */
    @Column(name = "version")
    private String version;

    private Integer effect;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDynamicStickerName() {
        return dynamicStickerName;
    }

    public void setDynamicStickerName(String dynamicStickerName) {
        this.dynamicStickerName = dynamicStickerName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getPreviewImg() {
        return previewImg;
    }

    public void setPreviewImg(String previewImg) {
        this.previewImg = previewImg;
    }

    public String getMaterialUrl() {
        return materialUrl;
    }

    public void setMaterialUrl(String materialUrl) {
        this.materialUrl = materialUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStickerType() {
        return stickerType;
    }

    public void setStickerType(Integer stickerType) {
        this.stickerType = stickerType;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getStickerTypeName() {
        return stickerTypeName;
    }

    public void setStickerTypeName(String stickerTypeName) {
        this.stickerTypeName = stickerTypeName;
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getEffect() {
        return effect;
    }

    public void setEffect(Integer effect) {
        this.effect = effect;
    }
}
