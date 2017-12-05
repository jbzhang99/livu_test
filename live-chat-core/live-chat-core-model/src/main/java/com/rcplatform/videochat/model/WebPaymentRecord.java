package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_web_payment_record")
@ApiModel
public class WebPaymentRecord implements Serializable {


    public WebPaymentRecord() {
    }

    public WebPaymentRecord(Integer userId, BigDecimal money, BigDecimal gold, Integer type, Long purchaseTimeMillis, Integer free, Date purchaseTime) {
        this.userId = userId;
        this.money = money;
        this.gold = gold;
        this.type = type;
        this.purchaseTimeMillis = purchaseTimeMillis;
        this.free = free;
        this.purchaseTime = purchaseTime;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * 订单支付金额
     */
    @ApiModelProperty(value="订单支付金额")
    private BigDecimal money;

    /**
     * 订单金币数
     */
    @ApiModelProperty(value="订单金币数")
    private BigDecimal gold;

    /**
     * 订单类型 3 payPal 4 code
     */
    @ApiModelProperty(value="订单类型 3 payPal 4 codaPay")
    private Integer type;

    /**
     * 支付时间 
     */
    @Column(name = "purchase_time_millis")
    @ApiModelProperty(value="支付时间 ")
    private Long purchaseTimeMillis;

    /**
     * 是否是免费金币
     */
    @ApiModelProperty(value="是否是免费金币")
    private Integer free;

    /**
     * 订单支付时间
     */
    @Column(name = "purchase_time")
    @ApiModelProperty(value="订单支付时间")
    private Date purchaseTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取订单支付金额
     *
     * @return money - 订单支付金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置订单支付金额
     *
     * @param money 订单支付金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取订单金币数
     *
     * @return gold - 订单金币数
     */
    public BigDecimal getGold() {
        return gold;
    }

    /**
     * 设置订单金币数
     *
     * @param gold 订单金币数
     */
    public void setGold(BigDecimal gold) {
        this.gold = gold;
    }

    /**
     * 获取订单类型 1 payPal 2 code
     *
     * @return type - 订单类型 1 payPal 2 code
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置订单类型 1 payPal 2 code
     *
     * @param type 订单类型 1 payPal 2 code
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取支付时间 
     *
     * @return purchase_time_millis - 支付时间 
     */
    public Long getPurchaseTimeMillis() {
        return purchaseTimeMillis;
    }

    /**
     * 设置支付时间 
     *
     * @param purchaseTimeMillis 支付时间 
     */
    public void setPurchaseTimeMillis(Long purchaseTimeMillis) {
        this.purchaseTimeMillis = purchaseTimeMillis;
    }

    /**
     * 获取是否是免费金币
     *
     * @return free - 是否是免费金币
     */
    public Integer getFree() {
        return free;
    }

    /**
     * 设置是否是免费金币
     *
     * @param free 是否是免费金币
     */
    public void setFree(Integer free) {
        this.free = free;
    }

    /**
     * 获取订单支付时间
     *
     * @return purchase_time - 订单支付时间
     */
    public Date getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * 设置订单支付时间
     *
     * @param purchaseTime 订单支付时间
     */
    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", money=").append(money);
        sb.append(", gold=").append(gold);
        sb.append(", type=").append(type);
        sb.append(", purchaseTimeMillis=").append(purchaseTimeMillis);
        sb.append(", free=").append(free);
        sb.append(", purchaseTime=").append(purchaseTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}