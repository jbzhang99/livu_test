package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_match_role")
@ApiModel
public class MatchRole implements Serializable {

	public MatchRole() {
	}

	public MatchRole(Integer appId, Integer userLevelId, Integer eroticism) {
		this.appId = appId;
		this.userLevelId = userLevelId;
		this.eroticism = eroticism;
	}


	public MatchRole(Integer id, String roleName, Integer initScore, Integer appId,
	                 Integer gender, Integer userLevelId, Integer eroticism, Integer userType, Integer payMatch) {
		this.id = id;
		this.roleName = roleName;
		this.initScore = initScore;
		this.appId = appId;
		this.gender = gender;
		this.userLevelId = userLevelId;
		this.eroticism = eroticism;
		this.userType = userType;
		this.payMatch = payMatch;
	}

	/**
	 * id
	 */
	@Id
	@ApiModelProperty(value = "id")
	private Integer id;

	/**
	 * match role name,use for show
	 */
	@Column(name = "role_name")
	@ApiModelProperty(value = "match role name,use for show")
	private String roleName;

	/**
	 * user score
	 */
	@Column(name = "init_score")
	@ApiModelProperty(value = "user score")
	private Integer initScore;

	/**
	 * the app id
	 */
	@Column(name = "app_id")
	@ApiModelProperty(value = "the app id")
	private Integer appId;

	/**
	 * user gender
	 */
	@ApiModelProperty(value = "user gender")
	private Integer gender;

	/**
	 * user vip level 0 free
	 */
	@Column(name = "user_level_id")
	@ApiModelProperty(value = "user vip level 0 free")
	private Integer userLevelId;

	/**
	 * user is eroticism or not  0 no  1 yes
	 */
	@ApiModelProperty(value = "user is eroticism or not  0 no  1 yes")
	private Integer eroticism;


	@Column(name = "user_type")
	private Integer userType;
	/**
	 * create time
	 */
	@Column(name = "create_time")
	@ApiModelProperty(value = "create time")
	private Date createTime;


	@Column(name = "pay_match")
	@ApiModelProperty(value = "是否是付费匹配")
	private Integer payMatch;


	@Transient
	private String userLevelName;

	/**
	 * 是否是色情圈子匹配角色
	 */
	@Column(name = "eroticism_circle")
	private Boolean eroticismCircle;


	private static final long serialVersionUID = 1L;

	/**
	 * 获取id
	 *
	 * @return id - id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置id
	 *
	 * @param id id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取match role name,use for show
	 *
	 * @return role_name - match role name,use for show
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * 设置match role name,use for show
	 *
	 * @param roleName match role name,use for show
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * 获取user score
	 *
	 * @return init_score - user score
	 */
	public Integer getInitScore() {
		return initScore;
	}

	/**
	 * 设置user score
	 *
	 * @param initScore user score
	 */
	public void setInitScore(Integer initScore) {
		this.initScore = initScore;
	}

	/**
	 * 获取the app id
	 *
	 * @return app_id - the app id
	 */
	public Integer getAppId() {
		return appId;
	}

	/**
	 * 设置the app id
	 *
	 * @param appId the app id
	 */
	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	/**
	 * 获取user gender
	 *
	 * @return gender - user gender
	 */
	public Integer getGender() {
		return gender;
	}

	/**
	 * 设置user gender
	 *
	 * @param gender user gender
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * 获取user vip level 0 free
	 *
	 * @return user_level_id - user vip level 0 free
	 */
	public Integer getUserLevelId() {
		return userLevelId;
	}

	/**
	 * 设置user vip level 0 free
	 *
	 * @param userLevelId user vip level 0 free
	 */
	public void setUserLevelId(Integer userLevelId) {
		this.userLevelId = userLevelId;
	}

	/**
	 * 获取user is eroticism or not  0 no  1 yes
	 *
	 * @return eroticism - user is eroticism or not  0 no  1 yes
	 */
	public Integer getEroticism() {
		return eroticism;
	}

	/**
	 * 设置user is eroticism or not  0 no  1 yes
	 *
	 * @param eroticism user is eroticism or not  0 no  1 yes
	 */
	public void setEroticism(Integer eroticism) {
		this.eroticism = eroticism;
	}

	/**
	 * 获取create time
	 *
	 * @return create_time - create time
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置create time
	 *
	 * @param createTime create time
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getUserLevelName() {
		return userLevelName;
	}

	public void setUserLevelName(String userLevelName) {
		this.userLevelName = userLevelName;
	}


	public Integer getPayMatch() {
		return payMatch;
	}

	public void setPayMatch(Integer payMatch) {
		this.payMatch = payMatch;
	}

	public Boolean getEroticismCircle() {
		return eroticismCircle;
	}

	public void setEroticismCircle(Boolean eroticismCircle) {
		this.eroticismCircle = eroticismCircle;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("MatchRole{");
		sb.append("id=").append(id);
		sb.append(", roleName='").append(roleName).append('\'');
		sb.append(", initScore=").append(initScore);
		sb.append(", appId=").append(appId);
		sb.append(", gender=").append(gender);
		sb.append(", userLevelId=").append(userLevelId);
		sb.append(", eroticism=").append(eroticism);
		sb.append(", userType=").append(userType);
		sb.append(", createTime=").append(createTime);
		sb.append('}');
		return sb.toString();
	}
}