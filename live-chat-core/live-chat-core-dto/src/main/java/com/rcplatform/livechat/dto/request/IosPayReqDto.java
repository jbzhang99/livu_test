package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by yang peng on 2016/8/8.
 */
@ApiModel
public class IosPayReqDto implements Serializable{


    /**
     * 购买的商品id
     */

    @ApiModelProperty(value = "商品id")
    @NotNull
    private Integer commodityId;


    @NotEmpty
    @ApiModelProperty(value = "rechargeId")
    private String rechargeId;



    @NotEmpty
    @ApiModelProperty(value = "receiptData")
    private String receiptData;


    public String getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId;
    }

    public String getReceiptData() {
        return receiptData;
    }

    public void setReceiptData(String receiptData) {
        this.receiptData = receiptData;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IosPayReqDto{");
        sb.append("rechargeId='").append(rechargeId).append('\'');
        sb.append(", receiptData='").append(receiptData).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
