package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_exchange_order")
@ApiModel
public class ExchangeOrder implements Serializable {


    public ExchangeOrder() {
    }

    public ExchangeOrder(Integer userId) {
        this.userId = userId;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * 用户兑换前钻石数量
     */
    @Column(name = "user_stone")
    @ApiModelProperty(value="用户兑换前钻石数量")
    private BigDecimal userStone;

    /**
     * 兑换商品id
     */
    @Column(name = "exchange_commodity_id")
    @ApiModelProperty(value="兑换商品id")
    private Integer exchangeCommodityId;

    /**
     * 消耗钻石数
     */
    @ApiModelProperty(value="消耗钻石数")
    private BigDecimal stone;

    /**
     * 兑换的金额
     */
    @Column(name = "exchange_money")
    @ApiModelProperty(value="兑换的金额")
    private BigDecimal exchangeMoney;

    /**
     * 兑换商品类型 0 amazon卡 1 paypal
     */
    @Column(name = "exchange_type")
    @ApiModelProperty(value="兑换商品类型 0 amazon卡 1 paypal")
    private Integer exchangeType;

    /**
     * 兑换邮箱地址
     */
    @ApiModelProperty(value="兑换邮箱地址")
    private String email;

    /**
     * payPal账号
     */
    @Column(name = "pay_pal_account")
    @ApiModelProperty(value="payPal账号")
    private String payPalAccount;

    /**
     * firstName
     */
    @Column(name = "first_name")
    @ApiModelProperty(value="firstName")
    private String firstName;

    /**
     * last name
     */
    @Column(name = "last_name")
    @ApiModelProperty(value="last name")
    private String lastName;

    /**
     * 国家
     */
    @ApiModelProperty(value="国家")
    private String country;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 发放时间
     */
    @Column(name = "finish_time")
    @ApiModelProperty(value="发放时间")
    private Date finishTime;

    /**
     * 完成时间
     */
    @Column(name = "audit_time")
    @ApiModelProperty(value="完成时间")
    private Date auditTime;

    /**
     * 订单审核状态 0 待审核 1 审核通过  2  已关闭  3 已完成
     */
    @Column(name = "order_audit_status")
    @ApiModelProperty(value="订单审核状态 0 待审核 1 审核通过  2  已关闭  3 已完成")
    private Integer orderAuditStatus;

    /**
     * 订单支持货币
     */
    @ApiModelProperty(value="订单支持货币")
    private String currency;

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
     * 获取用户兑换前钻石数量
     *
     * @return user_stone - 用户兑换前钻石数量
     */
    public BigDecimal getUserStone() {
        return userStone;
    }

    /**
     * 设置用户兑换前钻石数量
     *
     * @param userStone 用户兑换前钻石数量
     */
    public void setUserStone(BigDecimal userStone) {
        this.userStone = userStone;
    }

    /**
     * 获取兑换商品id
     *
     * @return exchange_commodity_id - 兑换商品id
     */
    public Integer getExchangeCommodityId() {
        return exchangeCommodityId;
    }

    /**
     * 设置兑换商品id
     *
     * @param exchangeCommodityId 兑换商品id
     */
    public void setExchangeCommodityId(Integer exchangeCommodityId) {
        this.exchangeCommodityId = exchangeCommodityId;
    }

    /**
     * 获取消耗钻石数
     *
     * @return stone - 消耗钻石数
     */
    public BigDecimal getStone() {
        return stone;
    }

    /**
     * 设置消耗钻石数
     *
     * @param stone 消耗钻石数
     */
    public void setStone(BigDecimal stone) {
        this.stone = stone;
    }

    /**
     * 获取兑换的金额
     *
     * @return exchange_money - 兑换的金额
     */
    public BigDecimal getExchangeMoney() {
        return exchangeMoney;
    }

    /**
     * 设置兑换的金额
     *
     * @param exchangeMoney 兑换的金额
     */
    public void setExchangeMoney(BigDecimal exchangeMoney) {
        this.exchangeMoney = exchangeMoney;
    }

    /**
     * 获取兑换商品类型 0 amazon卡 1 paypal
     *
     * @return exchange_type - 兑换商品类型 0 amazon卡 1 paypal
     */
    public Integer getExchangeType() {
        return exchangeType;
    }

    /**
     * 设置兑换商品类型 0 amazon卡 1 paypal
     *
     * @param exchangeType 兑换商品类型 0 amazon卡 1 paypal
     */
    public void setExchangeType(Integer exchangeType) {
        this.exchangeType = exchangeType;
    }

    /**
     * 获取兑换邮箱地址
     *
     * @return email - 兑换邮箱地址
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置兑换邮箱地址
     *
     * @param email 兑换邮箱地址
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取payPal账号
     *
     * @return pay_pal_account - payPal账号
     */
    public String getPayPalAccount() {
        return payPalAccount;
    }

    /**
     * 设置payPal账号
     *
     * @param payPalAccount payPal账号
     */
    public void setPayPalAccount(String payPalAccount) {
        this.payPalAccount = payPalAccount;
    }

    /**
     * 获取firstName
     *
     * @return first_name - firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置firstName
     *
     * @param firstName firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 获取last name
     *
     * @return last_name - last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置last name
     *
     * @param lastName last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
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

    /**
     * 获取发放时间
     *
     * @return finish_time - 发放时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置发放时间
     *
     * @param finishTime 发放时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 获取完成时间
     *
     * @return audit_time - 完成时间
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * 设置完成时间
     *
     * @param auditTime 完成时间
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * 获取订单审核状态 0 待审核 1 审核通过  2  已关闭  3 已完成
     *
     * @return order_audit_status - 订单审核状态 0 待审核 1 审核通过  2  已关闭  3 已完成
     */
    public Integer getOrderAuditStatus() {
        return orderAuditStatus;
    }

    /**
     * 设置订单审核状态 0 待审核 1 审核通过  2  已关闭  3 已完成
     *
     * @param orderAuditStatus 订单审核状态 0 待审核 1 审核通过  2  已关闭  3 已完成
     */
    public void setOrderAuditStatus(Integer orderAuditStatus) {
        this.orderAuditStatus = orderAuditStatus;
    }

    /**
     * 获取订单支持货币
     *
     * @return currency - 订单支持货币
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置订单支持货币
     *
     * @param currency 订单支持货币
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userStone=").append(userStone);
        sb.append(", exchangeCommodityId=").append(exchangeCommodityId);
        sb.append(", stone=").append(stone);
        sb.append(", exchangeMoney=").append(exchangeMoney);
        sb.append(", exchangeType=").append(exchangeType);
        sb.append(", email=").append(email);
        sb.append(", payPalAccount=").append(payPalAccount);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", country=").append(country);
        sb.append(", createTime=").append(createTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", orderAuditStatus=").append(orderAuditStatus);
        sb.append(", currency=").append(currency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}