package com.rcplatform.videochat.model;

import com.rcplatform.livechat.enums.SwitchEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_match_role_setting")
@ApiModel
public class MatchRoleSetting implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 版本号
     */
    @ApiModelProperty(value = "版本号")
    private Integer version;

    /**
     * 角色类型
     */
    @ApiModelProperty(value = "角色类型")
    private Integer role;

    /**
     * 概率 数字 1-100
     */
    @ApiModelProperty(value = "概率 数字 1-100")
    private Integer probability;


    /**
     * 初始分值数
     */
    @Column(name = "init_score")
    @ApiModelProperty(value = "初始分支数")
    private Integer initScore;


    @Column(name = "role_switch")
    @ApiModelProperty(value = "角色开关")
    private SwitchEnum roleSwitch;


    @Column(name = "app_id")
    @ApiModelProperty(value = "应用id")
    private Integer appId;


    @ApiModelProperty(value = "用户性别")
    private Integer gender;
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

    /**
     * 获取角色类型
     *
     * @return role - 角色类型
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 设置角色类型
     *
     * @param role 角色类型
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * 获取概率 数字 1-100
     *
     * @return probability - 概率 数字 1-100
     */
    public Integer getProbability() {
        return probability;
    }

    /**
     * 设置概率 数字 1-100
     *
     * @param probability 概率 数字 1-100
     */
    public void setProbability(Integer probability) {
        this.probability = probability;
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


    public SwitchEnum getRoleSwitch() {
        return roleSwitch;
    }

    public void setRoleSwitch(SwitchEnum roleSwitch) {
        this.roleSwitch = roleSwitch;
    }

    public Integer getInitScore() {
        return initScore;
    }

    public void setInitScore(Integer initScore) {
        this.initScore = initScore;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MatchRoleSetting{");
        sb.append("id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", role=").append(role);
        sb.append(", probability=").append(probability);
        sb.append(", initScore=").append(initScore);
        sb.append(", roleSwitch=").append(roleSwitch);
        sb.append(", appId=").append(appId);
        sb.append(", gender=").append(gender);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}