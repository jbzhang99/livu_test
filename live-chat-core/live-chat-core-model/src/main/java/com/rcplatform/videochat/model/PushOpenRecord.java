package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_push_open_record")
@ApiModel
public class PushOpenRecord implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键,客户端无须提交，请忽略")
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id",required = true)
    private Integer userId;

    /**
     * 推送id，用于标记每次推送
     */
    @Column(name = "push_id")
    @ApiModelProperty(value="推送id，用于标记每次推送",required =true)
    private Integer pushId;

    /**
     * 用户使用的平台类型1 ios 2 android
     */
    @Column(name = "platform_type")
    @ApiModelProperty(value="用户使用的平台类型1 ios 2 android",required = true)
    private Integer platformType;

    /**
     * 用户性别，1男性 2女性
     */
    @ApiModelProperty(value="用户性别，1男性 2女性",required = true)
    private Integer gender;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间，客户端无须提交，请忽略")
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
     * 获取推送id，用于标记每次推送
     *
     * @return push_id - 推送id，用于标记每次推送
     */
    public Integer getPushId() {
        return pushId;
    }

    /**
     * 设置推送id，用于标记每次推送
     *
     * @param pushId 推送id，用于标记每次推送
     */
    public void setPushId(Integer pushId) {
        this.pushId = pushId;
    }

    /**
     * 获取用户使用的平台类型1 ios 2 android
     *
     * @return platform_type - 用户使用的平台类型1 ios 2 android
     */
    public Integer getPlatformType() {
        return platformType;
    }

    /**
     * 设置用户使用的平台类型1 ios 2 android
     *
     * @param platformType 用户使用的平台类型1 ios 2 android
     */
    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    /**
     * 获取用户性别，1男性 2女性
     *
     * @return gender - 用户性别，1男性 2女性
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置用户性别，1男性 2女性
     *
     * @param gender 用户性别，1男性 2女性
     */
    public void setGender(Integer gender) {
        this.gender = gender;
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
        sb.append(", pushId=").append(pushId);
        sb.append(", platformType=").append(platformType);
        sb.append(", gender=").append(gender);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}