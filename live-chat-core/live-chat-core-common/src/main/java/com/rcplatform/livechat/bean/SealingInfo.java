package com.rcplatform.livechat.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Yang Peng on 2017/5/8.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */

public class SealingInfo implements Serializable {

	public SealingInfo() {
	}

	public SealingInfo(Date sealingTime, Integer sealingReason, Integer sealingCount, Integer gold) {
		this.sealingTime = sealingTime;
		this.sealingReason = sealingReason;
		this.sealingCount = sealingCount;
		this.gold = gold;
	}

	public SealingInfo(Date sealingTime, Integer sealingReason, Integer sealingCount, Integer gold, Date forbidTime) {
		this.sealingTime = sealingTime;
		this.sealingReason = sealingReason;
		this.sealingCount = sealingCount;
		this.gold = gold;
		this.forbidTime = forbidTime;
	}

	private Date sealingTime;


	private Integer sealingReason;


	private Integer sealingCount;


	private Integer gold;

	/**
	 * 当前封号时间
	 */
	private Date forbidTime;


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
		final StringBuilder sb = new StringBuilder("SealingInfo{");
		sb.append("sealingTime=").append(sealingTime);
		sb.append(", sealingReason=").append(sealingReason);
		sb.append(", sealingCount=").append(sealingCount);
		sb.append(", gold=").append(gold);
		sb.append('}');
		return sb.toString();
	}
}
