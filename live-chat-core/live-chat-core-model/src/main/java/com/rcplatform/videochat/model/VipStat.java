package com.rcplatform.videochat.model;


import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "stat_sum_vip_user")
public class VipStat implements Serializable{

    /**
     * 主键
     */
    @Id
    private Integer id;

    private Date sDate;

    private Integer appId;

    private Integer platType;

    /** 0 非色情 1 色情**/
    private Integer isporn;

    /** 1VIPA 2 VIPB 3VIPC **/
    private Integer vipLevel;

    private Integer d1Num;

    private double d2_percent;

    private double d3_percent;

    private double d4_percent;

    private double d5_percent;

    private double d6_percent;

    private double d7_percent;

    private double d8_percent;

    private double d9_percent;

    private double d10_percent;

    private double d11_percent;

    private double d12_percent;

    private double d13_percent;

    private double d14_percent;

    private double d15_percent;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getPlatType() {
        return platType;
    }

    public void setPlatType(Integer platType) {
        this.platType = platType;
    }

    public Integer getIsporn() {
        return isporn;
    }

    public void setIsporn(Integer isporn) {
        this.isporn = isporn;
    }

    public Integer getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Integer getD1Num() {
        return d1Num;
    }

    public void setD1Num(Integer d1Num) {
        this.d1Num = d1Num;
    }

    public double getD2_percent() {
        return d2_percent;
    }

    public void setD2_percent(double d2_percent) {
        this.d2_percent = d2_percent;
    }

    public double getD3_percent() {
        return d3_percent;
    }

    public void setD3_percent(double d3_percent) {
        this.d3_percent = d3_percent;
    }

    public double getD4_percent() {
        return d4_percent;
    }

    public void setD4_percent(double d4_percent) {
        this.d4_percent = d4_percent;
    }

    public double getD5_percent() {
        return d5_percent;
    }

    public void setD5_percent(double d5_percent) {
        this.d5_percent = d5_percent;
    }

    public double getD6_percent() {
        return d6_percent;
    }

    public void setD6_percent(double d6_percent) {
        this.d6_percent = d6_percent;
    }

    public double getD7_percent() {
        return d7_percent;
    }

    public void setD7_percent(double d7_percent) {
        this.d7_percent = d7_percent;
    }

    public double getD8_percent() {
        return d8_percent;
    }

    public void setD8_percent(double d8_percent) {
        this.d8_percent = d8_percent;
    }

    public double getD9_percent() {
        return d9_percent;
    }

    public void setD9_percent(double d9_percent) {
        this.d9_percent = d9_percent;
    }

    public double getD10_percent() {
        return d10_percent;
    }

    public void setD10_percent(double d10_percent) {
        this.d10_percent = d10_percent;
    }

    public double getD11_percent() {
        return d11_percent;
    }

    public void setD11_percent(double d11_percent) {
        this.d11_percent = d11_percent;
    }

    public double getD12_percent() {
        return d12_percent;
    }

    public void setD12_percent(double d12_percent) {
        this.d12_percent = d12_percent;
    }

    public double getD13_percent() {
        return d13_percent;
    }

    public void setD13_percent(double d13_percent) {
        this.d13_percent = d13_percent;
    }

    public double getD14_percent() {
        return d14_percent;
    }

    public void setD14_percent(double d14_percent) {
        this.d14_percent = d14_percent;
    }

    public double getD15_percent() {
        return d15_percent;
    }

    public void setD15_percent(double d15_percent) {
        this.d15_percent = d15_percent;
    }
}
