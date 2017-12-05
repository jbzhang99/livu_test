package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_video_record")
@ApiModel
public class VideoRecord implements Serializable {

	public VideoRecord() {
	}


	public VideoRecord(Integer appId, Integer userId, Integer gender, Integer matchedGender, Integer matchedId, Integer isFriend,
	                   Integer videoTime, Integer userPay,
	                   Integer matchUserPay, Integer isPay, Integer userType, Integer matchUserType,
	                   Integer genderCondition, Boolean eroticism, Boolean eroticismBehavior, Boolean signEroticism,
	                   Integer virtualRoleId, Integer realRoleType, Integer userLevelId,
	                   String version, Boolean isRealUser, Date createTime, Boolean matchEroticismBehavior) {
		this.appId = appId;
		this.userId = userId;
		this.gender = gender;
		this.matchedGender = matchedGender;
		this.matchedId = matchedId;
		this.isFriend = isFriend;
		this.videoTime = videoTime;
		this.userPay = userPay;
		this.matchUserPay = matchUserPay;
		this.isPay = isPay;
		this.userType = userType;
		this.matchUserType = matchUserType;
		this.genderCondition = genderCondition;
		this.eroticism = eroticism;
		this.eroticismBehavior = eroticismBehavior;
		this.signEroticism = signEroticism;
		this.virtualRoleId = virtualRoleId;
		this.realRoleType = realRoleType;
		this.userLevelId = userLevelId;
		this.version = version;
		this.isRealUser = isRealUser;
		this.createTime = createTime;
		this.matchEroticismBehavior = matchEroticismBehavior;
	}

	/**
	 * 用户主键
	 */
	@Id
	@ApiModelProperty(value = "用户主键")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	 * 用户的性别 1 男性 2 女性
	 */
	@ApiModelProperty(value = "用户的性别 1 男性 2 女性")
	private Integer gender;

	/**
	 * 匹配用户的性别
	 */
	@Column(name = "matched_gender")
	@ApiModelProperty(value = "匹配用户的性别")
	private Integer matchedGender;

	/**
	 * 匹配的用户id
	 */
	@Column(name = "matched_id")
	@ApiModelProperty(value = "匹配的用户id")
	private Integer matchedId;

	/**
	 * 双方是否为朋友关系 1 非朋友关系 2 朋友关系
	 */
	@Column(name = "is_friend")
	@ApiModelProperty(value = "双方是否为朋友关系 1 非朋友关系 2 朋友关系")
	private Integer isFriend;

	/**
	 * 用户的 视频聊天时长
	 */
	@Column(name = "video_time")
	@ApiModelProperty(value = "用户的 视频聊天时长")
	private Integer videoTime;


	@Column(name = "user_pay")
	@ApiModelProperty(value = "用户是否是付费用户 0 未付费 1 付费")
	private Integer userPay;


	@Column(name = "match_user_pay")
	@ApiModelProperty(value = "用户是否是付费用户 0 未付费 1 付费")
	private Integer matchUserPay;


	@Column(name = "is_pay")
	@ApiModelProperty(value = "是否是付费视频 0 未付费 1 付费")
	private Integer isPay;


	@Column(name = "user_type")
	@ApiModelProperty(value = "用户类别 0 新用户 1 老用户")
	private Integer userType;


	@Column(name = "match_user_type")
	@ApiModelProperty(value = "用户类别 0 新用户 1 老用户")
	private Integer matchUserType;


	@Column(name = "gender_condition")
	@ApiModelProperty(value = "性别条件")
	private Integer genderCondition;


	@Column(name = "eroticism")
	private Boolean eroticism;


	@Column(name = "eroticism_behavior")
	private Boolean eroticismBehavior;


	@Column(name = "sign_eroticism")
	private Boolean signEroticism;


	@Column(name = "virtual_role_id")
	private Integer virtualRoleId;


	@Column(name = "real_role_type")
	private Integer realRoleType;


	@Column(name = "user_level_id")
	private Integer userLevelId;


	@Column(name = "version")
	private String version;


	@Column(name = "is_real_user")
	private Boolean isRealUser;

	/**
	 * 用户操作的时间
	 */
	@Column(name = "create_time")
	@ApiModelProperty(value = "用户操作的时间")
	private Date createTime;

	private static final long serialVersionUID = 1L;

	/**
	 * 匹配用户的色情标识
	 */
	@Column(name = "match_eroticism_behavior")
	private Boolean matchEroticismBehavior;

	/**
	 * 用户的终端
	 */
	@Column(name = "user_platform")
	private Integer userPlatform;

	/**
	 * 匹配用户的终端
	 */
	@Column(name = "match_user_platform")
	private Integer matchUserPlatform;

	/**
	 * 匹配用户的应用编号
	 */
	@Column(name = "match_app_id")
	private Integer matchAppId;


	@Transient
	private UserMatchParam userMatchParam;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getMatchedGender() {
		return matchedGender;
	}

	public void setMatchedGender(Integer matchedGender) {
		this.matchedGender = matchedGender;
	}

	public Integer getMatchedId() {
		return matchedId;
	}

	public void setMatchedId(Integer matchedId) {
		this.matchedId = matchedId;
	}

	public Integer getIsFriend() {
		return isFriend;
	}

	public void setIsFriend(Integer isFriend) {
		this.isFriend = isFriend;
	}

	public Integer getVideoTime() {
		return videoTime;
	}

	public void setVideoTime(Integer videoTime) {
		this.videoTime = videoTime;
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

	public Integer getIsPay() {
		return isPay;
	}

	public void setIsPay(Integer isPay) {
		this.isPay = isPay;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getMatchUserType() {
		return matchUserType;
	}

	public void setMatchUserType(Integer matchUserType) {
		this.matchUserType = matchUserType;
	}

	public Integer getGenderCondition() {
		return genderCondition;
	}

	public void setGenderCondition(Integer genderCondition) {
		this.genderCondition = genderCondition;
	}

	public Boolean getEroticism() {
		return eroticism;
	}

	public void setEroticism(Boolean eroticism) {
		this.eroticism = eroticism;
	}

	public Boolean getEroticismBehavior() {
		return eroticismBehavior;
	}

	public void setEroticismBehavior(Boolean eroticismBehavior) {
		this.eroticismBehavior = eroticismBehavior;
	}

	public Boolean getSignEroticism() {
		return signEroticism;
	}

	public void setSignEroticism(Boolean signEroticism) {
		this.signEroticism = signEroticism;
	}

	public Integer getVirtualRoleId() {
		return virtualRoleId;
	}

	public void setVirtualRoleId(Integer virtualRoleId) {
		this.virtualRoleId = virtualRoleId;
	}

	public Integer getRealRoleType() {
		return realRoleType;
	}

	public void setRealRoleType(Integer realRoleType) {
		this.realRoleType = realRoleType;
	}

	public Integer getUserLevelId() {
		return userLevelId;
	}

	public void setUserLevelId(Integer userLevelId) {
		this.userLevelId = userLevelId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Boolean getRealUser() {
		return isRealUser;
	}

	public void setRealUser(Boolean realUser) {
		isRealUser = realUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public Boolean getMatchEroticismBehavior() {
		return matchEroticismBehavior;
	}

	public void setMatchEroticismBehavior(Boolean matchEroticismBehavior) {
		this.matchEroticismBehavior = matchEroticismBehavior;
	}

	public UserMatchParam getUserMatchParam() {
		return userMatchParam;
	}

	public void setUserMatchParam(UserMatchParam userMatchParam) {
		this.userMatchParam = userMatchParam;
	}

	public Integer getUserPlatform() {
		return userPlatform;
	}

	public void setUserPlatform(Integer userPlatform) {
		this.userPlatform = userPlatform;
	}

	public Integer getMatchUserPlatform() {
		return matchUserPlatform;
	}

	public void setMatchUserPlatform(Integer matchUserPlatform) {
		this.matchUserPlatform = matchUserPlatform;
	}

	public Integer getMatchAppId() {
		return matchAppId;
	}

	public void setMatchAppId(Integer matchAppId) {
		this.matchAppId = matchAppId;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("VideoRecord{");
		sb.append("id=").append(id);
		sb.append(", appId=").append(appId);
		sb.append(", userId=").append(userId);
		sb.append(", gender=").append(gender);
		sb.append(", matchedGender=").append(matchedGender);
		sb.append(", matchedId=").append(matchedId);
		sb.append(", isFriend=").append(isFriend);
		sb.append(", videoTime=").append(videoTime);
		sb.append(", userPay=").append(userPay);
		sb.append(", matchUserPay=").append(matchUserPay);
		sb.append(", isPay=").append(isPay);
		sb.append(", userType=").append(userType);
		sb.append(", matchUserType=").append(matchUserType);
		sb.append(", genderCondition=").append(genderCondition);
		sb.append(", eroticism=").append(eroticism);
		sb.append(", eroticismBehavior=").append(eroticismBehavior);
		sb.append(", signEroticism=").append(signEroticism);
		sb.append(", virtualRoleId=").append(virtualRoleId);
		sb.append(", realRoleType=").append(realRoleType);
		sb.append(", userLevelId=").append(userLevelId);
		sb.append(", version='").append(version).append('\'');
		sb.append(", isRealUser=").append(isRealUser);
		sb.append(", createTime=").append(createTime);
		sb.append(", matchEroticismBehavior=").append(matchEroticismBehavior);
		sb.append(", userMatchParam=").append(userMatchParam);
		sb.append('}');
		return sb.toString();
	}
}