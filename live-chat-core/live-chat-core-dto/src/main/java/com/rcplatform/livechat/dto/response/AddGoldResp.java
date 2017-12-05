package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by 药耀源 on 2017/3/23.
 */
@ApiModel
public class AddGoldResp implements Serializable{
    public AddGoldResp() {
    }

    public AddGoldResp(BigDecimal addGold, BigDecimal goldNum, BigDecimal residueGoldNum) {
        this.addGold = addGold;
        this.goldNum = goldNum;
        this.residueGoldNum = residueGoldNum;
    }

    //添加金币以后需要返回的字段有: 添加的金币数量，添加后的金币数量

    @ApiModelProperty(value = "添加的金币数量")
    private BigDecimal addGold;

    @ApiModelProperty(value = "添加后的金币数量")
    private BigDecimal goldNum;

    @ApiModelProperty(value = "剩余可以添加金币的次数")
    private BigDecimal residueGoldNum;


    public BigDecimal getAddGold() {
        return addGold;
    }

    public void setAddGold(BigDecimal addGold) {
        this.addGold = addGold;
    }

    public BigDecimal getGoldNum() {
        return goldNum;
    }

    public void setGoldNum(BigDecimal goldNum) {
        this.goldNum = goldNum;
    }

    public BigDecimal getResidueGoldNum() {
        return residueGoldNum;
    }

    public void setResidueGoldNum(BigDecimal residueGoldNum) {
        this.residueGoldNum = residueGoldNum;
    }

    @Override
    public String toString() {
        return "AddGoldResp{" +
                "addGold=" + addGold +
                ", goldNum=" + goldNum +
                ", residueGoldNum=" + residueGoldNum +
                '}';
    }
}
