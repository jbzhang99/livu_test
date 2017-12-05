package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaoyuan on 2017/7/18.
 */
@Table(name = "rc_official_helper_message")
public class OfficialHelperMessage implements Serializable{

    public OfficialHelperMessage() {
    }

    @Id
    @ApiModelProperty(value="id,此字段返回")
    private Integer id;

    @Column(name = "country_id")
    @ApiModelProperty(value = "国家id,此字段返回")
    private Integer countryId;

    @Column(name = "content")
    @ApiModelProperty(value = "消息内容,此字段返回")
    private String content;


    @Column(name = "push_time")
    @ApiModelProperty(value = "push 时间,此字段不返回")
    private Date pushTime;

    @Column(name = "send_status")
    @ApiModelProperty(value = "发送状态 0 未发送 1 发送,此字段不返回")
    private Integer sendStatus;

    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间,次字段不返回")
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OfficialHelperMessage{");
        sb.append("id=").append(id);
        sb.append(", countryId=").append(countryId);
        sb.append(", content='").append(content).append('\'');
        sb.append(", pushTime=").append(pushTime);
        sb.append(", sendStatus=").append(sendStatus);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
