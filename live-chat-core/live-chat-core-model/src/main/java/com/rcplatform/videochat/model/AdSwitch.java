package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by 药耀源 on 2017/3/22.
 */
@Table(name = "rc_ad_switch")
@ApiModel
public class AdSwitch implements Serializable {

	private static final long serialVersionUID = -2540775781212080730L;

	public AdSwitch() {
	}

	public AdSwitch(Integer platfrom, String version) {
		this.platfrom = platfrom;
		this.version = version;
	}

	public AdSwitch(String version) {
		this.version = version;
	}


	/**
	 * 用户主键
	 */
	@Id
	@ApiModelProperty(value = "平台版本主键")
	private Integer id;

	/**
	 * 平台
	 */
	@Column(name = "platfrom")
	@ApiModelProperty(value = "平台,1 ios平台,2 Android平台")
	private Integer platfrom;

	/**
	 * 版本号
	 */
	@Column(name = "version")
	@ApiModelProperty(value = "版本号")
	private String version;

	/**
	 * 是否展示广告
	 */
	@Column(name = "ad_switch")
	@ApiModelProperty(value = "是否展示广告 1 未付费用户展示 2 全部展示 0 不展示")
	private Integer adSwitch;

	/**
	 * 添加的金币数量
	 */
	@Column(name = "gold_num")
	@ApiModelProperty(value = "每看完一次视频广告所添加的金币数量")
	private BigDecimal goldNum;


	@Column(name = "show_ad_count")
	@ApiModelProperty(value = "每天显示广告的次数")
	private Integer showAdCount;

	@Column(name = "ad_gold")
	@ApiModelProperty(value = "用户看广告概率与金币数")
	private String adGold;

	@Column(name = "new_ad_gold")
	@ApiModelProperty(value = "用户第一次看广告与金币数")
	private String newAdGold;

	@Column(name = "min_show_ad")
	@ApiModelProperty(value = "匹配页面n次匹配弹出广告,n的最小值")
	private Integer minShowAd;

	@Column(name = "max_show_ad")
	@ApiModelProperty(name = "匹配页面n次匹配弹出广告,n的最大值")
	private Integer maxShowAd;

	@Column(name = "app_id")
	@ApiModelProperty(name = "应用编号")
	private Integer appId;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPlatfrom() {
		return platfrom;
	}

	public void setPlatfrom(Integer platfrom) {
		this.platfrom = platfrom;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getAdSwitch() {
		return adSwitch;
	}

	public void setAdSwitch(Integer adSwitch) {
		this.adSwitch = adSwitch;
	}

	public BigDecimal getGoldNum() {
		return goldNum;
	}

	public void setNewAdGold(String newAdGold) {
		this.newAdGold = newAdGold;
	}

	public void setGoldNum(BigDecimal goldNum) {
		this.goldNum = goldNum;
	}

	public Integer getShowAdCount() {
		return showAdCount;
	}

	public void setShowAdCount(Integer showAdCount) {
		this.showAdCount = showAdCount;
	}

	public String getAdGold() {
		return adGold;
	}

	public void setAdGold(String adGold) {
		this.adGold = adGold;
	}

	public String getNewAdGold() {
		return newAdGold;
	}

	public Integer getMinShowAd() {
		return minShowAd;
	}

	public void setMinShowAd(Integer minShowAd) {
		this.minShowAd = minShowAd;
	}

	public Integer getMaxShowAd() {
		return maxShowAd;
	}

	public void setMaxShowAd(Integer maxShowAd) {
		this.maxShowAd = maxShowAd;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("AdSwitch{");
		sb.append("id=").append(id);
		sb.append(", platfrom=").append(platfrom);
		sb.append(", version='").append(version).append('\'');
		sb.append(", adSwitch=").append(adSwitch);
		sb.append(", goldNum=").append(goldNum);
		sb.append(", showAdCount=").append(showAdCount);
		sb.append(", adGold='").append(adGold).append('\'');
		sb.append(", newAdGold='").append(newAdGold).append('\'');
		sb.append(", minShowAd=").append(minShowAd);
		sb.append(", maxShowAd=").append(maxShowAd);
		sb.append('}');
		return sb.toString();
	}
}
