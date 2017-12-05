package com.rcplatform.videochat.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by ruihuagong on 2017/9/14.
 * 匹配统计@匹配算法统计需求
 */
public class MatchStatistics implements Serializable {

	private static final long serialVersionUID = -4785535811735666356L;

	private Long id;

	/**
	 * 匹配的用户群组 如下：
	 * 男付费未色情定向女 0
	 * 男付费未色情both 1
	 * 男付费A&B曾经色情定向女 2
	 * 男付费C曾经色情定向女 3
	 * 男付费A&B曾经色情both 4
	 * 男付费C曾经色情both 5
	 * 男未付费未色情定向女 6
	 * 男未付费未色情both（新） 7
	 * 男未付费未色情both（老） 8
	 * 男未付费曾经色情定向女 9
	 * 男未付费曾经色情both 10
	 */
	private Integer matchGroup;

	/**
	 * 链接到真女的次数
	 */
	private Integer linkRealGirlNum = 0;

	/**
	 * 链接到真女的人数
	 */
	private Integer linkRealGirlUsers = 0;

	/**
	 * 匹配到真女的次数
	 */
	private Integer matchRealGirlNum = 0;

	/**
	 * 匹配到真女的人数
	 */
	private Integer matchRealGirlUsers = 0;

	/**
	 * 链接到假女的次数
	 */
	private Integer linkFakeGirlNum = 0;

	/**
	 * 链接到假女的人数
	 */
	private Integer linkFakeGirlUsers = 0;

	/**
	 * 匹配到假女的次数
	 */
	private Integer matchFakeGirlNum = 0;

	/**
	 * 匹配到假女的人数
	 */
	private Integer matchFakeGirlUsers = 0;

	/**
	 * 匹配到人的次数
	 */
	private Integer matchNum = 0;

	/**
	 * 匹配到人的人数
	 */
	private Integer matchUsers = 0;

	/**
	 * 被封的次数
	 */
	private Integer forbidNum = 0;

	/**
	 * 被封了多少人
	 */
	private Integer forbidUsers = 0;

	/**
	 * 购买金币的数量
	 */
	private BigDecimal buyGoldNum = BigDecimal.ZERO;

	/**
	 * 购买金币的金额
	 */
	private BigDecimal buyGoldMoney = BigDecimal.ZERO;

	/**
	 * 付费人数
	 */
	private Integer payUsers = 0;

	/**
	 * 应用编号 19999 liveChat 20000 liveU
	 */
	private Integer appId;

	/**
	 * 统计的时间
	 */
	private Timestamp createDate;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMatchGroup() {
		return matchGroup;
	}

	public void setMatchGroup(Integer matchGroup) {
		this.matchGroup = matchGroup;
	}

	public Integer getLinkRealGirlNum() {
		return linkRealGirlNum;
	}

	public void setLinkRealGirlNum(Integer linkRealGirlNum) {
		this.linkRealGirlNum = linkRealGirlNum;
	}

	public Integer getLinkRealGirlUsers() {
		return linkRealGirlUsers;
	}

	public void setLinkRealGirlUsers(Integer linkRealGirlUsers) {
		this.linkRealGirlUsers = linkRealGirlUsers;
	}

	public Integer getMatchRealGirlNum() {
		return matchRealGirlNum;
	}

	public void setMatchRealGirlNum(Integer matchRealGirlNum) {
		this.matchRealGirlNum = matchRealGirlNum;
	}

	public Integer getMatchRealGirlUsers() {
		return matchRealGirlUsers;
	}

	public void setMatchRealGirlUsers(Integer matchRealGirlUsers) {
		this.matchRealGirlUsers = matchRealGirlUsers;
	}

	public Integer getLinkFakeGirlNum() {
		return linkFakeGirlNum;
	}

	public void setLinkFakeGirlNum(Integer linkFakeGirlNum) {
		this.linkFakeGirlNum = linkFakeGirlNum;
	}

	public Integer getLinkFakeGirlUsers() {
		return linkFakeGirlUsers;
	}

	public void setLinkFakeGirlUsers(Integer linkFakeGirlUsers) {
		this.linkFakeGirlUsers = linkFakeGirlUsers;
	}

	public Integer getMatchFakeGirlNum() {
		return matchFakeGirlNum;
	}

	public void setMatchFakeGirlNum(Integer matchFakeGirlNum) {
		this.matchFakeGirlNum = matchFakeGirlNum;
	}

	public Integer getMatchFakeGirlUsers() {
		return matchFakeGirlUsers;
	}

	public void setMatchFakeGirlUsers(Integer matchFakeGirlUsers) {
		this.matchFakeGirlUsers = matchFakeGirlUsers;
	}

	public Integer getMatchNum() {
		return matchNum;
	}

	public void setMatchNum(Integer matchNum) {
		this.matchNum = matchNum;
	}

	public Integer getMatchUsers() {
		return matchUsers;
	}

	public void setMatchUsers(Integer matchUsers) {
		this.matchUsers = matchUsers;
	}

	public Integer getForbidNum() {
		return forbidNum;
	}

	public void setForbidNum(Integer forbidNum) {
		this.forbidNum = forbidNum;
	}

	public Integer getForbidUsers() {
		return forbidUsers;
	}

	public void setForbidUsers(Integer forbidUsers) {
		this.forbidUsers = forbidUsers;
	}

	public BigDecimal getBuyGoldNum() {
		return buyGoldNum;
	}

	public void setBuyGoldNum(BigDecimal buyGoldNum) {
		this.buyGoldNum = buyGoldNum;
	}

	public BigDecimal getBuyGoldMoney() {
		return buyGoldMoney;
	}

	public void setBuyGoldMoney(BigDecimal buyGoldMoney) {
		this.buyGoldMoney = buyGoldMoney;
	}

	public Integer getPayUsers() {
		return payUsers;
	}

	public void setPayUsers(Integer payUsers) {
		this.payUsers = payUsers;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

