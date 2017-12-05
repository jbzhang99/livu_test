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
public class GooglePayReqDto implements Serializable {


    /**
     * 购买的商品id
     */

    @ApiModelProperty(value = "商品id")
    @NotNull
    private Integer commodityId;

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

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GooglePayReqDto{");
        sb.append("signture='").append(signture).append('\'');
        sb.append(", signtureData='").append(signtureData).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
