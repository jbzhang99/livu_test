package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_forbidden_setting")
@ApiModel
public class ForbiddenSetting implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 每次封号时长(分钟)
     */
    @ApiModelProperty(value="每次封号时长(分钟)")
    private Integer time;

    /**
     * 累计封号次数
     */
    @Column(name = "forbidden_count")
    @ApiModelProperty(value="累计封号次数")
    private Integer forbiddenCount;

    /**
     * 用户类型 0 普通用户 1 vip
     */
    @Column(name = "user_type")
    @ApiModelProperty(value="用户类型 0 普通用户 1 vip")
    private Integer userType;

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
     * 获取每次封号时长(分钟)
     *
     * @return time - 每次封号时长(分钟)
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 设置每次封号时长(分钟)
     *
     * @param time 每次封号时长(分钟)
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * 获取累计封号次数
     *
     * @return forbidden_count - 累计封号次数
     */
    public Integer getForbiddenCount() {
        return forbiddenCount;
    }

    /**
     * 设置累计封号次数
     *
     * @param forbiddenCount 累计封号次数
     */
    public void setForbiddenCount(Integer forbiddenCount) {
        this.forbiddenCount = forbiddenCount;
    }

    /**
     * 获取用户类型 0 普通用户 1 vip
     *
     * @return user_type - 用户类型 0 普通用户 1 vip
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置用户类型 0 普通用户 1 vip
     *
     * @param userType 用户类型 0 普通用户 1 vip
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
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
        sb.append(", id=").append(id);
        sb.append(", time=").append(time);
        sb.append(", forbiddenCount=").append(forbiddenCount);
        sb.append(", userType=").append(userType);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}