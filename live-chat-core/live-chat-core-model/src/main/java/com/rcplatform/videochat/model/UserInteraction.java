package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_interaction")
@ApiModel
public class UserInteraction implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 消费品id
     */
    @Column(name = "cousumeId")
    @ApiModelProperty(value="消费品id")
    private Integer cousumeid;

    /**
     * 累计的数量 
     */
    @ApiModelProperty(value="累计的数量 ")
    private Integer number;

    /**
     * 用户id ,关联用户表主键
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id ,关联用户表主键")
    private Integer userId;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取消费品id
     *
     * @return cousumeId - 消费品id
     */
    public Integer getCousumeid() {
        return cousumeid;
    }

    /**
     * 设置消费品id
     *
     * @param cousumeid 消费品id
     */
    public void setCousumeid(Integer cousumeid) {
        this.cousumeid = cousumeid;
    }

    /**
     * 获取累计的数量 
     *
     * @return number - 累计的数量 
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置累计的数量 
     *
     * @param number 累计的数量 
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取用户id ,关联用户表主键
     *
     * @return user_id - 用户id ,关联用户表主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id ,关联用户表主键
     *
     * @param userId 用户id ,关联用户表主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cousumeid=").append(cousumeid);
        sb.append(", number=").append(number);
        sb.append(", userId=").append(userId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}