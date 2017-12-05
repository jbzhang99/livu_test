package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * 用户赞
 * Created by fj on 2017/11/9.
 */
@ApiModel
public class UserPraiseDto implements Serializable {


    private Integer totalPrise=0;

    private Integer currentPraise=0;

    private Integer userId;


    public Integer getTotalPrise() {
        return totalPrise;
    }

    public void setTotalPrise(Integer totalPrise) {
        this.totalPrise = totalPrise;
    }

    public Integer getCurrentPraise() {
        return currentPraise;
    }

    public void setCurrentPraise(Integer currentPraise) {
        this.currentPraise = currentPraise;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
