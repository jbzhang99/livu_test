package com.rcplatform.livechat.dto.response;

import java.io.Serializable;

/**
 * Created by admin on 2017/4/13.
 */
public class ReportRecordCountDto implements Serializable {


    private Integer reportReason;


    private Integer userId;


    private Integer num;

    public Integer getReportReason() {
        return reportReason;
    }

    public void setReportReason(Integer reportReason) {
        this.reportReason = reportReason;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReportRecordCountDto{");
        sb.append("userId=").append(userId);
        sb.append(", num=").append(num);
        sb.append('}');
        return sb.toString();
    }
}
