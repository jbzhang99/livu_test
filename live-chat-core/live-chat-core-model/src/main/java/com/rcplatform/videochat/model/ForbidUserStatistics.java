package com.rcplatform.videochat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaoyuan on 2017/8/8.
 */
@Table(name = "rc_forbid_user_statistics")
public class ForbidUserStatistics implements Serializable {

    public ForbidUserStatistics() {
    }

    @Id
    private Integer id;

    @Column(name = "app_id")
    private Integer appId;

    @Column(name = "violations")
    private Integer violations;

    @Column(name = "violations_free")
    private Integer violationsFree;

    @Column(name = "violations_pay")
    private Integer violationsPay;

    @Column(name = "violations_femal")
    private Integer violationsFemal;

    @Column(name = "violence_language_forbid_count")
    private Integer violenceLangulageForbidCount;

    @Column(name = "gender_change_count")
    private Integer genderChangeCount;

    @Column(name = "create_time")
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getViolations() {
        return violations;
    }

    public void setViolations(Integer violations) {
        this.violations = violations;
    }

    public Integer getViolationsFree() {
        return violationsFree;
    }

    public void setViolationsFree(Integer violationsFree) {
        this.violationsFree = violationsFree;
    }

    public Integer getViolationsPay() {
        return violationsPay;
    }

    public void setViolationsPay(Integer violationsPay) {
        this.violationsPay = violationsPay;
    }

    public Integer getViolationsFemal() {
        return violationsFemal;
    }

    public void setViolationsFemal(Integer violationsFemal) {
        this.violationsFemal = violationsFemal;
    }

    public Integer getViolenceLangulageForbidCount() {
        return violenceLangulageForbidCount;
    }

    public void setViolenceLangulageForbidCount(Integer violenceLangulageForbidCount) {
        this.violenceLangulageForbidCount = violenceLangulageForbidCount;
    }

    public Integer getGenderChangeCount() {
        return genderChangeCount;
    }

    public void setGenderChangeCount(Integer genderChangeCount) {
        this.genderChangeCount = genderChangeCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ForbidUserStatistics{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", violations=").append(violations);
        sb.append(", violationsFree=").append(violationsFree);
        sb.append(", violationsPay=").append(violationsPay);
        sb.append(", violationsFemal=").append(violationsFemal);
        sb.append(", violenceLangulageForbidCount=").append(violenceLangulageForbidCount);
        sb.append(", genderChangeCount=").append(genderChangeCount);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
