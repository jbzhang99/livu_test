package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_user_power")
@ApiModel
public class UserPower implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value = "主键")
    private Integer id;


    @Column(name = "consume_id")
    @ApiModelProperty(hidden = true)
    private Integer consumeId;


    @Column(name = "platform_type")
    @ApiModelProperty(hidden = true)
    private Integer platformType;


    @Column(name = "pay_status")
    @ApiModelProperty(hidden = true)
    private Integer payStatus;


    @Column(name = "app_id")
    @ApiModelProperty(hidden = true)
    private Integer appId;
    /**
     * vip id ,普通用户为0
     */
    @Column(name = "vip_commodity_id")
    @ApiModelProperty(value = "vip id ,普通用户为0")
    private Integer vipCommodityId;

    /**
     * 用户性别
     */
    @ApiModelProperty(value = "用户性别")
    private Integer gender;

    /**
     * 视频次数每小时
     */
    @Column(name = "video_count_hour")
    @ApiModelProperty(value = "视频次数每小时")
    private Integer videoCountHour;

    /**
     * 发送消息次数每天次数（给普通用户）
     */
    @Column(name = "send_message_normal_count_day")
    @ApiModelProperty(value = "发送消息次数每天次数（给普通用户）")
    private Integer sendMessageNormalCountDay;

    /**
     * 发送消息次数每天次数（给热门用户）
     */
    @Column(name = "send_message_hot_count_day")
    @ApiModelProperty(value = "发送消息次数每天次数（给热门用户）")
    private Integer sendMessageHotCountDay;

    /**
     * 消息回复次数
     */
    @Column(name = "answer_message_count_day")
    @ApiModelProperty(value = "消息回复次数")
    private Integer answerMessageCountDay;


    @Column(name = "greet_count_day")
    @ApiModelProperty(value = "打招呼次数,即女性给男性发送一句话的次数(在性别为女的情况下)")
    private Integer greetCountDay;


    @Column(name = "more_video_cost")
    @ApiModelProperty(value = "用户视频次数超过限制的后每次收费")
    private BigDecimal moreVideoCost;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;




    @Transient
    private String consumeName;

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


    public Integer getVipCommodityId() {
        return vipCommodityId;
    }

    public void setVipCommodityId(Integer vipCommodityId) {
        this.vipCommodityId = vipCommodityId;
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
     * 获取视频次数每小时
     *
     * @return video_count_hour - 视频次数每小时
     */
    public Integer getVideoCountHour() {
        return videoCountHour;
    }

    /**
     * 设置视频次数每小时
     *
     * @param videoCountHour 视频次数每小时
     */
    public void setVideoCountHour(Integer videoCountHour) {
        this.videoCountHour = videoCountHour;
    }

    /**
     * 获取发送消息次数每天次数（给普通用户）
     *
     * @return send_message_normal_count_day - 发送消息次数每天次数（给普通用户）
     */
    public Integer getSendMessageNormalCountDay() {
        return sendMessageNormalCountDay;
    }

    /**
     * 设置发送消息次数每天次数（给普通用户）
     *
     * @param sendMessageNormalCountDay 发送消息次数每天次数（给普通用户）
     */
    public void setSendMessageNormalCountDay(Integer sendMessageNormalCountDay) {
        this.sendMessageNormalCountDay = sendMessageNormalCountDay;
    }

    /**
     * 获取发送消息次数每天次数（给热门用户）
     *
     * @return send_message_hot_count_day - 发送消息次数每天次数（给热门用户）
     */
    public Integer getSendMessageHotCountDay() {
        return sendMessageHotCountDay;
    }

    /**
     * 设置发送消息次数每天次数（给热门用户）
     *
     * @param sendMessageHotCountDay 发送消息次数每天次数（给热门用户）
     */
    public void setSendMessageHotCountDay(Integer sendMessageHotCountDay) {
        this.sendMessageHotCountDay = sendMessageHotCountDay;
    }

    /**
     * 获取消息回复次数
     *
     * @return answer_message_count_day - 消息回复次数
     */
    public Integer getAnswerMessageCountDay() {
        return answerMessageCountDay;
    }

    /**
     * 设置消息回复次数
     *
     * @param answerMessageCountDay 消息回复次数
     */
    public void setAnswerMessageCountDay(Integer answerMessageCountDay) {
        this.answerMessageCountDay = answerMessageCountDay;
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


    public Integer getGreetCountDay() {
        return greetCountDay;
    }


    public void setGreetCountDay(Integer greetCountDay) {
        this.greetCountDay = greetCountDay;
    }


    public BigDecimal getMoreVideoCost() {
        return moreVideoCost;
    }

    public void setMoreVideoCost(BigDecimal moreVideoCost) {
        this.moreVideoCost = moreVideoCost;
    }


    public Integer getConsumeId() {
        return consumeId;
    }

    public void setConsumeId(Integer consumeId) {
        this.consumeId = consumeId;
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getConsumeName() {
        return consumeName;
    }

    public void setConsumeName(String consumeName) {
        this.consumeName = consumeName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserPower{");
        sb.append("id=").append(id);
        sb.append(", consumeId=").append(consumeId);
        sb.append(", platformType=").append(platformType);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", appId=").append(appId);
        sb.append(", vipCommodityId=").append(vipCommodityId);
        sb.append(", gender=").append(gender);
        sb.append(", videoCountHour=").append(videoCountHour);
        sb.append(", sendMessageNormalCountDay=").append(sendMessageNormalCountDay);
        sb.append(", sendMessageHotCountDay=").append(sendMessageHotCountDay);
        sb.append(", answerMessageCountDay=").append(answerMessageCountDay);
        sb.append(", greetCountDay=").append(greetCountDay);
        sb.append(", moreVideoCost=").append(moreVideoCost);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}