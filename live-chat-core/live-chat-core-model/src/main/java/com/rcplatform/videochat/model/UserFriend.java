package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_friend")
@ApiModel
public class UserFriend implements Serializable {

    public UserFriend() {
    }

    public UserFriend(Integer userId, Integer userFriendId) {
        this.userId = userId;
        this.userFriendId = userFriendId;
    }

    public UserFriend(Integer userId, Integer userFriendId, Integer friendType) {
        this.userId = userId;
        this.userFriendId = userFriendId;
        this.friendType = friendType;
    }

    public UserFriend(Integer id, Integer status, Date updateTime) {
        this.id = id;
        this.status = status;
        this.updateTime = updateTime;
    }


    public UserFriend(Integer userId, Integer userFriendId, Integer friendType, Integer status, Date createTime, Date updateTime) {
        this.userId = userId;
        this.userFriendId = userFriendId;
        this.friendType = friendType;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户的id，关联用户表
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户的id，关联用户表")
    private Integer userId;

    /**
     * 用户朋友的id
     */
    @Column(name = "user_friend_id")
    @ApiModelProperty(value="用户朋友的id")
    private Integer userFriendId;

    /**
     * 朋友状态 1 正常 2.黑名单
     */
    @ApiModelProperty(value="朋友状态 1 正常 2.黑名单")
    private Integer status;

    /**
     * 朋友关系的类型，1.单向好友，2 双向好友 3.对方和我是好友
     */
    @Column(name = "friend_type")
    @ApiModelProperty(value="朋友关系的类型，1.单向好友，2 双向好友 3.对方和我是好友")
    private Integer friendType;

    /**
     * 关系创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="关系创建时间")
    private Date createTime;

    /**
     * 记录更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value="记录更新时间")
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
     * 获取用户的id，关联用户表
     *
     * @return user_id - 用户的id，关联用户表
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户的id，关联用户表
     *
     * @param userId 用户的id，关联用户表
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户朋友的id
     *
     * @return user_friend_id - 用户朋友的id
     */
    public Integer getUserFriendId() {
        return userFriendId;
    }

    /**
     * 设置用户朋友的id
     *
     * @param userFriendId 用户朋友的id
     */
    public void setUserFriendId(Integer userFriendId) {
        this.userFriendId = userFriendId;
    }

    /**
     * 获取朋友状态 1 正常 2.黑名单
     *
     * @return status - 朋友状态 1 正常 2.黑名单
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置朋友状态 1 正常 2.黑名单
     *
     * @param status 朋友状态 1 正常 2.黑名单
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取朋友关系的类型，1.单向好友，2 双向好友 3.对方和我是好友
     *
     * @return friend_type - 朋友关系的类型，1.单向好友，2 双向好友 3.对方和我是好友
     */
    public Integer getFriendType() {
        return friendType;
    }

    /**
     * 设置朋友关系的类型，1.单向好友，2 双向好友 3.对方和我是好友
     *
     * @param friendType 朋友关系的类型，1.单向好友，2 双向好友 3.对方和我是好友
     */
    public void setFriendType(Integer friendType) {
        this.friendType = friendType;
    }

    /**
     * 获取关系创建时间
     *
     * @return create_time - 关系创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置关系创建时间
     *
     * @param createTime 关系创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取记录更新时间
     *
     * @return update_time - 记录更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置记录更新时间
     *
     * @param updateTime 记录更新时间
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
        sb.append(", userId=").append(userId);
        sb.append(", userFriendId=").append(userFriendId);
        sb.append(", status=").append(status);
        sb.append(", friendType=").append(friendType);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


    public static final class Builder {

        private Integer id;
        private Integer userId;
        private Integer userFriendId;
        private Integer status;
        private Integer friendType;
        private Date createTime;
        private Date updateTime;

        public Builder() {
        }



        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public Builder userFriendId(Integer userFriendId) {
            this.userFriendId = userFriendId;
            return this;
        }

        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public Builder friendType(Integer friendType) {
            this.friendType = friendType;
            return this;
        }

        public Builder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder updateTime(Date updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public UserFriend build() {
            UserFriend userFriend = new UserFriend();
            userFriend.setId(id);
            userFriend.setUserId(userId);
            userFriend.setUserFriendId(userFriendId);
            userFriend.setStatus(status);
            userFriend.setFriendType(friendType);
            userFriend.setCreateTime(createTime);
            userFriend.setUpdateTime(updateTime);
            return userFriend;
        }
    }
}