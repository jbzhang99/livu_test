package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_google_play_sub")
@ApiModel
public class GooglePlaySub implements Serializable {


    public GooglePlaySub() {
    }

    public GooglePlaySub(Integer userId, String signture, String signtureData, Integer dataVerify, BigDecimal money, String packageName, String subscriptionId, String token) {
        this.userId = userId;
        this.signture = signture;
        this.signtureData = signtureData;
        this.dataVerify = dataVerify;
        this.money = money;
        this.packageName = packageName;
        this.subscriptionId = subscriptionId;
        this.token = token;
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
     * google签名字符串
     */
    @ApiModelProperty(value="google签名字符串")
    private String signture;

    /**
     * google 签名的数据
     */
    @Column(name = "signture_data")
    @ApiModelProperty(value="google 签名的数据")
    private String signtureData;

    /**
     * 本地验证结果 1 成功 2 失败
     */
    @Column(name = "data_verify")
    @ApiModelProperty(value="本地验证结果 1 成功 2 失败")
    private Integer dataVerify;

    /**
     * 购买的所花的钱数
     */
    @ApiModelProperty(value="购买的所花的钱数")
    private BigDecimal money;

    /**
     * 支付包名称
     */
    @Column(name = "package_name")
    @ApiModelProperty(value="支付包名称")
    private String packageName;

    /**
     * 订阅id
     */
    @Column(name = "subscription_id")
    @ApiModelProperty(value="订阅id")
    private String subscriptionId;

    /**
     * 用户支付token
     */
    @ApiModelProperty(value="用户支付token")
    private String token;

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

    public String getSigntureData() {
        return signtureData;
    }

    public void setSigntureData(String signtureData) {
        this.signtureData = signtureData;
    }

    /**
     * 获取本地验证结果 1 成功 2 失败
     *
     * @return data_verify - 本地验证结果 1 成功 2 失败
     */
    public Integer getDataVerify() {
        return dataVerify;
    }

    /**
     * 设置本地验证结果 1 成功 2 失败
     *
     * @param dataVerify 本地验证结果 1 成功 2 失败
     */
    public void setDataVerify(Integer dataVerify) {
        this.dataVerify = dataVerify;
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
     * 获取支付包名称
     *
     * @return package_name - 支付包名称
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * 设置支付包名称
     *
     * @param packageName 支付包名称
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * 获取订阅id
     *
     * @return subscription_id - 订阅id
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * 设置订阅id
     *
     * @param subscriptionId 订阅id
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * 获取用户支付token
     *
     * @return token - 用户支付token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置用户支付token
     *
     * @param token 用户支付token
     */
    public void setToken(String token) {
        this.token = token;
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
        final StringBuilder sb = new StringBuilder("GooglePlaySub{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", signture='").append(signture).append('\'');
        sb.append(", signtureData='").append(signtureData).append('\'');
        sb.append(", dataVerify=").append(dataVerify);
        sb.append(", money=").append(money);
        sb.append(", packageName='").append(packageName).append('\'');
        sb.append(", subscriptionId='").append(subscriptionId).append('\'');
        sb.append(", token='").append(token).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}