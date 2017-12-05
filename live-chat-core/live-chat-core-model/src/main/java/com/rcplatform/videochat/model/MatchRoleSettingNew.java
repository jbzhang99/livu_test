package com.rcplatform.videochat.model;

import com.rcplatform.livechat.enums.SwitchEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_match_role_setting_new")
@ApiModel
public class MatchRoleSettingNew implements Serializable {
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
     * 初始化分值数
     */
    @Column(name = "init_score")
    @ApiModelProperty(value = "初始化分值数")
    private Integer initScore;

    /**
     * 开关
     */
    @Column(name = "role_switch")
    @ApiModelProperty(value = "开关")
    private SwitchEnum roleSwitch;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 应用id
     */
    @Column(name = "app_id")
    @ApiModelProperty(value = "应用id")
    private Integer appId;

    /**
     * 用户性别 1 男性 2 女性
     */
    @ApiModelProperty(value = "用户性别 1 男性 2 女性")
    private Integer gender;

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
     * 获取初始化分值数
     *
     * @return init_score - 初始化分值数
     */
    public Integer getInitScore() {
        return initScore;
    }

    /**
     * 设置初始化分值数
     *
     * @param initScore 初始化分值数
     */
    public void setInitScore(Integer initScore) {
        this.initScore = initScore;
    }


    public SwitchEnum getRoleSwitch() {
        return roleSwitch;
    }

    public void setRoleSwitch(SwitchEnum roleSwitch) {
        this.roleSwitch = roleSwitch;
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

    /**
     * 获取应用id
     *
     * @return app_id - 应用id
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * 设置应用id
     *
     * @param appId 应用id
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取用户性别 1 男性 2 女性
     *
     * @return gender - 用户性别 1 男性 2 女性
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置用户性别 1 男性 2 女性
     *
     * @param gender 用户性别 1 男性 2 女性
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", role=").append(role);
        sb.append(", probability=").append(probability);
        sb.append(", initScore=").append(initScore);
        sb.append(", roleSwitch=").append(roleSwitch);
        sb.append(", createTime=").append(createTime);
        sb.append(", appId=").append(appId);
        sb.append(", gender=").append(gender);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}