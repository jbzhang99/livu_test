package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by admin on 2017/3/2.
 */
@ApiModel
public class OperationResp implements Serializable{

    public OperationResp() {
    }

    public OperationResp(Integer userId, BigDecimal receiveStone) {
        this.userId = userId;
        this.receiveStone = receiveStone;
    }

    @ApiModelProperty(value = "用户id")
    private Integer userId;


    @ApiModelProperty(value = "用户名")
    private String userName;



    @ApiModelProperty(value = "头像")
    private String headImg;



    @ApiModelProperty(value = "收到的钻石数")
    private BigDecimal receiveStone;



    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public BigDecimal getReceiveStone() {
        return receiveStone;
    }

    public void setReceiveStone(BigDecimal receiveStone) {
        this.receiveStone = receiveStone;
    }
}
