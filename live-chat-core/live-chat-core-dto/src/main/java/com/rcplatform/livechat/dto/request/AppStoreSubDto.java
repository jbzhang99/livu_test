package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by apple on 2017/5/14.
 */
@ApiModel
public class AppStoreSubDto implements Serializable {


    /**
     * 购买的商品id
     */

    @ApiModelProperty(value = "商品id")
    @NotNull
    private Integer vipCommodityId;


    @NotEmpty
    @ApiModelProperty(value = "rechargeId")
    private String rechargeId;



    @NotEmpty
    @ApiModelProperty(value = "receiptData")
    private String receiptData;

    public Integer getVipCommodityId() {
        return vipCommodityId;
    }

    public void setVipCommodityId(Integer vipCommodityId) {
        this.vipCommodityId = vipCommodityId;
    }

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

    @Override
    public String toString() {
        return "AppleStoreSubDto{" +
                "vipCommodityId=" + vipCommodityId +
                ", rechargeId='" + rechargeId + '\'' +
                ", receiptData='" + receiptData + '\'' +
                '}';
    }
}
