package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户朋友数据载体
  Created by Administrator on 2016/8/7.
 */
@ApiModel
public class UserFriendDto implements Serializable {

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Integer id;


    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String userName;

    /**
     * 应用id
     */
    @ApiModelProperty(value = "应用id")
    private Integer appId;

    /**
     * 用户头像
     */
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
    @ApiModelProperty(value = "用户所在的国家id")
    private Integer countryId;

    /**
     * 用户所在的国家名称
     */
    @ApiModelProperty(value = "用户所在国家名称")
    private String countryName;

    /**
     * 语言名称，多个名称用，分割
     */
    @ApiModelProperty(value = "语言名称，多个名称用，分割")
    private String languageName;

    /**
     * 用户出生日期
     */
    @ApiModelProperty(value = "用户出生日期")
    private Date birthday;

    /**
     * 背景图片
     */
    @ApiModelProperty(value = "背景图片")
    private String background;


    /**
     * 语言id
     */
    @ApiModelProperty(value = "语言id，多个名称，分隔")
    private String languageId;


    @ApiModelProperty(value = "加入黑名单的时间")
    private Date createTime;


    @ApiModelProperty(value = "个人简介")
    private String  introduce;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }


    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserFriendDto{");
        sb.append("id=").append(id);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", appId=").append(appId);
        sb.append(", headImg='").append(headImg).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", countryId=").append(countryId);
        sb.append(", countryName='").append(countryName).append('\'');
        sb.append(", languageName='").append(languageName).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", background='").append(background).append('\'');
        sb.append(", languageId='").append(languageId).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", introduce='").append(introduce).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
