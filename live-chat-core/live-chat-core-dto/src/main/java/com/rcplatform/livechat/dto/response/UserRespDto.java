package com.rcplatform.livechat.dto.response;

import com.rcplatform.videochat.model.UserImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by yang peng on 2016/8/1.
 */
@ApiModel
public class UserRespDto implements Serializable{




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


    @ApiModelProperty(value = "用户账号")
    private String userAccount;


    @ApiModelProperty(value = "是否显示广告")
    private Boolean showAd;


    @ApiModelProperty(value = "24小时内播放广告的次数")
    private Integer showAdCount;


    @ApiModelProperty(value = "背景图片")
    private String background;

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
    @ApiModelProperty(value = "用户所在的国家名称")
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
     * 登录token
     */
    @ApiModelProperty(value = "登录token")
    private String loginToken;


    /**
     * 金币数
     */
    @ApiModelProperty(value = "金币数")
    private BigDecimal goldNum;

    /**
     * 语言id列表
     */

    @ApiModelProperty(value = "语言id列表")
    private String languageId;



    @ApiModelProperty(value = "是否分享过")
    private Boolean share;



    @ApiModelProperty(value = "是否评价过")
    private Boolean evaluate;


    @ApiModelProperty(value = "是否点过赞")
    private Boolean like;

    /**
     * 用户使用的平台类型1 ios 2 android
     */
    @ApiModelProperty(value="用户使用的平台类型1 ios 2 android")
    private Integer platformType;


    @ApiModelProperty(value = "剩余可以通过看广告视频添加金币的次数")
    private BigDecimal residueGoldNum;

    /**
     * 用户账号的登录类型 1 注册登录，2 facebook登录，3 ，google+登录
     */
    @ApiModelProperty(value="用户账号的登录类型 1 注册登录，2 facebook登录")
    private Integer type;
    /**
     * 钻石数量
     */
    @ApiModelProperty(value="钻石数量")
    private BigDecimal stone;



    @ApiModelProperty(value = "最近收到的礼物id列表")
    private List<Integer> giftIds;


    @ApiModelProperty(value = "获取到的礼物总数")
    private Integer giftCount;



    @ApiModelProperty(value = "用户注册时间")
    private Date createTime;


    @ApiModelProperty(value = "个人简介")
    private String  introduce;


    @ApiModelProperty(value = "用户相册列表")
    private List<UserImage> userImages;


    @ApiModelProperty(value = "第三方验证情况")
    private UserVerifyInfoResp userVerifyInfoResp;


    @ApiModelProperty(value = "推送消息开关 0 打开 1关闭")
    private Integer pushSwitch;


    @ApiModelProperty(value = "视频消息开关  0 打开 1关闭")
    private Integer videoMessageSwitch;



    @ApiModelProperty(value = "可见用户id")
    private String userOtherId;



    @ApiModelProperty(value = "用户性别是否修改过")
    private Boolean birthDayChange;


    @ApiModelProperty(value = "设备语言id")
    private Integer deviceLanguageId;


    @ApiModelProperty(value = "用户关系")
    private Integer relation;

    @ApiModelProperty(value = "匹配页面随机n次匹配弹出广告,n的最小值")
    private Integer minShowAd;

    @ApiModelProperty(value = "匹配页面随机n次匹配弹出广告,n的最大值")
    private Integer maxShowAd;


    @ApiModelProperty(value = "点赞数")
    private Integer praise;

    public UserVerifyInfoResp getUserVerifyInfoResp() {
        return userVerifyInfoResp;
    }

    public void setUserVerifyInfoResp(UserVerifyInfoResp userVerifyInfoResp) {
        this.userVerifyInfoResp = userVerifyInfoResp;
    }

    public Boolean getLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

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

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
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

    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }

    public BigDecimal getGoldNum() {
        return goldNum;
    }

    public void setGoldNum(BigDecimal goldNum) {
        this.goldNum = goldNum;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }


    public Boolean getShare() {
        return share;
    }

    public void setShare(Boolean share) {
        this.share = share;
    }

    public Boolean getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(Boolean evaluate) {
        this.evaluate = evaluate;
    }

    public BigDecimal getStone() {
        return stone;
    }

    public void setStone(BigDecimal stone) {
        this.stone = stone;
    }

    public List<Integer> getGiftIds() {
        return giftIds;
    }

    public void setGiftIds(List<Integer> giftIds) {
        this.giftIds = giftIds;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getGiftCount() {
        return giftCount;
    }

    public void setGiftCount(Integer giftCount) {
        this.giftCount = giftCount;
    }

    public Boolean getShowAd() {
        return showAd;
    }

    public void setShowAd(Boolean showAd) {
        this.showAd = showAd;
    }

    public Integer getShowAdCount() {
        return showAdCount;
    }

    public void setShowAdCount(Integer showAdCount) {
        this.showAdCount = showAdCount;
    }

    public BigDecimal getResidueGoldNum() {
        return residueGoldNum;
    }

    public void setResidueGoldNum(BigDecimal residueGoldNum) {
        this.residueGoldNum = residueGoldNum;
    }



    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }


    public List<UserImage> getUserImages() {
        return userImages;
    }

    public void setUserImages(List<UserImage> userImages) {
        this.userImages = userImages;
    }




    public Integer getPushSwitch() {
        return pushSwitch;
    }

    public void setPushSwitch(Integer pushSwitch) {
        this.pushSwitch = pushSwitch;
    }


    public String getUserOtherId() {
        return userOtherId;
    }



    public void setUserOtherId(String userOtherId) {
        this.userOtherId = userOtherId;
    }


    public Integer getVideoMessageSwitch() {
        return videoMessageSwitch;
    }

    public void setVideoMessageSwitch(Integer videoMessageSwitch) {
        this.videoMessageSwitch = videoMessageSwitch;
    }


    public Boolean getBirthDayChange() {
        return birthDayChange;
    }

    public void setBirthDayChange(Boolean birthDayChange) {
        this.birthDayChange = birthDayChange;
    }


    public Integer getDeviceLanguageId() {
        return deviceLanguageId;
    }

    public void setDeviceLanguageId(Integer deviceLanguageId) {
        this.deviceLanguageId = deviceLanguageId;
    }

    public Integer getRelation() {
        return relation;
    }

    public void setRelation(Integer relation) {
        this.relation = relation;
    }


    public Integer getMinShowAd() {
        return minShowAd;
    }

    public void setMinShowAd(Integer minShowAd) {
        this.minShowAd = minShowAd;
    }

    public Integer getMaxShowAd() {
        return maxShowAd;
    }

    public void setMaxShowAd(Integer maxShowAd) {
        this.maxShowAd = maxShowAd;
    }


    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserRespDto{");
        sb.append("id=").append(id);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", appId=").append(appId);
        sb.append(", userAccount='").append(userAccount).append('\'');
        sb.append(", showAd=").append(showAd);
        sb.append(", showAdCount=").append(showAdCount);
        sb.append(", background='").append(background).append('\'');
        sb.append(", headImg='").append(headImg).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", countryId=").append(countryId);
        sb.append(", countryName='").append(countryName).append('\'');
        sb.append(", languageName='").append(languageName).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", loginToken='").append(loginToken).append('\'');
        sb.append(", goldNum=").append(goldNum);
        sb.append(", languageId='").append(languageId).append('\'');
        sb.append(", share=").append(share);
        sb.append(", evaluate=").append(evaluate);
        sb.append(", like=").append(like);
        sb.append(", platformType=").append(platformType);
        sb.append(", residueGoldNum=").append(residueGoldNum);
        sb.append(", type=").append(type);
        sb.append(", stone=").append(stone);
        sb.append(", giftIds=").append(giftIds);
        sb.append(", giftCount=").append(giftCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", introduce='").append(introduce).append('\'');
        sb.append(", userImages=").append(userImages);
        sb.append(", userVerifyInfoResp=").append(userVerifyInfoResp);
        sb.append(", pushSwitch=").append(pushSwitch);
        sb.append(", videoMessageSwitch=").append(videoMessageSwitch);
        sb.append(", userOtherId='").append(userOtherId).append('\'');
        sb.append(", birthDayChange=").append(birthDayChange);
        sb.append(", deviceLanguageId=").append(deviceLanguageId);
        sb.append(", relation=").append(relation);
        sb.append(", minShowAd=").append(minShowAd);
        sb.append(", maxShowAd=").append(maxShowAd);
        sb.append(", praise=").append(praise);
        sb.append('}');
        return sb.toString();
    }
}
