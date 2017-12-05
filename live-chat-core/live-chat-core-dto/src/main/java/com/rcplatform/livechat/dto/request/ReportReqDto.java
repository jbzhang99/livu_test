package com.rcplatform.livechat.dto.request;

import com.rcplatform.livechat.enums.ReportEroticismEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 举报参数
 * Created by yang peng on 2016/8/2.
 */
@ApiModel
public class ReportReqDto implements Serializable {


	/**
	 * 应用ID LiveChat 19999;LivU 20000
	 */
	@ApiModelProperty(value = "应用id,LivU请传递20000")
	private Integer appId;


	/**
	 * 被举报用户id
	 */
	@NotNull
	@ApiModelProperty(value = "被举报用户id")
	private Integer reportedUserId;


	/**
	 * 举报页面
	 */
	@NotNull
	@ApiModelProperty(value = "举报页面" +
			"  ALL(0,\"未知\"),\n" +
			"\n" +
			"    VIDEO(1,\"视频页面\"),\n" +
			"\n" +
			"    SHOW(2,\"个人主页\"),\n" +
			"\n" +
			"    MATCH(3,\"匹配记录页面\"),\n" +
			"\n" +
			"    MESSAGE(4,\"message页面\");")
	private Integer reportPage;


	@ApiModelProperty(value = "举报原因     " +
			"GENDER_DISCREPANCY(1,\"性别不符\"),\n" +
			"\n" +
			"    VIOLATIONS(2,\"色情裸露\"),\n" +
			"\n" +
			"    OTHER(3,\"其他\"),\n" +
			"\n" +
			"    NO_REASON(4,\"无原因\"),\n" +
			"\n" +
			"    FRAUD(5,\"恶意诈骗\"),\n" +
			"\n" +
			"    VIOLENCE_LANGUAGE(6,\"语言暴力\"),\n" +
			"\n" +
			"    DISCRIMINATE(7,\"攻击歧视\");\n")
	private Integer reportReason;


	private String matchUserId;


	@ApiModelProperty(value = "被举报的用户性别,必须提交")
	private Integer gender;


	@ApiModelProperty(value = "非参数")
	private String reportImg;


	@ApiModelProperty(value = "非参数")
	private Integer person;


	@ApiModelProperty(value = "非参数")
	private Integer eroticism;


	@ApiModelProperty(value = "非参数")
	private Double violationsRate;

	@ApiModelProperty(value = "非参数")
	private Integer violationsReview;

	@ApiModelProperty(value = "非参数")
	private Integer violationsLabel;

	@ApiModelProperty(value = "非参数")
	private Double genderRate;


	@ApiModelProperty(value = "非参数")
	private Integer genderReview;


	@ApiModelProperty(value = "非参数")
	private Integer genderLabel;

	private ReportEroticismEnum reportEroticismEnum;


	public String getMatchUserId() {
		return matchUserId;
	}

	public void setMatchUserId(String matchUserId) {
		this.matchUserId = matchUserId;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Integer getReportedUserId() {
		return reportedUserId;
	}

	public void setReportedUserId(Integer reportedUserId) {
		this.reportedUserId = reportedUserId;
	}


	public Integer getReportPage() {
		return reportPage;
	}

	public void setReportPage(Integer reportPage) {
		this.reportPage = reportPage;
	}


	public Integer getReportReason() {
		return reportReason;
	}

	public void setReportReason(Integer reportReason) {
		this.reportReason = reportReason;
	}


	public String getReportImg() {
		return reportImg;
	}

	public void setReportImg(String reportImg) {
		this.reportImg = reportImg;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}


	public Integer getPerson() {
		return person;
	}

	public void setPerson(Integer person) {
		this.person = person;
	}

	public Integer getEroticism() {
		return eroticism;
	}

	public void setEroticism(Integer eroticism) {
		this.eroticism = eroticism;
	}

	public Double getViolationsRate() {
		return violationsRate;
	}

	public void setViolationsRate(Double violationsRate) {
		this.violationsRate = violationsRate;
	}

	public Integer getViolationsReview() {
		return violationsReview;
	}

	public void setViolationsReview(Integer violationsReview) {
		this.violationsReview = violationsReview;
	}

	public Integer getViolationsLabel() {
		return violationsLabel;
	}

	public void setViolationsLabel(Integer violationsLabel) {
		this.violationsLabel = violationsLabel;
	}

	public Double getGenderRate() {
		return genderRate;
	}

	public void setGenderRate(Double genderRate) {
		this.genderRate = genderRate;
	}

	public Integer getGenderReview() {
		return genderReview;
	}

	public void setGenderReview(Integer genderReview) {
		this.genderReview = genderReview;
	}

	public Integer getGenderLabel() {
		return genderLabel;
	}

	public void setGenderLabel(Integer genderLabel) {
		this.genderLabel = genderLabel;
	}

	public ReportEroticismEnum getReportEroticismEnum() {
		return reportEroticismEnum;
	}

	public void setReportEroticismEnum(ReportEroticismEnum reportEroticismEnum) {
		this.reportEroticismEnum = reportEroticismEnum;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ReportReqDto{");
		sb.append("appId=").append(appId);
		sb.append(", reportedUserId=").append(reportedUserId);
		sb.append(", reportPage=").append(reportPage);
		sb.append(", reportReason=").append(reportReason);
		sb.append(", matchUserId='").append(matchUserId).append('\'');
		sb.append(", gender=").append(gender);
		sb.append(", reportImg='").append(reportImg).append('\'');
		sb.append(", person=").append(person);
		sb.append(", eroticism=").append(eroticism);
		sb.append(", violationsRate=").append(violationsRate);
		sb.append(", violationsReview=").append(violationsReview);
		sb.append(", violationsLabel=").append(violationsLabel);
		sb.append(", genderRate=").append(genderRate);
		sb.append(", genderReview=").append(genderReview);
		sb.append(", genderLabel=").append(genderLabel);
		sb.append('}');
		return sb.toString();
	}
}
