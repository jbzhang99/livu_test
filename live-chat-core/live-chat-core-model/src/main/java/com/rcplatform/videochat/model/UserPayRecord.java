package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_user_pay_record")
@ApiModel
public class UserPayRecord implements Serializable {



    public UserPayRecord() {
    }


    public UserPayRecord(Integer userId, Integer commodityId, BigDecimal goldNum, BigDecimal money, Integer verifyResult, String googleOrderId,Integer payPlatform, Integer appId) {
        this.userId = userId;
        this.commodityId = commodityId;
        this.goldNum = goldNum;
        this.money = money;
        this.verifyResult = verifyResult;
        this.googleOrderId = googleOrderId;
        this.payPlatform = payPlatform;
        this.appId = appId;
    }



    @Id
    @ApiModelProperty(value="")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "app_id")
    private Integer appId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * google签名字符串
     */
    @ApiModelProperty(value="google签名字符串")
    private String signture;

    /**
     * google 签名的数据
     */
    @Column(name = "signtureData")
    @ApiModelProperty(value="google 签名的数据")
    private String signturedata;

    /**
     * 购买的商品id
     */
    @Column(name = "commodity_id")
    @ApiModelProperty(value="购买的商品id")
    private Integer commodityId;

    /**
     * 购买的金币数量
     */
    @Column(name = "gold_num")
    @ApiModelProperty(value="购买的金币数量")
    private BigDecimal goldNum;

    /**
     * 购买的所花的钱数
     */
    @ApiModelProperty(value="购买的所花的钱数")
    private BigDecimal money;

    /**
     * ios交易号
     */
    @Column(name = "recharge_id")
    @ApiModelProperty(value="ios交易号")
    private String rechargeId;

    /**
     * ios的交易id
     */
    @Column(name = "transaction_id")
    @ApiModelProperty(value="ios的交易id")
    private String transactionId;

    /**
     * 验证支付的结果 1 成功 2 失败
     */
    @Column(name = "verify_result")
    @ApiModelProperty(value="验证支付的结果 1 成功 2 失败")
    private Integer verifyResult;

    /**
     * 交易设备的id
     */
    @Column(name = "user_device_id")
    @ApiModelProperty(value="交易设备的id")
    private String userDeviceId;

    /**
     * 支付的平台 1 google 支付 2. 苹果内购支付
     */
    @Column(name = "pay_platform")
    @ApiModelProperty(value="支付的平台 1 google 支付 2. 苹果内购支付")
    private Integer payPlatform;

    /**
     * 交易创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="交易创建时间")
    private Date createTime;

    /**
     * 交易的验证时间点
     */
    @Column(name = "verify_time")
    @ApiModelProperty(value="交易的验证时间点")
    private Date verifyTime;

    /**
     * ios交易验证码
     */
    @Column(name = "receipt_data")
    @ApiModelProperty(value="ios交易验证码")
    private String receiptData;


    /**
     * google 的订单id
     */
    @Column(name = "google_order_id")
    @ApiModelProperty(value = "google的订单id")
    private String googleOrderId;

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
     * 获取google签名字符串
     *
     * @return signture - google签名字符串
     */
    public String getSignture() {
        return signture;
    }

    /**
     * 设置google签名字符串
     *
     * @param signture google签名字符串
     */
    public void setSignture(String signture) {
        this.signture = signture;
    }

    /**
     * 获取google 签名的数据
     *
     * @return signtureData - google 签名的数据
     */
    public String getSignturedata() {
        return signturedata;
    }

    /**
     * 设置google 签名的数据
     *
     * @param signturedata google 签名的数据
     */
    public void setSignturedata(String signturedata) {
        this.signturedata = signturedata;
    }

    /**
     * 获取购买的商品id
     *
     * @return commodity_id - 购买的商品id
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置购买的商品id
     *
     * @param commodityId 购买的商品id
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取购买的金币数量
     *
     * @return gold_num - 购买的金币数量
     */
    public BigDecimal getGoldNum() {
        return goldNum;
    }

    /**
     * 设置购买的金币数量
     *
     * @param goldNum 购买的金币数量
     */
    public void setGoldNum(BigDecimal goldNum) {
        this.goldNum = goldNum;
    }

    /**
     * 获取购买的所花的钱数
     *
     * @return money - 购买的所花的钱数
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置购买的所花的钱数
     *
     * @param money 购买的所花的钱数
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取ios交易号
     *
     * @return recharge_id - ios交易号
     */
    public String getRechargeId() {
        return rechargeId;
    }

    /**
     * 设置ios交易号
     *
     * @param rechargeId ios交易号
     */
    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId;
    }

    /**
     * 获取ios的交易id
     *
     * @return transaction_id - ios的交易id
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置ios的交易id
     *
     * @param transactionId ios的交易id
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * 获取验证支付的结果 1 成功 2 失败
     *
     * @return verify_result - 验证支付的结果 1 成功 2 失败
     */
    public Integer getVerifyResult() {
        return verifyResult;
    }

    /**
     * 设置验证支付的结果 1 成功 2 失败
     *
     * @param verifyResult 验证支付的结果 1 成功 2 失败
     */
    public void setVerifyResult(Integer verifyResult) {
        this.verifyResult = verifyResult;
    }

    /**
     * 获取交易设备的id
     *
     * @return user_device_id - 交易设备的id
     */
    public String getUserDeviceId() {
        return userDeviceId;
    }

    /**
     * 设置交易设备的id
     *
     * @param userDeviceId 交易设备的id
     */
    public void setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
    }

    /**
     * 获取支付的平台 1 google 支付 2. 苹果内购支付
     *
     * @return pay_platform - 支付的平台 1 google 支付 2. 苹果内购支付
     */
    public Integer getPayPlatform() {
        return payPlatform;
    }

    /**
     * 设置支付的平台 1 google 支付 2. 苹果内购支付
     *
     * @param payPlatform 支付的平台 1 google 支付 2. 苹果内购支付
     */
    public void setPayPlatform(Integer payPlatform) {
        this.payPlatform = payPlatform;
    }

    /**
     * 获取交易创建时间
     *
     * @return create_time - 交易创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置交易创建时间
     *
     * @param createTime 交易创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取交易的验证时间点
     *
     * @return verify_time - 交易的验证时间点
     */
    public Date getVerifyTime() {
        return verifyTime;
    }

    /**
     * 设置交易的验证时间点
     *
     * @param verifyTime 交易的验证时间点
     */
    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    /**
     * 获取ios交易验证码
     *
     * @return receipt_data - ios交易验证码
     */
    public String getReceiptData() {
        return receiptData;
    }

    /**
     * 设置ios交易验证码
     *
     * @param receiptData ios交易验证码
     */
    public void setReceiptData(String receiptData) {
        this.receiptData = receiptData;
    }


    public String getGoogleOrderId() {
        return googleOrderId;
    }

    public void setGoogleOrderId(String googleOrderId) {
        this.googleOrderId = googleOrderId;
    }


    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserPayRecord{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", userId=").append(userId);
        sb.append(", signture='").append(signture).append('\'');
        sb.append(", signturedata='").append(signturedata).append('\'');
        sb.append(", commodityId=").append(commodityId);
        sb.append(", goldNum=").append(goldNum);
        sb.append(", money=").append(money);
        sb.append(", rechargeId='").append(rechargeId).append('\'');
        sb.append(", transactionId='").append(transactionId).append('\'');
        sb.append(", verifyResult=").append(verifyResult);
        sb.append(", userDeviceId='").append(userDeviceId).append('\'');
        sb.append(", payPlatform=").append(payPlatform);
        sb.append(", createTime=").append(createTime);
        sb.append(", verifyTime=").append(verifyTime);
        sb.append(", receiptData='").append(receiptData).append('\'');
        sb.append(", googleOrderId='").append(googleOrderId).append('\'');
        sb.append('}');
        return sb.toString();
    }


    public static final class Builder {
        private Integer id;
        private Integer userId;
        private String signture;
        private String signturedata;
        private Integer commodityId;
        private BigDecimal goldNum;
        private BigDecimal money;
        private String rechargeId;
        private String transactionId;
        private Integer verifyResult;
        private String userDeviceId;
        private Integer payPlatform;
        private Date createTime;
        private Date verifyTime;
        private String receiptData;
        private String googleOrderId;
        private Integer appId;

        public Builder() {
        }



        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public Builder signture(String signture) {
            this.signture = signture;
            return this;
        }

        public Builder signturedata(String signturedata) {
            this.signturedata = signturedata;
            return this;
        }

        public Builder commodityId(Integer commodityId) {
            this.commodityId = commodityId;
            return this;
        }

        public Builder goldNum(BigDecimal goldNum) {
            this.goldNum = goldNum;
            return this;
        }

        public Builder money(BigDecimal money) {
            this.money = money;
            return this;
        }

        public Builder rechargeId(String rechargeId) {
            this.rechargeId = rechargeId;
            return this;
        }

        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder verifyResult(Integer verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }

        public Builder userDeviceId(String userDeviceId) {
            this.userDeviceId = userDeviceId;
            return this;
        }

        public Builder appId(Integer appId){
            this.appId = appId;
            return this;
        }

        public Builder payPlatform(Integer payPlatform) {
            this.payPlatform = payPlatform;
            return this;
        }

        public Builder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder verifyTime(Date verifyTime) {
            this.verifyTime = verifyTime;
            return this;
        }

        public Builder receiptData(String receiptData) {
            this.receiptData = receiptData;
            return this;
        }

        public Builder googleOrderId(String googleOrderId) {
            this.googleOrderId = googleOrderId;
            return this;
        }

        public UserPayRecord build() {
            UserPayRecord userPayRecord = new UserPayRecord();
            userPayRecord.setId(id);
            userPayRecord.setUserId(userId);
            userPayRecord.setSignture(signture);
            userPayRecord.setSignturedata(signturedata);
            userPayRecord.setCommodityId(commodityId);
            userPayRecord.setGoldNum(goldNum);
            userPayRecord.setMoney(money);
            userPayRecord.setRechargeId(rechargeId);
            userPayRecord.setTransactionId(transactionId);
            userPayRecord.setVerifyResult(verifyResult);
            userPayRecord.setUserDeviceId(userDeviceId);
            userPayRecord.setPayPlatform(payPlatform);
            userPayRecord.setCreateTime(createTime);
            userPayRecord.setVerifyTime(verifyTime);
            userPayRecord.setReceiptData(receiptData);
            userPayRecord.setGoogleOrderId(googleOrderId);
            userPayRecord.setAppId(appId);
            return userPayRecord;
        }
    }
}