package com.rcplatform.videochat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_pay_stat_day")

public class PayStatDay implements Serializable {


    @Id
    private Integer id;

    @Column(name = "app_id")
    private Integer appId;

    /**
     * 每日购买金币数
     */
    @Column(name = "gold_num")

    private BigDecimal goldNum;

    /**
     * 每日购买金额
     */

    private BigDecimal money;

    /**
     * 购买次数
     */

    private Integer count;

    @Column(name = "ios_pay_user_count")
    private Integer iosPayUserCount;

    @Column(name = "android_pay_user_count")
    private Integer androidPayUserCount;

    @Column(name = "ios_pay_money")
    private BigDecimal iosPayMoney;

    @Column(name = "android_pay_money")
    private BigDecimal androidPayMoney;

    @Column(name = "ios_commodity_statistics")
    private String iosCommodityStatistics;

    @Column(name = "android_commodity_statistics")
    private String androidCommodityStatistics;
    /**
     * 创建时间
     */
    @Column(name = "create_time")

    private Date createTime;

    private static final long serialVersionUID = 1L;

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
     * 获取每日购买金币数
     *
     * @return gold_num - 每日购买金币数
     */
    public BigDecimal getGoldNum() {
        return goldNum;
    }

    /**
     * 设置每日购买金币数
     *
     * @param goldNum 每日购买金币数
     */
    public void setGoldNum(BigDecimal goldNum) {
        this.goldNum = goldNum;
    }

    /**
     * 获取每日购买金额
     *
     * @return money - 每日购买金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置每日购买金额
     *
     * @param money 每日购买金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取购买次数
     *
     * @return count - 购买次数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置购买次数
     *
     * @param count 购买次数
     */
    public void setCount(Integer count) {
        this.count = count;
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

    public Integer getIosPayUserCount() {
        return iosPayUserCount;
    }

    public void setIosPayUserCount(Integer iosPayUserCount) {
        this.iosPayUserCount = iosPayUserCount;
    }

    public Integer getAndroidPayUserCount() {
        return androidPayUserCount;
    }

    public void setAndroidPayUserCount(Integer androidPayUserCount) {
        this.androidPayUserCount = androidPayUserCount;
    }

    public BigDecimal getIosPayMoney() {
        return iosPayMoney;
    }

    public void setIosPayMoney(BigDecimal iosPayMoney) {
        this.iosPayMoney = iosPayMoney;
    }

    public BigDecimal getAndroidPayMoney() {
        return androidPayMoney;
    }

    public void setAndroidPayMoney(BigDecimal androidPayMoney) {
        this.androidPayMoney = androidPayMoney;
    }

    public String getIosCommodityStatistics() {
        return iosCommodityStatistics;
    }

    public void setIosCommodityStatistics(String iosCommodityStatistics) {
        this.iosCommodityStatistics = iosCommodityStatistics;
    }

    public String getAndroidCommodityStatistics() {
        return androidCommodityStatistics;
    }

    public void setAndroidCommodityStatistics(String androidCommodityStatistics) {
        this.androidCommodityStatistics = androidCommodityStatistics;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PayStatDay{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", goldNum=").append(goldNum);
        sb.append(", money=").append(money);
        sb.append(", count=").append(count);
        sb.append(", iosPayUserCount=").append(iosPayUserCount);
        sb.append(", androidPayUserCount=").append(androidPayUserCount);
        sb.append(", iosPayMoney=").append(iosPayMoney);
        sb.append(", androidPayMoney=").append(androidPayMoney);
        sb.append(", iosCommodityStatistics='").append(iosCommodityStatistics).append('\'');
        sb.append(", androidCommodityStatistics='").append(androidCommodityStatistics).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}