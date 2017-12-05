package com.rcplatform.livechat.dto.request.admin;

/**
 * Created by admin on 2016/12/2.
 */
public class ReportPutDto {

    private Integer userId;


    private Integer type;

    private Integer rtype;

    public ReportPutDto() {
    }

    public ReportPutDto(Integer userId, Integer type) {
        this.userId = userId;
        this.type = type;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRtype() {
        return rtype;
    }

    public void setRtype(Integer rtype) {
        this.rtype = rtype;
    }
}
