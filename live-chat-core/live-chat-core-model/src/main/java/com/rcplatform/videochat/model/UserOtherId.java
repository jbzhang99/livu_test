package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_other_id")
@ApiModel
public class UserOtherId implements Serializable {


    public UserOtherId() {
    }

    public UserOtherId(Integer userId, String secondId, Date createTime) {
        this.userId = userId;
        this.secondId = secondId;
        this.createTime = createTime;
    }

    /**
     * 主键
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="主键")
    private Integer userId;

    /**
     * 用户第二id
     */
    @Column(name = "second_id")
    @ApiModelProperty(value="用户第二id")
    private String secondId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return user_id - 主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置主键
     *
     * @param userId 主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户第二id
     *
     * @return second_id - 用户第二id
     */
    public String getSecondId() {
        return secondId;
    }

    /**
     * 设置用户第二id
     *
     * @param secondId 用户第二id
     */
    public void setSecondId(String secondId) {
        this.secondId = secondId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", secondId=").append(secondId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}