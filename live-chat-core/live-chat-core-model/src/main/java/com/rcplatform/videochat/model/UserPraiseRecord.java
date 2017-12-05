package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_user_praise_record")
@ApiModel
public class UserPraiseRecord implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 应用id
     */
    @Column(name = "app_id")
    @ApiModelProperty(value="应用id")
    private Integer appId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * 点赞的用户id
     */
    @Column(name = "praise_user_id")
    @ApiModelProperty(value="点赞的用户id")
    private Integer praiseUserId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 用户性别
     */
    @ApiModelProperty(value="用户性别")
    private Integer gender;

    /**
     * 用户平台类型
     */
    @Column(name = "platform_type")
    @ApiModelProperty(value="用户平台类型")
    private Integer platformType;

    /**
     * 用户国家id
     */
    @Column(name = "country_id")
    @ApiModelProperty(value="用户国家id")
    private Integer countryId;

    /**
     * 评价用户的appId
     */
    @Column(name = "praise_user_app_id")
    @ApiModelProperty(value="评价用户的appId")
    private Integer praiseUserAppId;

    /**
     * 评价用户的性别
     */
    @Column(name = "praise_user_gender")
    @ApiModelProperty(value="评价用户的性别")
    private Integer praiseUserGender;

    /**
     * 评价用户的平台类型
     */
    @Column(name = "praise_user_platform_type")
    @ApiModelProperty(value="评价用户的平台类型")
    private Integer praiseUserPlatformType;

    /**
     * 评价用户国家
     */
    @Column(name = "praise_user_country_id")
    @ApiModelProperty(value="评价用户国家")
    private Integer praiseUserCountryId;

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
     * 获取点赞的用户id
     *
     * @return praise_user_id - 点赞的用户id
     */
    public Integer getPraiseUserId() {
        return praiseUserId;
    }

    /**
     * 设置点赞的用户id
     *
     * @param praiseUserId 点赞的用户id
     */
    public void setPraiseUserId(Integer praiseUserId) {
        this.praiseUserId = praiseUserId;
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
     * 获取用户性别
     *
     * @return gender - 用户性别
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置用户性别
     *
     * @param gender 用户性别
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取用户平台类型
     *
     * @return platform_type - 用户平台类型
     */
    public Integer getPlatformType() {
        return platformType;
    }

    /**
     * 设置用户平台类型
     *
     * @param platformType 用户平台类型
     */
    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    /**
     * 获取用户国家id
     *
     * @return country_id - 用户国家id
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * 设置用户国家id
     *
     * @param countryId 用户国家id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 获取评价用户的appId
     *
     * @return praise_user_app_id - 评价用户的appId
     */
    public Integer getPraiseUserAppId() {
        return praiseUserAppId;
    }

    /**
     * 设置评价用户的appId
     *
     * @param praiseUserAppId 评价用户的appId
     */
    public void setPraiseUserAppId(Integer praiseUserAppId) {
        this.praiseUserAppId = praiseUserAppId;
    }

    /**
     * 获取评价用户的性别
     *
     * @return praise_user_gender - 评价用户的性别
     */
    public Integer getPraiseUserGender() {
        return praiseUserGender;
    }

    /**
     * 设置评价用户的性别
     *
     * @param praiseUserGender 评价用户的性别
     */
    public void setPraiseUserGender(Integer praiseUserGender) {
        this.praiseUserGender = praiseUserGender;
    }

    /**
     * 获取评价用户的平台类型
     *
     * @return praise_user_platform_type - 评价用户的平台类型
     */
    public Integer getPraiseUserPlatformType() {
        return praiseUserPlatformType;
    }

    /**
     * 设置评价用户的平台类型
     *
     * @param praiseUserPlatformType 评价用户的平台类型
     */
    public void setPraiseUserPlatformType(Integer praiseUserPlatformType) {
        this.praiseUserPlatformType = praiseUserPlatformType;
    }

    /**
     * 获取评价用户国家
     *
     * @return praise_user_country_id - 评价用户国家
     */
    public Integer getPraiseUserCountryId() {
        return praiseUserCountryId;
    }

    /**
     * 设置评价用户国家
     *
     * @param praiseUserCountryId 评价用户国家
     */
    public void setPraiseUserCountryId(Integer praiseUserCountryId) {
        this.praiseUserCountryId = praiseUserCountryId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", userId=").append(userId);
        sb.append(", praiseUserId=").append(praiseUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", gender=").append(gender);
        sb.append(", platformType=").append(platformType);
        sb.append(", countryId=").append(countryId);
        sb.append(", praiseUserAppId=").append(praiseUserAppId);
        sb.append(", praiseUserGender=").append(praiseUserGender);
        sb.append(", praiseUserPlatformType=").append(praiseUserPlatformType);
        sb.append(", praiseUserCountryId=").append(praiseUserCountryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


    public static final class Builder {
        private Integer id;
        private Integer appId;
        private Integer userId;
        private Integer praiseUserId;
        private Date createTime;
        private Integer gender;
        private Integer platformType;
        private Integer countryId;
        private Integer praiseUserAppId;
        private Integer praiseUserGender;
        private Integer praiseUserPlatformType;
        private Integer praiseUserCountryId;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder appId(Integer appId) {
            this.appId = appId;
            return this;
        }

        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public Builder praiseUserId(Integer praiseUserId) {
            this.praiseUserId = praiseUserId;
            return this;
        }

        public Builder createTime(Date createTime) {
            this.createTime = createTime;
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

        public Builder countryId(Integer countryId) {
            this.countryId = countryId;
            return this;
        }

        public Builder praiseUserAppId(Integer praiseUserAppId) {
            this.praiseUserAppId = praiseUserAppId;
            return this;
        }

        public Builder praiseUserGender(Integer praiseUserGender) {
            this.praiseUserGender = praiseUserGender;
            return this;
        }

        public Builder praiseUserPlatformType(Integer praiseUserPlatformType) {
            this.praiseUserPlatformType = praiseUserPlatformType;
            return this;
        }

        public Builder praiseUserCountryId(Integer praiseUserCountryId) {
            this.praiseUserCountryId = praiseUserCountryId;
            return this;
        }

        public UserPraiseRecord build() {
            UserPraiseRecord userPraiseRecord = new UserPraiseRecord();
            userPraiseRecord.setId(id);
            userPraiseRecord.setAppId(appId);
            userPraiseRecord.setUserId(userId);
            userPraiseRecord.setPraiseUserId(praiseUserId);
            userPraiseRecord.setCreateTime(createTime);
            userPraiseRecord.setGender(gender);
            userPraiseRecord.setPlatformType(platformType);
            userPraiseRecord.setCountryId(countryId);
            userPraiseRecord.setPraiseUserAppId(praiseUserAppId);
            userPraiseRecord.setPraiseUserGender(praiseUserGender);
            userPraiseRecord.setPraiseUserPlatformType(praiseUserPlatformType);
            userPraiseRecord.setPraiseUserCountryId(praiseUserCountryId);
            return userPraiseRecord;
        }
    }
}