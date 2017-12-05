package com.rcplatform.videochat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * Created by ruihuagong on 2017/10/11.
 * 封号配置详情
 */
@Table(name = "rc_seal_detail")
public class SealDetail implements Serializable {

	private static final long serialVersionUID = 870354471375893966L;

	@Id
	private Long id;

	/**
	 * 封号记录编号
	 */
	@Column(name = "seal_setting_id")
	private Long sealSettingId;

	/**
	 * 封号次数
	 */
	@Column(name = "seal_num")
	private Integer sealNum;

	/**
	 * 封号的时间 分钟
	 */
	@Column(name = "seal_time")
	private Integer sealTime;

	@Transient
	private String sealSettingName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSealSettingId() {
		return sealSettingId;
	}

	public void setSealSettingId(Long sealSettingId) {
		this.sealSettingId = sealSettingId;
	}

	public Integer getSealNum() {
		return sealNum;
	}

	public void setSealNum(Integer sealNum) {
		this.sealNum = sealNum;
	}

	public Integer getSealTime() {
		return sealTime;
	}

	public void setSealTime(Integer sealTime) {
		this.sealTime = sealTime;
	}

	public String getSealSettingName() {
		return sealSettingName;
	}

	public void setSealSettingName(String sealSettingName) {
		this.sealSettingName = sealSettingName;
	}
}

