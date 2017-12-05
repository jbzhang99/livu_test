package com.rcplatform.videochat.bean;

import com.rcplatform.livechat.enums.ReportEroticismEnum;

/**
 * Created by yaoyuan on 2017/7/25.
 */
public class ImageCheckResult {


	public ImageCheckResult() {
	}

	public ImageCheckResult(Double rate, Boolean review, Integer label) {
		this.rate = rate;
		this.review = review;
		this.label = label;
	}

	public ImageCheckResult(Integer checkResult, Double rate, Boolean review, Integer label) {
		this.checkResult = checkResult;
		this.rate = rate;
		this.review = review;
		this.label = label;
	}

	private Integer checkResult;

	private Double rate;

	private Boolean review;

	/**
	 * 类别: 0：色情； 1：性感； 2：正常；
	 */
	private Integer label;

	/**
	 * 返回鉴定的值
	 */
	private ReportEroticismEnum reportEroticismEnum;

	public ReportEroticismEnum getReportEroticismEnum() {

		ReportEroticismEnum reportEroticismEnum = ReportEroticismEnum.NORMAL;

		if (this.getLabel() == 0 && !this.getReview()) {
			//色情 confirm
			reportEroticismEnum = ReportEroticismEnum.EROTICISM_CONFIRM;
		} else if (this.getLabel() == 0 && this.getReview()) {
			//色情likely
			reportEroticismEnum = ReportEroticismEnum.EROTICISM_LIKELY;
		} else if (this.getLabel() == 1 && !this.getReview()) {
			//性感confirm
			reportEroticismEnum = ReportEroticismEnum.OOMPH_CONFIRM;
		} else if (this.getLabel() == 1 && this.getReview()) {
			//性感likely
			reportEroticismEnum = ReportEroticismEnum.OOMPH_LIKELY;
		} else if (this.getLabel() == 3 && !this.getReview()) {
			reportEroticismEnum = ReportEroticismEnum.GENDER_FEMALE_CONFIRM;
		} else if (this.getLabel() == 3 && this.getReview()) {
			reportEroticismEnum = ReportEroticismEnum.GENDER_FEMALE_LIKELY;
		} else if (this.getLabel() == 2 && !this.getReview()) {
			reportEroticismEnum = ReportEroticismEnum.GENDER_MALE_CONFIRM;
		} else if (this.getLabel() == 2 && this.getReview()) {
			reportEroticismEnum = ReportEroticismEnum.GENDER_MALE_LIKELY;
		}
		return reportEroticismEnum;
	}


	public Integer getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(Integer checkResult) {
		this.checkResult = checkResult;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Boolean getReview() {
		return review;
	}

	public void setReview(Boolean review) {
		this.review = review;
	}

	public Integer getLabel() {
		return label;
	}

	public void setLabel(Integer label) {
		this.label = label;
	}


	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("ImageCheckResult{");
		sb.append("checkResult=").append(checkResult);
		sb.append(", rate=").append(rate);
		sb.append(", review=").append(review);
		sb.append(", label=").append(label);
		sb.append('}');
		return sb.toString();
	}
}
