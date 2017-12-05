package com.rcplatform.videochat.model;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by ruihuagong on 2017/9/11.
 * push 到用户的详细列表
 */
@Table(name = "rc_push_detail")
public class PushDetail implements Serializable {


	private Long id;

	@Column(name = "user_id")
	private Long userId;

	//push的时间
	@Column(name = "push_date")
	private Timestamp pushDate;

	//push是否成功 true成功 false 失败
	@Column(name = "is_success")
	private Boolean pushSuccess;

	//push编号
	@Column(name = "push_id")
	private Long pushId;

	//记录的创建时间
	@Column(name = "create_date")
	private Timestamp createDate;

	public PushDetail() {
	}

	public PushDetail(Long userId, Boolean pushSuccess, Long pushId, Timestamp pushDate) {
		this.userId = userId;
		this.pushSuccess = pushSuccess;
		this.pushId = pushId;
		this.pushDate = pushDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Timestamp getPushDate() {
		return pushDate;
	}

	public void setPushDate(Timestamp pushDate) {
		this.pushDate = pushDate;
	}

	public Boolean getPushSuccess() {
		return pushSuccess;
	}

	public void setPushSuccess(Boolean pushSuccess) {
		this.pushSuccess = pushSuccess;
	}

	public Long getPushId() {
		return pushId;
	}

	public void setPushId(Long pushId) {
		this.pushId = pushId;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
}
