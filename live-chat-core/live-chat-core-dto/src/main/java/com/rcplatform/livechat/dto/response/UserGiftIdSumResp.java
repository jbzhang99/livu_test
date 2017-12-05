package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by admin on 2017/2/13.
 */
@ApiModel
public class UserGiftIdSumResp implements Serializable {


    @ApiModelProperty(value = "礼物id")
    private Integer id;


    @ApiModelProperty(value = "钻石总数")
    private BigDecimal stoneSum;


    @ApiModelProperty(value = "礼物数量")
    private Integer giftNum;



    @ApiModelProperty(value = "每个礼物的钻石数")
    private BigDecimal stone;


    @ApiModelProperty(value = "发送者id")
    private Integer sendUserId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getStoneSum() {
        return stoneSum;
    }

    public void setStoneSum(BigDecimal stoneSum) {
        this.stoneSum = stoneSum;
    }

    public Integer getGiftNum() {
        return giftNum;
    }

    public void setGiftNum(Integer giftNum) {
        this.giftNum = giftNum;
    }

    public BigDecimal getStone() {
        return stone;
    }

    public void setStone(BigDecimal stone) {
        this.stone = stone;
    }

    public Integer getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(Integer sendUserId) {
        this.sendUserId = sendUserId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserGiftIdSumResp{");
        sb.append("id=").append(id);
        sb.append(", stoneSum=").append(stoneSum);
        sb.append(", giftNum=").append(giftNum);
        sb.append(", stone=").append(stone);
        sb.append(", sendUserId=").append(sendUserId);
        sb.append('}');
        return sb.toString();
    }
}
