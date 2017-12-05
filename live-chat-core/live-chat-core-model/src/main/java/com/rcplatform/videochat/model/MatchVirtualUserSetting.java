package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_match_virtual_user_setting")
@ApiModel
public class MatchVirtualUserSetting implements Serializable {


    public MatchVirtualUserSetting() {
    }

    public MatchVirtualUserSetting(Integer appId, Integer userLevelId, Integer eroticism, Integer userType, Integer matchCondition,
                                   Integer virtualMale, Integer virtualFemale, Integer realMale) {
        this.appId = appId;
        this.userLevelId = userLevelId;
        this.eroticism = eroticism;
        this.userType = userType;
        this.matchCondition = matchCondition;
        this.virtualMale = virtualMale;
        this.virtualFemale = virtualFemale;
        this.realMale = realMale;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 应用id
     */
    @Column(name = "app_id")
    @ApiModelProperty(value = "应用id")
    private Integer appId;

    /**
     * 用户级别id 0为免费用户
     */
    @Column(name = "user_level_id")
    @ApiModelProperty(value = "用户级别id 0为免费用户")
    private Integer userLevelId;

    @Transient
    private String userLevelName;

    /**
     * 用户是否出现过色情行为 0 从未色情  1 曾经色情  2 正在色情
     */
    @ApiModelProperty(value = "用户是否出现过色情行为 0 从未色情  1 曾经色情  2 正在色情")
    private Integer eroticism;

    /**
     * 用户类型 0 老用户 1 新用户
     */
    @Column(name = "user_type")
    @ApiModelProperty(value = "用户类型 0 老用户 1 新用户")
    private Integer userType;

    /**
     * 匹配条件 0 全部 1 男 2 女
     */
    @Column(name = "match_condition")
    @ApiModelProperty(value = "匹配条件 0 全部 1 男 2 女")
    private Integer matchCondition;

    /**
     * 版本号
     */
    @ApiModelProperty(value = "版本号")
    private Integer version;

    /**
     * 当前角色开关 0 打开 1 关闭
     */
    @Column(name = "role_switch")
    @ApiModelProperty(value = "当前角色开关 0 打开 1 关闭")
    private Integer roleSwitch;

    /**
     * 虚拟男性用户概率
     */
    @Column(name = "virtual_male")
    @ApiModelProperty(value = "虚拟男性用户概率")
    private Integer virtualMale;

    /**
     * 虚拟女性用户概率
     */
    @Column(name = "virtual_female")
    @ApiModelProperty(value = "虚拟女性用户概率")
    private Integer virtualFemale;

    /**
     * 真实男性用户概率
     */
    @Column(name = "real_male")
    @ApiModelProperty(value = "真实男性用户概率")
    private Integer realMale;

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
     * 获取用户级别id 0为免费用户
     *
     * @return user_level_id - 用户级别id 0为免费用户
     */
    public Integer getUserLevelId() {
        return userLevelId;
    }

    /**
     * 设置用户级别id 0为免费用户
     *
     * @param userLevelId 用户级别id 0为免费用户
     */
    public void setUserLevelId(Integer userLevelId) {
        this.userLevelId = userLevelId;
    }

    /**
     * 获取用户是否出现过色情行为 0 从未色情  1 曾经色情  2 正在色情
     *
     * @return eroticism - 用户是否出现过色情行为 0 从未色情  1 曾经色情  2 正在色情
     */
    public Integer getEroticism() {
        return eroticism;
    }

    /**
     * 设置用户是否出现过色情行为 0 从未色情  1 曾经色情  2 正在色情
     *
     * @param eroticism 用户是否出现过色情行为 0 从未色情  1 曾经色情  2 正在色情
     */
    public void setEroticism(Integer eroticism) {
        this.eroticism = eroticism;
    }

    /**
     * 获取用户类型 0 老用户 1 新用户
     *
     * @return user_type - 用户类型 0 老用户 1 新用户
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置用户类型 0 老用户 1 新用户
     *
     * @param userType 用户类型 0 老用户 1 新用户
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取匹配条件 0 全部 1 男 2 女
     *
     * @return match_condition - 匹配条件 0 全部 1 男 2 女
     */
    public Integer getMatchCondition() {
        return matchCondition;
    }

    /**
     * 设置匹配条件 0 全部 1 男 2 女
     *
     * @param matchCondition 匹配条件 0 全部 1 男 2 女
     */
    public void setMatchCondition(Integer matchCondition) {
        this.matchCondition = matchCondition;
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
     * 获取当前角色开关 0 打开 1 关闭
     *
     * @return role_switch - 当前角色开关 0 打开 1 关闭
     */
    public Integer getRoleSwitch() {
        return roleSwitch;
    }

    /**
     * 设置当前角色开关 0 打开 1 关闭
     *
     * @param roleSwitch 当前角色开关 0 打开 1 关闭
     */
    public void setRoleSwitch(Integer roleSwitch) {
        this.roleSwitch = roleSwitch;
    }

    /**
     * 获取虚拟男性用户概率
     *
     * @return virtual_male - 虚拟男性用户概率
     */
    public Integer getVirtualMale() {
        return virtualMale;
    }

    /**
     * 设置虚拟男性用户概率
     *
     * @param virtualMale 虚拟男性用户概率
     */
    public void setVirtualMale(Integer virtualMale) {
        this.virtualMale = virtualMale;
    }

    /**
     * 获取虚拟女性用户概率
     *
     * @return virtual_female - 虚拟女性用户概率
     */
    public Integer getVirtualFemale() {
        return virtualFemale;
    }

    /**
     * 设置虚拟女性用户概率
     *
     * @param virtualFemale 虚拟女性用户概率
     */
    public void setVirtualFemale(Integer virtualFemale) {
        this.virtualFemale = virtualFemale;
    }

    /**
     * 获取真实男性用户概率
     *
     * @return real_male - 真实男性用户概率
     */
    public Integer getRealMale() {
        return realMale;
    }

    /**
     * 设置真实男性用户概率
     *
     * @param realMale 真实男性用户概率
     */
    public void setRealMale(Integer realMale) {
        this.realMale = realMale;
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

    public String getUserLevelName() {
        return userLevelName;
    }

    public void setUserLevelName(String userLevelName) {
        this.userLevelName = userLevelName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", userLevelId=").append(userLevelId);
        sb.append(", eroticism=").append(eroticism);
        sb.append(", userType=").append(userType);
        sb.append(", matchCondition=").append(matchCondition);
        sb.append(", version=").append(version);
        sb.append(", roleSwitch=").append(roleSwitch);
        sb.append(", virtualMale=").append(virtualMale);
        sb.append(", virtualFemale=").append(virtualFemale);
        sb.append(", realMale=").append(realMale);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }



}