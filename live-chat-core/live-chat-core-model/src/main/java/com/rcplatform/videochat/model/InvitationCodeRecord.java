package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaoyuan on 2017/8/15.
 */
@Table(name = "rc_invitation_code_record")
@ApiModel
public class InvitationCodeRecord implements Serializable {

	public InvitationCodeRecord() {
	}

	@Id
	@ApiModelProperty(value = "")
	private Integer id;


	@Column(name = "user_id")
	@ApiModelProperty(value = "用户id")
	private Integer userId;

	@Column(name = "type")
	@ApiModelProperty(value = "用户类型,1 邀请者，2 被邀请者")
	private Integer type;

	@Column(name = "device_id")
	@ApiModelProperty(value = "设备ID")
	private String deviceId;

	@Column(name = "invitation_code")
	@ApiModelProperty(value = "邀请码")
	private String invitationCode;

	/**
	 * 应用类型
	 */
	@Column(name = "app_id")
	private Integer appId;

	/**
	 * 终端类型
	 */
	@Column(name = "platform_type")
	private Integer platformType;


	@Column(name = "create_time")
	@ApiModelProperty(value = "创建时间")
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getInvitationCode() {
		return invitationCode;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
}
