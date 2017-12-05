package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Yang Peng on 2017/5/8.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@ApiModel
public class SealingInfoDto implements Serializable {

    public SealingInfoDto() {
    }

    public SealingInfoDto(Date sealingTime, Integer sealingReason) {
        this.sealingTime = sealingTime;
        this.sealingReason = sealingReason;
    }

    @ApiModelProperty(value = "封号截至时间")
    private Date sealingTime;


    @ApiModelProperty(value = "封号原因")
    private Integer sealingReason;


    public Date getSealingTime() {
        return sealingTime;
    }

    public void setSealingTime(Date sealingTime) {
        this.sealingTime = sealingTime;
    }

    public Integer getSealingReason() {
        return sealingReason;
    }

    public void setSealingReason(Integer sealingReason) {
        this.sealingReason = sealingReason;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SealingInfo{");
        sb.append("sealingTime=").append(sealingTime);
        sb.append(", sealingReason=").append(sealingReason);
        sb.append('}');
        return sb.toString();
    }
}
