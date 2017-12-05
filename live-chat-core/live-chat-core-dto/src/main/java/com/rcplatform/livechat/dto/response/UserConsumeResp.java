package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by admin on 2017/2/14.
 */
@ApiModel
public class UserConsumeResp implements Serializable{

    public UserConsumeResp() {
    }

    public UserConsumeResp(Integer userId, BigDecimal cost, BigDecimal goldNum, Integer consumeId) {
        this.userId = userId;
        this.cost = cost;
        this.goldNum = goldNum;
        this.consumeId = consumeId;
    }

    @ApiModelProperty(value = "用户id")
    private Integer userId;


    @ApiModelProperty(value = "用户花费金币")
    private BigDecimal cost;


    @ApiModelProperty(value = "用户剩余金币")
    private BigDecimal goldNum;


    @ApiModelProperty(value = "用户消费产品id")
    private Integer consumeId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getGoldNum() {
        return goldNum;
    }

    public void setGoldNum(BigDecimal goldNum) {
        this.goldNum = goldNum;
    }

    public Integer getConsumeId() {
        return consumeId;
    }

    public void setConsumeId(Integer consumeId) {
        this.consumeId = consumeId;
    }
}
