package com.rcplatform.videochat.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by ruihuagong on 2017/10/12.
 */
@Table(name = "rc_eroticism_circle_user")
public class EroticismCircleUser implements Serializable {

	private static final long serialVersionUID = -1317407396038479157L;

	public EroticismCircleUser() {
	}


	public EroticismCircleUser(Integer userId, Integer appId) {
		this.userId = userId;
		this.appId = appId;
	}

	public EroticismCircleUser(Integer userId) {
		this.userId = userId;
	}

	public EroticismCircleUser(Integer userId, Integer appId, Integer popups, Integer eroticismTimes, Integer eroticismType) {
		this.userId = userId;
		this.appId = appId;
		this.popups = popups;
		this.eroticismTimes = eroticismTimes;
		this.eroticismType = eroticismType;
	}

	public EroticismCircleUser enterCircleInstance() {
		this.setStatus(1);
		this.setType(0);
		return this;
	}

	public EroticismCircleUser leaveCircleInstanceByReport() {
		this.setStatus(2);
		this.setType(1);
		return this;
	}

	public EroticismCircleUser leaveCircleInstanceByGender() {
		this.setStatus(3);
		this.setType(1);
		return this;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 用户编号
	 */
	@Column(name = "user_id")
	private Integer userId;

	/**
	 * 状态  1 正常 2举报别人出圈 再也进不来 3 性别更改出圈
	 */
	@Column(name = "status")
	private Integer status;

	/**
	 * 0 进圈 1 出圈
	 */
	@Column(name = "type")
	private Integer type;

	/**
	 * 创建时间
	 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/**
	 * 应用编号
	 */
	@Column(name = "app_id")
	private Integer appId;

	/**
	 * popup不举报次数
	 */
	@Column(name = "popups")
	private Integer popups;

	/**
	 * 色情次数
	 */
	@Column(name = "eroticism_times")
	private Integer eroticismTimes;

	/**
	 * eroticism comfirm 2:eroticism likely 3:sexy comfirm 4:sexy likely 5:other
	 */
	@Column(name = "eroticism_type")
	private Integer eroticismType;

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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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

	public Integer getPopups() {
		return popups;
	}

	public void setPopups(Integer popups) {
		this.popups = popups;
	}

	public Integer getEroticismTimes() {
		return eroticismTimes;
	}

	public void setEroticismTimes(Integer eroticismTimes) {
		this.eroticismTimes = eroticismTimes;
	}

	public Integer getEroticismType() {
		return eroticismType;
	}

	public void setEroticismType(Integer eroticismType) {
		this.eroticismType = eroticismType;
	}
}

