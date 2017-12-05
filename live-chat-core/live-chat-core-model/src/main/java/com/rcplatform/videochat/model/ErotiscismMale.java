package com.rcplatform.videochat.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by ruihuagong on 2017/10/20.
 * 保存每个级别男性更新改色情男的记录
 */
@Table(name = "rc_erotiscism_male")
public class ErotiscismMale implements Serializable {

	public ErotiscismMale() {
	}

	public ErotiscismMale(Integer userId, Integer userLevel, Integer appId) {
		this.userId = userId;
		this.userLevel = userLevel;
		this.appId = appId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id")
	private Integer userId;

	/**
	 * 用户基本
	 */
	@Column(name = "user_level")
	private Integer userLevel;

	@Column(name = "app_id")
	private Integer appId;

	@Column(name = "create_date")
	private Timestamp createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
}

