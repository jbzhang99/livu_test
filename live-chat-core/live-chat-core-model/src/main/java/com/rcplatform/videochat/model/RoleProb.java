package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_role_prob")
@ApiModel
public class RoleProb implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "应用id")
    @Column(name = "app_id")
    private Integer appId;

    /**
     * 角色类型
     */
    @Column(name = "role_type")
    @ApiModelProperty(value = "角色类型")
    private Integer roleType;

    /**
     * 匹配的角色类型
     */
    @Column(name = "match_role_type")
    @ApiModelProperty(value = "匹配的角色类型")
    private Integer matchRoleType;

    /**
     * 概率
     */
    @ApiModelProperty(value = "概率")
    private Integer prob;

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


    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取角色类型
     *
     * @return role_type - 角色类型
     */
    public Integer getRoleType() {
        return roleType;
    }

    /**
     * 设置角色类型
     *
     * @param roleType 角色类型
     */
    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    /**
     * 获取匹配的角色类型
     *
     * @return match_role_type - 匹配的角色类型
     */
    public Integer getMatchRoleType() {
        return matchRoleType;
    }

    /**
     * 设置匹配的角色类型
     *
     * @param matchRoleType 匹配的角色类型
     */
    public void setMatchRoleType(Integer matchRoleType) {
        this.matchRoleType = matchRoleType;
    }

    /**
     * 获取概率
     *
     * @return prob - 概率
     */
    public Integer getProb() {
        return prob;
    }

    /**
     * 设置概率
     *
     * @param prob 概率
     */
    public void setProb(Integer prob) {
        this.prob = prob;
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
        final StringBuilder sb = new StringBuilder("RoleProb{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", roleType=").append(roleType);
        sb.append(", matchRoleType=").append(matchRoleType);
        sb.append(", prob=").append(prob);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}