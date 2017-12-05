package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_user_unblock_record")
@ApiModel
public class UserUnblockRecord implements Serializable {

	public UserUnblockRecord() {
	}


	public UserUnblockRecord(Integer userId, BigDecimal gold) {
		this.userId = userId;
		this.gold = gold;
	}

	public UserUnblockRecord(Integer userId, BigDecimal gold, Integer appId, Integer platformType) {
		this.userId = userId;
		this.gold = gold;
		this.appId = appId;
		this.platformType = platformType;
	}

	/**
	 * id
	 */
	@Id
	@ApiModelProperty(value = "id")
	private Integer id;

	/**
	 * the user id
	 */
	@Column(name = "user_id")
	@ApiModelProperty(value = "the user id")
	private Integer userId;

	@ApiModelProperty(value = "解锁金币数")
	private BigDecimal gold;

	/**
	 * create time
	 */
	@Column(name = "create_time")
	@ApiModelProperty(value = "create time")
	private Date createTime;

	/**
	 * 应用的编号
	 */
	@Column(name = "app_id")
	private Integer appId;

	/**
	 * 终端类型
	 */
	@Column(name = "platform_type")
	private Integer platformType;

	private static final long serialVersionUID = 1L;

	/**
	 * 获取id
	 *
	 * @return id - id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置id
	 *
	 * @param id id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取the user id
	 *
	 * @return user_id - the user id
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 设置the user id
	 *
	 * @param userId the user id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * 获取create time
	 *
	 * @return create_time - create time
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置create time
	 *
	 * @param createTime create time
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public BigDecimal getGold() {
		return gold;
	}

	public void setGold(BigDecimal gold) {
		this.gold = gold;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Integer getPlatformType() {
		return platformType;
	}

	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UserUnblockRecord{");
		sb.append("id=").append(id);
		sb.append(", userId=").append(userId);
		sb.append(", gold=").append(gold);
		sb.append(", createTime=").append(createTime);
		sb.append('}');
		return sb.toString();
	}
}