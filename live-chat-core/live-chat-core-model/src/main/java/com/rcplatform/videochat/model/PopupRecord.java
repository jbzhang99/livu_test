package com.rcplatform.videochat.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by ruihuagong on 2017/10/30.
 * popup举报记录表
 */
@Table(name = "rc_popup_record")
public class PopupRecord implements Serializable {

	private static final long serialVersionUID = -8579220284189115736L;

	public PopupRecord() {
	}

	public PopupRecord(Integer userId, Integer reportUserId, Integer reportType,
	                   Integer reportUserLevel, Integer reportUserGender, Integer appId,
	                   boolean eroticismBehavior, Integer platformType, Integer reportAppId, Integer reportPlatformType) {
		this.userId = userId;
		this.reportUserId = reportUserId;
		this.reportType = reportType;
		this.reportUserLevel = reportUserLevel;
		this.reportUserGender = reportUserGender;
		this.appId = appId;
		this.eroticismBehavior = eroticismBehavior;
		this.platformType = platformType;
		this.reportAppId = reportAppId;
		this.reportPlatformType = reportPlatformType;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "user_id")
	private Integer userId;

	/**
	 * '被举报人编号'
	 */
	@Column(name = "report_user_id")
	private Integer reportUserId;

	/**
	 * 举报类型 1举报 2 不举报 0不处理
	 */
	@Column(name = "report_type")
	private Integer reportType;

	/**
	 * 被举报人级别
	 */
	@Column(name = "report_user_level")
	private Integer reportUserLevel;

	/**
	 * 被举报人性别 1 男 2女
	 */
	@Column(name = "recport_user_gender")
	private Integer reportUserGender;

	@Column(name = "create_date")
	private Timestamp createDate;

	/**
	 * 应用编号
	 */
	@Column(name = "app_id")
	private Integer appId;

	/**
	 * 色情行为
	 */
	@Column(name = "eroticism_behavior")
	private boolean eroticismBehavior;

	/**
	 * 举报用户的appId
	 */
	@Column(name = "platform_type")
	private Integer platformType;

	/**
	 * 被举报用户的appId
	 */
	@Column(name = "report_app_id")
	private Integer reportAppId;

	/**
	 * 被举报用户的终端
	 */
	@Column(name = "report_platform_type")
	private Integer reportPlatformType;


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

	public Integer getReportUserId() {
		return reportUserId;
	}

	public void setReportUserId(Integer reportUserId) {
		this.reportUserId = reportUserId;
	}

	public Integer getReportType() {
		return reportType;
	}

	public void setReportType(Integer reportType) {
		this.reportType = reportType;
	}

	public Integer getReportUserLevel() {
		return reportUserLevel;
	}

	public void setReportUserLevel(Integer reportUserLevel) {
		this.reportUserLevel = reportUserLevel;
	}

	public Integer getReportUserGender() {
		return reportUserGender;
	}

	public void setReportUserGender(Integer reportUserGender) {
		this.reportUserGender = reportUserGender;
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

	public boolean isEroticismBehavior() {
		return eroticismBehavior;
	}

	public void setEroticismBehavior(boolean eroticismBehavior) {
		this.eroticismBehavior = eroticismBehavior;
	}

	public Integer getPlatformType() {
		return platformType;
	}

	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}

	public Integer getReportAppId() {
		return reportAppId;
	}

	public void setReportAppId(Integer reportAppId) {
		this.reportAppId = reportAppId;
	}

	public Integer getReportPlatformType() {
		return reportPlatformType;
	}

	public void setReportPlatformType(Integer reportPlatformType) {
		this.reportPlatformType = reportPlatformType;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

