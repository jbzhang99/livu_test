package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_user_statistics")
@ApiModel
public class UserStatistics implements Serializable {
	/**
	 * 主键
	 */
	@Id
	@ApiModelProperty(value = "主键")
	private Integer id;

	@Column(name = "app_id")
	private Integer appId;

	/**
	 * 总用户数量
	 */
	@Column(name = "user_total_num")
	@ApiModelProperty(value = "总用户数量")
	private Integer userTotalNum;

	/**
	 * facebook的用户数量
	 */
	@Column(name = "facebook_num")
	@ApiModelProperty(value = "facebook的用户数量")
	private Integer facebookNum;

	/**
	 * 男性总用户数量
	 */
	@Column(name = "user_boy_num")
	@ApiModelProperty(value = "男性总用户数量")
	private Integer userBoyNum;

	/**
	 * 女性总用户数量
	 */
	@Column(name = "user_girl_num")
	@ApiModelProperty(value = "女性总用户数量")
	private Integer userGirlNum;

	/**
	 * 邮箱用户女性数量
	 */
	@Column(name = "email_girl_num")
	@ApiModelProperty(value = "邮箱用户女性数量")
	private Integer emailGirlNum;

	/**
	 * 邮箱用户男性数量
	 */
	@Column(name = "email_boy_num")
	@ApiModelProperty(value = "邮箱用户男性数量")
	private Integer emailBoyNum;

	/**
	 * 累计facebook女性数量
	 */
	@Column(name = "facebook_girl_num")
	@ApiModelProperty(value = "累计facebook女性数量")
	private Integer facebookGirlNum;

	/**
	 * 累计facebook男性数量
	 */
	@Column(name = "facebook_boy_num")
	@ApiModelProperty(value = "累计facebook男性数量")
	private Integer facebookBoyNum;

	/**
	 * 新增用户数量
	 */
	@Column(name = "new_user_num")
	@ApiModelProperty(value = "新增用户数量")
	private Integer newUserNum;

	/**
	 * facebook新增人数
	 */
	@Column(name = "new_facebook_num")
	@ApiModelProperty(value = "facebook新增人数")
	private Integer newFacebookNum;

	/**
	 * 新增女性用户数量
	 */
	@Column(name = "new_user_girl_num")
	@ApiModelProperty(value = "新增女性用户数量")
	private Integer newUserGirlNum;

	/**
	 * 新增男性用户数量
	 */
	@Column(name = "new_user_boy_num")
	@ApiModelProperty(value = "新增男性用户数量")
	private Integer newUserBoyNum;

	/**
	 * 新增邮箱女性用户数量
	 */
	@Column(name = "new_email_girl_num")
	@ApiModelProperty(value = "新增邮箱女性用户数量")
	private Integer newEmailGirlNum;

	/**
	 * 新增邮箱男性用户数量
	 */
	@Column(name = "new_email_boy_num")
	@ApiModelProperty(value = "新增邮箱男性用户数量")
	private Integer newEmailBoyNum;

	/**
	 * 新增facebook男性用户数量
	 */
	@Column(name = "new_facebook_boy_num")
	@ApiModelProperty(value = "新增facebook男性用户数量")
	private Integer newFacebookBoyNum;

	/**
	 * 新增facebook女性用户数量
	 */
	@Column(name = "new_facebook_girl_num")
	@ApiModelProperty(value = "新增facebook女性用户数量")
	private Integer newFacebookGirlNum;

	/**
	 * 累计安卓用户数量
	 */
	@Column(name = "android_user")
	@ApiModelProperty(value = "累计安卓用户数量")
	private Integer androidUser;

	/**
	 * 累计ios用户数量
	 */
	@Column(name = "ios_user")
	@ApiModelProperty(value = "累计ios用户数量")
	private Integer iosUser;

	/**
	 * 新增android用户数量
	 */
	@Column(name = "new_android_user")
	@ApiModelProperty(value = "新增android用户数量")
	private Integer newAndroidUser;

	/**
	 * 新增ios用户数量
	 */
	@Column(name = "new_ios_user")
	@ApiModelProperty(value = "新增ios用户数量")
	private Integer newIosUser;

	/**
	 * 新增Google女性用户人数
	 */
	@Column(name = "new_google_girl_num")
	@ApiModelProperty(value = "新增Google女性用户人数")
	private Integer newGoogleGirlNum;

	/**
	 * 新增Google男性用户人数
	 */
	@Column(name = "new_google_boy_num")
	@ApiModelProperty(value = "新增Google男性用户人数")
	private Integer newGoogleBoyNum;

	/**
	 * 新增Twitter女性用户人数
	 */
	@Column(name = "new_twitter_girl_num")
	@ApiModelProperty(value = "新增Twitter女性用户人数")
	private Integer newTwitterGirlNum;

	/**
	 * 新增Twitter男性用户人数
	 */
	@Column(name = "new_twitter_boy_num")
	@ApiModelProperty(value = "新增Twitter男性用户人数")
	private Integer newTwitterBoyNum;

	/**
	 * 新增VK女性用户人数
	 */
	@Column(name = "new_vk_girl_num")
	@ApiModelProperty(value = "新增VK女性用户人数")
	private Integer newVKGirlNum;

	/**
	 * 新增VK男性用户人数
	 */
	@Column(name = "new_vk_boy_num")
	@ApiModelProperty(value = "新增VK男性用户人数")
	private Integer newVKBoyNum;

	@Column(name = "new_android_boy_user")
	private Integer newAndroidBoyUser;

	@Column(name = "new_android_girl_user")
	private Integer newAndroidGirlUser;

	@Column(name = "new_ios_boy_user")
	private Integer newIosBoyUser;

	@Column(name = "new_ios_girl_user")
	private Integer newIosGirlUser;

	/**
	 * 创建的时间
	 */
	@Column(name = "create_time")
	@ApiModelProperty(value = "创建的时间")
	private Date createTime;

	//手机号用户数量
	@Column(name = "phone_user")
	private Integer phoneUser;

	//新增手机号用户数量
	@Column(name = "new_phone_user")
	private Integer newPhoneUser;

	//安卓手机号用户数量
	@Column(name = "android_phone_user")
	private Integer androidPhoneUser;

	//安卓新增用户数量
	@Column(name = "android_new_phone_user")
	private Integer androidNewPhoneUser;

	//安卓累计女性用户数量
	@Column(name = "android_girl_phone_user")
	private Integer androidGirlPhoneUser;

	//安卓累计男性用户数量
	@Column(name = "android_boy_phone_user")
	private Integer androidBoyPhoneUser;


	//ios手机号用户数量
	@Column(name = "ios_phone_user")
	private Integer iosPhoneUser;

	//ios新增用户数量
	@Column(name = "ios_new_phone_user")
	private Integer iosNewPhoneUser;

	//ios累计女性用户数量
	@Column(name = "ios_girl_phone_user")
	private Integer iosGirlPhoneUser;

	//ios累计男性用户数量
	@Column(name = "ios_boy_phone_user")
	private Integer iosBoyPhoneUser;


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
	 * 获取总用户数量
	 *
	 * @return user_total_num - 总用户数量
	 */
	public Integer getUserTotalNum() {
		return userTotalNum;
	}

	/**
	 * 设置总用户数量
	 *
	 * @param userTotalNum 总用户数量
	 */
	public void setUserTotalNum(Integer userTotalNum) {
		this.userTotalNum = userTotalNum;
	}

	/**
	 * 获取facebook的用户数量
	 *
	 * @return facebook_num - facebook的用户数量
	 */
	public Integer getFacebookNum() {
		return facebookNum;
	}

	/**
	 * 设置facebook的用户数量
	 *
	 * @param facebookNum facebook的用户数量
	 */
	public void setFacebookNum(Integer facebookNum) {
		this.facebookNum = facebookNum;
	}

	/**
	 * 获取男性总用户数量
	 *
	 * @return user_boy_num - 男性总用户数量
	 */
	public Integer getUserBoyNum() {
		return userBoyNum;
	}

	/**
	 * 设置男性总用户数量
	 *
	 * @param userBoyNum 男性总用户数量
	 */
	public void setUserBoyNum(Integer userBoyNum) {
		this.userBoyNum = userBoyNum;
	}

	/**
	 * 获取女性总用户数量
	 *
	 * @return user_girl_num - 女性总用户数量
	 */
	public Integer getUserGirlNum() {
		return userGirlNum;
	}

	/**
	 * 设置女性总用户数量
	 *
	 * @param userGirlNum 女性总用户数量
	 */
	public void setUserGirlNum(Integer userGirlNum) {
		this.userGirlNum = userGirlNum;
	}

	/**
	 * 获取邮箱用户女性数量
	 *
	 * @return email_girl_num - 邮箱用户女性数量
	 */
	public Integer getEmailGirlNum() {
		return emailGirlNum;
	}

	/**
	 * 设置邮箱用户女性数量
	 *
	 * @param emailGirlNum 邮箱用户女性数量
	 */
	public void setEmailGirlNum(Integer emailGirlNum) {
		this.emailGirlNum = emailGirlNum;
	}

	/**
	 * 获取邮箱用户男性数量
	 *
	 * @return email_boy_num - 邮箱用户男性数量
	 */
	public Integer getEmailBoyNum() {
		return emailBoyNum;
	}

	/**
	 * 设置邮箱用户男性数量
	 *
	 * @param emailBoyNum 邮箱用户男性数量
	 */
	public void setEmailBoyNum(Integer emailBoyNum) {
		this.emailBoyNum = emailBoyNum;
	}

	/**
	 * 获取累计facebook女性数量
	 *
	 * @return facebook_girl_num - 累计facebook女性数量
	 */
	public Integer getFacebookGirlNum() {
		return facebookGirlNum;
	}

	/**
	 * 设置累计facebook女性数量
	 *
	 * @param facebookGirlNum 累计facebook女性数量
	 */
	public void setFacebookGirlNum(Integer facebookGirlNum) {
		this.facebookGirlNum = facebookGirlNum;
	}

	/**
	 * 获取累计facebook男性数量
	 *
	 * @return facebook_boy_num - 累计facebook男性数量
	 */
	public Integer getFacebookBoyNum() {
		return facebookBoyNum;
	}

	/**
	 * 设置累计facebook男性数量
	 *
	 * @param facebookBoyNum 累计facebook男性数量
	 */
	public void setFacebookBoyNum(Integer facebookBoyNum) {
		this.facebookBoyNum = facebookBoyNum;
	}

	/**
	 * 获取新增用户数量
	 *
	 * @return new_user_num - 新增用户数量
	 */
	public Integer getNewUserNum() {
		return newUserNum;
	}

	/**
	 * 设置新增用户数量
	 *
	 * @param newUserNum 新增用户数量
	 */
	public void setNewUserNum(Integer newUserNum) {
		this.newUserNum = newUserNum;
	}

	/**
	 * 获取facebook新增人数
	 *
	 * @return new_facebook_num - facebook新增人数
	 */
	public Integer getNewFacebookNum() {
		return newFacebookNum;
	}

	/**
	 * 设置facebook新增人数
	 *
	 * @param newFacebookNum facebook新增人数
	 */
	public void setNewFacebookNum(Integer newFacebookNum) {
		this.newFacebookNum = newFacebookNum;
	}

	/**
	 * 获取新增女性用户数量
	 *
	 * @return new_user_girl_num - 新增女性用户数量
	 */
	public Integer getNewUserGirlNum() {
		return newUserGirlNum;
	}

	/**
	 * 设置新增女性用户数量
	 *
	 * @param newUserGirlNum 新增女性用户数量
	 */
	public void setNewUserGirlNum(Integer newUserGirlNum) {
		this.newUserGirlNum = newUserGirlNum;
	}

	/**
	 * 获取新增男性用户数量
	 *
	 * @return new_user_boy_num - 新增男性用户数量
	 */
	public Integer getNewUserBoyNum() {
		return newUserBoyNum;
	}

	/**
	 * 设置新增男性用户数量
	 *
	 * @param newUserBoyNum 新增男性用户数量
	 */
	public void setNewUserBoyNum(Integer newUserBoyNum) {
		this.newUserBoyNum = newUserBoyNum;
	}

	/**
	 * 获取新增邮箱女性用户数量
	 *
	 * @return new_email_girl_num - 新增邮箱女性用户数量
	 */
	public Integer getNewEmailGirlNum() {
		return newEmailGirlNum;
	}

	/**
	 * 设置新增邮箱女性用户数量
	 *
	 * @param newEmailGirlNum 新增邮箱女性用户数量
	 */
	public void setNewEmailGirlNum(Integer newEmailGirlNum) {
		this.newEmailGirlNum = newEmailGirlNum;
	}

	/**
	 * 获取新增邮箱男性用户数量
	 *
	 * @return new_email_boy_num - 新增邮箱男性用户数量
	 */
	public Integer getNewEmailBoyNum() {
		return newEmailBoyNum;
	}

	/**
	 * 设置新增邮箱男性用户数量
	 *
	 * @param newEmailBoyNum 新增邮箱男性用户数量
	 */
	public void setNewEmailBoyNum(Integer newEmailBoyNum) {
		this.newEmailBoyNum = newEmailBoyNum;
	}

	/**
	 * 获取新增facebook男性用户数量
	 *
	 * @return new_facebook_boy_num - 新增facebook男性用户数量
	 */
	public Integer getNewFacebookBoyNum() {
		return newFacebookBoyNum;
	}

	/**
	 * 设置新增facebook男性用户数量
	 *
	 * @param newFacebookBoyNum 新增facebook男性用户数量
	 */
	public void setNewFacebookBoyNum(Integer newFacebookBoyNum) {
		this.newFacebookBoyNum = newFacebookBoyNum;
	}

	/**
	 * 获取新增facebook女性用户数量
	 *
	 * @return new_facebook_girl_num - 新增facebook女性用户数量
	 */
	public Integer getNewFacebookGirlNum() {
		return newFacebookGirlNum;
	}

	/**
	 * 设置新增facebook女性用户数量
	 *
	 * @param newFacebookGirlNum 新增facebook女性用户数量
	 */
	public void setNewFacebookGirlNum(Integer newFacebookGirlNum) {
		this.newFacebookGirlNum = newFacebookGirlNum;
	}

	/**
	 * 获取累计安卓用户数量
	 *
	 * @return android_user - 累计安卓用户数量
	 */
	public Integer getAndroidUser() {
		return androidUser;
	}

	/**
	 * 设置累计安卓用户数量
	 *
	 * @param androidUser 累计安卓用户数量
	 */
	public void setAndroidUser(Integer androidUser) {
		this.androidUser = androidUser;
	}

	/**
	 * 获取累计ios用户数量
	 *
	 * @return ios_user - 累计ios用户数量
	 */
	public Integer getIosUser() {
		return iosUser;
	}

	/**
	 * 设置累计ios用户数量
	 *
	 * @param iosUser 累计ios用户数量
	 */
	public void setIosUser(Integer iosUser) {
		this.iosUser = iosUser;
	}

	/**
	 * 获取新增android用户数量
	 *
	 * @return new_android_user - 新增android用户数量
	 */
	public Integer getNewAndroidUser() {
		return newAndroidUser;
	}

	/**
	 * 设置新增android用户数量
	 *
	 * @param newAndroidUser 新增android用户数量
	 */
	public void setNewAndroidUser(Integer newAndroidUser) {
		this.newAndroidUser = newAndroidUser;
	}

	/**
	 * 获取新增ios用户数量
	 *
	 * @return new_ios_user - 新增ios用户数量
	 */
	public Integer getNewIosUser() {
		return newIosUser;
	}

	/**
	 * 设置新增ios用户数量
	 *
	 * @param newIosUser 新增ios用户数量
	 */
	public void setNewIosUser(Integer newIosUser) {
		this.newIosUser = newIosUser;
	}

	/**
	 * 获取创建的时间
	 *
	 * @return create_time - 创建的时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置创建的时间
	 *
	 * @param createTime 创建的时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getNewGoogleGirlNum() {
		return newGoogleGirlNum;
	}

	public void setNewGoogleGirlNum(Integer newGoogleGirlNum) {
		this.newGoogleGirlNum = newGoogleGirlNum;
	}

	public Integer getNewGoogleBoyNum() {
		return newGoogleBoyNum;
	}

	public void setNewGoogleBoyNum(Integer newGoogleBoyNum) {
		this.newGoogleBoyNum = newGoogleBoyNum;
	}

	public Integer getNewTwitterGirlNum() {
		return newTwitterGirlNum;
	}

	public void setNewTwitterGirlNum(Integer newTwitterGirlNum) {
		this.newTwitterGirlNum = newTwitterGirlNum;
	}

	public Integer getNewTwitterBoyNum() {
		return newTwitterBoyNum;
	}

	public void setNewTwitterBoyNum(Integer newTwitterBoyNum) {
		this.newTwitterBoyNum = newTwitterBoyNum;
	}

	public Integer getNewVKGirlNum() {
		return newVKGirlNum;
	}

	public void setNewVKGirlNum(Integer newVKGirlNum) {
		this.newVKGirlNum = newVKGirlNum;
	}

	public Integer getNewVKBoyNum() {
		return newVKBoyNum;
	}

	public void setNewVKBoyNum(Integer newVKBoyNum) {
		this.newVKBoyNum = newVKBoyNum;
	}

	public Integer getNewAndroidBoyUser() {
		return newAndroidBoyUser;
	}

	public void setNewAndroidBoyUser(Integer newAndroidBoyUser) {
		this.newAndroidBoyUser = newAndroidBoyUser;
	}

	public Integer getNewAndroidGirlUser() {
		return newAndroidGirlUser;
	}

	public void setNewAndroidGirlUser(Integer newAndroidGirlUser) {
		this.newAndroidGirlUser = newAndroidGirlUser;
	}

	public Integer getNewIosBoyUser() {
		return newIosBoyUser;
	}

	public void setNewIosBoyUser(Integer newIosBoyUser) {
		this.newIosBoyUser = newIosBoyUser;
	}

	public Integer getNewIosGirlUser() {
		return newIosGirlUser;
	}

	public void setNewIosGirlUser(Integer newIosGirlUser) {
		this.newIosGirlUser = newIosGirlUser;
	}


	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Integer getPhoneUser() {
		return phoneUser;
	}

	public void setPhoneUser(Integer phoneUser) {
		this.phoneUser = phoneUser;
	}

	public Integer getNewPhoneUser() {
		return newPhoneUser;
	}

	public void setNewPhoneUser(Integer newPhoneUser) {
		this.newPhoneUser = newPhoneUser;
	}


	public Integer getAndroidPhoneUser() {
		return androidPhoneUser;
	}

	public void setAndroidPhoneUser(Integer androidPhoneUser) {
		this.androidPhoneUser = androidPhoneUser;
	}

	public Integer getAndroidNewPhoneUser() {
		return androidNewPhoneUser;
	}

	public void setAndroidNewPhoneUser(Integer androidNewPhoneUser) {
		this.androidNewPhoneUser = androidNewPhoneUser;
	}

	public Integer getAndroidGirlPhoneUser() {
		return androidGirlPhoneUser;
	}

	public void setAndroidGirlPhoneUser(Integer androidGirlPhoneUser) {
		this.androidGirlPhoneUser = androidGirlPhoneUser;
	}

	public Integer getAndroidBoyPhoneUser() {
		return androidBoyPhoneUser;
	}

	public void setAndroidBoyPhoneUser(Integer androidBoyPhoneUser) {
		this.androidBoyPhoneUser = androidBoyPhoneUser;
	}

	public Integer getIosPhoneUser() {
		return iosPhoneUser;
	}

	public void setIosPhoneUser(Integer iosPhoneUser) {
		this.iosPhoneUser = iosPhoneUser;
	}

	public Integer getIosNewPhoneUser() {
		return iosNewPhoneUser;
	}

	public void setIosNewPhoneUser(Integer iosNewPhoneUser) {
		this.iosNewPhoneUser = iosNewPhoneUser;
	}

	public Integer getIosGirlPhoneUser() {
		return iosGirlPhoneUser;
	}

	public void setIosGirlPhoneUser(Integer iosGirlPhoneUser) {
		this.iosGirlPhoneUser = iosGirlPhoneUser;
	}

	public Integer getIosBoyPhoneUser() {
		return iosBoyPhoneUser;
	}

	public void setIosBoyPhoneUser(Integer iosBoyPhoneUser) {
		this.iosBoyPhoneUser = iosBoyPhoneUser;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("UserStatistics{");
		sb.append("id=").append(id);
		sb.append(", appId=").append(appId);
		sb.append(", userTotalNum=").append(userTotalNum);
		sb.append(", facebookNum=").append(facebookNum);
		sb.append(", userBoyNum=").append(userBoyNum);
		sb.append(", userGirlNum=").append(userGirlNum);
		sb.append(", emailGirlNum=").append(emailGirlNum);
		sb.append(", emailBoyNum=").append(emailBoyNum);
		sb.append(", facebookGirlNum=").append(facebookGirlNum);
		sb.append(", facebookBoyNum=").append(facebookBoyNum);
		sb.append(", newUserNum=").append(newUserNum);
		sb.append(", newFacebookNum=").append(newFacebookNum);
		sb.append(", newUserGirlNum=").append(newUserGirlNum);
		sb.append(", newUserBoyNum=").append(newUserBoyNum);
		sb.append(", newEmailGirlNum=").append(newEmailGirlNum);
		sb.append(", newEmailBoyNum=").append(newEmailBoyNum);
		sb.append(", newFacebookBoyNum=").append(newFacebookBoyNum);
		sb.append(", newFacebookGirlNum=").append(newFacebookGirlNum);
		sb.append(", androidUser=").append(androidUser);
		sb.append(", iosUser=").append(iosUser);
		sb.append(", newAndroidUser=").append(newAndroidUser);
		sb.append(", newIosUser=").append(newIosUser);
		sb.append(", newGoogleGirlNum=").append(newGoogleGirlNum);
		sb.append(", newGoogleBoyNum=").append(newGoogleBoyNum);
		sb.append(", newTwitterGirlNum=").append(newTwitterGirlNum);
		sb.append(", newTwitterBoyNum=").append(newTwitterBoyNum);
		sb.append(", newVKGirlNum=").append(newVKGirlNum);
		sb.append(", newVKBoyNum=").append(newVKBoyNum);
		sb.append(", newAndroidBoyUser=").append(newAndroidBoyUser);
		sb.append(", newAndroidGirlUser=").append(newAndroidGirlUser);
		sb.append(", newIosBoyUser=").append(newIosBoyUser);
		sb.append(", newIosGirlUser=").append(newIosGirlUser);
		sb.append(", createTime=").append(createTime);
		sb.append('}');
		return sb.toString();
	}
}