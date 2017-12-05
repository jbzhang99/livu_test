package com.rcplatform.livechat.dto.response.admin;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by yaoyuan on 2017/8/10.
 */
public class PushStatisticsRespDto implements Serializable {

	public PushStatisticsRespDto() {
	}

	private Integer appId;

	private Integer pushId;

	private String pushDescription;

	private Integer shouldPushNum = 0;

	private Integer pushNum = 0;

	private Integer openNum = 0;

	//5分钟充值的免费用户
	private Integer freeRechargeUserNum = 0;

	//5分钟充值的付费用户
	private Integer vipRechargeUserNum = 0;

	//终端类型 1 ios 1 安卓
	private Integer platformType;

	//推送时间 如果没有推送则为当前时间
	private Timestamp pushDate = new Timestamp(System.currentTimeMillis());


	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Integer getPushId() {
		return pushId;
	}

	public void setPushId(Integer pushId) {
		this.pushId = pushId;
	}

	public String getPushDescription() {
		return pushDescription;
	}

	public void setPushDescription(String pushDescription) {
		this.pushDescription = pushDescription;
	}

	public Integer getShouldPushNum() {
		return shouldPushNum;
	}

	public void setShouldPushNum(Integer shouldPushNum) {
		this.shouldPushNum = shouldPushNum;
	}

	public Integer getPushNum() {
		return pushNum;
	}

	public void setPushNum(Integer pushNum) {
		this.pushNum = pushNum;
	}

	public Integer getOpenNum() {
		return openNum;
	}

	public void setOpenNum(Integer openNum) {
		this.openNum = openNum;
	}

	public Integer getFreeRechargeUserNum() {
		return freeRechargeUserNum;
	}

	public void setFreeRechargeUserNum(Integer freeRechargeUserNum) {
		this.freeRechargeUserNum = freeRechargeUserNum;
	}

	public Integer getVipRechargeUserNum() {
		return vipRechargeUserNum;
	}

	public void setVipRechargeUserNum(Integer vipRechargeUserNum) {
		this.vipRechargeUserNum = vipRechargeUserNum;
	}

	public Integer getPlatformType() {
		return platformType;
	}

	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}

	public Timestamp getPushDate() {
		return pushDate;
	}

	public void setPushDate(Timestamp pushDate) {
		this.pushDate = pushDate;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("PushStatisticsRespDto{");
		sb.append("appId=").append(appId);
		sb.append(", pushId=").append(pushId);
		sb.append(", pushDescription='").append(pushDescription).append('\'');
		sb.append(", shouldPushNum=").append(shouldPushNum);
		sb.append(", pushNum=").append(pushNum);
		sb.append(", openNum=").append(openNum);
		sb.append('}');
		return sb.toString();
	}
}
