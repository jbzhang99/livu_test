package com.rcplatform.videochat.model;

import com.rcplatform.livechat.enums.MatchScoreEnum;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by ruihuagong on 2017/9/8.
 */
@Table(name = "rc_match_score_statistics")
public class MatchScoreStatistics implements Serializable {

	private static final long serialVersionUID = 1478232937482387387L;

	@Id
	private Long id;

	@Column(name = "bad_score_count")
	private Integer badScoreCount;

	@Column(name = "bad_score_user_count")
	private Integer badScoreUserCount;

	@Column(name = "bad_score_percent")
	private BigDecimal badScorePercent = BigDecimal.ZERO;

	@Column(name = "mid_score_count")
	private Integer midScoreCount;

	@Column(name = "mid_score_user_count")
	private Integer midScoreUserCount;

	@Column(name = "mid_score_percent")
	private BigDecimal midScorePercent = BigDecimal.ZERO;

	@Column(name = "good_score_count")
	private Integer goodScoreCount;

	@Column(name = "good_score_user_count")
	private Integer goodScoreUserCount;

	@Column(name = "good_score_percent")
	private BigDecimal goodScorePercent = BigDecimal.ZERO;

	@Column(name = "create_date")
	private Date createDate = new Date();


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getBadScoreCount() {
		return badScoreCount;
	}

	public void setBadScoreCount(Integer badScoreCount) {
		this.badScoreCount = badScoreCount;
	}

	public Integer getBadScoreUserCount() {
		return badScoreUserCount;
	}

	public void setBadScoreUserCount(Integer badScoreUserCount) {
		this.badScoreUserCount = badScoreUserCount;
	}

	public BigDecimal getBadScorePercent() {
		return badScorePercent;
	}

	public void setBadScorePercent(BigDecimal badScorePercent) {
		this.badScorePercent = badScorePercent;
	}

	public Integer getMidScoreCount() {
		return midScoreCount;
	}

	public void setMidScoreCount(Integer midScoreCount) {
		this.midScoreCount = midScoreCount;
	}

	public Integer getMidScoreUserCount() {
		return midScoreUserCount;
	}

	public void setMidScoreUserCount(Integer midScoreUserCount) {
		this.midScoreUserCount = midScoreUserCount;
	}

	public BigDecimal getMidScorePercent() {
		return midScorePercent;
	}

	public void setMidScorePercent(BigDecimal midScorePercent) {
		this.midScorePercent = midScorePercent;
	}

	public Integer getGoodScoreCount() {
		return goodScoreCount;
	}

	public void setGoodScoreCount(Integer goodScoreCount) {
		this.goodScoreCount = goodScoreCount;
	}

	public Integer getGoodScoreUserCount() {
		return goodScoreUserCount;
	}

	public void setGoodScoreUserCount(Integer goodScoreUserCount) {
		this.goodScoreUserCount = goodScoreUserCount;
	}

	public BigDecimal getGoodScorePercent() {
		return goodScorePercent;
	}

	public void setGoodScorePercent(BigDecimal goodScorePercent) {
		this.goodScorePercent = goodScorePercent;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public void initScoreData(MatchScoreEnum matchScoreEnum, int count, int userCount) {
		switch (matchScoreEnum) {
			case BAD_SCORE:
				this.setBadScoreCount(count);
				this.setBadScoreUserCount(userCount);
				if (count > 0) {
					this.setBadScorePercent(new BigDecimal(0.1 * userCount / count).setScale(6,
							BigDecimal.ROUND_HALF_UP));
				}
				break;
			case MID_SCORE:
				this.setMidScoreCount(count);
				this.setMidScoreUserCount(userCount);
				if (count > 0) {
					this.setMidScorePercent(new BigDecimal(0.1 * userCount / count).setScale(6,
							BigDecimal.ROUND_HALF_UP));
				}
				break;
			case GOOD_SCORE:
				this.setGoodScoreCount(count);
				this.setGoodScoreUserCount(userCount);
				if (count > 0) {
					this.setGoodScorePercent(new BigDecimal(0.1 * userCount / count).setScale(6,
							BigDecimal.ROUND_HALF_UP));
				}
				break;
			default:
				break;
		}
	}
}
