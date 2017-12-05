package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by 药耀源 on 2017/4/27.
 */
@ApiModel
public class ActiveUserDto implements Serializable {

    public ActiveUserDto() {
    }

    public ActiveUserDto(Integer gender) {
        this.gender = gender;
    }

    public ActiveUserDto(Integer gender, Integer beginAge, Integer endAge, Integer home, Integer countryId, Integer languageId) {
        this.gender = gender;
        this.beginAge = beginAge;
        this.endAge = endAge;
        this.home = home;
        this.countryId = countryId;
        this.languageId = languageId;
    }

    /**
     * 用户性别 0 ALL 1 男性 2 女性
     */
    @ApiModelProperty(value="性别筛选 1 男性 2 女性,如果不做筛选，不必传递，下同")
    private Integer gender;

    /**
     * 筛选的用户最大年龄
     */
    @ApiModelProperty(value="筛选的最小年龄")
    private Integer beginAge;


    /**
     * 筛选的用户大年龄
     */
    @ApiModelProperty(value="筛选的最大年龄")
    private Integer endAge;

    /**
     * 用户所在国家id
     */
    @ApiModelProperty(value="用户所在国家id,不可为空")
    private Integer home;

    /**
     * 用户筛选的国家id
     */
    @ApiModelProperty(value = "用户筛选的国家id")
    private Integer countryId;
    /**
     * 语言id
     */
    @ApiModelProperty(value="语言id")
    private Integer languageId;

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getBeginAge() {
        return beginAge;
    }

    public void setBeginAge(Integer beginAge) {
        this.beginAge = beginAge;
    }

    public Integer getEndAge() {
        return endAge;
    }

    public void setEndAge(Integer endAge) {
        this.endAge = endAge;
    }

    public Integer getHome() {
        return home;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }
}
