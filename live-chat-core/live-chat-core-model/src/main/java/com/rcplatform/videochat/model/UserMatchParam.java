package com.rcplatform.videochat.model;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.rcplatform.livechat.util.DateUtil;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by ruihuagong on 2017/9/14.
 * 用户匹配参数
 */
public class UserMatchParam {

	public static final String KEY_AB_ROLE_19999 = "1999AB_USER_ROLE";

	public static final String KEY_C_ROLE_19999 = "19999C_USER_ROLE";

	public static final String KEY_AB_ROLE_20000 = "20000AB_USER_ROLE";

	public static final String KEY_C_ROLE_20000 = "20000C_USER_ROLE";

	public static final String KEY_AB_USER_LEVEL_19999 = "1999AB_USER_LEVEL";

	public static final String KEY_C_USER_LEVEL_19999 = "19999C_USER_LEVEL";

	public static final String KEY_AB_USER_LEVEL_20000 = "20000AB_USER_LEVEL";

	public static final String KEY_C_USER_LEVEL_20000 = "20000C_USER_LEVEL";

	public static final Map<String, List<Integer>> ROLE_MAP = Maps.newHashMap();

	static {
		ROLE_MAP.put(KEY_AB_ROLE_19999, Lists.newArrayList(5, 6, 7, 8, 9, 10, 11, 12, 21, 22, 23, 24, 25, 26, 27, 28));
		ROLE_MAP.put(KEY_C_ROLE_19999, Lists.newArrayList(13, 14, 15, 16, 29, 30, 31, 32));
		ROLE_MAP.put(KEY_AB_ROLE_20000, Lists.newArrayList(37, 38, 39, 40, 41, 42, 43, 44, 53, 54, 55, 56, 57, 58, 59, 60));
		ROLE_MAP.put(KEY_C_ROLE_20000, Lists.newArrayList(33, 34, 36, 36, 61, 62, 63, 64));


		ROLE_MAP.put(KEY_AB_USER_LEVEL_19999, Lists.newArrayList(1, 2));
		ROLE_MAP.put(KEY_C_USER_LEVEL_19999, Lists.newArrayList(3));
		ROLE_MAP.put(KEY_AB_USER_LEVEL_20000, Lists.newArrayList(5, 6));
		ROLE_MAP.put(KEY_C_USER_LEVEL_20000, Lists.newArrayList(7));
	}

	private Integer matchGroupId;

	private Date startDate;

	private Date endDate;

	private Integer appId;

	/**
	 * 是否花费金币匹配
	 */
	private Boolean payMatch;

	/**
	 * 是否匹配女性 1 男性 2 女性
	 */
	private Boolean matchGirl;

	/**
	 * 匹配到的人是否是色情用户
	 */
	private Boolean userSQ;

	/**
	 * 匹配人的级别
	 */
	private List<Integer> userLevel;

	/**
	 * 匹配人角色
	 */
	private List<Integer> userRoles;

	/**
	 * 是否匹配新用户 false 新用户 true 老用户
	 */
	private Boolean newUser;

	/**
	 * 匹配到的用户曾经是否有色情
	 */
	private Boolean behaviorSQ;

	/**
	 * 匹配到的用户是否是真实女性
	 */
	private Boolean realGirl;

	/**
	 * 是否匹配上 1 成功 2 失败
	 */
	private Boolean linkResult;

	/**
	 * 用户是否是付费用户
	 */
	private Boolean userPay;

	private Boolean evenDay;

	public Integer getMatchGroupId() {
		return matchGroupId;
	}

	public void setMatchGroupId(Integer matchGroupId) {
		this.matchGroupId = matchGroupId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Boolean getPayMatch() {
		return payMatch;
	}

	public void setPayMatch(Boolean payMatch) {
		this.payMatch = payMatch;
	}

	public Boolean getMatchGirl() {
		return matchGirl;
	}

	public void setMatchGirl(Boolean matchGirl) {
		this.matchGirl = matchGirl;
	}

	public Boolean getUserSQ() {
		return userSQ;
	}

	public void setUserSQ(Boolean userSQ) {
		this.userSQ = userSQ;
	}

	public Boolean getNewUser() {
		return newUser;
	}

	public void setNewUser(Boolean newUser) {
		this.newUser = newUser;
	}

	public Boolean getBehaviorSQ() {
		return behaviorSQ;
	}

	public void setBehaviorSQ(Boolean behaviorSQ) {
		this.behaviorSQ = behaviorSQ;
	}

	public List<Integer> getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(List<Integer> userLevel) {
		this.userLevel = userLevel;
	}

	public Boolean getRealGirl() {
		return realGirl;
	}

	public void setRealGirl(Boolean realGirl) {
		this.realGirl = realGirl;
	}

	public Boolean getLinkResult() {
		return linkResult;
	}

	public void setLinkResult(Boolean linkResult) {
		this.linkResult = linkResult;
	}

	public Boolean getUserPay() {
		return userPay;
	}

	public void setUserPay(Boolean userPay) {
		this.userPay = userPay;
	}


	public Boolean getEvenDay() {
		return evenDay;
	}

	public void setEvenDay(Boolean evenDay) {
		this.evenDay = evenDay;
	}

	public List<Integer> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<Integer> userRoles) {
		this.userRoles = userRoles;
	}

	public static Builder builderFactory(Date startDate, Date endDate, Integer appId) {

		boolean evenDayFlag = DateUtil.isEvenDay(startDate);

		return new Builder()
				.startDate(startDate).evenDay(evenDayFlag)
				.endDate(endDate).appId(appId);
	}

	public static Builder builderFactory() {
		return new Builder();
	}

	public static class Builder {

		private Boolean evenDay;

		public Builder evenDay(boolean evenDay) {
			this.evenDay = evenDay;
			return this;
		}

		private Date startDate;

		public Builder startDate(Date startDate) {
			this.startDate = startDate;
			return this;
		}

		private Date endDate;

		public Builder endDate(Date endDate) {
			this.endDate = endDate;
			return this;
		}

		private Integer appId;

		public Builder appId(Integer appId) {
			this.appId = appId;
			return this;
		}

		private List<Integer> userRoles;

		public Builder userRoles(List<Integer> userRoles) {
			this.userRoles = userRoles;
			return this;
		}

		private Boolean payMatch;

		public Builder payMatch(Boolean payMatch) {
			this.payMatch = payMatch;
			return this;
		}

		private Boolean matchGirl;

		public Builder matchGirl(Boolean matchGirl) {
			this.matchGirl = matchGirl;
			return this;
		}

		private Boolean userSQ;

		public Builder userSQ(Boolean userSQ) {
			this.userSQ = userSQ;
			return this;
		}

		private List<Integer> userLevel;

		public Builder userLevel(List<Integer> userLevel) {
			this.userLevel = userLevel;
			return this;
		}

		private Boolean newUser;

		public Builder newUser(Boolean newUser) {
			this.newUser = newUser;
			return this;
		}

		private Boolean behaviorSQ;

		public Builder behaviorSQ(Boolean behaviorSQ) {
			this.behaviorSQ = behaviorSQ;
			return this;
		}

		private Boolean realGirl;

		public Builder realGirl(Boolean realGirl) {
			this.realGirl = realGirl;
			return this;
		}

		private Boolean linkResult;

		public Builder linkResult(Boolean linkResult) {
			this.linkResult = linkResult;
			return this;
		}

		private Boolean userPay;

		public Builder userPay(Boolean userPay) {
			this.userPay = userPay;
			return this;
		}


		public UserMatchParam build() {
			UserMatchParam userMatchParam = new UserMatchParam();

			userMatchParam.startDate = this.startDate;
			userMatchParam.endDate = this.endDate;
			userMatchParam.appId = this.appId;
			userMatchParam.payMatch = this.payMatch;
			userMatchParam.matchGirl = this.matchGirl;
			userMatchParam.userSQ = this.userSQ;
			userMatchParam.userLevel = this.userLevel;
			userMatchParam.newUser = this.newUser;
			userMatchParam.behaviorSQ = this.behaviorSQ;
			userMatchParam.realGirl = this.realGirl;
			userMatchParam.linkResult = this.linkResult;
			userMatchParam.userPay = this.userPay;
			userMatchParam.evenDay = this.evenDay;
			userMatchParam.userRoles = this.userRoles;
			return userMatchParam;
		}
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public static void main(String[] args) {
		UserMatchParam userMatchParam = UserMatchParam.builderFactory()
				.matchGirl(true)
				.payMatch(true)
				.startDate(new Date())
				.build();

		System.out.println(userMatchParam.toString());
	}
}
