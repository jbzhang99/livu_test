package com.rcplatform.videochat.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by fj on 2017/8/22.
 */
@Table(name = "video_info")
public class VideoInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * livechat或livu的用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * livechat或livu的用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * livechat或livu的用户头像
     */
    @Column(name = "head_img")
    private String headImg;

    /**
     * 性别 1 男性 2 女性
     */
    private Integer gender;

    /**
     * 国家id
     */
    @Column(name = "country_id")
    private Integer countryId;
    /**
     * 国家
     */
    @Column(name = "country_name")
    private String countryName;

    /**
     * 语言
     */
    @Column(name = "language_name")
    private String languageName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 平台 1 ios 2 android
     */
    @Column(name = "platform_type")
    private Integer platformType;

    /**
     * 支付状态
     */
    @Column(name = "pay_status")
    private Integer payStatus;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;


    /**
     * 用户上传视频1
     */
    @Column(name = "video_url1")
    private String videoUrl1;

    /**
     * 用户上传视频2
     */
    @Column(name = "video_url2")
    private String videoUrl2;

    /**
     * 用户上传视频3
     */
    @Column(name = "video_url3")
    private String videoUrl3;

    /**
     * 用户上传视频4
     */
    @Column(name = "video_url4")
    private String videoUrl4;

    /**
     * <5:启用，9:上传，5-8：审核通过
     */
    private Integer status;

    @Column(name = "app_id")
    private Integer appId;

    /**
     * 视频时长(s)
     */
    @Column(name = "video_times")
    private Integer videoTimes;

    @Column(name = "appId_to")
    private Integer appIdTo;

    @Column(name = "background")
    private String background;

    @Column(name = "language_id")
    private String languageId;


    @Column(name = "virtual_id")
    private Integer virtualId;

    /**
     * 0:默认 1:测试 2:正式
     */
    @Column(name = "flag")
    private Integer flag;

    /**
     * 0:默认非色情 1:色情
     */
    @Column(name = "sex_flag")
    private boolean sexFlag;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取livechat或livu的用户id
     *
     * @return user_id - livechat或livu的用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置livechat或livu的用户id
     *
     * @param userId livechat或livu的用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取livechat或livu的用户名
     *
     * @return user_name - livechat或livu的用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置livechat或livu的用户名
     *
     * @param userName livechat或livu的用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取livechat或livu的用户头像
     *
     * @return head_img - livechat或livu的用户头像
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 设置livechat或livu的用户头像
     *
     * @param headImg livechat或livu的用户头像
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取性别 1 男性 2 女性
     *
     * @return gender - 性别 1 男性 2 女性
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别 1 男性 2 女性
     *
     * @param gender 性别 1 男性 2 女性
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取国家
     *
     * @return country_name - 国家
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置国家
     *
     * @param countryName 国家
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 获取语言
     *
     * @return language_name - 语言
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * 设置语言
     *
     * @param languageName 语言
     */
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取平台 1 ios 2 android
     *
     * @return platform_type - 平台 1 ios 2 android
     */
    public Integer getPlatformType() {
        return platformType;
    }

    /**
     * 设置平台 1 ios 2 android
     *
     * @param platformType 平台 1 ios 2 android
     */
    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    /**
     * 获取支付状态
     *
     * @return pay_status - 支付状态
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * 设置支付状态
     *
     * @param payStatus 支付状态
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取用户上传视频1
     *
     * @return video_url1 - 用户上传视频1
     */
    public String getVideoUrl1() {
        return videoUrl1;
    }

    /**
     * 设置用户上传视频1
     *
     * @param videoUrl1 用户上传视频1
     */
    public void setVideoUrl1(String videoUrl1) {
        this.videoUrl1 = videoUrl1;
    }

    /**
     * 获取用户上传视频2
     *
     * @return video_url2 - 用户上传视频2
     */
    public String getVideoUrl2() {
        return videoUrl2;
    }

    /**
     * 设置用户上传视频2
     *
     * @param videoUrl2 用户上传视频2
     */
    public void setVideoUrl2(String videoUrl2) {
        this.videoUrl2 = videoUrl2;
    }

    /**
     * 获取用户上传视频3
     *
     * @return video_url3 - 用户上传视频3
     */
    public String getVideoUrl3() {
        return videoUrl3;
    }

    /**
     * 设置用户上传视频3
     *
     * @param videoUrl3 用户上传视频3
     */
    public void setVideoUrl3(String videoUrl3) {
        this.videoUrl3 = videoUrl3;
    }

    /**
     * 获取用户上传视频4
     *
     * @return video_url4 - 用户上传视频4
     */
    public String getVideoUrl4() {
        return videoUrl4;
    }

    /**
     * 设置用户上传视频4
     *
     * @param videoUrl4 用户上传视频4
     */
    public void setVideoUrl4(String videoUrl4) {
        this.videoUrl4 = videoUrl4;
    }

    /**
     * 获取0:启用，1、上传，2：审核通过
     *
     * @return status - 0:启用，1、上传，2：审核通过
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0:启用，1、上传，2：审核通过
     *
     * @param status 0:启用，1、上传，2：审核通过
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return app_id
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * @param appId
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取视频时长(s)
     *
     * @return video_times - 视频时长(s)
     */
    public Integer getVideoTimes() {
        return videoTimes;
    }

    /**
     * 设置视频时长(s)
     *
     * @param videoTimes 视频时长(s)
     */
    public void setVideoTimes(Integer videoTimes) {
        this.videoTimes = videoTimes;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getAppIdTo() {
        return appIdTo;
    }

    public void setAppIdTo(Integer appIdTo) {
        this.appIdTo = appIdTo;
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

    public Integer getVirtualId() {
        return virtualId;
    }

    public void setVirtualId(Integer virtualId) {
        this.virtualId = virtualId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public boolean getSexFlag() {
        return sexFlag;
    }

    public void setSexFlag(boolean sexFlag) {
        this.sexFlag = sexFlag;
    }
}