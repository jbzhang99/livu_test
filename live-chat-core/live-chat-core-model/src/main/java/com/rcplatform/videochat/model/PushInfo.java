package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_push_info")
@ApiModel
public class PushInfo implements Serializable {



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
     * 用户的性别 用户性别 1 男性 2 女性
     */
    @ApiModelProperty(value="用户的性别 用户性别 1 男性 2 女性")
    private Integer gender;

    /**
     * 用户设备平台类型 1 ios 2 android
     */
    @Column(name = "platform_type")
    @ApiModelProperty(value="用户设备平台类型 1 ios 2 android")
    private Integer platformType;

    /**
     * 用户推送token
     */
    @Column(name = "push_token")
    @ApiModelProperty(value="用户推送token")
    private String pushToken;



    @Column(name = "push_switch")
    @ApiModelProperty(value = "推送开关")
    private Integer pushSwitch;


    @Column(name = "video_message_switch")
    @ApiModelProperty(value = "视频消息开关")
    private Integer videoMessageSwitch;
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
     * 获取用户的性别 用户性别 1 男性 2 女性
     *
     * @return gender - 用户的性别 用户性别 1 男性 2 女性
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置用户的性别 用户性别 1 男性 2 女性
     *
     * @param gender 用户的性别 用户性别 1 男性 2 女性
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取用户设备平台类型 1 ios 2 android
     *
     * @return platform_type - 用户设备平台类型 1 ios 2 android
     */
    public Integer getPlatformType() {
        return platformType;
    }

    /**
     * 设置用户设备平台类型 1 ios 2 android
     *
     * @param platformType 用户设备平台类型 1 ios 2 android
     */
    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    /**
     * 获取用户推送token
     *
     * @return push_token - 用户推送token
     */
    public String getPushToken() {
        return pushToken;
    }

    /**
     * 设置用户推送token
     *
     * @param pushToken 用户推送token
     */
    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
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


    public Integer getPushSwitch() {
        return pushSwitch;
    }

    public void setPushSwitch(Integer pushSwitch) {
        this.pushSwitch = pushSwitch;
    }

    public Integer getVideoMessageSwitch() {
        return videoMessageSwitch;
    }

    public void setVideoMessageSwitch(Integer videoMessageSwitch) {
        this.videoMessageSwitch = videoMessageSwitch;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", gender=").append(gender);
        sb.append(", platformType=").append(platformType);
        sb.append(", pushToken=").append(pushToken);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public static final class Builder {

        private Integer id;
        private Integer userId;
        private Integer gender;
        private Integer platformType;
        private String pushToken;
        private Integer pushSwitch;
        private Integer videoMessageSwitch;
        private Date createTime;

        public Builder() {
        }



        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public Builder gender(Integer gender) {
            this.gender = gender;
            return this;
        }

        public Builder platformType(Integer platformType) {
            this.platformType = platformType;
            return this;
        }

        public Builder pushToken(String pushToken) {
            this.pushToken = pushToken;
            return this;
        }

        public Builder pushSwitch(Integer pushSwitch) {
            this.pushSwitch = pushSwitch;
            return this;
        }

        public Builder videoMessageSwitch(Integer videoMessageSwitch) {
            this.videoMessageSwitch = videoMessageSwitch;
            return this;
        }

        public Builder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }



        public PushInfo build() {
            PushInfo pushInfo = new PushInfo();
            pushInfo.setId(id);
            pushInfo.setUserId(userId);
            pushInfo.setGender(gender);
            pushInfo.setPlatformType(platformType);
            pushInfo.setPushToken(pushToken);
            pushInfo.setPushSwitch(pushSwitch);
            pushInfo.setVideoMessageSwitch(videoMessageSwitch);
            pushInfo.setCreateTime(createTime);
            return pushInfo;
        }
    }
}