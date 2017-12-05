package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_delete_reason")
@ApiModel
public class DeleteReason implements Serializable {

    public DeleteReason() {
    }

    public DeleteReason(Integer userId, Integer gender, Integer reason, Integer score, String feedback, Date createTime) {
        this.userId = userId;
        this.gender = gender;
        this.reason = reason;
        this.score = score;
        this.feedback = feedback;
        this.createTime = createTime;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * 用户性别，1男性 2女性
     */
    @ApiModelProperty(value="用户性别，1男性 2女性")
    private Integer gender;

    /**
     * 原因 1，2，3，4，5，6
     */
    @ApiModelProperty(value="原因 1，2，3，4，5，6")
    private Integer reason;

    /**
     * 用户的分数
     */
    @ApiModelProperty(value="用户的分数")
    private Integer score;

    /**
     * 文字反馈
     */
    @ApiModelProperty(value="文字反馈")
    private String feedback;

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
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户性别，1男性 2女性
     *
     * @return gender - 用户性别，1男性 2女性
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置用户性别，1男性 2女性
     *
     * @param gender 用户性别，1男性 2女性
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取原因 1，2，3，4，5，6
     *
     * @return reason - 原因 1，2，3，4，5，6
     */
    public Integer getReason() {
        return reason;
    }

    /**
     * 设置原因 1，2，3，4，5，6
     *
     * @param reason 原因 1，2，3，4，5，6
     */
    public void setReason(Integer reason) {
        this.reason = reason;
    }

    /**
     * 获取用户的分数
     *
     * @return score - 用户的分数
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置用户的分数
     *
     * @param score 用户的分数
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取文字反馈
     *
     * @return feedback - 文字反馈
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * 设置文字反馈
     *
     * @param feedback 文字反馈
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
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
        sb.append(", gender=").append(gender);
        sb.append(", reason=").append(reason);
        sb.append(", score=").append(score);
        sb.append(", feedback=").append(feedback);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}