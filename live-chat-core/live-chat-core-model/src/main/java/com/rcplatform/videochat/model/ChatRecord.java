package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_chat_record")
@ApiModel
public class ChatRecord implements Serializable {
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
     * 另一方的性别
     */
    @Column(name = "friend_gender")
    @ApiModelProperty(value="另一方的性别")
    private Integer friendGender;

    /**
     * 通过哪个页面进入聊天 1.匹配历史纪录 2 好友列表
     */
    @Column(name = "chat_page")
    @ApiModelProperty(value="通过哪个页面进入聊天 1.匹配历史纪录 2 好友列表")
    private Integer chatPage;

    /**
     * 用户的 视频聊天时长
     */
    @Column(name = "friend_id")
    @ApiModelProperty(value="用户的 视频聊天时长")
    private Integer friendId;

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
     * 获取另一方的性别
     *
     * @return friend_gender - 另一方的性别
     */
    public Integer getFriendGender() {
        return friendGender;
    }

    /**
     * 设置另一方的性别
     *
     * @param friendGender 另一方的性别
     */
    public void setFriendGender(Integer friendGender) {
        this.friendGender = friendGender;
    }

    /**
     * 获取通过哪个页面进入聊天 1.匹配历史纪录 2 好友列表
     *
     * @return chat_page - 通过哪个页面进入聊天 1.匹配历史纪录 2 好友列表
     */
    public Integer getChatPage() {
        return chatPage;
    }

    /**
     * 设置通过哪个页面进入聊天 1.匹配历史纪录 2 好友列表
     *
     * @param chatPage 通过哪个页面进入聊天 1.匹配历史纪录 2 好友列表
     */
    public void setChatPage(Integer chatPage) {
        this.chatPage = chatPage;
    }

    /**
     * 获取用户的 视频聊天时长
     *
     * @return friend_id - 用户的 视频聊天时长
     */
    public Integer getFriendId() {
        return friendId;
    }

    /**
     * 设置用户的 视频聊天时长
     *
     * @param friendId 用户的 视频聊天时长
     */
    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
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
        sb.append(", friendGender=").append(friendGender);
        sb.append(", chatPage=").append(chatPage);
        sb.append(", friendId=").append(friendId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}