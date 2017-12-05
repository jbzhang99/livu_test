package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_verify_info")
@ApiModel
public class UserVerifyInfo implements Serializable {

    public UserVerifyInfo(Integer userId) {
        this.userId = userId;
    }

    public UserVerifyInfo() {
    }


    public UserVerifyInfo(Integer userId, String threePartyId, String threePartyEmail, String threePartyImage,
                          Integer type, Integer gender, Date birthday, Integer countryId, String countryName, Integer languageId, String languageName) {
        this.userId = userId;
        this.threePartyId = threePartyId;
        this.threePartyEmail = threePartyEmail;
        this.threePartyImage = threePartyImage;
        this.type = type;
        this.gender = gender;
        this.birthday = birthday;
        this.countryId = countryId;
        this.countryName = countryName;
        this.languageId = languageId;
        this.languageName = languageName;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * 第三方id
     */
    @Column(name = "three_party_id")
    @ApiModelProperty(value="第三方id")
    @NotNull
    private String threePartyId;


    @Column(name = "three_party_email")
    @ApiModelProperty(value = "第三方邮箱")
    private String threePartyEmail;

    /**
     * 第三方图片地址
     */
    @Column(name = "three_party_image")
    @ApiModelProperty(value="第三方图片地址")
    private String threePartyImage;

    /**
     * 第三方账户类型 2 facebook 3,google,4.Twitter 5.VK 
     */
    @ApiModelProperty(value="第三方账户类型 2 facebook 3,google,4.Twitter 5.VK ")
    @NotNull
    private Integer type;

    /**
     * 第三方用户性别
     */
    @ApiModelProperty(value="第三方用户性别")
    private Integer gender;

    /**
     * 用户出生日期
     */
    @ApiModelProperty(value="用户出生日期")
    private Date birthday;

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
     * 语言id
     */
    @Column(name = "language_id")
    @ApiModelProperty(value="语言id")
    private Integer languageId;

    /**
     * 语言名称
     */
    @Column(name = "language_name")
    @ApiModelProperty(value="语言名称")
    private String languageName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

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
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取第三方id
     *
     * @return three_party_id - 第三方id
     */
    public String getThreePartyId() {
        return threePartyId;
    }

    /**
     * 设置第三方id
     *
     * @param threePartyId 第三方id
     */
    public void setThreePartyId(String threePartyId) {
        this.threePartyId = threePartyId;
    }

    /**
     * 获取第三方图片地址
     *
     * @return three_party_image - 第三方图片地址
     */
    public String getThreePartyImage() {
        return threePartyImage;
    }

    /**
     * 设置第三方图片地址
     *
     * @param threePartyImage 第三方图片地址
     */
    public void setThreePartyImage(String threePartyImage) {
        this.threePartyImage = threePartyImage;
    }

    /**
     * 获取第三方账户类型 2 facebook 3,google,4.Twitter 5.VK 
     *
     * @return type - 第三方账户类型 2 facebook 3,google,4.Twitter 5.VK 
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置第三方账户类型 2 facebook 3,google,4.Twitter 5.VK 
     *
     * @param type 第三方账户类型 2 facebook 3,google,4.Twitter 5.VK 
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取第三方用户性别
     *
     * @return gender - 第三方用户性别
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置第三方用户性别
     *
     * @param gender 第三方用户性别
     */
    public void setGender(Integer gender) {
        this.gender = gender;
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
    public Integer getLanguageId() {
        return languageId;
    }

    /**
     * 设置语言id
     *
     * @param languageId 语言id
     */
    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    /**
     * 获取语言名称
     *
     * @return language_name - 语言名称
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * 设置语言名称
     *
     * @param languageName 语言名称
     */
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public String getThreePartyEmail() {
        return threePartyEmail;
    }

    public void setThreePartyEmail(String threePartyEmail) {
        this.threePartyEmail = threePartyEmail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserVerifyInfo{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", threePartyId='").append(threePartyId).append('\'');
        sb.append(", threePartyEmail='").append(threePartyEmail).append('\'');
        sb.append(", threePartyImage='").append(threePartyImage).append('\'');
        sb.append(", type=").append(type);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", countryId=").append(countryId);
        sb.append(", countryName='").append(countryName).append('\'');
        sb.append(", languageId=").append(languageId);
        sb.append(", languageName='").append(languageName).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}