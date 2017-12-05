package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_default_user_icon")
@ApiModel
public class DefaultUserIcon implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 用户性别
     */
    @ApiModelProperty(value="用户性别")
    private Integer gender;

    /**
     * 语言名称
     */
    @ApiModelProperty(value="语言名称")
    private String url;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;


    @ApiModelProperty(value = "应用id")
    @Column(name = "app_id")
    private Integer appId;


    @Column(name = "type")
    private Integer type;

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
     * 获取语言名称
     *
     * @return url - 语言名称
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置语言名称
     *
     * @param url 语言名称
     */
    public void setUrl(String url) {
        this.url = url;
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


    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DefaultUserIcon{");
        sb.append("id=").append(id);
        sb.append(", gender=").append(gender);
        sb.append(", url='").append(url).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", appId=").append(appId);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}