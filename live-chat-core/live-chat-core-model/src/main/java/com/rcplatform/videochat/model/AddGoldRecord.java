package com.rcplatform.videochat.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by 药耀源 on 2017/3/23.
 */
@ApiModel
@Table(name = "rc_add_gold_record")
public class AddGoldRecord implements Serializable{

    public AddGoldRecord() {
    }

    public AddGoldRecord(Integer id, Integer userId, BigDecimal addNum, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.addNum = addNum;
        this.createTime = createTime;
    }

    public AddGoldRecord(Integer userId, BigDecimal addNum, Date createTime, Integer appId) {
        this.userId = userId;
        this.addNum = addNum;
        this.createTime = createTime;
        this.appId = appId;
    }

    public AddGoldRecord(Integer userId, BigDecimal addNum, Date createTime, Integer appId, Integer type) {
        this.appId = appId;
        this.userId = userId;
        this.addNum = addNum;
        this.createTime = createTime;
        this.type = type;
    }

    public AddGoldRecord(Integer userId) {
        this.userId = userId;
    }

    @ApiModelProperty(value = "添加金币记录id")
    @Column(name = "id")
    private Integer id;

    @Column(name = "app_id")
    private Integer appId;

    @ApiModelProperty(value = "被添加金币的用户id")
    @Column(name = "userId")
    private Integer userId;

    @ApiModelProperty(value = "添加金币的数量")
    @Column(name = "add_num")
    private BigDecimal addNum;

    @ApiModelProperty(value = "添加金币的时间，精确到秒")
    @Column(name = "create_time")
    private Date createTime;

    @ApiModelProperty(value = "0 看广告加金币, 1 邀请好友添加金币 , 2 被邀请注册添加金币")
    @Column(name = "type")
    private Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getAddNum() {
        return addNum;
    }

    public void setAddNum(BigDecimal addNum) {
        this.addNum = addNum;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AddGoldRecord{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", userId=").append(userId);
        sb.append(", addNum=").append(addNum);
        sb.append(", createTime=").append(createTime);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
