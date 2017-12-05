package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_user_eroticism_record")
@ApiModel
public class UserEroticismRecord implements Serializable {


    public UserEroticismRecord() {
    }

    public UserEroticismRecord(Integer userId, Integer source) {
        this.userId = userId;
        this.source = source;
    }

    /**

     * id
     */
    @Id
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * the user id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="the user id")
    private Integer userId;

    /**
     * the source 0 all 1 video page 2 person home page 3 match 4 message 5 video upload image 6 head img
     */
    @ApiModelProperty(value="the source 0 all 1 video page 2 person home page 3 match 4 message 5 video upload image 6 head img")
    private Integer source;

    /**
     * create time
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="create time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取the user id
     *
     * @return user_id - the user id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置the user id
     *
     * @param userId the user id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取the source 0 all 1 video page 2 person home page 3 match 4 message 5 video upload image 6 head img
     *
     * @return source - the source 0 all 1 video page 2 person home page 3 match 4 message 5 video upload image 6 head img
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 设置the source 0 all 1 video page 2 person home page 3 match 4 message 5 video upload image 6 head img
     *
     * @param source the source 0 all 1 video page 2 person home page 3 match 4 message 5 video upload image 6 head img
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 获取create time
     *
     * @return create_time - create time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置create time
     *
     * @param createTime create time
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
        sb.append(", source=").append(source);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}