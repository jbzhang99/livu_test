package com.rcplatform.videochat.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_eroticism_circle_setting")
public class EroticismCircleSetting implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "app_id")
	private Integer appId;

	/**
	 * 1:male 2:female
	 */
	private Integer gender;

	/**
	 * 1:eroticism comfirm 2:eroticism likely 3:sexy comfirm 4:sexy likely 5:other
	 */
	@Column(name = "eroticism_type")
	private Integer eroticismType;

	@Column(name = "times")
	private Integer times;

	/**
	 * not report times
	 */
	private Integer popup;

	@Column(name = "create_time")
	private Date createTime;

	/**
	 * 终端类型 0 未指定 1 ios 2 android
	 */
	@Column(name = "platform_type")
	private Integer platformType;

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return app_id
	 */
	public Integer getAppId() {
		return appId;
	}

	/**
	 * @param appId
	 */
	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	/**
	 * ��ȡ1:male 2:female
	 *
	 * @return gender - 1:male 2:female
	 */
	public Integer getGender() {
		return gender;
	}

	/**
	 * ����1:male 2:female
	 *
	 * @param gender 1:male 2:female
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * ��ȡ1:eroticism comfirm 2:eroticism likely 3:sexy comfirm 4:sexy likely 5:other
	 *
	 * @return eroticism_type - 1:eroticism comfirm 2:eroticism likely 3:sexy comfirm 4:sexy likely 5:other
	 */
	public Integer getEroticismType() {
		return eroticismType;
	}

	/**
	 * ����1:eroticism comfirm 2:eroticism likely 3:sexy comfirm 4:sexy likely 5:other
	 *
	 * @param eroticismType 1:eroticism comfirm 2:eroticism likely 3:sexy comfirm 4:sexy likely 5:other
	 */
	public void setEroticismType(Integer eroticismType) {
		this.eroticismType = eroticismType;
	}

	/**
	 * ��ȡnot report times
	 *
	 * @return popup - not report times
	 */
	public Integer getPopup() {
		return popup;
	}

	/**
	 * ����not report times
	 *
	 * @param popup not report times
	 */
	public void setPopup(Integer popup) {
		this.popup = popup;
	}

	/**
	 * @return create_time
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getTimes() {
		return times;
	}

	public void setTimes(Integer times) {
		this.times = times;
	}

	public Integer getPlatformType() {
		return platformType;
	}

	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}
}