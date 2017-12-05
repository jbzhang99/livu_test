package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_birthday_change_record")
@ApiModel
public class BirthDayChangeRecord implements Serializable {

    public BirthDayChangeRecord() {
    }


    public BirthDayChangeRecord(Integer userId) {
        this.userId = userId;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 标签名称
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="标签名称")
    private Integer userId;

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
     * 获取标签名称
     *
     * @return user_id - 标签名称
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置标签名称
     *
     * @param userId 标签名称
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}