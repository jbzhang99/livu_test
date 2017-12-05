package com.rcplatform.livechat.bean;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by admin on 2017/4/7.
 */
public class UserValidate implements Serializable {

	public UserValidate() {
	}

	public UserValidate(String token, String deviceId, String deviceName, Boolean sealing) {
		this.token = token;
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.sealing = sealing;
	}

	private String token;


	private String deviceId;


	private String deviceName;


	private Boolean sealing;


	private Date sealingTime;


	private Integer sealingReason;


	private Integer sealingCount;


	private Integer gold;

	/**
	 * 当前封号的时间
	 */
	private Date forbidTime;


	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public Boolean getSealing() {
		return sealing;
	}

	public void setSealing(Boolean sealing) {
		this.sealing = sealing;
	}

	public Date getSealingTime() {
		return sealingTime;
	}

	public void setSealingTime(Date sealingTime) {
		this.sealingTime = sealingTime;
	}

	public Integer getSealingReason() {
		return sealingReason;
	}

	public void setSealingReason(Integer sealingReason) {
		this.sealingReason = sealingReason;
	}

	public Integer getSealingCount() {
		return sealingCount;
	}

	public void setSealingCount(Integer sealingCount) {
		this.sealingCount = sealingCount;
	}


	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public Date getForbidTime() {
		return forbidTime;
	}

	public void setForbidTime(Date forbidTime) {
		this.forbidTime = forbidTime;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UserValidate{");
		sb.append("token='").append(token).append('\'');
		sb.append(", deviceId='").append(deviceId).append('\'');
		sb.append(", deviceName='").append(deviceName).append('\'');
		sb.append(", sealing=").append(sealing);
		sb.append(", sealingTime=").append(sealingTime);
		sb.append(", sealingReason=").append(sealingReason);
		sb.append(", sealingCount=").append(sealingCount);
		sb.append(", gold=").append(gold);
		sb.append('}');
		return sb.toString();
	}
}
