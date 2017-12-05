package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by 药耀源 on 2017/5/11.
 */

@Table(name = "rc_img_check_result")
@ApiModel
public class ImgCheckResult {

    public ImgCheckResult() {
    }

    public ImgCheckResult(Integer userId) {
        this.userId = userId;
    }



    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 用户头像审核结果,0 合格无法区分男女, 1 男性, 2 女性, 3 未知是否合格, 4 不合格
     */
    @Column(name = "user_id")
    @ApiModelProperty(value = "用户id")
    private Integer userId;


    /**
     * 记录创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "记录创建时间")
    private Date createTime;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ImgCheckResult{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
