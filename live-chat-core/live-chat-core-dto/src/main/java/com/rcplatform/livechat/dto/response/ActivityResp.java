package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yaoyuan on 2017/8/22.
 */
@ApiModel
public class ActivityResp implements Serializable {

    public ActivityResp() {
    }

    @ApiModelProperty(value = "用户的排行榜信息")
    private ActivityUserDto user;

    @ApiModelProperty(value = "获得笑脸的排行榜")
    private List<ActivityUserDto> topList;

    public ActivityUserDto getUser() {
        return user;
    }

    public void setUser(ActivityUserDto user) {
        this.user = user;
    }

    public List<ActivityUserDto> getTopList() {
        return topList;
    }

    public void setTopList(List<ActivityUserDto> topList) {
        this.topList = topList;
    }
}
