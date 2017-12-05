package com.rcplatform.videochat.model;

import javax.persistence.*;

@Table(name = "rc_eroticism_circle_out_setting")
public class EroticismCircleOutSetting {

    public EroticismCircleOutSetting(Integer appId) {
        this.appId = appId;
    }

    public EroticismCircleOutSetting() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "app_id")
    private Integer appId;

    /**
     * 色情女举报次数
     */
    @Column(name = "eroticism_female")
    private Integer eroticismFemale;

    /**
     * 自动截图男性
     */
    @Column(name = "snapshot_male")
    private Integer snapshotMale;

    /**
     * 匹配男性comfirm一次
     */
    @Column(name = "match_male_one")
    private Integer matchMaleOne;

    /**
     * 匹配男性comfirm两次
     */
    @Column(name = "match_male_two")
    private Integer matchMaleTwo;

    /**
     * 不进圈国家
     */
    @Column(name = "country_id")
    private String countryId;

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

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取色情女举报次数
     *
     * @return eroticism_female - 色情女举报次数
     */
    public Integer getEroticismFemale() {
        return eroticismFemale;
    }

    /**
     * 设置色情女举报次数
     *
     * @param eroticismFemale 色情女举报次数
     */
    public void setEroticismFemale(Integer eroticismFemale) {
        this.eroticismFemale = eroticismFemale;
    }

    /**
     * 获取自动截图男性
     *
     * @return snapshot_male - 自动截图男性
     */
    public Integer getSnapshotMale() {
        return snapshotMale;
    }

    /**
     * 设置自动截图男性
     *
     * @param snapshotMale 自动截图男性
     */
    public void setSnapshotMale(Integer snapshotMale) {
        this.snapshotMale = snapshotMale;
    }

    /**
     * 获取匹配男性comfirm一次
     *
     * @return match_male_one - 匹配男性comfirm一次
     */
    public Integer getMatchMaleOne() {
        return matchMaleOne;
    }

    /**
     * 设置匹配男性comfirm一次
     *
     * @param matchMaleOne 匹配男性comfirm一次
     */
    public void setMatchMaleOne(Integer matchMaleOne) {
        this.matchMaleOne = matchMaleOne;
    }

    /**
     * 获取匹配男性comfirm两次
     *
     * @return match_male_two - 匹配男性comfirm两次
     */
    public Integer getMatchMaleTwo() {
        return matchMaleTwo;
    }

    /**
     * 设置匹配男性comfirm两次
     *
     * @param matchMaleTwo 匹配男性comfirm两次
     */
    public void setMatchMaleTwo(Integer matchMaleTwo) {
        this.matchMaleTwo = matchMaleTwo;
    }

    /**
     * 获取不进圈国家
     *
     * @return country_id - 不进圈国家
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * 设置不进圈国家
     *
     * @param countryId 不进圈国家
     */
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }
}