package com.rcplatform.livechat.dto.response;

import com.rcplatform.videochat.bean.KeyValue;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by 药耀源 on 2017/5/5.
 */
public class AdSwitchResp {

	public AdSwitchResp(Integer id, Integer platfrom, String version, Integer adSwitch, BigDecimal goldNum, Integer showAdCount, List<KeyValue> adGold, List<KeyValue> newAdGold) {
		this.id = id;
		this.platfrom = platfrom;
		this.version = version;
		this.adSwitch = adSwitch;
		this.goldNum = goldNum;
		this.showAdCount = showAdCount;
		this.adGold = adGold;
		this.newAdGold = newAdGold;
	}

	public AdSwitchResp() {
	}

	/**
	 * 用户主键
	 */
	private Integer id;

	/**
	 * 平台
	 */
	private Integer platfrom;

	/**
	 * 版本号
	 */
	private String version;

	/**
	 * 是否展示广告
	 */
	private Integer adSwitch;

	private Integer appId;

	/**
	 * 添加的金币数量
	 */
	private BigDecimal goldNum;


	private Integer showAdCount;

	private List<KeyValue> adGold;

	private List<KeyValue> newAdGold;

	private Integer minShowAd;

	private Integer maxShowAd;

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

	public void setGoldNum(BigDecimal goldNum) {
		this.goldNum = goldNum;
	}

	public Integer getShowAdCount() {
		return showAdCount;
	}

	public void setShowAdCount(Integer showAdCount) {
		this.showAdCount = showAdCount;
	}

	public List<KeyValue> getAdGold() {
		return adGold;
	}

	public void setAdGold(List<KeyValue> adGold) {
		this.adGold = adGold;
	}

	public List<KeyValue> getNewAdGold() {
		return newAdGold;
	}

	public void setNewAdGold(List<KeyValue> newAdGold) {
		this.newAdGold = newAdGold;
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
		final StringBuffer sb = new StringBuffer("AdSwitchResp{");
		sb.append("id=").append(id);
		sb.append(", platfrom=").append(platfrom);
		sb.append(", version='").append(version).append('\'');
		sb.append(", adSwitch=").append(adSwitch);
		sb.append(", goldNum=").append(goldNum);
		sb.append(", showAdCount=").append(showAdCount);
		sb.append(", adGold=").append(adGold);
		sb.append(", newAdGold=").append(newAdGold);
		sb.append(", minShowAd=").append(minShowAd);
		sb.append(", maxShowAd=").append(maxShowAd);
		sb.append('}');
		return sb.toString();
	}
}
