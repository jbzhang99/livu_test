package com.rcplatform.videochat.model;

import com.google.common.collect.Lists;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by ruihuagong on 2017/10/11.
 * 封号和解封角色
 */
@Table(name = "rc_seal_setting")
public class SealSetting implements Serializable {

	private static final long serialVersionUID = 5113439323898169404L;

	public SealSetting() {
	}

	public SealSetting(Integer appId) {
		this.appId = appId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 应用编号
	 */
	@Column(name = "app_id")
	private Integer appId;

	/**
	 * 用户级别
	 */
	@Column(name = "user_level")
	private Integer userLevel;

	/**
	 * 用户性别
	 */
	@Column(name = "gender")
	private Integer gender;

	/**
	 * 版本号
	 */
	@Column(name = "version")
	private String version;

	/**
	 * 举报原因
	 */
	@Column(name = "report_reason")
	private Integer reportReason;

	/**
	 * 创建时间
	 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/**
	 * 是否开启 false 关闭 true 开启
	 */
	@Column(name = "is_open")
	private Boolean open;

	/**
	 * 色情状态 false 非色情 true 色情
	 */
	@Column(name = "eroticism_status")
	private Boolean eroticismStatus;

	/**
	 * popup_report_status true popup举报 false 非popup举报
	 */
	@Column(name = "popup_report_status")
	private Boolean popupReportStatus;

	/**
	 * 类型 0 自动截图 1 手动截取
	 */
	@Column(name = "type")
	private Integer type;

	@Column(name = "name")
	private String name;

	/**
	 * 终端类型
	 */
	@Column(name = "platform_type")
	private Integer platformType;

	/**
	 * 解封配置
	 */
	@Transient
	private SealUnlockDetail sealUnlockDetail;

	/**
	 * 封号配置列表
	 */
	@Transient
	private List<SealDetail> sealDetails = Lists.newArrayList();

	@Transient
	private String userLevelName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Integer getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getReportReason() {
		return reportReason;
	}

	public void setReportReason(Integer reportReason) {
		this.reportReason = reportReason;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public Boolean getEroticismStatus() {
		return eroticismStatus;
	}

	public void setEroticismStatus(Boolean eroticismStatus) {
		this.eroticismStatus = eroticismStatus;
	}

	public Boolean getPopupReportStatus() {
		return popupReportStatus;
	}

	public void setPopupReportStatus(Boolean popupReportStatus) {
		this.popupReportStatus = popupReportStatus;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public SealUnlockDetail getSealUnlockDetail() {
		return sealUnlockDetail;
	}

	public void setSealUnlockDetail(SealUnlockDetail sealUnlockDetail) {
		this.sealUnlockDetail = sealUnlockDetail;
	}

	public List<SealDetail> getSealDetails() {
		return sealDetails;
	}

	public void setSealDetails(List<SealDetail> sealDetails) {
		this.sealDetails = sealDetails;
	}

	public String getUserLevelName() {
		return userLevelName;
	}

	public void setUserLevelName(String userLevelName) {
		this.userLevelName = userLevelName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPlatformType() {
		return platformType;
	}

	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}
}


