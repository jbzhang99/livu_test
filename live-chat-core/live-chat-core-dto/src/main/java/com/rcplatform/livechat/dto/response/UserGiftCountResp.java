package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 2017/2/14.
 */
@ApiModel
public class UserGiftCountResp implements Serializable {

    public UserGiftCountResp() {
    }

    public UserGiftCountResp(Integer giftCount, List<Integer> giftIds) {
        this.giftCount = giftCount;
        this.giftIds = giftIds;
    }

    @ApiModelProperty(value = "获取到的礼物总数")
    private Integer giftCount;


    @ApiModelProperty(value = "获取到的礼物id列表，钻石数最高的五件")
    private List<Integer> giftIds;



    public Integer getGiftCount() {
        return giftCount;
    }

    public void setGiftCount(Integer giftCount) {
        this.giftCount = giftCount;
    }

    public List<Integer> getGiftIds() {
        return giftIds;
    }

    public void setGiftIds(List<Integer> giftIds) {
        this.giftIds = giftIds;
    }
}
