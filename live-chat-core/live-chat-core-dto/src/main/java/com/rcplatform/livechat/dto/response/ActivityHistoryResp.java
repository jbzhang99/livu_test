package com.rcplatform.livechat.dto.response;

import com.rcplatform.videochat.model.ActivityHistory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * Created by yaoyuan on 2017/8/23.
 */
@ApiModel
public class ActivityHistoryResp {

    public ActivityHistoryResp() {
    }

    @ApiModelProperty(value = "活动id")
    private Integer activityId;

    @ApiModelProperty(value = "活动开始时间")
    private Date beginTime;

    @ApiModelProperty(value = "活动结束时间")
    private Date endTime;

    @ApiModelProperty(value = "获奖列表")
    private List<ActivityHistory> activityHistories;


    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<ActivityHistory> getActivityHistories() {
        return activityHistories;
    }

    public void setActivityHistories(List<ActivityHistory> activityHistories) {
        this.activityHistories = activityHistories;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ActivityHistoryResp{");
        sb.append("activityId=").append(activityId);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", activityHistories=").append(activityHistories);
        sb.append('}');
        return sb.toString();
    }
}
