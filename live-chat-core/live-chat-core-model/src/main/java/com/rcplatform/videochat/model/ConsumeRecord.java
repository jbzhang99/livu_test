package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_consume_record")
@ApiModel
public class ConsumeRecord implements Serializable {


    public ConsumeRecord() {
    }

    public ConsumeRecord(Integer userId, Integer consumeId, Date createTime, Integer userGender,
                         Integer userPlatformType, String userCountry, String userIpCountry, Integer appId) {
        this.userId = userId;
        this.consumeId = consumeId;
        this.createTime = createTime;
        this.userGender = userGender;
        this.userPlatformType = userPlatformType;
        this.userCountry = userCountry;
        this.userIpCountry = userIpCountry;
        this.appId = appId;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    @Column(name = "app_id")
    private Integer appId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * 用户消费的id
     */
    @Column(name = "consume_id")
    @ApiModelProperty(value="用户消费的id")
    private Integer consumeId;

    /**
     * 消费记录创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="消费记录创建时间")
    private Date createTime;


    /**
     * 用户性别
     */
    @Column(name = "user_gender")
    private Integer userGender;

    /**
     * 用户平台类型
     */
    @Column(name = "user_platform_type")
    private Integer userPlatformType;

    /**
     * 用户国家
     */
    @Column(name = "user_country")
    private String userCountry;

    /**
     * 用户的ip国家
     */
    @Column(name = "user_ip_country")
    private String userIpCountry;

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
     * 获取用户消费的id
     *
     * @return consume_id - 用户消费的id
     */
    public Integer getConsumeId() {
        return consumeId;
    }

    /**
     * 设置用户消费的id
     *
     * @param consumeId 用户消费的id
     */
    public void setConsumeId(Integer consumeId) {
        this.consumeId = consumeId;
    }

    /**
     * 获取消费记录创建时间
     *
     * @return create_time - 消费记录创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置消费记录创建时间
     *
     * @param createTime 消费记录创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public Integer getUserPlatformType() {
        return userPlatformType;
    }

    public void setUserPlatformType(Integer userPlatformType) {
        this.userPlatformType = userPlatformType;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserIpCountry() {
        return userIpCountry;
    }

    public void setUserIpCountry(String userIpCountry) {
        this.userIpCountry = userIpCountry;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ConsumeRecord{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", userId=").append(userId);
        sb.append(", consumeId=").append(consumeId);
        sb.append(", createTime=").append(createTime);
        sb.append(", userGender=").append(userGender);
        sb.append(", userPlatformType=").append(userPlatformType);
        sb.append(", userCountry='").append(userCountry).append('\'');
        sb.append(", userIpCountry='").append(userIpCountry).append('\'');
        sb.append('}');
        return sb.toString();
    }
}