package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_user_first_pay")
@ApiModel
public class UserFirstPay implements Serializable {

    public UserFirstPay() {
    }

    public UserFirstPay(Integer userId, BigDecimal money, Integer commodityId, BigDecimal gold, Integer appId) {
        this.userId = userId;
        this.money = money;
        this.commodityId = commodityId;
        this.gold = gold;
        this.appId = appId;
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
     * 付费额
     */
    @ApiModelProperty(value="付费额")
    private BigDecimal money;

    /**
     * 商品id
     */
    @Column(name = "commodity_id")
    @ApiModelProperty(value="商品id")
    private Integer commodityId;

    /**
     * 金币数
     */
    @ApiModelProperty(value="金币数")
    private BigDecimal gold;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 应用id
     */
    @Column(name = "app_id")
    @ApiModelProperty(value="应用id")
    private Integer appId;

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
     * 获取付费额
     *
     * @return money - 付费额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置付费额
     *
     * @param money 付费额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取商品id
     *
     * @return commodity_id - 商品id
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品id
     *
     * @param commodityId 商品id
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取金币数
     *
     * @return gold - 金币数
     */
    public BigDecimal getGold() {
        return gold;
    }

    /**
     * 设置金币数
     *
     * @param gold 金币数
     */
    public void setGold(BigDecimal gold) {
        this.gold = gold;
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
     * 获取应用id
     *
     * @return app_id - 应用id
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * 设置应用id
     *
     * @param appId 应用id
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
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
        sb.append(", commodityId=").append(commodityId);
        sb.append(", gold=").append(gold);
        sb.append(", createTime=").append(createTime);
        sb.append(", appId=").append(appId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}