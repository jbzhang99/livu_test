package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Yang Peng on 2017/6/22.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@ApiModel
public class GroupUserDto implements Serializable {


    public GroupUserDto() {
    }


    public GroupUserDto(String id, String appId) {
        this.id = id;
        this.appId = appId;
    }

    @ApiModelProperty(value = "用户第三方id")
    private String id;


    @ApiModelProperty(value = "facebook的appId")
    private String appId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupUserDto{");
        sb.append("id='").append(id).append('\'');
        sb.append(", appId='").append(appId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
