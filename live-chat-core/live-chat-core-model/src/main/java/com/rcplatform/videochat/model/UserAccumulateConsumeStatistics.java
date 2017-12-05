package com.rcplatform.videochat.model;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by ruihuagong on 2017/9/13.
 * 用户累积消费统计
 */
public class UserAccumulateConsumeStatistics implements Serializable {


	private Long id;

	//每月消费统计
	private String monthUserCount;

	//总共消费的用户
	private String totalUserCount;

	//创建时间
	private Date createDate;

	private Integer appId;

	@Transient
	private List<String> monthUserLists = Lists.newArrayList();

	@Transient
	private List<String> totalUserLists = Lists.newArrayList();


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMonthUserCount() {
		return monthUserCount;
	}

	public void setMonthUserCount(String monthUserCount) {
		this.monthUserCount = monthUserCount;
	}

	public String getTotalUserCount() {
		return totalUserCount;
	}

	public void setTotalUserCount(String totalUserCount) {
		this.totalUserCount = totalUserCount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public List<String> getMonthUserLists() {
		if (StringUtils.isNotBlank(this.monthUserCount)) {
			return Splitter.on(",").omitEmptyStrings().splitToList(this.monthUserCount);
		}
		return monthUserLists;
	}

	public List<String> getTotalUserLists() {
		if (StringUtils.isNotBlank(this.totalUserCount)) {
			return Splitter.on(",").omitEmptyStrings().splitToList(this.totalUserCount);
		}
		return totalUserLists;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public void setMonthUserLists(List<String> monthUserLists) {
		this.monthUserLists = monthUserLists;
	}

	public void setTotalUserLists(List<String> totalUserLists) {
		this.totalUserLists = totalUserLists;
	}
}
