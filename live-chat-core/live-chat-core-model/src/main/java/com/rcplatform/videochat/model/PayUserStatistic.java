package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "rc_pay_user_statistic")
@ApiModel
public class PayUserStatistic implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 付费用户dau
     */
    @Column(name = "pay_user_dau")
    @ApiModelProperty(value="付费用户dau")
    private Integer payUserDau;

    /**
     * 付费用户请求次数
     */
    @Column(name = "pay_user_request")
    @ApiModelProperty(value="付费用户请求次数")
    private Integer payUserRequest;

    /**
     * 付费用户花金币匹配次数
     */
    @Column(name = "pay_user_match_gold")
    @ApiModelProperty(value="付费用户花金币匹配次数")
    private Integer payUserMatchGold;
    				
    /**
     * 付费用户免费匹配次数
     */
    @Column(name = "pay_user_match_nogold")
    @ApiModelProperty(value="付费用户免费匹配次数")
    private Integer payUserMatchNogold;

    
    /**
     * 付费用户匹配消耗金币数
     */
    @Column(name = "pay_user_match_consumegold")
    @ApiModelProperty(value="付费用户匹配消耗金币数")
    private Integer payUserMatchConsumegold;
    
    /**
     * 付费用户加好友花金币数
     */
    @Column(name = "pay_user_addfriend_gold")
    @ApiModelProperty(value="付费用户加好友花金币数")
    private Integer payUserAddfriendGold;

    /**
     * 花金币总数(匹配消耗金币+加好友消耗金币)
     */
    @Column(name = "pay_user_gold_total")
    @ApiModelProperty(value="花金币总数(匹配消耗金币+加好友消耗金币)")
    private Integer payUserGoldTotal;
    
    
    /**
     * 付费用户匹配成功举报次数
     */
    @Column(name = "pay_user_match_report")
    @ApiModelProperty(value="付费用户匹配成功举报次数")
    private Integer payUserMatchReport;
    

    /**
     * 每天付费用户数
     */
    @Column(name = "pay_user_add")
    @ApiModelProperty(value="每天付费用户数")
    private Integer payUserAdd;

    /**
     * 每天新用户付费数
     */
    @Column(name = "pay_user_add_new")
    @ApiModelProperty(value="每天新用户付费数")
    private Integer payUserAddNew;

    
    /**
     * 每天老用户付费数
     */
    @Column(name = "pay_user_add_old")
    @ApiModelProperty(value="每天老用户付费数")
    private Integer payUserAddOld;

    
    /**
     * 每天VIP被投诉封的数量
     */
    @Column(name = "pay_user_report_ban")
    @ApiModelProperty(value="每天VIP被投诉封的数量")
    private Integer payUserReportBan;

    
    /**
     * 每天被投诉男性用户数
     */
    @Column(name = "pay_user_report_male")
    @ApiModelProperty(value="每天被投诉男性用户数")
    private Integer payUserReportMale;

    
    /**
     * 每天因性别被投诉男性用户数
     */
    @Column(name = "pay_user_report_male_gender")
    @ApiModelProperty(value="每天因性别被投诉男性用户数")
    private Integer payUserReportMaleGender;
    
    
    /**
     * 每天因行为被投诉男性用户数
     */
    @Column(name = "pay_user_report_male_behavior")
    @ApiModelProperty(value="每天被投诉男性用户数")
    private Integer payUserReportMaleBehavior;
    
    
    /**
     * 每天被投诉女性用户数
     */
    @Column(name = "pay_user_report_female")
    @ApiModelProperty(value="每天被投诉女性用户数")
    private Integer payUserReportFemale;

    
    /**
     * 每天因性别被投诉女性用户数
     */
    @Column(name = "pay_user_report_female_gender")
    @ApiModelProperty(value="每天因性别被投诉女性用户数")
    private Integer payUserReportFemaleGender;
    
    
    /**
     * 每天因行为被投诉女性用户数
     */
    @Column(name = "pay_user_report_female_behavior")
    @ApiModelProperty(value="每天因行为被投诉女性用户数")
    private Integer payUserReportFemaleBehavior;
    
    
    
    /**
     *时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="时间")
    private Date createTime;
    
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPayUserDau() {
		return payUserDau;
	}

	public void setPayUserDau(Integer payUserDau) {
		this.payUserDau = payUserDau;
	}

	public Integer getPayUserRequest() {
		return payUserRequest;
	}

	public void setPayUserRequest(Integer payUserRequest) {
		this.payUserRequest = payUserRequest;
	}

	

	public Integer getPayUserMatchGold() {
		return payUserMatchGold;
	}

	public void setPayUserMatchGold(Integer payUserMatchGold) {
		this.payUserMatchGold = payUserMatchGold;
	}

	public long getPayUserMatchNogold() {
		return payUserMatchNogold;
	}

	public void setPayUserMatchNogold(Integer matchNogoldNum) {
		this.payUserMatchNogold = matchNogoldNum;
	}


	public Integer getPayUserAddfriendGold() {
		return payUserAddfriendGold;
	}

	public void setPayUserAddfriendGold(Integer payUserAddfriendGold) {
		this.payUserAddfriendGold = payUserAddfriendGold;
	}

	public Integer getPayUserGoldTotal() {
		return payUserGoldTotal;
	}

	public void setPayUserGoldTotal(Integer payUserGoldTotal) {
		this.payUserGoldTotal = payUserGoldTotal;
	}

	public Integer getPayUserMatchReport() {
		return payUserMatchReport;
	}

	public void setPayUserMatchReport(Integer payUserMatchReport) {
		this.payUserMatchReport = payUserMatchReport;
	}

	public Integer getPayUserMatchConsumegold() {
		return payUserMatchConsumegold;
	}

	public void setPayUserMatchConsumegold(Integer payUserMatchConsumegold) {
		this.payUserMatchConsumegold = payUserMatchConsumegold;
	}

	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getPayUserAdd() {
		return payUserAdd;
	}

	public void setPayUserAdd(Integer payUserAdd) {
		this.payUserAdd = payUserAdd;
	}

	public Integer getPayUserAddNew() {
		return payUserAddNew;
	}

	public void setPayUserAddNew(Integer payUserAddNew) {
		this.payUserAddNew = payUserAddNew;
	}

	public Integer getPayUserAddOld() {
		return payUserAddOld;
	}

	public void setPayUserAddOld(Integer payUserAddOld) {
		this.payUserAddOld = payUserAddOld;
	}

	public Integer getPayUserReportBan() {
		return payUserReportBan;
	}

	public void setPayUserReportBan(Integer payUserReportBan) {
		this.payUserReportBan = payUserReportBan;
	}

	public Integer getPayUserReportMale() {
		return payUserReportMale;
	}

	public void setPayUserReportMale(Integer payUserReportMale) {
		this.payUserReportMale = payUserReportMale;
	}

	public Integer getPayUserReportMaleGender() {
		return payUserReportMaleGender;
	}

	public void setPayUserReportMaleGender(Integer payUserReportMaleGender) {
		this.payUserReportMaleGender = payUserReportMaleGender;
	}

	public Integer getPayUserReportMaleBehavior() {
		return payUserReportMaleBehavior;
	}

	public void setPayUserReportMaleBehavior(Integer payUserReportMaleBehavior) {
		this.payUserReportMaleBehavior = payUserReportMaleBehavior;
	}

	public Integer getPayUserReportFemale() {
		return payUserReportFemale;
	}

	public void setPayUserReportFemale(Integer payUserReportFemale) {
		this.payUserReportFemale = payUserReportFemale;
	}

	public Integer getPayUserReportFemaleGender() {
		return payUserReportFemaleGender;
	}

	public void setPayUserReportFemaleGender(Integer payUserReportFemaleGender) {
		this.payUserReportFemaleGender = payUserReportFemaleGender;
	}

	public Integer getPayUserReportFemaleBehavior() {
		return payUserReportFemaleBehavior;
	}

	public void setPayUserReportFemaleBehavior(Integer payUserReportFemaleBehavior) {
		this.payUserReportFemaleBehavior = payUserReportFemaleBehavior;
	}

	
}