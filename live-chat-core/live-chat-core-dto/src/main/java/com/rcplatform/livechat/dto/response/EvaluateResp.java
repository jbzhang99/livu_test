package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by yang peng on 2016/11/2.
 */

@ApiModel
public class EvaluateResp implements Serializable {

    public EvaluateResp() {
    }

    public EvaluateResp(BigDecimal addGold, BigDecimal totalGold) {
        this.addGold = addGold;
        this.totalGold = totalGold;
    }


    @ApiModelProperty(value = "增加的金币数")
    private BigDecimal addGold;



    @ApiModelProperty(value = "剩余金币数")
    private BigDecimal totalGold;


    public BigDecimal getAddGold() {
        return addGold;
    }

    public void setAddGold(BigDecimal addGold) {
        this.addGold = addGold;
    }

    public BigDecimal getTotalGold() {
        return totalGold;
    }

    public void setTotalGold(BigDecimal totalGold) {
        this.totalGold = totalGold;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EvaluateResp{");
        sb.append("addGold=").append(addGold);
        sb.append(", totalGold=").append(totalGold);
        sb.append('}');
        return sb.toString();
    }
}
