package com.rcplatform.videochat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by ruihuagong on 2017/9/11.
 * push后5小时内充值的用户列表
 */
@Table(name = "rc_push_recharge_statistics")
public class PushRechargeStatistics implements Serializable {

	private static final long serialVersionUID = 5752760885698151165L;

	@Id
	private Long id;

	//终端类型
	@Column(name = "platform_type")
	private Integer platformType;

	//用户编号
	@Column(name = "user_id")
	private Long userId;

	//支付时间
	@Column(name = "pay_date")
	private Timestamp payDate;

	//充值金额
	private BigDecimal money;

	//充值金币数量
	private BigDecimal gold;

	//是否是付费用户
	@Column(name = "pay_status")
	private Boolean payStatus;

	@Column(name = "app_id")
	private Integer appId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPlatformType() {
		return platformType;
	}

	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Timestamp getPayDate() {
		return payDate;
	}

	public void setPayDate(Timestamp payDate) {
		this.payDate = payDate;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public BigDecimal getGold() {
		return gold;
	}

	public void setGold(BigDecimal gold) {
		this.gold = gold;
	}


	public Boolean getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Boolean payStatus) {
		this.payStatus = payStatus;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}
}
