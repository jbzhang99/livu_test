package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by 药耀源 on 2017/3/27.
 */
@ApiModel
public class ShowAdDetail implements Serializable{

    public ShowAdDetail() {
    }


    public ShowAdDetail(Boolean ifShowAd) {
        this.ifShowAd = ifShowAd;
    }

    public ShowAdDetail(Boolean ifShowAd, Integer showAdCount, BigDecimal residueGoldNum, Integer minShowAd, Integer maxShowAd) {
        this.ifShowAd = ifShowAd;
        this.showAdCount = showAdCount;
        this.residueGoldNum = residueGoldNum;
        this.minShowAd = minShowAd;
        this.maxShowAd = maxShowAd;
    }

    @ApiModelProperty(value = "是否展示广告")
    private Boolean ifShowAd;

    @ApiModelProperty(value = "每个自然日展示广告次数")
    private Integer showAdCount;

    @ApiModelProperty(value = "剩余可以添加金币的次数")
    private BigDecimal residueGoldNum;

    private Integer minShowAd;

    private Integer maxShowAd;

    public Boolean getIfShowAd() {
        return ifShowAd;
    }

    public void setIfShowAd(Boolean ifShowAd) {
        this.ifShowAd = ifShowAd;
    }

    public Integer getShowAdCount() {
        return showAdCount;
    }

    public void setShowAdCount(Integer showAdCount) {
        this.showAdCount = showAdCount;
    }

    public BigDecimal getResidueGoldNum() {
        return residueGoldNum;
    }

    public void setResidueGoldNum(BigDecimal residueGoldNum) {
        this.residueGoldNum = residueGoldNum;
    }


    public Integer getMinShowAd() {
        return minShowAd;
    }

    public void setMinShowAd(Integer minShowAd) {
        this.minShowAd = minShowAd;
    }

    public Integer getMaxShowAd() {
        return maxShowAd;
    }

    public void setMaxShowAd(Integer maxShowAd) {
        this.maxShowAd = maxShowAd;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ShowAdDetail{");
        sb.append("ifShowAd=").append(ifShowAd);
        sb.append(", showAdCount=").append(showAdCount);
        sb.append(", residueGoldNum=").append(residueGoldNum);
        sb.append(", minShowAd=").append(minShowAd);
        sb.append(", maxShowAd=").append(maxShowAd);
        sb.append('}');
        return sb.toString();
    }
}
