package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2017/3/23.
 */
@ApiModel
public class IfShowAdReqDto {

    public IfShowAdReqDto() {
    }

    public IfShowAdReqDto(Integer platformType) {
        this.platformType = platformType;
    }


    /**
     * 客户端的平台 1 ios 2 android
     */
    @ApiModelProperty(value = "客户端的平台 1 ios 2 android")
    private Integer platformType;


    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }
}
