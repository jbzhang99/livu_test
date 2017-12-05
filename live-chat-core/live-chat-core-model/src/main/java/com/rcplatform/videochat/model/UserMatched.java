package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_matched")
@ApiModel
public class UserMatched implements Serializable {


    public UserMatched() {
    }

    public UserMatched(Integer userId, Integer matchedUserId) {
        this.userId = userId;
        this.matchedUserId = matchedUserId;
    }


    public UserMatched(Integer userId, Integer matchedUserId, Integer status, Integer relation, Date createTime) {
        this.userId = userId;
        this.matchedUserId = matchedUserId;
        this.status = status;
        this.relation = relation;
        this.createTime = createTime;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id，关联用户表id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id，关联用户表id")
    private Integer userId;

    /**
     * 匹配后的用户id
     */
    @Column(name = "matched_user_id")
    @ApiModelProperty(value="匹配后的用户id")
    private Integer matchedUserId;

    /**
     * 记录的状态 1 正常  2 已删除
     */
    @ApiModelProperty(value="记录的状态 1 正常  2 已删除")
    private Integer status;

    /**
     * 关系状态 1 我和对方是好友 2 双向好友，3 对方和我是好友 4.不是好友关系
     */
    @ApiModelProperty(value="关系状态 1 我和对方是好友 2 双向好友，3 对方和我是好友 4.不是好友关系")
    private Integer relation;

    /**
     * 记录创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="记录创建时间")
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
     * 获取用户id，关联用户表id
     *
     * @return user_id - 用户id，关联用户表id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id，关联用户表id
     *
     * @param userId 用户id，关联用户表id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取匹配后的用户id
     *
     * @return matched_user_id - 匹配后的用户id
     */
    public Integer getMatchedUserId() {
        return matchedUserId;
    }

    /**
     * 设置匹配后的用户id
     *
     * @param matchedUserId 匹配后的用户id
     */
    public void setMatchedUserId(Integer matchedUserId) {
        this.matchedUserId = matchedUserId;
    }

    /**
     * 获取记录的状态 1 正常  2 已删除
     *
     * @return status - 记录的状态 1 正常  2 已删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置记录的状态 1 正常  2 已删除
     *
     * @param status 记录的状态 1 正常  2 已删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取关系状态 1 我和对方是好友 2 双向好友，3 对方和我是好友 4.不是好友关系
     *
     * @return relation - 关系状态 1 我和对方是好友 2 双向好友，3 对方和我是好友 4.不是好友关系
     */
    public Integer getRelation() {
        return relation;
    }

    /**
     * 设置关系状态 1 我和对方是好友 2 双向好友，3 对方和我是好友 4.不是好友关系
     *
     * @param relation 关系状态 1 我和对方是好友 2 双向好友，3 对方和我是好友 4.不是好友关系
     */
    public void setRelation(Integer relation) {
        this.relation = relation;
    }

    /**
     * 获取记录创建时间
     *
     * @return create_time - 记录创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置记录创建时间
     *
     * @param createTime 记录创建时间
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
        sb.append(", matchedUserId=").append(matchedUserId);
        sb.append(", status=").append(status);
        sb.append(", relation=").append(relation);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}