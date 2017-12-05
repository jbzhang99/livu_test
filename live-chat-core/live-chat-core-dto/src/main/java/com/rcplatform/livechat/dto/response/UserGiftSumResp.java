package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by admin on 2017/2/13.
 */
@ApiModel
public class UserGiftSumResp implements Serializable{


    @ApiModelProperty(value = "发送者用户id")
    private Integer sendUserId;



    @ApiModelProperty(value = "用户头像")
    private String headImg;



    @ApiModelProperty(value = "用户头像")
    private String userName;


    @ApiModelProperty(value = "钻石总数")
    private BigDecimal stoneSum;


    @ApiModelProperty(value = "礼物数量")
    private Integer giftNum;



    @ApiModelProperty(value = "礼物汇总列表")
    private List<UserGiftIdSumResp> gifts;



    public Integer getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(Integer sendUserId) {
        this.sendUserId = sendUserId;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public List<UserGiftIdSumResp> getGifts() {
        return gifts;
    }

    public void setGifts(List<UserGiftIdSumResp> gifts) {
        this.gifts = gifts;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserGiftSumResp{");
        sb.append("sendUserId=").append(sendUserId);
        sb.append(", headImg='").append(headImg).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", stoneSum=").append(stoneSum);
        sb.append(", giftNum=").append(giftNum);
        sb.append(", gifts=").append(gifts);
        sb.append('}');
        return sb.toString();
    }
}
