package com.rcplatform.videochat.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by ruihuagong on 2017/9/29.
 */
@Table(name = "rc_match_circle_order")
public class MatchCircleOrder implements Serializable {

	private static final long serialVersionUID = 1294967612433454497L;

	/**
	 * 匹配角色ID
	 * {@link com.rcplatform.videochat.model.MatchRole}
	 */
	private Integer matchRoleId;

	@javax.persistence.Id
	private Integer Id;

	/**
	 * 匹配类型 0 色情女 1 色情视频 2假女 3 真女
	 */
	private Integer matchType;

	private Date createDate;

	/**
	 * 匹配的概率
	 */
	private Integer probability;

	/**
	 * 排序序号
	 */
	private Integer orders;

	@Transient
	private String matchRoleName;

	public Integer getMatchRoleId() {
		return matchRoleId;
	}

	public void setMatchRoleId(Integer matchRoleId) {
		this.matchRoleId = matchRoleId;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getMatchType() {
		return matchType;
	}

	public void setMatchType(Integer matchType) {
		this.matchType = matchType;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getOrders() {
		return orders;
	}

	public void setOrders(Integer orders) {
		this.orders = orders;
	}

	public Integer getProbability() {
		return probability;
	}

	public void setProbability(Integer probability) {
		this.probability = probability;
	}

	public String getMatchRoleName() {
		return matchRoleName;
	}

	public void setMatchRoleName(String matchRoleName) {
		this.matchRoleName = matchRoleName;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public enum MatchOrderTypeEnum {
		EROTICISM_FEMALE(0, "色情女"), EROTICISM_VIDEO(1, "色情视频"), FAKE_FEMALE(2, "假女"), REAL_FEMALE(3, "真女");

		private int key;

		private String msg;

		MatchOrderTypeEnum(int key, String msg) {
			this.key = key;
			this.msg = msg;
		}

		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}
	}

	/**
	 * 获取匹配的类型
	 *
	 * @param matchType
	 * @return
	 */
	public static MatchOrderTypeEnum getMatchTypeEnum(Integer matchType) {
		for (MatchOrderTypeEnum matchOrderTypeEnum : MatchOrderTypeEnum.values()) {
			if (matchOrderTypeEnum.getKey() == matchType) {
				return matchOrderTypeEnum;
			}
		}
		return null;
	}

}
