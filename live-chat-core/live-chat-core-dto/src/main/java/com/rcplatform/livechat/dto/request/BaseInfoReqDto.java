package com.rcplatform.livechat.dto.request;


import com.rcplatform.livechat.enums.BaseInfoTypeEnum;

import javax.validation.constraints.NotNull;

/**
 * Created by yang peng on 2016/8/16.
 */

public class BaseInfoReqDto {

    public BaseInfoReqDto() {
    }

    public BaseInfoReqDto(Integer appId, BaseInfoTypeEnum type) {
        this.appId = appId;
        this.type = type;
    }

    /**
     * 应用id不能为空
     */
    @NotNull(message = "{appId}")
    private Integer appId;

    /**
     * 信息类型不能为空
     */

    @NotNull(message = "{type}")
    private BaseInfoTypeEnum type;


    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public BaseInfoTypeEnum getType() {
        return type;
    }

    public void setType(BaseInfoTypeEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseInfoReqDto{");
        sb.append("appId=").append(appId);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
