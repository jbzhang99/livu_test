package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_tupu_secret_id")
@ApiModel
public class TupuSecretId implements Serializable {

    public TupuSecretId() {
    }

    public TupuSecretId(String name, Integer appId, String secretId, Integer gender, Integer function, Integer type) {
        this.name = name;
        this.appId = appId;
        this.secretId = secretId;
        this.gender = gender;
        this.function = function;
        this.type = type;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * secretId名称
     */
    @ApiModelProperty(value="secretId名称")
    private String name;

    /**
     * appId
     */
    @Column(name = "app_id")
    @ApiModelProperty(value="appId")
    private Integer appId;

    /**
     * secretId
     */
    @Column(name = "secret_id")
    @ApiModelProperty(value="secretId")
    private String secretId;

    /**
     * 用户性别
     */
    @ApiModelProperty(value="用户性别")
    private Integer gender;

    /**
     * 用途 0 视频中，1 头像
     */
    @ApiModelProperty(value="用途 0 视频中，1 头像")
    private Integer function;

    /**
     * 类型，0 人物细分与色情 1 人物细分，2 色情
     */
    @ApiModelProperty(value="类型，0 人物细分与色情 1 人物细分，2 色情")
    private Integer type;

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
     * 获取secretId名称
     *
     * @return name - secretId名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置secretId名称
     *
     * @param name secretId名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取appId
     *
     * @return app_id - appId
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * 设置appId
     *
     * @param appId appId
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取secretId
     *
     * @return secret_id - secretId
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * 设置secretId
     *
     * @param secretId secretId
     */
    public void setSecretId(String secretId) {
        this.secretId = secretId;
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
     * 获取用途 0 视频中，1 头像
     *
     * @return function - 用途 0 视频中，1 头像
     */
    public Integer getFunction() {
        return function;
    }

    /**
     * 设置用途 0 视频中，1 头像
     *
     * @param function 用途 0 视频中，1 头像
     */
    public void setFunction(Integer function) {
        this.function = function;
    }

    /**
     * 获取类型，0 人物细分与色情 1 人物细分，2 色情
     *
     * @return type - 类型，0 人物细分与色情 1 人物细分，2 色情
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型，0 人物细分与色情 1 人物细分，2 色情
     *
     * @param type 类型，0 人物细分与色情 1 人物细分，2 色情
     */
    public void setType(Integer type) {
        this.type = type;
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
        sb.append(", name=").append(name);
        sb.append(", appId=").append(appId);
        sb.append(", secretId=").append(secretId);
        sb.append(", gender=").append(gender);
        sb.append(", function=").append(function);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}