package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_google_play_sub_result")
@ApiModel
public class GooglePlaySubResult implements Serializable {


    public GooglePlaySubResult(Integer userId, Integer googlePlaySubId, Integer onlineVerify, Date verifyTime) {
        this.userId = userId;
        this.googlePlaySubId = googlePlaySubId;
        this.onlineVerify = onlineVerify;
        this.verifyTime = verifyTime;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * google play 订阅信息id
     */
    @Column(name = "google_play_sub_id")
    @ApiModelProperty(value="google play 订阅信息id")
    private Integer googlePlaySubId;

    /**
     * 线上验证结果 1 成功 2 失败
     */
    @Column(name = "online_verify")
    @ApiModelProperty(value="线上验证结果 1 成功 2 失败")
    private Integer onlineVerify;

    /**
     * 交易的验证时间
     */
    @Column(name = "verify_time")
    @ApiModelProperty(value="交易的验证时间")
    private Date verifyTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

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
     * 获取google play 订阅信息id
     *
     * @return google_play_sub_id - google play 订阅信息id
     */
    public Integer getGooglePlaySubId() {
        return googlePlaySubId;
    }

    /**
     * 设置google play 订阅信息id
     *
     * @param googlePlaySubId google play 订阅信息id
     */
    public void setGooglePlaySubId(Integer googlePlaySubId) {
        this.googlePlaySubId = googlePlaySubId;
    }

    /**
     * 获取线上验证结果 1 成功 2 失败
     *
     * @return online_verify - 线上验证结果 1 成功 2 失败
     */
    public Integer getOnlineVerify() {
        return onlineVerify;
    }

    /**
     * 设置线上验证结果 1 成功 2 失败
     *
     * @param onlineVerify 线上验证结果 1 成功 2 失败
     */
    public void setOnlineVerify(Integer onlineVerify) {
        this.onlineVerify = onlineVerify;
    }

    /**
     * 获取交易的验证时间
     *
     * @return verify_time - 交易的验证时间
     */
    public Date getVerifyTime() {
        return verifyTime;
    }

    /**
     * 设置交易的验证时间
     *
     * @param verifyTime 交易的验证时间
     */
    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
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
        sb.append(", userId=").append(userId);
        sb.append(", googlePlaySubId=").append(googlePlaySubId);
        sb.append(", onlineVerify=").append(onlineVerify);
        sb.append(", verifyTime=").append(verifyTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}