package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by admin on 2017/2/13.
 */
@ApiModel
public class UserGiftDto implements Serializable{


    @ApiModelProperty(value = "收到礼物的用户id")
    @NotNull
    private Integer receiveUserId;


    @ApiModelProperty(value = "发送的礼物id")
    @NotNull
    private Integer giftId;

    public Integer getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(Integer receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserGiftDto{");
        sb.append("receiveUserId=").append(receiveUserId);
        sb.append(", giftId=").append(giftId);
        sb.append('}');
        return sb.toString();
    }
}
