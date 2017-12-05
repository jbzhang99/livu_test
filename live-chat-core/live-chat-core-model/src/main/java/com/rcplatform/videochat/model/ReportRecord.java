package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_report_record")
@ApiModel
public class ReportRecord implements Serializable {

	public ReportRecord() {
	}


	public ReportRecord(Integer useId, Date offTime, Integer offDuration) {
		this.useId = useId;
		this.offTime = offTime;
		this.offDuration = offDuration;
	}

	public ReportRecord(Integer useId, Date offTime, Date deadline, Integer offDuration, Integer reportReason,
	                    Integer appId, Integer platformType) {
		this.useId = useId;
		this.offTime = offTime;
		this.deadline = deadline;
		this.offDuration = offDuration;
		this.reportReason = reportReason;
		this.appId = appId;
		this.platformType = platformType;
	}


	public ReportRecord(Integer useId, Date offTime, Integer offDuration, Integer reportReason) {
		this.useId = useId;
		this.offTime = offTime;
		this.offDuration = offDuration;
		this.reportReason = reportReason;
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
	 * 用户id
	 */
	@Column(name = "use_id")
	@ApiModelProperty(value = "用户id")
	private Integer useId;

	/**
	 * 禁用的时间
	 */
	@Column(name = "off_time")
	@ApiModelProperty(value = "禁用的时间")
	private Date offTime;


	@ApiModelProperty(value = "截至时间")
	private Date deadline;

	/**
	 * 禁用的时间长度 ，小时
	 */
	@Column(name = "off_duration")
	@ApiModelProperty(value = "禁用的时间长度 ，小时")
	private Integer offDuration;


	/**
	 * 更新时间
	 */
	@Column(name = "update_time")
	@ApiModelProperty(value = "更新时间")
	private Date updateTime;

	/**
	 * 记录创建时间
	 */
	@Column(name = "create_time")
	@ApiModelProperty(value = "记录创建时间")
	private Date createTime;


	/**
	 *
	 */
	@Column(name = "report_reason")
	@ApiModelProperty(value = "举报原因 1,性别不符，2 色情裸露 3 无原因")
	private Integer reportReason;

	/**
	 * 用户性别
	 */
	@Column(name = "gender")
	private Integer gender;

	/**
	 * 用户级别
	 */
	@Column(name = "user_level")
	private Integer userLevel;

	/**
	 * 用户的色情行为
	 */
	@Column(name = "eroticism_behavior")
	private boolean eroticismBehavior;

	@Transient
	private String userLevelName;

	/**
	 * 用户的终端
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
	 * 获取用户id
	 *
	 * @return use_id - 用户id
	 */
	public Integer getUseId() {
		return useId;
	}

	/**
	 * 设置用户id
	 *
	 * @param useId 用户id
	 */
	public void setUseId(Integer useId) {
		this.useId = useId;
	}

	/**
	 * 获取禁用的时间
	 *
	 * @return off_time - 禁用的时间
	 */
	public Date getOffTime() {
		return offTime;
	}

	/**
	 * 设置禁用的时间
	 *
	 * @param offTime 禁用的时间
	 */
	public void setOffTime(Date offTime) {
		this.offTime = offTime;
	}

	/**
	 * 获取禁用的时间长度 ，小时
	 *
	 * @return off_duration - 禁用的时间长度 ，小时
	 */
	public Integer getOffDuration() {
		return offDuration;
	}

	/**
	 * 设置禁用的时间长度 ，小时
	 *
	 * @param offDuration 禁用的时间长度 ，小时
	 */
	public void setOffDuration(Integer offDuration) {
		this.offDuration = offDuration;
	}

	/**
	 * 获取更新时间
	 *
	 * @return update_time - 更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置更新时间
	 *
	 * @param updateTime 更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取记录创建时间
	 *
	 * @return create_time - 记录创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置记录创建时间
	 *
	 * @param createTime 记录创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public Integer getReportReason() {
		return reportReason;
	}

	public void setReportReason(Integer reportReason) {
		this.reportReason = reportReason;
	}


	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	public boolean isEroticismBehavior() {
		return eroticismBehavior;
	}

	public void setEroticismBehavior(boolean eroticismBehavior) {
		this.eroticismBehavior = eroticismBehavior;
	}

	public String getUserLevelName() {
		return userLevelName;
	}

	public void setUserLevelName(String userLevelName) {
		this.userLevelName = userLevelName;
	}

	public Integer getPlatformType() {
		return platformType;
	}

	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("ReportRecord{");
		sb.append("id=").append(id);
		sb.append(", appId=").append(appId);
		sb.append(", useId=").append(useId);
		sb.append(", offTime=").append(offTime);
		sb.append(", deadline=").append(deadline);
		sb.append(", offDuration=").append(offDuration);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", createTime=").append(createTime);
		sb.append(", reportReason=").append(reportReason);
		sb.append('}');
		return sb.toString();
	}
}