package com.rcplatform.videochat.model;

import com.rcplatform.livechat.enums.InvitationCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by ruihuagong on 2017/9/4.
 * 邀请用户统计表
 */
@Table(name = "rc_invite_user_statistics")
@ApiModel(description = "邀请用户统计")
public class InviteUserStatistics implements Serializable {

	private static final long serialVersionUID = -5044839740245083060L;

	@ApiModelProperty(value = "编号")
	@Id
	public Long id;

	@ApiModelProperty(name = "邀请用户的数量")
	@Column(name = "invite_user_count")
	public Long inviteUserCount;

	@ApiModelProperty(name = "注册用户的数量")
	@Column(name = "register_user_count")
	public Long registerUserCount;

	@ApiModelProperty(name = "安装数量")
	@Column(name = "install_soft_user_count")
	public Long installSoftUserCount;

	@ApiModelProperty(name = "邀请赠送金币的总数量")
	@Column(name = "send_gold_count")
	public BigDecimal sendGoldCount;

	@ApiModelProperty(name = "创建时间")
	@Column(name = "create_date")
	public Timestamp createDate;

	@ApiModelProperty(name = "项目编号")
	@Column(name = "app_id")
	public Integer appId;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getInviteUserCount() {
		return inviteUserCount;
	}

	public void setInviteUserCount(Long inviteUserCount) {
		this.inviteUserCount = inviteUserCount;
	}

	public Long getRegisterUserCount() {
		return registerUserCount;
	}

	public void setRegisterUserCount(Long registerUserCount) {
		this.registerUserCount = registerUserCount;
	}

	public Long getInstallSoftUserCount() {
		return installSoftUserCount;
	}

	public void setInstallSoftUserCount(Long installSoftUserCount) {
		this.installSoftUserCount = installSoftUserCount;
	}

	public BigDecimal getSendGoldCount() {
		return sendGoldCount;
	}

	public void setSendGoldCount(BigDecimal sendGoldCount) {
		this.sendGoldCount = sendGoldCount;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	/**
	 * 设置数据
	 *
	 * @param invitationCodeEnum
	 * @param userCount
	 */
	public void setEveryUserCount(InvitationCodeEnum invitationCodeEnum, Long userCount) {
		if (invitationCodeEnum.equals(InvitationCodeEnum.INVITATION)) {
			this.setInviteUserCount(userCount);
		} else if (invitationCodeEnum.equals(InvitationCodeEnum.BE_INVITED)) {
			this.setRegisterUserCount(userCount);
		} else if (invitationCodeEnum.equals(InvitationCodeEnum.INSTALL)) {
			this.setInstallSoftUserCount(userCount);
		}
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
