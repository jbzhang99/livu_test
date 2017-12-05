package com.rcplatform.videochat.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by ruihuagong on 2017/9/11.
 */
@Table(name = "rc_push_statistics")
public class PushStatistics implements Serializable {

	private static final long serialVersionUID = -8232667422583022703L;

	@Id
	private Long id;

	//推送的编号
	@Column(name = "push_id")
	private Integer pushId;

	//推送内容
	@Column(name = "push_title")
	private String pushTitle;

	//应该推送的数量
	@Column(name = "should_push_num")
	private Long shouldPushNum;

	//实际推送的数量
	@Column(name = "real_push_num")
	private Long realPushNum;

	//打开push的人数
	@Column(name = "open_push_num")
	private Long openPushNum;

	//推送是时间
	@Column(name = "push_date")
	private Timestamp pushDate;

	//创建记录时间
	@Column(name = "create_date")
	private Timestamp createDate;

	@Column(name = "app_id")
	private Integer appId;

	@Column(name = "platform_type")
	private Integer platformType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPushId() {
		return pushId;
	}

	public void setPushId(Integer pushId) {
		this.pushId = pushId;
	}

	public String getPushTitle() {
		return pushTitle;
	}

	public void setPushTitle(String pushTitle) {
		this.pushTitle = pushTitle;
	}

	public Long getShouldPushNum() {
		return shouldPushNum;
	}

	public void setShouldPushNum(Long shouldPushNum) {
		this.shouldPushNum = shouldPushNum;
	}

	public Long getRealPushNum() {
		return realPushNum;
	}

	public void setRealPushNum(Long realPushNum) {
		this.realPushNum = realPushNum;
	}

	public Long getOpenPushNum() {
		return openPushNum;
	}

	public void setOpenPushNum(Long openPushNum) {
		this.openPushNum = openPushNum;
	}

	public Timestamp getPushDate() {
		return pushDate;
	}

	public void setPushDate(Timestamp pushDate) {
		this.pushDate = pushDate;
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

	public Integer getPlatformType() {
		return platformType;
	}

	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

