package com.rcplatform.livechat.dto.request;

import java.math.BigDecimal;

/**
 * Created by admin on 2017/3/27.
 */

public class UserGoldDto {


    private Integer userId;


    private BigDecimal gold;

    /**
     * 谷歌订单号
     */
    private String googleOrderId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getGold() {
        return gold;
    }

    public void setGold(BigDecimal gold) {
        this.gold = gold;
    }

    public String getGoogleOrderId() {
        return googleOrderId;
    }

    public void setGoogleOrderId(String googleOrderId) {
        this.googleOrderId = googleOrderId;
    }

    @Override
    public String toString() {
        return "UserGoldDto{" +
                "userId=" + userId +
                ", gold=" + gold +
                ", googleOrderId='" + googleOrderId + '\'' +
                '}';
    }
}
