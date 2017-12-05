package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by 药耀源 on 2017/3/23.
 */
@ApiModel
public class IfShowAd {


    public IfShowAd() {
    }

    public IfShowAd(Boolean showAd) {
        this.showAd = showAd;
    }

    //
    /**
     * 是否显示广告
     */
    @ApiModelProperty(value = "是否显示广告")
    private Boolean showAd;

    public Boolean getShowAd() {
        return showAd;
    }

    public void setShowAd(Boolean showAd) {
        this.showAd = showAd;
    }
}
