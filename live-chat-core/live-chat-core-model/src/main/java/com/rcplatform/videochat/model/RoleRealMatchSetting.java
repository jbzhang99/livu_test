package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_role_real_match_setting")
@ApiModel
public class RoleRealMatchSetting implements Serializable {


    public RoleRealMatchSetting() {
    }

    public RoleRealMatchSetting(Integer roleSettingId, Integer roleId, Integer probability) {
        this.roleSettingId = roleSettingId;
        this.roleId = roleId;
        this.probability = probability;
    }

    /**
     * id
     */
    @Id
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * join to rc_role_setting_id
     */
    @Column(name = "role_setting_id")
    @ApiModelProperty(value="join to rc_role_setting_id")
    private Integer roleSettingId;

    /**
     * user role id , join rc_match_role id 
     */
    @Column(name = "role_id")
    @ApiModelProperty(value="user role id , join rc_match_role id ")
    private Integer roleId;

    /**
     * match user probability
     */
    @ApiModelProperty(value="match user probability")
    private Integer probability;

    /**
     * create time
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="create time")
    private Date createTime;

    @Transient
    private String roleName;
    @Transient
    private Integer genderCondition;
    @Transient
    private Integer matchOrder;

    @Transient
    private String matchRoleName;

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
     * 获取join to rc_role_setting_id
     *
     * @return role_setting_id - join to rc_role_setting_id
     */
    public Integer getRoleSettingId() {
        return roleSettingId;
    }

    /**
     * 设置join to rc_role_setting_id
     *
     * @param roleSettingId join to rc_role_setting_id
     */
    public void setRoleSettingId(Integer roleSettingId) {
        this.roleSettingId = roleSettingId;
    }

    /**
     * 获取user role id , join rc_match_role id 
     *
     * @return role_id - user role id , join rc_match_role id 
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置user role id , join rc_match_role id 
     *
     * @param roleId user role id , join rc_match_role id 
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取match user probability
     *
     * @return probability - match user probability
     */
    public Integer getProbability() {
        return probability;
    }

    /**
     * 设置match user probability
     *
     * @param probability match user probability
     */
    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    /**
     * 获取create time
     *
     * @return create_time - create time
     */
    public Date getCreateTime() {
        return createTime;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getGenderCondition() {
        return genderCondition;
    }

    public void setGenderCondition(Integer genderCondition) {
        this.genderCondition = genderCondition;
    }

    public Integer getMatchOrder() {
        return matchOrder;
    }

    public void setMatchOrder(Integer matchOrder) {
        this.matchOrder = matchOrder;
    }

    public String getMatchRoleName() {
        return matchRoleName;
    }

    public void setMatchRoleName(String matchRoleName) {
        this.matchRoleName = matchRoleName;
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
        sb.append(", roleSettingId=").append(roleSettingId);
        sb.append(", roleId=").append(roleId);
        sb.append(", probability=").append(probability);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}