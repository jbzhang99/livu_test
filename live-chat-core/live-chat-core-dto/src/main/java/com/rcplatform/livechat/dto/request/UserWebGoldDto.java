package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Yang Peng on 2017/5/22.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@ApiModel
public class UserWebGoldDto implements Serializable{

    @NotNull
    @ApiModelProperty(value = "用户id")
    private Integer userId;


    @ApiModelProperty(value = "应用ID,LivU 20000,LiveChat 19999")
    private Integer appId;

    @NotNull
    @ApiModelProperty(value = "校验token，规则如下，用户id+key+gold md5加密串")
    private String token;


    @NotNull
    @ApiModelProperty(value = "充值金币数")
    private BigDecimal gold;


    @NotNull
    @ApiModelProperty(value = "花费金额")
    private BigDecimal money;


    @NotNull
    @ApiModelProperty(value = "充值平台类型 3 payPal 4 codaPay ")
    private Integer type;


    @NotNull
    @ApiModelProperty(value = "是否是免费金币")
    private Boolean free;


    @NotNull
    @ApiModelProperty(value = "支付时间毫秒")
    private Long purchaseTimeMillis;



    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public BigDecimal getGold() {
        return gold;
    }

    public void setGold(BigDecimal gold) {
        this.gold = gold;
    }


    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public Long getPurchaseTimeMillis() {
        return purchaseTimeMillis;
    }

    public void setPurchaseTimeMillis(Long purchaseTimeMillis) {
        this.purchaseTimeMillis = purchaseTimeMillis;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserWebGoldDto{");
        sb.append("userId=").append(userId);
        sb.append(", appId=").append(appId);
        sb.append(", token='").append(token).append('\'');
        sb.append(", gold=").append(gold);
        sb.append(", money=").append(money);
        sb.append(", type=").append(type);
        sb.append(", free=").append(free);
        sb.append(", purchaseTimeMillis=").append(purchaseTimeMillis);
        sb.append('}');
        return sb.toString();
    }
}
