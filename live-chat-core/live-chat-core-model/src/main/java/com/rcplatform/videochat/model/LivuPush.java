package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by fj on 2017/8/10.
 */
@Table(name = "rc_livu_push")
@ApiModel
public class LivuPush {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 1:待发送 2:已发送
     */
    @Column(name = "send_status")
    private Integer sendStatus;

    /**
     * 19999:livechat 20000:livu
     */
    @Column(name = "app_id")
    private Integer appId;

    /**
     * 国家
     */
    private String country;

    /**
     * 0:全部 1:免费 2:付费
     */
    @Column(name = "user_recharge")
    private Integer userRecharge;

    /**
     * 0:全部 1:男 2:女
     */
    private Integer gender;

    /**
     * 0:全部 1:android 2:ios
     */
    private Integer platform;

    /**
     * 单位是天，手动填数字
     */
    @Column(name = "last_login_day")
    private Integer lastLoginDay;

    /**
     * 累计消费金额
     */
    @Column(name = "recharge_total")
    private Double rechargeTotal;

    /**
     * 1:好评 2:中评 3:差评
     */
    @Column(name = "comment_type")
    private Integer commentType;

    /**
     * 评论数量
     */
    @Column(name = "comment_num")
    private Integer commentNum;

    /**
     * 付费次数
     */
    @Column(name = "recharge_num")
    private Integer rechargeNum;

    /**
     * 0:全部 1:带色情标签 2:不带
     */
    @Column(name = "user_sign")
    private Integer userSign;

    /**
     * 匹配次数
     */
    @Column(name = "match_num")
    private Integer matchNum;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 贴纸id
     */
    @Column(name = "sticker_id")
    private Integer stickerId;

    /**
     * 图片
     */
    private String img;

    /**
     * 网址
     */
    @Column(name = "web_site")
    private String webSite;

    /**
     * 发送量
     */
    @Column(name = "send_count")
    private Integer sendCount;

    /**
     * 到达量
     */
    @Column(name = "receive_count")
    private Integer receiveCount;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "app_store")
    private Integer appStore;

    @Column(name = "type")
    private Integer type;

    @Transient
    private String title;

    @Transient
    private String content;

    @Transient
    private String languageCode;

    @Transient
    private Integer languageId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取1:待发送 2:已发送
     *
     * @return send_status - 1:待发送 2:已发送
     */
    public Integer getSendStatus() {
        return sendStatus;
    }

    /**
     * 设置1:待发送 2:已发送
     *
     * @param sendStatus 1:待发送 2:已发送
     */
    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    /**
     * 获取19999:livechat 20000:livu
     *
     * @return app_id - 19999:livechat 20000:livu
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * 设置19999:livechat 20000:livu
     *
     * @param appId 19999:livechat 20000:livu
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取0:全部 1:免费 2:付费
     *
     * @return user_recharge - 0:全部 1:免费 2:付费
     */
    public Integer getUserRecharge() {
        return userRecharge;
    }

    /**
     * 设置0:全部 1:免费 2:付费
     *
     * @param userRecharge 0:全部 1:免费 2:付费
     */
    public void setUserRecharge(Integer userRecharge) {
        this.userRecharge = userRecharge;
    }

    /**
     * 获取0:全部 1:男 2:女
     *
     * @return gender - 0:全部 1:男 2:女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置0:全部 1:男 2:女
     *
     * @param gender 0:全部 1:男 2:女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取0:全部 1:android 2:ios
     *
     * @return platform - 0:全部 1:android 2:ios
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * 设置0:全部 1:android 2:ios
     *
     * @param platform 0:全部 1:android 2:ios
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * 获取单位是天，手动填数字
     *
     * @return last_login_day - 单位是天，手动填数字
     */
    public Integer getLastLoginDay() {
        return lastLoginDay;
    }

    /**
     * 设置单位是天，手动填数字
     *
     * @param lastLoginDay 单位是天，手动填数字
     */
    public void setLastLoginDay(Integer lastLoginDay) {
        this.lastLoginDay = lastLoginDay;
    }

    /**
     * 获取累计消费金额
     *
     * @return recharge_total - 累计消费金额
     */
    public Double getRechargeTotal() {
        return rechargeTotal;
    }

    /**
     * 设置累计消费金额
     *
     * @param rechargeTotal 累计消费金额
     */
    public void setRechargeTotal(Double rechargeTotal) {
        this.rechargeTotal = rechargeTotal;
    }

    /**
     * 获取1:好评 2:中评 3:差评
     *
     * @return comment_type - 1:好评 2:中评 3:差评
     */
    public Integer getCommentType() {
        return commentType;
    }

    /**
     * 设置1:好评 2:中评 3:差评
     *
     * @param commentType 1:好评 2:中评 3:差评
     */
    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    /**
     * 获取评论数量
     *
     * @return comment_num - 评论数量
     */
    public Integer getCommentNum() {
        return commentNum;
    }

    /**
     * 设置评论数量
     *
     * @param commentNum 评论数量
     */
    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    /**
     * 获取付费次数
     *
     * @return recharge_num - 付费次数
     */
    public Integer getRechargeNum() {
        return rechargeNum;
    }

    /**
     * 设置付费次数
     *
     * @param rechargeNum 付费次数
     */
    public void setRechargeNum(Integer rechargeNum) {
        this.rechargeNum = rechargeNum;
    }

    /**
     * 获取0:全部 1:带色情标签 2:不带
     *
     * @return user_sign - 0:全部 1:带色情标签 2:不带
     */
    public Integer getUserSign() {
        return userSign;
    }

    /**
     * 设置0:全部 1:带色情标签 2:不带
     *
     * @param userSign 0:全部 1:带色情标签 2:不带
     */
    public void setUserSign(Integer userSign) {
        this.userSign = userSign;
    }

    /**
     * 获取匹配次数
     *
     * @return match_num - 匹配次数
     */
    public Integer getMatchNum() {
        return matchNum;
    }

    /**
     * 设置匹配次数
     *
     * @param matchNum 匹配次数
     */
    public void setMatchNum(Integer matchNum) {
        this.matchNum = matchNum;
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
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
     * 获取贴纸id
     *
     * @return sticker_id - 贴纸id
     */
    public Integer getStickerId() {
        return stickerId;
    }

    /**
     * 设置贴纸id
     *
     * @param stickerId 贴纸id
     */
    public void setStickerId(Integer stickerId) {
        this.stickerId = stickerId;
    }

    /**
     * 获取图片
     *
     * @return img - 图片
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置图片
     *
     * @param img 图片
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取网址
     *
     * @return web_site - 网址
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * 设置网址
     *
     * @param webSite 网址
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    /**
     * 获取发送量
     *
     * @return send_count - 发送量
     */
    public Integer getSendCount() {
        return sendCount;
    }

    /**
     * 设置发送量
     *
     * @param sendCount 发送量
     */
    public void setSendCount(Integer sendCount) {
        this.sendCount = sendCount;
    }

    /**
     * 获取到达量
     *
     * @return receive_count - 到达量
     */
    public Integer getReceiveCount() {
        return receiveCount;
    }

    /**
     * 设置到达量
     *
     * @param receiveCount 到达量
     */
    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAppStore() {
        return appStore;
    }

    public void setAppStore(Integer appStore) {
        this.appStore = appStore;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
