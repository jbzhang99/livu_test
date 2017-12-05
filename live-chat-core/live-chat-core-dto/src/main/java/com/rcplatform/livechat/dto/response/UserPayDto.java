package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by yang peng on 2016/9/5.
 */
@ApiModel
public class UserPayDto implements Serializable {

    public UserPayDto() {
    }

    public UserPayDto(Integer commodityId, BigDecimal goldNum, Integer userId) {
        this.commodityId = commodityId;
        this.goldNum = goldNum;
        this.userId = userId;
    }


    @ApiModelProperty(value = "商品id")
    private Integer commodityId;


    @ApiModelProperty(value = "金币数")
    private BigDecimal goldNum;


    @ApiModelProperty(value = "用户id")
    private Integer userId;


    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public BigDecimal getGoldNum() {
        return goldNum;
    }

    public void setGoldNum(BigDecimal goldNum) {
        this.goldNum = goldNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserPayDto{");
        sb.append("commodityId=").append(commodityId);
        sb.append(", goldNum=").append(goldNum);
        sb.append(", userId=").append(userId);
        sb.append('}');
        return sb.toString();
    }
}
