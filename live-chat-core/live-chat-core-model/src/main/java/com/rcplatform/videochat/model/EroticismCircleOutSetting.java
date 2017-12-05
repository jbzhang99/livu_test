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
     * ɫ��Ů�ٱ�����
     */
    @Column(name = "eroticism_female")
    private Integer eroticismFemale;

    /**
     * �Զ���ͼ����
     */
    @Column(name = "snapshot_male")
    private Integer snapshotMale;

    /**
     * ƥ������comfirmһ��
     */
    @Column(name = "match_male_one")
    private Integer matchMaleOne;

    /**
     * ƥ������comfirm����
     */
    @Column(name = "match_male_two")
    private Integer matchMaleTwo;

    /**
     * ����Ȧ����
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
     * ��ȡɫ��Ů�ٱ�����
     *
     * @return eroticism_female - ɫ��Ů�ٱ�����
     */
    public Integer getEroticismFemale() {
        return eroticismFemale;
    }

    /**
     * ����ɫ��Ů�ٱ�����
     *
     * @param eroticismFemale ɫ��Ů�ٱ�����
     */
    public void setEroticismFemale(Integer eroticismFemale) {
        this.eroticismFemale = eroticismFemale;
    }

    /**
     * ��ȡ�Զ���ͼ����
     *
     * @return snapshot_male - �Զ���ͼ����
     */
    public Integer getSnapshotMale() {
        return snapshotMale;
    }

    /**
     * �����Զ���ͼ����
     *
     * @param snapshotMale �Զ���ͼ����
     */
    public void setSnapshotMale(Integer snapshotMale) {
        this.snapshotMale = snapshotMale;
    }

    /**
     * ��ȡƥ������comfirmһ��
     *
     * @return match_male_one - ƥ������comfirmһ��
     */
    public Integer getMatchMaleOne() {
        return matchMaleOne;
    }

    /**
     * ����ƥ������comfirmһ��
     *
     * @param matchMaleOne ƥ������comfirmһ��
     */
    public void setMatchMaleOne(Integer matchMaleOne) {
        this.matchMaleOne = matchMaleOne;
    }

    /**
     * ��ȡƥ������comfirm����
     *
     * @return match_male_two - ƥ������comfirm����
     */
    public Integer getMatchMaleTwo() {
        return matchMaleTwo;
    }

    /**
     * ����ƥ������comfirm����
     *
     * @param matchMaleTwo ƥ������comfirm����
     */
    public void setMatchMaleTwo(Integer matchMaleTwo) {
        this.matchMaleTwo = matchMaleTwo;
    }

    /**
     * ��ȡ����Ȧ����
     *
     * @return country_id - ����Ȧ����
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * ���ò���Ȧ����
     *
     * @param countryId ����Ȧ����
     */
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }
}