package com.rcplatform.videochat.model;

import com.rcplatform.livechat.enums.SwitchEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_app_config")
@ApiModel
public class AppConfig implements Serializable {

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value = "主键")
    private Integer id;


    @ApiModelProperty(value = "应用id")
    @Column(name = "app_id")
    private Integer appId;
    /**
     * android我的收益开关
     */
    @Column(name = "android_income_switch")
    @ApiModelProperty(value = "android我的收益开关")
    private SwitchEnum androidIncomeSwitch;

    /**
     * ios我的收益开关
     */
    @Column(name = "ios_income_switch")
    @ApiModelProperty(value = "ios我的收益开关")
    private SwitchEnum iosIncomeSwitch;

    /**
     * android运营位开关
     */
    @Column(name = "android_operation_switch")
    @ApiModelProperty(value = "android运营位开关")
    private SwitchEnum androidOperationSwitch;

    /**
     * ios运营位开关
     */
    @Column(name = "ios_operation_switch")
    @ApiModelProperty(value = "ios运营位开关")
    private SwitchEnum iosOperationSwitch;

    /**
     * 运营位时间范围
     */
    @Column(name = "operation_time")
    @ApiModelProperty(value = "运营位时间范围")
    private Integer operationTime;

    /**
     * android版本号
     */
    @Column(name = "android_version")
    @ApiModelProperty(value = "android版本号")
    private Integer androidVersion;

    /**
     * ios版本号
     */
    @Column(name = "ios_version")
    @ApiModelProperty(value = "ios版本号")
    private Integer iosVersion;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * 展示间隔时间(小时)
     */
    @Column(name = "interval_hour")
    @ApiModelProperty(value = "展示间隔时间")
    private Integer intervalHour;


    /**
     * 展示数量
     */
    @Column(name = "show_number")
    @ApiModelProperty(value = "展示数量")
    private Integer showNumber;


    /**
     * next 时间
     */
    @Column(name = "next_time")
    @ApiModelProperty(value = "next时间")
    private Integer nextTime;


    @Column(name = "boy_active_auto")
    @ApiModelProperty(value = "男性自动active")
    private Integer boyActiveAuto;


    @Column(name = "girl_active_auto")
    @ApiModelProperty(value = "女性自动active")
    private Integer girlActiveAuto;

    @ApiModelProperty(value = "hot用户最低钻钻石数")
    @Column(name = "hot_user_min_stone_num")
    private Integer hotUserMinStoneNum;


    @ApiModelProperty(value = "top用户展示数量")
    @Column(name = "top_user_num")
    private Integer topUserNum;


    @ApiModelProperty(value = "top开关")
    @Column(name = "top_switch")
    private SwitchEnum topSwitch;


    @ApiModelProperty("活跃开关")
    @Column(name = "active_switch")
    private SwitchEnum activeSwitch;

    @ApiModelProperty("女性首页截图次数")
    @Column(name = "home_snapshot")
    private Integer homeSnapshot;

    @ApiModelProperty("邀请好友添加金币数量")
    @Column(name = "invitation_gold_num")
    private BigDecimal invitationGoldNum;


    @ApiModelProperty("匹配等待时间")
    @Column(name = "match_wait_time")
    private Integer matchWaitTime;


    @ApiModelProperty("平台类型")
    @Column(name = "platform_type")
    private Integer platformType;


    @ApiModelProperty("匹配进入视频X秒后可以切人或者退出")
    @Column(name = "match_quit_time")
    private Integer matchQuitTime;


    @ApiModelProperty("匹配进入视频X后，加好友按钮出现")
    @Column(name = "match_friend_button_time")
    private Integer matchFriendButtonTime;


    @ApiModelProperty("匹配进入视频X秒后，点赞按钮出现")
    @Column(name = "match_like_button_time")
    private Integer matchLikeButtonTime;


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


    public SwitchEnum getAndroidIncomeSwitch() {
        return androidIncomeSwitch;
    }

    public void setAndroidIncomeSwitch(SwitchEnum androidIncomeSwitch) {
        this.androidIncomeSwitch = androidIncomeSwitch;
    }

    public SwitchEnum getIosIncomeSwitch() {
        return iosIncomeSwitch;
    }

    public void setIosIncomeSwitch(SwitchEnum iosIncomeSwitch) {
        this.iosIncomeSwitch = iosIncomeSwitch;
    }

    public SwitchEnum getAndroidOperationSwitch() {
        return androidOperationSwitch;
    }

    public void setAndroidOperationSwitch(SwitchEnum androidOperationSwitch) {
        this.androidOperationSwitch = androidOperationSwitch;
    }

    public SwitchEnum getIosOperationSwitch() {
        return iosOperationSwitch;
    }

    public void setIosOperationSwitch(SwitchEnum iosOperationSwitch) {
        this.iosOperationSwitch = iosOperationSwitch;
    }

    /**
     * 获取运营位时间范围
     *
     * @return operation_time - 运营位时间范围
     */
    public Integer getOperationTime() {
        return operationTime;
    }

    /**
     * 设置运营位时间范围
     *
     * @param operationTime 运营位时间范围
     */
    public void setOperationTime(Integer operationTime) {
        this.operationTime = operationTime;
    }

    /**
     * 获取android版本号
     *
     * @return android_version - android版本号
     */
    public Integer getAndroidVersion() {
        return androidVersion;
    }

    /**
     * 设置android版本号
     *
     * @param androidVersion android版本号
     */
    public void setAndroidVersion(Integer androidVersion) {
        this.androidVersion = androidVersion;
    }

    /**
     * 获取ios版本号
     *
     * @return ios_version - ios版本号
     */
    public Integer getIosVersion() {
        return iosVersion;
    }

    /**
     * 设置ios版本号
     *
     * @param iosVersion ios版本号
     */
    public void setIosVersion(Integer iosVersion) {
        this.iosVersion = iosVersion;
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


    public Integer getIntervalHour() {
        return intervalHour;
    }

    public void setIntervalHour(Integer intervalHour) {
        this.intervalHour = intervalHour;
    }

    public Integer getShowNumber() {
        return showNumber;
    }

    public void setShowNumber(Integer showNumber) {
        this.showNumber = showNumber;
    }


    public Integer getNextTime() {
        return nextTime;
    }

    public void setNextTime(Integer nextTime) {
        this.nextTime = nextTime;
    }

    public Integer getBoyActiveAuto() {
        return boyActiveAuto;
    }

    public void setBoyActiveAuto(Integer boyActiveAuto) {
        this.boyActiveAuto = boyActiveAuto;
    }

    public Integer getGirlActiveAuto() {
        return girlActiveAuto;
    }

    public void setGirlActiveAuto(Integer girlActiveAuto) {
        this.girlActiveAuto = girlActiveAuto;
    }

    public Integer getHotUserMinStoneNum() {
        return hotUserMinStoneNum;
    }

    public void setHotUserMinStoneNum(Integer hotUserMinStoneNum) {
        this.hotUserMinStoneNum = hotUserMinStoneNum;
    }

    public Integer getTopUserNum() {
        return topUserNum;
    }

    public void setTopUserNum(Integer topUserNum) {
        this.topUserNum = topUserNum;
    }

    public SwitchEnum getTopSwitch() {
        return topSwitch;
    }

    public void setTopSwitch(SwitchEnum topSwitch) {
        this.topSwitch = topSwitch;
    }

    public SwitchEnum getActiveSwitch() {
        return activeSwitch;
    }

    public void setActiveSwitch(SwitchEnum activeSwitch) {
        this.activeSwitch = activeSwitch;
    }

    public Integer getHomeSnapshot() {
        return homeSnapshot;
    }

    public void setHomeSnapshot(Integer homeSnapshot) {
        this.homeSnapshot = homeSnapshot;
    }


    public BigDecimal getInvitationGoldNum() {
        return invitationGoldNum;
    }

    public void setInvitationGoldNum(BigDecimal invitationGoldNum) {
        this.invitationGoldNum = invitationGoldNum;
    }


    public Integer getMatchWaitTime() {
        return matchWaitTime;
    }

    public void setMatchWaitTime(Integer matchWaitTime) {
        this.matchWaitTime = matchWaitTime;
    }


    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public Integer getMatchQuitTime() {
        return matchQuitTime;
    }

    public void setMatchQuitTime(Integer matchQuitTime) {
        this.matchQuitTime = matchQuitTime;
    }

    public Integer getMatchFriendButtonTime() {
        return matchFriendButtonTime;
    }

    public void setMatchFriendButtonTime(Integer matchFriendButtonTime) {
        this.matchFriendButtonTime = matchFriendButtonTime;
    }

    public Integer getMatchLikeButtonTime() {
        return matchLikeButtonTime;
    }

    public void setMatchLikeButtonTime(Integer matchLikeButtonTime) {
        this.matchLikeButtonTime = matchLikeButtonTime;
    }


    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppConfig{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", androidIncomeSwitch=").append(androidIncomeSwitch);
        sb.append(", iosIncomeSwitch=").append(iosIncomeSwitch);
        sb.append(", androidOperationSwitch=").append(androidOperationSwitch);
        sb.append(", iosOperationSwitch=").append(iosOperationSwitch);
        sb.append(", operationTime=").append(operationTime);
        sb.append(", androidVersion=").append(androidVersion);
        sb.append(", iosVersion=").append(iosVersion);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", intervalHour=").append(intervalHour);
        sb.append(", showNumber=").append(showNumber);
        sb.append(", nextTime=").append(nextTime);
        sb.append(", boyActiveAuto=").append(boyActiveAuto);
        sb.append(", girlActiveAuto=").append(girlActiveAuto);
        sb.append(", hotUserMinStoneNum=").append(hotUserMinStoneNum);
        sb.append(", topUserNum=").append(topUserNum);
        sb.append(", topSwitch=").append(topSwitch);
        sb.append(", activeSwitch=").append(activeSwitch);
        sb.append(", homeSnapshot=").append(homeSnapshot);
        sb.append(", invitationGoldNum=").append(invitationGoldNum);
        sb.append(", matchWaitTime=").append(matchWaitTime);
        sb.append(", platformType=").append(platformType);
        sb.append(", matchQuitTime=").append(matchQuitTime);
        sb.append(", matchFriendButtonTime=").append(matchFriendButtonTime);
        sb.append(", matchLikeButtonTime=").append(matchLikeButtonTime);
        sb.append('}');
        return sb.toString();
    }
}