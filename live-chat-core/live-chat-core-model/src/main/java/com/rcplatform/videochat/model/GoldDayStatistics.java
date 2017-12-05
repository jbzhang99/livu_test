package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by yaoyuan on 2017/6/8.
 */
@Table(name = "rc_gold_day_statistics")
@ApiModel
public class GoldDayStatistics {

	public GoldDayStatistics() {
	}

	/**
	 * 主键
	 */
	@Id
	@ApiModelProperty(value = "主键")
	private Integer id;

	@Column(name = "app_id")
	private Integer appId;

	/**
	 * 购买金币数
	 */
	@Column(name = "purchase_gold")
	@ApiModelProperty(value = "购买金币数")
	private Integer purchaseGold;

	/**
	 * 免费金币数
	 */
	@Column(name = "free_gold")
	@ApiModelProperty(value = "免费金币数")
	private Integer freeGold;

	/**
	 * 广告金币数
	 */
	@Column(name = "ad_gold")
	@ApiModelProperty(value = "广告金币数")
	private Integer adGold;

	/**
	 * 统计日期
	 */
	@Column(name = "create_time")
	@ApiModelProperty(value = "统计日期")
	private Date createTime;

	/**
	 * 新用户购买金币数
	 */
	@Column(name = "new_user_add_gold")
	private Integer newUserAddGold;

	/**
	 * 老用户购买金币数
	 */
	@Column(name = "pre_user_add_gold")
	private Integer preUserAddGold;


	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPurchaseGold() {
		return purchaseGold;
	}

	public void setPurchaseGold(Integer purchaseGold) {
		this.purchaseGold = purchaseGold;
	}

	public Integer getFreeGold() {
		return freeGold;
	}

	public void setFreeGold(Integer freeGold) {
		this.freeGold = freeGold;
	}

	public Integer getAdGold() {
		return adGold;
	}

	public void setAdGold(Integer adGold) {
		this.adGold = adGold;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getNewUserAddGold() {
		return newUserAddGold;
	}

	public void setNewUserAddGold(Integer newUserAddGold) {
		this.newUserAddGold = newUserAddGold;
	}

	public Integer getPreUserAddGold() {
		return preUserAddGold;
	}

	public void setPreUserAddGold(Integer preUserAddGold) {
		this.preUserAddGold = preUserAddGold;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("GoldDayStatistics{");
		sb.append("id=").append(id);
		sb.append(", appId=").append(appId);
		sb.append(", purchaseGold=").append(purchaseGold);
		sb.append(", freeGold=").append(freeGold);
		sb.append(", adGold=").append(adGold);
		sb.append(", createTime=").append(createTime);
		sb.append('}');
		return sb.toString();
	}
}
