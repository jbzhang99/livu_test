package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_consume")
@ApiModel
public class Consume implements Serializable {
	/**
	 * 主键
	 */
	@Id
	@ApiModelProperty(value = "主键")
	private Integer id;

	/**
	 * 应用id
	 */
	@Column(name = "app_id")
	@ApiModelProperty(value = "应用id")
	private Integer appId;

	/**
	 * 消费品价格
	 */
	@ApiModelProperty(value = "消费品价格")
	private BigDecimal price;

	/**
	 * 消费品类型 1 表情互动  2 添加好友 3.匹配计费
	 */
	@ApiModelProperty(value = "消费品类型 1 表情互动  2 添加好友 3.匹配计费")
	private Integer type;

	/**
	 * 消费品名称
	 */
	@ApiModelProperty(value = "消费品名称")
	private String name;

	/**
	 * 创建时间
	 */
	@Column(name = "create_time")
	@ApiModelProperty(value = "创建时间")
	private Date createTime;

	/**
	 * 终端类型 0 未指定 1 ios 2 android
	 */
	@Column(name = "platform_type")
	private Integer platformType;

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

	/**
	 * 获取应用id
	 *
	 * @return app_id - 应用id
	 */
	public Integer getAppId() {
		return appId;
	}

	/**
	 * 设置应用id
	 *
	 * @param appId 应用id
	 */
	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	/**
	 * 获取消费品价格
	 *
	 * @return price - 消费品价格
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 设置消费品价格
	 *
	 * @param price 消费品价格
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 获取消费品类型 1 表情互动  2 添加好友 3.匹配计费
	 *
	 * @return type - 消费品类型 1 表情互动  2 添加好友 3.匹配计费
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * 设置消费品类型 1 表情互动  2 添加好友 3.匹配计费
	 *
	 * @param type 消费品类型 1 表情互动  2 添加好友 3.匹配计费
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * 获取消费品名称
	 *
	 * @return name - 消费品名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置消费品名称
	 *
	 * @param name 消费品名称
	 */
	public void setName(String name) {
		this.name = name;
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

	public Integer getPlatformType() {
		return platformType;
	}

	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", appId=").append(appId);
		sb.append(", price=").append(price);
		sb.append(", type=").append(type);
		sb.append(", name=").append(name);
		sb.append(", createTime=").append(createTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}