package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_push_record")
@ApiModel
public class PushRecord implements Serializable {


    public PushRecord() {
    }


    public PushRecord(Integer userId, Integer pushUserId, Date createTime, Integer pushType) {
        this.userId = userId;
        this.pushUserId = pushUserId;
        this.createTime = createTime;
        this.pushType = pushType;
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
     * 推送的用户id
     */
    @Column(name = "push_user_id")
    @ApiModelProperty(value="推送的用户id")
    private Integer pushUserId;

    /**
     * 推送时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="推送时间")
    private Date createTime;

    /**
     * 推送的类型 0 好友消息通知
     */
    @Column(name = "push_type")
    @ApiModelProperty(value="推送的类型 0 好友消息通知")
    private Integer pushType;

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
     * 获取推送的用户id
     *
     * @return push_user_id - 推送的用户id
     */
    public Integer getPushUserId() {
        return pushUserId;
    }

    /**
     * 设置推送的用户id
     *
     * @param pushUserId 推送的用户id
     */
    public void setPushUserId(Integer pushUserId) {
        this.pushUserId = pushUserId;
    }

    /**
     * 获取推送时间
     *
     * @return create_time - 推送时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置推送时间
     *
     * @param createTime 推送时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取推送的类型 0 好友消息通知
     *
     * @return push_type - 推送的类型 0 好友消息通知
     */
    public Integer getPushType() {
        return pushType;
    }

    /**
     * 设置推送的类型 0 好友消息通知
     *
     * @param pushType 推送的类型 0 好友消息通知
     */
    public void setPushType(Integer pushType) {
        this.pushType = pushType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", pushUserId=").append(pushUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", pushType=").append(pushType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}