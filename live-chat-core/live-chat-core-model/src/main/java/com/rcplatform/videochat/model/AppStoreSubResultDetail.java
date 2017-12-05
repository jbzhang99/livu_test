package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_app_store_sub_result_detail")
@ApiModel
public class AppStoreSubResultDetail implements Serializable {
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
    @Column(name = "app_store_sub_id")
    @ApiModelProperty(value="google play 订阅信息id")
    private Integer appStoreSubId;

    /**
     * app store 返回状态码
     */
    @ApiModelProperty(value="app store 返回状态码")
    private Integer status;

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
     * @return app_store_sub_id - google play 订阅信息id
     */
    public Integer getAppStoreSubId() {
        return appStoreSubId;
    }

    /**
     * 设置google play 订阅信息id
     *
     * @param appStoreSubId google play 订阅信息id
     */
    public void setAppStoreSubId(Integer appStoreSubId) {
        this.appStoreSubId = appStoreSubId;
    }

    /**
     * 获取app store 返回状态码
     *
     * @return status - app store 返回状态码
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置app store 返回状态码
     *
     * @param status app store 返回状态码
     */
    public void setStatus(Integer status) {
        this.status = status;
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
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}