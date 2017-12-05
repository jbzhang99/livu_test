package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_app_store_sub_result")
@ApiModel
public class AppStoreSubResult implements Serializable {
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
     * app store 订阅信息id
     */
    @Column(name = "app_store_sub_id")
    @ApiModelProperty(value="app store 订阅信息id")
    private Integer appStoreSubId;

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
     * 获取app store 订阅信息id
     *
     * @return app_store_sub_id - app store 订阅信息id
     */
    public Integer getAppStoreSubId() {
        return appStoreSubId;
    }

    /**
     * 设置app store 订阅信息id
     *
     * @param appStoreSubId app store 订阅信息id
     */
    public void setAppStoreSubId(Integer appStoreSubId) {
        this.appStoreSubId = appStoreSubId;
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
        sb.append(", appStoreSubId=").append(appStoreSubId);
        sb.append(", onlineVerify=").append(onlineVerify);
        sb.append(", verifyTime=").append(verifyTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}