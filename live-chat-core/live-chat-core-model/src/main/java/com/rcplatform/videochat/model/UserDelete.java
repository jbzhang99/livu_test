package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_user_delete")
@ApiModel
public class UserDelete implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 用户的邮箱账号
     */
    @Column(name = "user_account")
    @ApiModelProperty(value="用户的邮箱账号")
    private String userAccount;

    /**
     * 第三方平台的用户id
     */
    @Column(name = "three_party_id")
    @ApiModelProperty(value="第三方平台的用户id")
    private String threePartyId;

    /**
     * 第三方用户的邮箱
     */
    @Column(name = "three_party_email")
    @ApiModelProperty(value="第三方用户的邮箱")
    private String threePartyEmail;

    /**
     * 用户密码
     */
    @ApiModelProperty(value="用户密码")
    private String password;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    @ApiModelProperty(value="用户名")
    private String userName;

    /**
     * 应用id
     */
    @Column(name = "app_id")
    @ApiModelProperty(value="应用id")
    private Integer appId;

    @ApiModelProperty(value="")
    private String background;

    /**
     * 用户头像
     */
    @Column(name = "head_img")
    @ApiModelProperty(value="用户头像")
    private String headImg;

    /**
     * 用户性别 1 男性 2 女性
     */
    @ApiModelProperty(value="用户性别 1 男性 2 女性")
    private Integer gender;

    /**
     * 用户所在国家id
     */
    @Column(name = "country_id")
    @ApiModelProperty(value="用户所在国家id")
    private Integer countryId;

    /**
     * 用户所在的国家名称
     */
    @Column(name = "country_name")
    @ApiModelProperty(value="用户所在的国家名称")
    private String countryName;

    /**
     * 金币数量
     */
    @Column(name = "gold_num")
    @ApiModelProperty(value="金币数量")
    private BigDecimal goldNum;

    /**
     * 语言id
     */
    @Column(name = "language_id")
    @ApiModelProperty(value="语言id")
    private String languageId;

    /**
     * 语言名称，多个名称用，分割
     */
    @Column(name = "language_name")
    @ApiModelProperty(value="语言名称，多个名称用，分割")
    private String languageName;

    /**
     * 用户的年龄
     */
    @ApiModelProperty(value="用户的年龄")
    private Integer age;

    /**
     * 用户出生日期
     */
    @ApiModelProperty(value="用户出生日期")
    private Date birthday;

    /**
     * 用户使用的平台类型1 ios 2 android
     */
    @Column(name = "platform_type")
    @ApiModelProperty(value="用户使用的平台类型1 ios 2 android")
    private Integer platformType;

    /**
     * 用户账号的登录类型 1 注册登录，2 facebook登录，3 ，google+登录
     */
    @ApiModelProperty(value="用户账号的登录类型 1 注册登录，2 facebook登录，3 ，google+登录")
    private Integer type;

    /**
     * 是否是付费用户
     */
    @Column(name = "pay_status")
    @ApiModelProperty(value="是否是付费用户")
    private Integer payStatus;

    /**
     * 当前账号的状态 1.可用，2 禁用 ，3 被举报
     */
    @ApiModelProperty(value="当前账号的状态 1.可用，2 禁用 ，3 被举报")
    private Integer status;

    /**
     * 用户创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="用户创建时间")
    private Date createTime;

    /**
     * 用户信息的更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value="用户信息的更新时间")
    private Date updateTime;

    /**
     * 钻石数量
     */
    @ApiModelProperty(value="钻石数量")
    private BigDecimal stone;

    /**
     * 钻石版本号
     */
    @Column(name = "stone_version")
    @ApiModelProperty(value="钻石版本号")
    private Integer stoneVersion;

    /**
     * 个人简介
     */
    @ApiModelProperty(value="个人简介")
    private String introduce;

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
     * 获取用户的邮箱账号
     *
     * @return user_account - 用户的邮箱账号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置用户的邮箱账号
     *
     * @param userAccount 用户的邮箱账号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获取第三方平台的用户id
     *
     * @return three_party_id - 第三方平台的用户id
     */
    public String getThreePartyId() {
        return threePartyId;
    }

    /**
     * 设置第三方平台的用户id
     *
     * @param threePartyId 第三方平台的用户id
     */
    public void setThreePartyId(String threePartyId) {
        this.threePartyId = threePartyId;
    }

    /**
     * 获取第三方用户的邮箱
     *
     * @return three_party_email - 第三方用户的邮箱
     */
    public String getThreePartyEmail() {
        return threePartyEmail;
    }

    /**
     * 设置第三方用户的邮箱
     *
     * @param threePartyEmail 第三方用户的邮箱
     */
    public void setThreePartyEmail(String threePartyEmail) {
        this.threePartyEmail = threePartyEmail;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
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
     * 获取金币数量
     *
     * @return gold_num - 金币数量
     */
    public BigDecimal getGoldNum() {
        return goldNum;
    }

    /**
     * 设置金币数量
     *
     * @param goldNum 金币数量
     */
    public void setGoldNum(BigDecimal goldNum) {
        this.goldNum = goldNum;
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
     * 获取用户的年龄
     *
     * @return age - 用户的年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置用户的年龄
     *
     * @param age 用户的年龄
     */
    public void setAge(Integer age) {
        this.age = age;
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
     * 获取用户账号的登录类型 1 注册登录，2 facebook登录，3 ，google+登录
     *
     * @return type - 用户账号的登录类型 1 注册登录，2 facebook登录，3 ，google+登录
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置用户账号的登录类型 1 注册登录，2 facebook登录，3 ，google+登录
     *
     * @param type 用户账号的登录类型 1 注册登录，2 facebook登录，3 ，google+登录
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取是否是付费用户
     *
     * @return pay_status - 是否是付费用户
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * 设置是否是付费用户
     *
     * @param payStatus 是否是付费用户
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取当前账号的状态 1.可用，2 禁用 ，3 被举报
     *
     * @return status - 当前账号的状态 1.可用，2 禁用 ，3 被举报
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置当前账号的状态 1.可用，2 禁用 ，3 被举报
     *
     * @param status 当前账号的状态 1.可用，2 禁用 ，3 被举报
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
     * 获取钻石数量
     *
     * @return stone - 钻石数量
     */
    public BigDecimal getStone() {
        return stone;
    }

    /**
     * 设置钻石数量
     *
     * @param stone 钻石数量
     */
    public void setStone(BigDecimal stone) {
        this.stone = stone;
    }

    /**
     * 获取钻石版本号
     *
     * @return stone_version - 钻石版本号
     */
    public Integer getStoneVersion() {
        return stoneVersion;
    }

    /**
     * 设置钻石版本号
     *
     * @param stoneVersion 钻石版本号
     */
    public void setStoneVersion(Integer stoneVersion) {
        this.stoneVersion = stoneVersion;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", threePartyId=").append(threePartyId);
        sb.append(", threePartyEmail=").append(threePartyEmail);
        sb.append(", password=").append(password);
        sb.append(", userName=").append(userName);
        sb.append(", appId=").append(appId);
        sb.append(", background=").append(background);
        sb.append(", headImg=").append(headImg);
        sb.append(", gender=").append(gender);
        sb.append(", countryId=").append(countryId);
        sb.append(", countryName=").append(countryName);
        sb.append(", goldNum=").append(goldNum);
        sb.append(", languageId=").append(languageId);
        sb.append(", languageName=").append(languageName);
        sb.append(", age=").append(age);
        sb.append(", birthday=").append(birthday);
        sb.append(", platformType=").append(platformType);
        sb.append(", type=").append(type);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", stone=").append(stone);
        sb.append(", stoneVersion=").append(stoneVersion);
        sb.append(", introduce=").append(introduce);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}