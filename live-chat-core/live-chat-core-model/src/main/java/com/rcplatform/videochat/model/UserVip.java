package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_vip")
@ApiModel
public class UserVip implements Serializable {

    public UserVip(Integer userId) {
        this.userId = userId;
    }


    public UserVip() {
    }




    public UserVip(Integer userId, Date beginTime, Date endTime, Integer type, Integer platform, Date createTime) {
        this.userId = userId;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.type = type;
        this.platform = platform;
        this.createTime = createTime;
    }


    public UserVip(Integer id, Integer userId, Date beginTime, Date endTime, Integer type, Integer platform) {
        this.id = id;
        this.userId = userId;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.type = type;
        this.platform = platform;
    }

    /**

     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * 开始时间
     */
    @Column(name = "begin_time")
    @ApiModelProperty(value="开始时间")
    private Date beginTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    @ApiModelProperty(value="结束时间")
    private Date endTime;

    /**
     * vip 类型 0 普通vip 1 超级vip
     */
    @ApiModelProperty(value="vip 类型 0 普通vip 1 超级vip")
    private Integer type;

    /**
     * 最近一次的支付平台类型 1 app store 2 google play
     */
    @ApiModelProperty(value="最近一次的支付平台类型 1 app store 2 google play")
    private Integer platform;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

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
     * 获取开始时间
     *
     * @return begin_time - 开始时间
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * 设置开始时间
     *
     * @param beginTime 开始时间
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取vip 类型 0 普通vip 1 超级vip
     *
     * @return type - vip 类型 0 普通vip 1 超级vip
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置vip 类型 0 普通vip 1 超级vip
     *
     * @param type vip 类型 0 普通vip 1 超级vip
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取最近一次的支付平台类型 1 app store 2 google play
     *
     * @return platform - 最近一次的支付平台类型 1 app store 2 google play
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * 设置最近一次的支付平台类型 1 app store 2 google play
     *
     * @param platform 最近一次的支付平台类型 1 app store 2 google play
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
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
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", type=").append(type);
        sb.append(", platform=").append(platform);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}