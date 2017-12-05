package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by yang peng on 2016/8/2.
 */

@ApiModel
public class UserMatchPayReqDto implements Serializable {

    /**
     *
     */
    @NotNull
    @ApiModelProperty(value = "匹配的用户id")
    private Integer matchUserId;

    /**
     * 消费品id
     */

    @NotNull
    @ApiModelProperty(value = "消费品id")
   private Integer consumeId;



    public Integer getMatchUserId() {
        return matchUserId;
    }

    public void setMatchUserId(Integer matchUserId) {
        this.matchUserId = matchUserId;
    }

    public Integer getConsumeId() {
        return consumeId;
    }

    public void setConsumeId(Integer consumeId) {
        this.consumeId = consumeId;
    }
}
