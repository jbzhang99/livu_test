package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_interaction_record")
@ApiModel
public class InteractionRecord implements Serializable {
    /**
     * 用户主键
     */
    @Id
    @ApiModelProperty(value="用户主键")
    private Integer id;

    /**
     * 用户的id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户的id")
    private Integer userId;

    /**
     * 用户的性别 1 男性 2 女性
     */
    @ApiModelProperty(value="用户的性别 1 男性 2 女性")
    private Integer gender;

    /**
     * 用户的互动类型 1 点赞 2 送花 3 巴掌
     */
    @ApiModelProperty(value="用户的互动类型 1 点赞 2 送花 3 巴掌")
    private Integer type;

    /**
     * 用户操作的时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="用户操作的时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户主键
     *
     * @return id - 用户主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户主键
     *
     * @param id 用户主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户的id
     *
     * @return user_id - 用户的id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户的id
     *
     * @param userId 用户的id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户的性别 1 男性 2 女性
     *
     * @return gender - 用户的性别 1 男性 2 女性
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置用户的性别 1 男性 2 女性
     *
     * @param gender 用户的性别 1 男性 2 女性
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取用户的互动类型 1 点赞 2 送花 3 巴掌
     *
     * @return type - 用户的互动类型 1 点赞 2 送花 3 巴掌
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置用户的互动类型 1 点赞 2 送花 3 巴掌
     *
     * @param type 用户的互动类型 1 点赞 2 送花 3 巴掌
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取用户操作的时间
     *
     * @return create_time - 用户操作的时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置用户操作的时间
     *
     * @param createTime 用户操作的时间
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
        sb.append(", gender=").append(gender);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}