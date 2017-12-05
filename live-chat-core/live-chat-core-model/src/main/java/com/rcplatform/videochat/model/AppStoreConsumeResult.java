package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_app_store_consume_result")
@ApiModel
public class AppStoreConsumeResult implements Serializable {


    public AppStoreConsumeResult() {
    }

    public AppStoreConsumeResult(Integer userId, Integer appStoreConsumeId, Integer result, Integer appStoreStatus) {
        this.userId = userId;
        this.appStoreConsumeId = appStoreConsumeId;
        this.result = result;
        this.appStoreStatus = appStoreStatus;
    }

    public AppStoreConsumeResult(Integer userId, Integer appStoreConsumeId, Integer result) {
        this.userId = userId;
        this.appStoreConsumeId = appStoreConsumeId;
        this.result = result;
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
     * app store 消耗内购支付凭证id
     */
    @Column(name = "app_store_consume_id")
    @ApiModelProperty(value="app store 消耗内购支付凭证id")
    private Integer appStoreConsumeId;

    /**
     * 请求结果 0 请求成功 1 请求失败
     */
    @ApiModelProperty(value="请求结果 0 请求成功 1 请求失败")
    private Integer result;

    /**
     * app store 返回的status 状态
     */
    @Column(name = "app_store_status")
    @ApiModelProperty(value="app store 返回的status 状态")
    private Integer appStoreStatus;

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
     * 获取app store 消耗内购支付凭证id
     *
     * @return app_store_consume_id - app store 消耗内购支付凭证id
     */
    public Integer getAppStoreConsumeId() {
        return appStoreConsumeId;
    }

    /**
     * 设置app store 消耗内购支付凭证id
     *
     * @param appStoreConsumeId app store 消耗内购支付凭证id
     */
    public void setAppStoreConsumeId(Integer appStoreConsumeId) {
        this.appStoreConsumeId = appStoreConsumeId;
    }

    /**
     * 获取请求结果 0 请求成功 1 请求失败
     *
     * @return result - 请求结果 0 请求成功 1 请求失败
     */
    public Integer getResult() {
        return result;
    }

    /**
     * 设置请求结果 0 请求成功 1 请求失败
     *
     * @param result 请求结果 0 请求成功 1 请求失败
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * 获取app store 返回的status 状态
     *
     * @return app_store_status - app store 返回的status 状态
     */
    public Integer getAppStoreStatus() {
        return appStoreStatus;
    }

    /**
     * 设置app store 返回的status 状态
     *
     * @param appStoreStatus app store 返回的status 状态
     */
    public void setAppStoreStatus(Integer appStoreStatus) {
        this.appStoreStatus = appStoreStatus;
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
        sb.append(", appStoreConsumeId=").append(appStoreConsumeId);
        sb.append(", result=").append(result);
        sb.append(", appStoreStatus=").append(appStoreStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}