package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by ruihuagong on 2017/9/6.
 */
@Table(name = "rc_match_active_statistics")
@ApiModel(description = "活跃用户统计")
public class MatchActiveStatistics implements Serializable {

	private static final long serialVersionUID = 7194110818655724063L;

	@Id
	private Long id;

	@Column(name = "app_id")
	@ApiModelProperty(name = "应用编号")
	private Integer appId;

	@Column(name = "active_pay_user")
	@ApiModelProperty(name = "活跃的付费用户")
	private Integer activePayUserCount;

	@Column(name = "vip_match_girl")
	@ApiModelProperty(name = "'vip男匹配到女生的数量'")
	private Integer vipMatchGirlCount;

	@Column(name = "free_match_girl")
	@ApiModelProperty(name = "免费男匹配到女生的数量")
	private Integer freeMatchGirlCount;

	@Column(name = "new_match_girl")
	@ApiModelProperty(name = "新注册的用户男匹配到女生的次数")
	private Integer newMatchGirlCount;


	@Column(name = "old_match_girl")
	@ApiModelProperty(name = "老用户男匹配到女生的次数")
	private Integer oldMatchGirlCount;

	@Column(name = "girl_register_mobile")
	@ApiModelProperty(name = "女性通过手机号注册的次数")
	private Integer girlRegisterByMobileCount;

	@Column(name = "man_register_mobile")
	@ApiModelProperty(name = "男性通过手机号注册的次数")
	private Integer manRegisterByMobileCount;

	@Column(name = "create_date")
	@ApiModelProperty(name = "创建时间")
	private Date createDate;


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

	public Integer getActivePayUserCount() {
		return activePayUserCount;
	}

	public void setActivePayUserCount(Integer activePayUserCount) {
		this.activePayUserCount = activePayUserCount;
	}

	public Integer getVipMatchGirlCount() {
		return vipMatchGirlCount;
	}

	public void setVipMatchGirlCount(Integer vipMatchGirlCount) {
		this.vipMatchGirlCount = vipMatchGirlCount;
	}

	public Integer getFreeMatchGirlCount() {
		return freeMatchGirlCount;
	}

	public void setFreeMatchGirlCount(Integer freeMatchGirlCount) {
		this.freeMatchGirlCount = freeMatchGirlCount;
	}

	public Integer getNewMatchGirlCount() {
		return newMatchGirlCount;
	}

	public void setNewMatchGirlCount(Integer newMatchGirlCount) {
		this.newMatchGirlCount = newMatchGirlCount;
	}

	public Integer getOldMatchGirlCount() {
		return oldMatchGirlCount;
	}

	public void setOldMatchGirlCount(Integer oldMatchGirlCount) {
		this.oldMatchGirlCount = oldMatchGirlCount;
	}

	public Integer getGirlRegisterByMobileCount() {
		return girlRegisterByMobileCount;
	}

	public void setGirlRegisterByMobileCount(Integer girlRegisterByMobileCount) {
		this.girlRegisterByMobileCount = girlRegisterByMobileCount;
	}

	public Integer getManRegisterByMobileCount() {
		return manRegisterByMobileCount;
	}

	public void setManRegisterByMobileCount(Integer manRegisterByMobileCount) {
		this.manRegisterByMobileCount = manRegisterByMobileCount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public static MatchActiveStatistics instance() {
		MatchActiveStatistics matchActiveStatistics = new MatchActiveStatistics();
		return matchActiveStatistics;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
