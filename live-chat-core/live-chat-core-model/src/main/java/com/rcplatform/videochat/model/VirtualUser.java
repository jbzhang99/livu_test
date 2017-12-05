package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_virtual_user")
@ApiModel
public class VirtualUser implements Serializable {
	/**
	 * 主键
	 */
	@Id
	@ApiModelProperty(value = "主键")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 用户名
	 */
	@Column(name = "user_name")
	@ApiModelProperty(value = "用户名")
	private String userName;

	/**
	 * 应用id
	 */
	@Column(name = "app_id")
	@ApiModelProperty(value = "应用id")
	private Integer appId;


	@ApiModelProperty(value = "背景图片")
	private String background;

	/**
	 * 用户头像
	 */
	@Column(name = "head_img")
	@ApiModelProperty(value = "用户头像")
	private String headImg;

	/**
	 * 用户性别 1 男性 2 女性
	 */
	@ApiModelProperty(value = "用户性别 1 男性 2 女性")
	private Integer gender;

	/**
	 * 用户所在国家id
	 */
	@Column(name = "country_id")
	@ApiModelProperty(value = "用户所在国家id")
	private Integer countryId;

	/**
	 * 用户所在的国家名称
	 */
	@Column(name = "country_name")
	@ApiModelProperty(value = "用户所在的国家名称")
	private String countryName;

	/**
	 * 语言id
	 */
	@Column(name = "language_id")
	@ApiModelProperty(value = "语言id")
	private String languageId;

	/**
	 * 语言名称，多个名称用，分割
	 */
	@Column(name = "language_name")
	@ApiModelProperty(value = "语言名称，多个名称用，分割")
	private String languageName;

	/**
	 * 用户出生日期
	 */
	@ApiModelProperty(value = "用户出生日期")
	private Date birthday;

	/**
	 * 用户使用的平台类型1 ios 2 android
	 */
	@Column(name = "platform_type")
	@ApiModelProperty(value = "用户使用的平台类型1 ios 2 android")
	private Integer platformType;

	/**
	 * 当前账号的状态 1.可用，2 禁用
	 */
	@ApiModelProperty(value = "当前账号的状态 1.可用，2 禁用")
	private Integer status;

	/**
	 * 用户创建时间
	 */
	@Column(name = "create_time")
	@ApiModelProperty(value = "用户创建时间")
	private Date createTime;

	/**
	 * 用户信息的更新时间
	 */
	@Column(name = "update_time")
	@ApiModelProperty(value = "用户信息的更新时间")
	private Date updateTime;

	/**
	 * 个人简介
	 */
	@ApiModelProperty(value = "个人简介")
	private String introduce;

	/**
	 * 视频url地址
	 */
	@ApiModelProperty(value = "视频url地址")
	private String video;

	/**
	 * 真实用户id
	 */
	@Column(name = "real_user_id")
	@ApiModelProperty(value = "真实用户id")
	private Integer realUserId;

	/**
	 * 设备id
	 */
	@Column(name = "real_device_id")
	@ApiModelProperty(value = "设备id")
	private String realDeviceId;

	/**
	 * 是否是色情
	 * true 色情 false 非色情 null之前未指定色情的数据
	 */
	@Column(name = "eroticism")
	private Boolean eroticism;


	private static final long serialVersionUID = 1L;

	/**
	 * 获取主键
	 *
	 * @return id - 主键
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置主键
	 *
	 * @param id 主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取用户名
	 *
	 * @return user_name - 用户名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 设置用户名
	 *
	 * @param userName 用户名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 获取应用id
	 *
	 * @return app_id - 应用id
	 */
	public Integer getAppId() {
		return appId;
	}

	/**
	 * 设置应用id
	 *
	 * @param appId 应用id
	 */
	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	/**
	 * @return background
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * @param background
	 */
	public void setBackground(String background) {
		this.background = background;
	}

	/**
	 * 获取用户头像
	 *
	 * @return head_img - 用户头像
	 */
	public String getHeadImg() {
		return headImg;
	}

	/**
	 * 设置用户头像
	 *
	 * @param headImg 用户头像
	 */
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	/**
	 * 获取用户性别 1 男性 2 女性
	 *
	 * @return gender - 用户性别 1 男性 2 女性
	 */
	public Integer getGender() {
		return gender;
	}

	/**
	 * 设置用户性别 1 男性 2 女性
	 *
	 * @param gender 用户性别 1 男性 2 女性
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * 获取用户所在国家id
	 *
	 * @return country_id - 用户所在国家id
	 */
	public Integer getCountryId() {
		return countryId;
	}

	/**
	 * 设置用户所在国家id
	 *
	 * @param countryId 用户所在国家id
	 */
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	/**
	 * 获取用户所在的国家名称
	 *
	 * @return country_name - 用户所在的国家名称
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * 设置用户所在的国家名称
	 *
	 * @param countryName 用户所在的国家名称
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * 获取语言id
	 *
	 * @return language_id - 语言id
	 */
	public String getLanguageId() {
		return languageId;
	}

	/**
	 * 设置语言id
	 *
	 * @param languageId 语言id
	 */
	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	/**
	 * 获取语言名称，多个名称用，分割
	 *
	 * @return language_name - 语言名称，多个名称用，分割
	 */
	public String getLanguageName() {
		return languageName;
	}

	/**
	 * 设置语言名称，多个名称用，分割
	 *
	 * @param languageName 语言名称，多个名称用，分割
	 */
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	/**
	 * 获取用户出生日期
	 *
	 * @return birthday - 用户出生日期
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * 设置用户出生日期
	 *
	 * @param birthday 用户出生日期
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * 获取用户使用的平台类型1 ios 2 android
	 *
	 * @return platform_type - 用户使用的平台类型1 ios 2 android
	 */
	public Integer getPlatformType() {
		return platformType;
	}

	/**
	 * 设置用户使用的平台类型1 ios 2 android
	 *
	 * @param platformType 用户使用的平台类型1 ios 2 android
	 */
	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}

	/**
	 * 获取当前账号的状态 1.可用，2 禁用
	 *
	 * @return status - 当前账号的状态 1.可用，2 禁用
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置当前账号的状态 1.可用，2 禁用
	 *
	 * @param status 当前账号的状态 1.可用，2 禁用
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 获取用户创建时间
	 *
	 * @return create_time - 用户创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置用户创建时间
	 *
	 * @param createTime 用户创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取用户信息的更新时间
	 *
	 * @return update_time - 用户信息的更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置用户信息的更新时间
	 *
	 * @param updateTime 用户信息的更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取个人简介
	 *
	 * @return introduce - 个人简介
	 */
	public String getIntroduce() {
		return introduce;
	}

	/**
	 * 设置个人简介
	 *
	 * @param introduce 个人简介
	 */
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	/**
	 * 获取视频url地址
	 *
	 * @return video - 视频url地址
	 */
	public String getVideo() {
		return video;
	}

	/**
	 * 设置视频url地址
	 *
	 * @param video 视频url地址
	 */
	public void setVideo(String video) {
		this.video = video;
	}

	/**
	 * 获取真实用户id
	 *
	 * @return real_user_id - 真实用户id
	 */
	public Integer getRealUserId() {
		return realUserId;
	}

	/**
	 * 设置真实用户id
	 *
	 * @param realUserId 真实用户id
	 */
	public void setRealUserId(Integer realUserId) {
		this.realUserId = realUserId;
	}

	/**
	 * 获取设备id
	 *
	 * @return real_device_id - 设备id
	 */
	public String getRealDeviceId() {
		return realDeviceId;
	}

	/**
	 * 设置设备id
	 *
	 * @param realDeviceId 设备id
	 */
	public void setRealDeviceId(String realDeviceId) {
		this.realDeviceId = realDeviceId;
	}

	public Boolean getEroticism() {
		return eroticism;
	}

	public void setEroticism(Boolean eroticism) {
		this.eroticism = eroticism;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", userName=").append(userName);
		sb.append(", appId=").append(appId);
		sb.append(", background=").append(background);
		sb.append(", headImg=").append(headImg);
		sb.append(", gender=").append(gender);
		sb.append(", countryId=").append(countryId);
		sb.append(", countryName=").append(countryName);
		sb.append(", languageId=").append(languageId);
		sb.append(", languageName=").append(languageName);
		sb.append(", birthday=").append(birthday);
		sb.append(", platformType=").append(platformType);
		sb.append(", status=").append(status);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", introduce=").append(introduce);
		sb.append(", video=").append(video);
		sb.append(", realUserId=").append(realUserId);
		sb.append(", realDeviceId=").append(realDeviceId);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}