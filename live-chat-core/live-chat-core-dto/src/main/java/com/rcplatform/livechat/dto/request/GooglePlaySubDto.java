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
public class GooglePlaySubDto implements Serializable {



    /**
     * 购买的商品id
     */

    @ApiModelProperty(value = "商品id")
    @NotNull
    private Integer vipCommodityId;

    /**
     * google签名字符串
     */

    @ApiModelProperty(value = "google签名字符串")
    @NotEmpty
    private String signture;


    /**
     * google签名数据
     */
    @ApiModelProperty(value = "google签名数据")
    @NotEmpty
    private String signtureData;

    public Integer getVipCommodityId() {
        return vipCommodityId;
    }

    public void setVipCommodityId(Integer vipCommodityId) {
        this.vipCommodityId = vipCommodityId;
    }

    public String getSignture() {
        return signture;
    }

    public void setSignture(String signture) {
        this.signture = signture;
    }

    public String getSigntureData() {
        return signtureData;
    }

    public void setSigntureData(String signtureData) {
        this.signtureData = signtureData;
    }

    @Override
    public String toString() {
        return "GooglePlaySubDto{" +
                "vipCommodityId=" + vipCommodityId +
                ", signture='" + signture + '\'' +
                ", signtureData='" + signtureData + '\'' +
                '}';
    }
}
