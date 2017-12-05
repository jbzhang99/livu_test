package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_role_setting")
@ApiModel
public class RoleSetting implements Serializable {

	public RoleSetting() {
	}

	public RoleSetting(Integer genderCondition, Integer roleId, Integer matchOrder
	) {
		this.genderCondition = genderCondition;
		this.roleId = roleId;
		this.matchOrder = matchOrder;
	}


	public RoleSetting(Integer genderCondition, Integer roleId, Integer matchOrder,
	                   Integer virtualMaleProbability, Integer virtualFemaleProbability) {
		this.genderCondition = genderCondition;
		this.roleId = roleId;
		this.matchOrder = matchOrder;
		this.virtualMaleProbability = virtualMaleProbability;
		this.virtualFemaleProbability = virtualFemaleProbability;
	}


	public RoleSetting(Integer genderCondition) {
		this.genderCondition = genderCondition;
	}

	/**
	 * id
	 */
	@Id
	@ApiModelProperty(value = "id")
	private Integer id;

	/**
	 * role setting version
	 */
	@ApiModelProperty(value = "role setting version ")
	private String version;

	/**
	 * user gender match condition 0 all 1 male 2 female
	 */
	@Column(name = "gender_condition")
	@ApiModelProperty(value = "user gender match condition 0 all 1 male 2 female")
	private Integer genderCondition;

	/**
	 * user role id , join rc_match_role id
	 */
	@Column(name = "role_id")
	@ApiModelProperty(value = "user role id , join rc_match_role id ")
	private Integer roleId;

	/**
	 * user match user order, 0 first virtual user, 1 real user
	 */
	@Column(name = "match_order")
	@ApiModelProperty(value = "user match user order, 0 first virtual user, 1 real user")
	private Integer matchOrder;

	/**
	 * match virtual male probability
	 */
	@Column(name = "virtual_male_probability")
	@ApiModelProperty(value = "match virtual male probability")
	private Integer virtualMaleProbability;

	/**
	 * match virtual female probability
	 */
	@Column(name = "virtual_female_probability")
	@ApiModelProperty(value = "match virtual female probability ")
	private Integer virtualFemaleProbability;

	/**
	 * create time
	 */
	@Column(name = "create_time")
	@ApiModelProperty(value = "create time")
	private Date createTime;

	@Transient
	private String roleName;

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
	 * 获取role setting version
	 *
	 * @return version - role setting version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * 设置role setting version
	 *
	 * @param version role setting version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * 获取user gender match condition 0 all 1 male 2 female
	 *
	 * @return gender_condition - user gender match condition 0 all 1 male 2 female
	 */
	public Integer getGenderCondition() {
		return genderCondition;
	}

	/**
	 * 设置user gender match condition 0 all 1 male 2 female
	 *
	 * @param genderCondition user gender match condition 0 all 1 male 2 female
	 */
	public void setGenderCondition(Integer genderCondition) {
		this.genderCondition = genderCondition;
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
	 * 获取user match user order, 0 first virtual user, 1 real user
	 *
	 * @return match_order - user match user order, 0 first virtual user, 1 real user
	 */
	public Integer getMatchOrder() {
		return matchOrder;
	}

	/**
	 * 设置user match user order, 0 first virtual user, 1 real user
	 *
	 * @param matchOrder user match user order, 0 first virtual user, 1 real user
	 */
	public void setMatchOrder(Integer matchOrder) {
		this.matchOrder = matchOrder;
	}

	/**
	 * 获取match virtual male probability
	 *
	 * @return virtual_male_probability - match virtual male probability
	 */
	public Integer getVirtualMaleProbability() {
		return virtualMaleProbability;
	}

	/**
	 * 设置match virtual male probability
	 *
	 * @param virtualMaleProbability match virtual male probability
	 */
	public void setVirtualMaleProbability(Integer virtualMaleProbability) {
		this.virtualMaleProbability = virtualMaleProbability;
	}

	/**
	 * 获取match virtual female probability
	 *
	 * @return virtual_female_probability - match virtual female probability
	 */
	public Integer getVirtualFemaleProbability() {
		return virtualFemaleProbability;
	}

	/**
	 * 设置match virtual female probability
	 *
	 * @param virtualFemaleProbability match virtual female probability
	 */
	public void setVirtualFemaleProbability(Integer virtualFemaleProbability) {
		this.virtualFemaleProbability = virtualFemaleProbability;
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

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", version=").append(version);
		sb.append(", genderCondition=").append(genderCondition);
		sb.append(", roleId=").append(roleId);
		sb.append(", matchOrder=").append(matchOrder);
		sb.append(", virtualMaleProbability=").append(virtualMaleProbability);
		sb.append(", virtualFemaleProbability=").append(virtualFemaleProbability);
		sb.append(", createTime=").append(createTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}