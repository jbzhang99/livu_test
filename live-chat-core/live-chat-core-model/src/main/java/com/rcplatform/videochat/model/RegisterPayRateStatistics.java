package com.rcplatform.videochat.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by ruihuagong on 2017/9/14.
 * 新老用户注册付费统计
 */
public class RegisterPayRateStatistics implements Serializable {

	private static final long serialVersionUID = 6867648676671491247L;

	private Long id;

	/**
	 * 活跃用户数量
	 */
	private Integer activeUserNum;


	/**
	 * 新注册当天付费的用户数量
	 */
	private Integer newUserPayDayNum;


	/**
	 * 新注册当天购买的金币数
	 */
	private Integer newUserPayDayGold;


	/**
	 * 新注册当天支付的销售额
	 */
	private BigDecimal newUserPayDayMoney;


	/**
	 * 之前注册`未付费`当天付费的用户数
	 */
	private Integer preFreeUserPayDayNum;


	/**
	 * 之前注册`未付费`当天购买的金币数
	 */
	private Integer preFreeUserPayDayGold;


	/**
	 * 之前注册`未付费`当天购买的金币数
	 */
	private BigDecimal preFreeUserPayDayMoney;


	/**
	 * 之前注册`已付费`当天付费的用户数
	 */
	private Integer preVipUserPayDayNum;


	/**
	 * 之前注册`已付费`当天购买的金币数
	 */
	private Integer preVipUserPayDayGold;


	/**
	 * 之前注册`已付费`当天购买的金币数
	 */
	private BigDecimal preVipUserPayDayMoney;

	/**
	 * 新注册用户
	 */
	private Integer newUserNum;

	/**
	 * 新注册男性用户
	 */
	private Integer newBoyUserNum;

	/**
	 * 新付费男性用户数
	 */
	private Integer newBoyUserPayNum;

	/**
	 * 新用户付费率
	 */
	private BigDecimal newPayRate;

	/**
	 * 老用户付费率
	 */
	private BigDecimal prePayRate;

	/**
	 * 应用编号
	 */
	private Integer appId;

	/**
	 * 创建时间
	 */
	private Timestamp createDate;

	/**
	 * 1 ios 2 安卓
	 */
	private Integer rateType;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getActiveUserNum() {
		return activeUserNum;
	}

	public void setActiveUserNum(Integer activeUserNum) {
		this.activeUserNum = activeUserNum;
	}

	public Integer getNewUserPayDayNum() {
		return newUserPayDayNum;
	}

	public void setNewUserPayDayNum(Integer newUserPayDayNum) {
		this.newUserPayDayNum = newUserPayDayNum;
	}

	public Integer getNewUserPayDayGold() {
		return newUserPayDayGold;
	}

	public void setNewUserPayDayGold(Integer newUserPayDayGold) {
		this.newUserPayDayGold = newUserPayDayGold;
	}

	public BigDecimal getNewUserPayDayMoney() {
		return newUserPayDayMoney;
	}

	public void setNewUserPayDayMoney(BigDecimal newUserPayDayMoney) {
		this.newUserPayDayMoney = newUserPayDayMoney;
	}

	public Integer getPreFreeUserPayDayNum() {
		return preFreeUserPayDayNum;
	}

	public void setPreFreeUserPayDayNum(Integer preFreeUserPayDayNum) {
		this.preFreeUserPayDayNum = preFreeUserPayDayNum;
	}

	public Integer getPreFreeUserPayDayGold() {
		return preFreeUserPayDayGold;
	}

	public void setPreFreeUserPayDayGold(Integer preFreeUserPayDayGold) {
		this.preFreeUserPayDayGold = preFreeUserPayDayGold;
	}

	public BigDecimal getPreFreeUserPayDayMoney() {
		return preFreeUserPayDayMoney;
	}

	public void setPreFreeUserPayDayMoney(BigDecimal preFreeUserPayDayMoney) {
		this.preFreeUserPayDayMoney = preFreeUserPayDayMoney;
	}

	public Integer getPreVipUserPayDayNum() {
		return preVipUserPayDayNum;
	}

	public void setPreVipUserPayDayNum(Integer preVipUserPayDayNum) {
		this.preVipUserPayDayNum = preVipUserPayDayNum;
	}

	public Integer getPreVipUserPayDayGold() {
		return preVipUserPayDayGold;
	}

	public void setPreVipUserPayDayGold(Integer preVipUserPayDayGold) {
		this.preVipUserPayDayGold = preVipUserPayDayGold;
	}

	public BigDecimal getPreVipUserPayDayMoney() {
		return preVipUserPayDayMoney;
	}

	public void setPreVipUserPayDayMoney(BigDecimal preVipUserPayDayMoney) {
		this.preVipUserPayDayMoney = preVipUserPayDayMoney;
	}

	public Integer getNewUserNum() {
		return newUserNum;
	}

	public void setNewUserNum(Integer newUserNum) {
		this.newUserNum = newUserNum;
	}

	public Integer getNewBoyUserNum() {
		return newBoyUserNum;
	}

	public void setNewBoyUserNum(Integer newBoyUserNum) {
		this.newBoyUserNum = newBoyUserNum;
	}

	public Integer getNewBoyUserPayNum() {
		return newBoyUserPayNum;
	}

	public void setNewBoyUserPayNum(Integer newBoyUserPayNum) {
		this.newBoyUserPayNum = newBoyUserPayNum;
	}

	public BigDecimal getNewPayRate() {
		return newPayRate;
	}

	public void setNewPayRate(BigDecimal newPayRate) {
		this.newPayRate = newPayRate;
	}

	public BigDecimal getPrePayRate() {
		return prePayRate;
	}

	public void setPrePayRate(BigDecimal prePayRate) {
		this.prePayRate = prePayRate;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Integer getRateType() {
		return rateType;
	}

	public void setRateType(Integer rateType) {
		this.rateType = rateType;
	}
}
