package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_head_img")
@ApiModel
public class UserHeadImg implements Serializable {

    public UserHeadImg() {
    }

    public UserHeadImg(Integer handle) {
        this.handle = handle;
    }


    public UserHeadImg(Integer gender, Integer type, Integer handle) {
        this.gender = gender;
        this.type = type;
        this.handle = handle;
    }


    public UserHeadImg(Integer userId, String userName, Integer gender, Date birthday, String headImg, Integer handle, Integer type) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.birthday = birthday;
        this.headImg = headImg;
        this.handle = handle;
        this.type = type;
    }

    public UserHeadImg( String userName,Date birthday, String headImg, Integer handle, Integer version,Date createTime) {
        this.userName = userName;
        this.birthday = birthday;
        this.headImg = headImg;
        this.handle = handle;
        this.version = version;
        this.createTime = createTime;
    }

    public UserHeadImg(String userName, Integer gender, Date birthday, String headImg,  Integer handle, Integer type) {
        this.userName = userName;
        this.gender = gender;
        this.birthday = birthday;
        this.headImg = headImg;
        this.handle = handle;
        this.type = type;
    }

    public UserHeadImg(Integer id, Date handleTime, Integer handle, Integer checked) {
        this.id = id;
        this.handleTime = handleTime;
        this.handle = handle;
        this.checked = checked;
    }

    public UserHeadImg(Integer userId, Integer type) {
        this.userId = userId;
        this.type = type;
    }

    public UserHeadImg(Integer checked, Integer handle, Date handleTime) {
        this.checked = checked;
        this.handle = handle;
        this.handleTime = handleTime;
    }


    public UserHeadImg(Integer userId, String userName, Integer gender, Date birthday, String headImg,
                       Integer checked, Integer handle, Date handleTime, Date createTime, Integer type, Integer version) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.birthday = birthday;
        this.headImg = headImg;
        this.checked = checked;
        this.handle = handle;
        this.handleTime = handleTime;
        this.createTime = createTime;
        this.type = type;
        this.version = version;
    }

    @Id
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * 用户昵称
     */
    @Column(name = "user_name")
    @ApiModelProperty(value="用户昵称")
    private String userName;

    /**
     * 用户性别
     */
    @ApiModelProperty(value="用户性别")
    private Integer gender;

    /**
     * 用户生日
     */
    @ApiModelProperty(value="用户生日")
    private Date birthday;

    /**
     * 用户的头像
     */
    @Column(name = "head_img")
    @ApiModelProperty(value="用户的头像")
    private String headImg;

    /**
     * 是否通过了审核 1 通过 2 未通过
     */
    @ApiModelProperty(value="是否通过了审核 1 通过 2 未通过")
    private Integer checked;

    /**
     * 是否提示处理过 1.已处理 2，未处理
     */
    @ApiModelProperty(value="是否提示处理过 1.已处理 2，未处理")
    private Integer handle;

    /**
     * 审核处理时间
     */
    @Column(name = "handle_time")
    @ApiModelProperty(value="审核处理时间")
    private Date handleTime;

    /**
     * 审核创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="审核创建时间")
    private Date createTime;

    /**
     * 1,头像 2 背景图片
     */
    @ApiModelProperty(value="1,头像 2 背景图片")
    private Integer type;

    /**
     * 版本号
     */
    @ApiModelProperty(value="版本号")
    private Integer version;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
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
     * 获取用户昵称
     *
     * @return user_name - 用户昵称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户昵称
     *
     * @param userName 用户昵称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户性别
     *
     * @return gender - 用户性别
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置用户性别
     *
     * @param gender 用户性别
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取用户生日
     *
     * @return birthday - 用户生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置用户生日
     *
     * @param birthday 用户生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取用户的头像
     *
     * @return head_img - 用户的头像
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 设置用户的头像
     *
     * @param headImg 用户的头像
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取是否通过了审核 1 通过 2 未通过
     *
     * @return checked - 是否通过了审核 1 通过 2 未通过
     */
    public Integer getChecked() {
        return checked;
    }

    /**
     * 设置是否通过了审核 1 通过 2 未通过
     *
     * @param checked 是否通过了审核 1 通过 2 未通过
     */
    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    /**
     * 获取是否提示处理过 1.已处理 2，未处理
     *
     * @return handle - 是否提示处理过 1.已处理 2，未处理
     */
    public Integer getHandle() {
        return handle;
    }

    /**
     * 设置是否提示处理过 1.已处理 2，未处理
     *
     * @param handle 是否提示处理过 1.已处理 2，未处理
     */
    public void setHandle(Integer handle) {
        this.handle = handle;
    }

    /**
     * 获取审核处理时间
     *
     * @return handle_time - 审核处理时间
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
     * 设置审核处理时间
     *
     * @param handleTime 审核处理时间
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
     * 获取审核创建时间
     *
     * @return create_time - 审核创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置审核创建时间
     *
     * @param createTime 审核创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取1,头像 2 背景图片
     *
     * @return type - 1,头像 2 背景图片
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1,头像 2 背景图片
     *
     * @param type 1,头像 2 背景图片
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", headImg=").append(headImg);
        sb.append(", checked=").append(checked);
        sb.append(", handle=").append(handle);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", type=").append(type);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}