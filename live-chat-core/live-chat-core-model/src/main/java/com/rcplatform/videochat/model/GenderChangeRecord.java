package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_gender_change_record")
@ApiModel
public class GenderChangeRecord implements Serializable {

    public GenderChangeRecord(Integer userId, Integer beforeGender, Integer afterGender, Date createTime,Integer changeMode) {
        this.userId = userId;
        this.beforeGender = beforeGender;
        this.afterGender = afterGender;
        this.createTime = createTime;
        this.chargeMode = changeMode;
    }

    public GenderChangeRecord(Integer userId, Integer beforeGender, Integer afterGender, Date createTime) {
        this.userId = userId;
        this.beforeGender = beforeGender;
        this.afterGender = afterGender;
        this.createTime = createTime;
    }


    public GenderChangeRecord(Integer userId) {
        this.userId = userId;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value = "用户id")
    private Integer userId;

    /**
     * 更改前性别
     */
    @Column(name = "before_gender")
    @ApiModelProperty(value = "更改前性别")
    private Integer beforeGender;

    /**
     * 更改后性别
     */
    @Column(name = "after_gender")
    @ApiModelProperty(value = "更改后性别")
    private Integer afterGender;


    @ApiModelProperty(value = "性别改变方式 1 手动 0 自动")
    @Column(name = "charge_mode")
    private Integer chargeMode;
    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
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
     * 获取更改前性别
     *
     * @return before_gender - 更改前性别
     */
    public Integer getBeforeGender() {
        return beforeGender;
    }

    /**
     * 设置更改前性别
     *
     * @param beforeGender 更改前性别
     */
    public void setBeforeGender(Integer beforeGender) {
        this.beforeGender = beforeGender;
    }

    /**
     * 获取更改后性别
     *
     * @return after_gender - 更改后性别
     */
    public Integer getAfterGender() {
        return afterGender;
    }

    /**
     * 设置更改后性别
     *
     * @param afterGender 更改后性别
     */
    public void setAfterGender(Integer afterGender) {
        this.afterGender = afterGender;
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


    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GenderChangeRecord{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", beforeGender=").append(beforeGender);
        sb.append(", afterGender=").append(afterGender);
        sb.append(", chargeMode=").append(chargeMode);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}