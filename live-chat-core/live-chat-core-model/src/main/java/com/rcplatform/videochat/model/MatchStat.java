package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_match_stat")
@ApiModel
public class MatchStat implements Serializable {

	@Transient
	private UserMatchParam userMatchParam;


	public MatchStat() {
	}

	public MatchStat(Integer appId, Integer userId, Integer result, Date createTime, Integer isPay,
	                 Integer matchUserId, Integer userGender, Integer userPlatform, Integer matchUserGender,
	                 Integer matchUserPlatform, String userCountry, String userIpCountry, String matchUserCountry,
	                 String matchUserIpCountry, Integer userPay, Integer matchUserPay, Integer userRole, Integer matchUserRole,
	                 Integer userScore, Integer matchUserScore, Integer userBackup, Integer matchUserBackup, Integer status, boolean signEroticism,
	                 boolean matchSignEroticism, boolean isRealUser, boolean eroticismBehavior,
	                 boolean matchEroticismBehavior, Integer userLevelId, Integer matchUserLevelId, Integer matchAppId) {
		this.appId = appId;
		this.userId = userId;
		this.result = result;
		this.createTime = createTime;
		this.isPay = isPay;
		this.matchUserId = matchUserId;
		this.userGender = userGender;
		this.userPlatform = userPlatform;
		this.matchUserGender = matchUserGender;
		this.matchUserPlatform = matchUserPlatform;
		this.userCountry = userCountry;
		this.userIpCountry = userIpCountry;
		this.matchUserCountry = matchUserCountry;
		this.matchUserIpCountry = matchUserIpCountry;
		this.userPay = userPay;
		this.matchUserPay = matchUserPay;
		this.userRole = userRole;
		this.matchUserRole = matchUserRole;
		this.userScore = userScore;
		this.matchUserScore = matchUserScore;
		this.userBackup = userBackup;
		this.matchUserBackup = matchUserBackup;
		this.status = status;
		this.signEroticism = signEroticism;
		this.matchSignEroticism = matchSignEroticism;
		this.isRealUser = isRealUser;
		this.eroticismBehavior = eroticismBehavior;
		this.matchEroticismBehavior = matchEroticismBehavior;
		this.userLevelId = userLevelId;
		this.matchUserLevelId = matchUserLevelId;
		this.matchAppId = matchAppId;
	}

	/**
	 * 用户主键
	 */
	@Id
	@ApiModelProperty(value = "用户主键")
	private Integer id;

	@Column(name = "app_id")
	private Integer appId;

	/**
	 * 用户的id
	 */
	@Column(name = "user_id")
	@ApiModelProperty(value = "用户的id")
	private Integer userId;

	/**
	 * 是否成功 1 成功 2 失败
	 */
	@ApiModelProperty(value = "是否成功 1 成功 2 失败")
	private Integer result;

	/**
	 * 用户操作的时间
	 */
	@Column(name = "create_time")
	@ApiModelProperty(value = "用户操作的时间")
	private Date createTime;

	@Column(name = "is_pay")
	@ApiModelProperty(value = "")
	private Integer isPay;

	@Column(name = "match_user_id")
	@ApiModelProperty(value = "")
	private Integer matchUserId;

	/**
	 * 用户性别
	 */
	@Column(name = "user_gender")
	@ApiModelProperty(value = "用户性别")
	private Integer userGender;

	/**
	 * 用户平台类型
	 */
	@Column(name = "user_platform")
	@ApiModelProperty(value = "用户平台类型")
	private Integer userPlatform;

	/**
	 * 匹配到的用户性别
	 */
	@Column(name = "match_user_gender")
	@ApiModelProperty(value = "匹配到的用户性别")
	private Integer matchUserGender;

	/**
	 * 匹配到的用户平台类型
	 */
	@Column(name = "match_user_platform")
	@ApiModelProperty(value = "匹配到的用户平台类型")
	private Integer matchUserPlatform;

	/**
	 * 用户国家
	 */
	@Column(name = "user_country")
	@ApiModelProperty(value = "用户国家")
	private String userCountry;

	/**
	 * 用户的ip国家
	 */
	@Column(name = "user_ip_country")
	@ApiModelProperty(value = "用户的ip国家")
	private String userIpCountry;

	/**
	 * 匹配到的国家
	 */
	@Column(name = "match_user_country")
	@ApiModelProperty(value = "匹配到的国家")
	private String matchUserCountry;

	/**
	 * 匹配到的用户ip国家
	 */
	@Column(name = "match_user_ip_country")
	@ApiModelProperty(value = "匹配到的用户ip国家")
	private String matchUserIpCountry;


	@Column(name = "user_pay")
	@ApiModelProperty(value = "用户是否是付费用户")
	private Integer userPay;


	@Column(name = "match_user_pay")
	@ApiModelProperty(value = "匹配到的用户是否是付费用户")
	private Integer matchUserPay;


	@Column(name = "user_role")
	private Integer userRole;


	@Column(name = "match_user_role")
	private Integer matchUserRole;


	@Column(name = "user_score")
	private Integer userScore;


	@Column(name = "match_user_score")
	private Integer matchUserScore;


	@Column(name = "user_backup")
	private Integer userBackup;


	@Column(name = "match_user_backup")
	private Integer matchUserBackup;


	private Integer status;

	@Column(name = "sign_eroticism")
	private boolean signEroticism;


	@Column(name = "match_sign_eroticism")
	private boolean matchSignEroticism;

	@Column(name = "is_real_user")
	private boolean isRealUser;


	@Column(name = "eroticism_behavior")
	private boolean eroticismBehavior;

	@Column(name = "match_eroticism_behavior")
	private boolean matchEroticismBehavior;


	@Column(name = "user_level_id")
	private Integer userLevelId;

	@Column(name = "match_user_level_id")
	private Integer matchUserLevelId;

	/**
	 * 匹配用户的应用编号
	 */
	@Column(name = "match_app_id")
	private Integer matchAppId;

	private static final long serialVersionUID = 1L;

	/**
	 * 获取用户主键
	 *
	 * @return id - 用户主键
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置用户主键
	 *
	 * @param id 用户主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取用户的id
	 *
	 * @return user_id - 用户的id
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 设置用户的id
	 *
	 * @param userId 用户的id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * 获取是否成功 1 成功 2 失败
	 *
	 * @return result - 是否成功 1 成功 2 失败
	 */
	public Integer getResult() {
		return result;
	}

	/**
	 * 设置是否成功 1 成功 2 失败
	 *
	 * @param result 是否成功 1 成功 2 失败
	 */
	public void setResult(Integer result) {
		this.result = result;
	}

	/**
	 * 获取用户操作的时间
	 *
	 * @return create_time - 用户操作的时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置用户操作的时间
	 *
	 * @param createTime 用户操作的时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return is_pay
	 */
	public Integer getIsPay() {
		return isPay;
	}

	/**
	 * @param isPay
	 */
	public void setIsPay(Integer isPay) {
		this.isPay = isPay;
	}

	/**
	 * @return match_user_id
	 */
	public Integer getMatchUserId() {
		return matchUserId;
	}

	/**
	 * @param matchUserId
	 */
	public void setMatchUserId(Integer matchUserId) {
		this.matchUserId = matchUserId;
	}

	/**
	 * 获取用户性别
	 *
	 * @return user_gender - 用户性别
	 */
	public Integer getUserGender() {
		return userGender;
	}

	/**
	 * 设置用户性别
	 *
	 * @param userGender 用户性别
	 */
	public void setUserGender(Integer userGender) {
		this.userGender = userGender;
	}

	/**
	 * 获取用户平台类型
	 *
	 * @return user_platform - 用户平台类型
	 */
	public Integer getUserPlatform() {
		return userPlatform;
	}

	/**
	 * 设置用户平台类型
	 *
	 * @param userPlatform 用户平台类型
	 */
	public void setUserPlatform(Integer userPlatform) {
		this.userPlatform = userPlatform;
	}

	/**
	 * 获取匹配到的用户性别
	 *
	 * @return match_user_gender - 匹配到的用户性别
	 */
	public Integer getMatchUserGender() {
		return matchUserGender;
	}

	/**
	 * 设置匹配到的用户性别
	 *
	 * @param matchUserGender 匹配到的用户性别
	 */
	public void setMatchUserGender(Integer matchUserGender) {
		this.matchUserGender = matchUserGender;
	}

	/**
	 * 获取匹配到的用户平台类型
	 *
	 * @return match_user_platform - 匹配到的用户平台类型
	 */
	public Integer getMatchUserPlatform() {
		return matchUserPlatform;
	}

	/**
	 * 设置匹配到的用户平台类型
	 *
	 * @param matchUserPlatform 匹配到的用户平台类型
	 */
	public void setMatchUserPlatform(Integer matchUserPlatform) {
		this.matchUserPlatform = matchUserPlatform;
	}

	/**
	 * 获取用户国家
	 *
	 * @return user_country - 用户国家
	 */
	public String getUserCountry() {
		return userCountry;
	}

	/**
	 * 设置用户国家
	 *
	 * @param userCountry 用户国家
	 */
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	/**
	 * 获取用户的ip国家
	 *
	 * @return user_ip_country - 用户的ip国家
	 */
	public String getUserIpCountry() {
		return userIpCountry;
	}

	/**
	 * 设置用户的ip国家
	 *
	 * @param userIpCountry 用户的ip国家
	 */
	public void setUserIpCountry(String userIpCountry) {
		this.userIpCountry = userIpCountry;
	}

	/**
	 * 获取匹配到的国家
	 *
	 * @return match_user_country - 匹配到的国家
	 */
	public String getMatchUserCountry() {
		return matchUserCountry;
	}

	/**
	 * 设置匹配到的国家
	 *
	 * @param matchUserCountry 匹配到的国家
	 */
	public void setMatchUserCountry(String matchUserCountry) {
		this.matchUserCountry = matchUserCountry;
	}

	/**
	 * 获取匹配到的用户ip国家
	 *
	 * @return match_user_ip_country - 匹配到的用户ip国家
	 */
	public String getMatchUserIpCountry() {
		return matchUserIpCountry;
	}

	/**
	 * 设置匹配到的用户ip国家
	 *
	 * @param matchUserIpCountry 匹配到的用户ip国家
	 */
	public void setMatchUserIpCountry(String matchUserIpCountry) {
		this.matchUserIpCountry = matchUserIpCountry;
	}


	public Integer getUserPay() {
		return userPay;
	}

	public void setUserPay(Integer userPay) {
		this.userPay = userPay;
	}

	public Integer getMatchUserPay() {
		return matchUserPay;
	}

	public void setMatchUserPay(Integer matchUserPay) {
		this.matchUserPay = matchUserPay;
	}


	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}


	public Integer getUserRole() {
		return userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	public Integer getMatchUserRole() {
		return matchUserRole;
	}

	public void setMatchUserRole(Integer matchUserRole) {
		this.matchUserRole = matchUserRole;
	}

	public Integer getUserScore() {
		return userScore;
	}

	public void setUserScore(Integer userScore) {
		this.userScore = userScore;
	}

	public Integer getMatchUserScore() {
		return matchUserScore;
	}

	public void setMatchUserScore(Integer matchUserScore) {
		this.matchUserScore = matchUserScore;
	}

	public Integer getUserBackup() {
		return userBackup;
	}

	public void setUserBackup(Integer userBackup) {
		this.userBackup = userBackup;
	}

	public Integer getMatchUserBackup() {
		return matchUserBackup;
	}

	public void setMatchUserBackup(Integer matchUserBackup) {
		this.matchUserBackup = matchUserBackup;
	}


	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}


	public boolean isSignEroticism() {
		return signEroticism;
	}

	public void setSignEroticism(boolean signEroticism) {
		this.signEroticism = signEroticism;
	}

	public boolean isRealUser() {
		return isRealUser;
	}

	public void setRealUser(boolean realUser) {
		isRealUser = realUser;
	}


	public boolean isMatchSignEroticism() {
		return matchSignEroticism;
	}

	public void setMatchSignEroticism(boolean matchSignEroticism) {
		this.matchSignEroticism = matchSignEroticism;
	}


	public boolean isEroticismBehavior() {
		return eroticismBehavior;
	}

	public void setEroticismBehavior(boolean eroticismBehavior) {
		this.eroticismBehavior = eroticismBehavior;
	}

	public boolean isMatchEroticismBehavior() {
		return matchEroticismBehavior;
	}

	public void setMatchEroticismBehavior(boolean matchEroticismBehavior) {
		this.matchEroticismBehavior = matchEroticismBehavior;
	}

	public Integer getUserLevelId() {
		return userLevelId;
	}

	public void setUserLevelId(Integer userLevelId) {
		this.userLevelId = userLevelId;
	}

	public Integer getMatchUserLevelId() {
		return matchUserLevelId;
	}

	public void setMatchUserLevelId(Integer matchUserLevelId) {
		this.matchUserLevelId = matchUserLevelId;
	}


	public UserMatchParam getUserMatchParam() {
		return userMatchParam;
	}

	public void setUserMatchParam(UserMatchParam userMatchParam) {
		this.userMatchParam = userMatchParam;
	}

	public Integer getMatchAppId() {
		return matchAppId;
	}

	public void setMatchAppId(Integer matchAppId) {
		this.matchAppId = matchAppId;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("MatchStat{");
		sb.append("id=").append(id);
		sb.append(", appId=").append(appId);
		sb.append(", userId=").append(userId);
		sb.append(", result=").append(result);
		sb.append(", createTime=").append(createTime);
		sb.append(", isPay=").append(isPay);
		sb.append(", matchUserId=").append(matchUserId);
		sb.append(", userGender=").append(userGender);
		sb.append(", userPlatform=").append(userPlatform);
		sb.append(", matchUserGender=").append(matchUserGender);
		sb.append(", matchUserPlatform=").append(matchUserPlatform);
		sb.append(", userCountry='").append(userCountry).append('\'');
		sb.append(", userIpCountry='").append(userIpCountry).append('\'');
		sb.append(", matchUserCountry='").append(matchUserCountry).append('\'');
		sb.append(", matchUserIpCountry='").append(matchUserIpCountry).append('\'');
		sb.append(", userPay=").append(userPay);
		sb.append(", matchUserPay=").append(matchUserPay);
		sb.append(", userRole=").append(userRole);
		sb.append(", matchUserRole=").append(matchUserRole);
		sb.append(", userScore=").append(userScore);
		sb.append(", matchUserScore=").append(matchUserScore);
		sb.append(", userBackup=").append(userBackup);
		sb.append(", matchUserBackup=").append(matchUserBackup);
		sb.append(", status=").append(status);
		sb.append(", signEroticism=").append(signEroticism);
		sb.append(", matchSignEroticism=").append(matchSignEroticism);
		sb.append(", isRealUser=").append(isRealUser);
		sb.append('}');
		return sb.toString();
	}
}