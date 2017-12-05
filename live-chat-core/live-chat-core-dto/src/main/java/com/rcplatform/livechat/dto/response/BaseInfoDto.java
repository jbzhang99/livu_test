package com.rcplatform.livechat.dto.response;

import com.rcplatform.videochat.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/2/8.
 */
@ApiModel
public class BaseInfoDto implements Serializable {


    @ApiModelProperty(value = "国家列表")
    private List<Country> countries;


    @ApiModelProperty(value = "语言列表")
    private List<Language> languages;


    @ApiModelProperty(value = "免费商品列表")
    private List<FreeCommodity> freeCommodities;


    @ApiModelProperty(value = "消费品列表")
    private List<Consume> consumes;


    @ApiModelProperty(value = "app 版本信息")
    private AppVersion appVersion;


    @ApiModelProperty(value = "服务端时间")
    private Date timestamp;


    @ApiModelProperty(value = "app 配置信息")
    private List<AppConfig> appConfigs;


    @ApiModelProperty(value = "礼物列表")
    private List<Gift> gifts;


    @ApiModelProperty(value = "用户权限")
    private List<UserPower> userPowers;


    @ApiModelProperty(value = "视频截图截取规则")
    private List<SnapshotSetting> snapshotSettings;

    @ApiModelProperty(value = "新视频截图规则")
    private List<SnapshotSettingNewResp> snapshotSettingNewResps;


    @ApiModelProperty(value = "匹配的语言列表")
    private List<MatchLanguage> matchLanguages;


    @ApiModelProperty(value = "默认用户的头像icon")
    private List<DefaultUserIcon> defaultUserIcons;




    public List<SnapshotSetting> getSnapshotSettings() {
        return snapshotSettings;
    }

    public void setSnapshotSettings(List<SnapshotSetting> snapshotSettings) {
        this.snapshotSettings = snapshotSettings;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public List<FreeCommodity> getFreeCommodities() {
        return freeCommodities;
    }

    public void setFreeCommodities(List<FreeCommodity> freeCommodities) {
        this.freeCommodities = freeCommodities;
    }

    public List<Consume> getConsumes() {
        return consumes;
    }

    public void setConsumes(List<Consume> consumes) {
        this.consumes = consumes;
    }


    public AppVersion getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(AppVersion appVersion) {
        this.appVersion = appVersion;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }


    public List<AppConfig> getAppConfigs() {
        return appConfigs;
    }

    public void setAppConfigs(List<AppConfig> appConfigs) {
        this.appConfigs = appConfigs;
    }

    public List<Gift> getGifts() {
        return gifts;
    }

    public void setGifts(List<Gift> gifts) {
        this.gifts = gifts;
    }

    public List<UserPower> getUserPowers() {
        return userPowers;
    }

    public void setUserPowers(List<UserPower> userPowers) {
        this.userPowers = userPowers;
    }

    public List<SnapshotSettingNewResp> getSnapshotSettingNewResps() {
        return snapshotSettingNewResps;
    }

    public void setSnapshotSettingNewResps(List<SnapshotSettingNewResp> snapshotSettingNewResps) {
        this.snapshotSettingNewResps = snapshotSettingNewResps;
    }

    public List<MatchLanguage> getMatchLanguages() {
        return matchLanguages;
    }

    public void setMatchLanguages(List<MatchLanguage> matchLanguages) {
        this.matchLanguages = matchLanguages;
    }


    public List<DefaultUserIcon> getDefaultUserIcons() {
        return defaultUserIcons;
    }

    public void setDefaultUserIcons(List<DefaultUserIcon> defaultUserIcons) {
        this.defaultUserIcons = defaultUserIcons;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseInfoDto{");
        sb.append("countries=").append(countries);
        sb.append(", languages=").append(languages);
        sb.append(", freeCommodities=").append(freeCommodities);
        sb.append(", consumes=").append(consumes);
        sb.append(", appVersion=").append(appVersion);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", appConfigs=").append(appConfigs);
        sb.append(", gifts=").append(gifts);
        sb.append(", userPowers=").append(userPowers);
        sb.append(", snapshotSettings=").append(snapshotSettings);
        sb.append(", snapshotSettingNewResps=").append(snapshotSettingNewResps);
        sb.append(", matchLanguages=").append(matchLanguages);
        sb.append(", defaultUserIcons=").append(defaultUserIcons);
        sb.append('}');
        return sb.toString();
    }
}
