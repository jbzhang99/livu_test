package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yangpeng on 2016/8/2.
 */

/**
 * 匹配用户数据载体
 */
@ApiModel
public class UserMatchedResp implements Serializable {

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
    @ApiModelProperty(value = "用户所在国家id")
    private Integer countryId;

    /**
     * 用户所在的国家名称
     */
    @ApiModelProperty(value = "用户所在国家名称")
    private String countryName;

    /**
     * 语言名称，多个名称用，分割
     */
    @ApiModelProperty(value = "语言名称，多个用，分隔")
    private String languageName;

    /**
     * 语言id
     */
    @ApiModelProperty(value = "语言id")
    private String languageId;

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
     * 用户标识
     */
    @ApiModelProperty(value = "用户标识")
    private String ident;


    @ApiModelProperty(value = "1 正常匹配 2 匹配中")
    private Integer status;


    @ApiModelProperty(value = "视频地址")
    private String video;


    @ApiModelProperty(value = "点赞数")
    private Integer praise;


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

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserMatchedResp{");
        sb.append("id=").append(id);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", appId=").append(appId);
        sb.append(", headImg='").append(headImg).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", countryId=").append(countryId);
        sb.append(", countryName='").append(countryName).append('\'');
        sb.append(", languageName='").append(languageName).append('\'');
        sb.append(", languageId='").append(languageId).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", background='").append(background).append('\'');
        sb.append(", ident='").append(ident).append('\'');
        sb.append(", status=").append(status);
        sb.append(", video='").append(video).append('\'');
        sb.append(", praise=").append(praise);
        sb.append('}');
        return sb.toString();
    }
}
