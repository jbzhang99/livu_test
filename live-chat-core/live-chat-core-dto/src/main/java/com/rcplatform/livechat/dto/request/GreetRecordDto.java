package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Yang Peng on 2017/5/16.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@ApiModel
public class GreetRecordDto implements Serializable{

    public GreetRecordDto() {
    }

    public GreetRecordDto(Integer count, List<String> userIds) {
        this.count = count;
        this.userIds = userIds;
    }

    @ApiModelProperty(value = "当日剩余")
    private Integer count;

    @ApiModelProperty(value = "打过招呼的id列表")
    private List<String> userIds;


    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }
}
