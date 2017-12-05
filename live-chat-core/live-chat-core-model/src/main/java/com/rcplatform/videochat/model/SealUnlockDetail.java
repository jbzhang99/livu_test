package com.rcplatform.videochat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * Created by ruihuagong on 2017/10/11.
 */
@Table(name = "rc_seal_unlock_detail")
public class SealUnlockDetail implements Serializable {

	private static final long serialVersionUID = -3812149493828965712L;

	@Id
	private Long id;

	/**
	 * 解封次数
	 */
	@Column(name = "unlock_num")
	private Integer unlockNum;

	/**
	 * 解封金币
	 */
	@Column(name = "unlock_gold")
	private Integer unlockGold;

	@Column(name = "seal_setting_id")
	private Integer sealSettingId;

	@Transient
	private String sealSettingName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUnlockNum() {
		return unlockNum;
	}

	public void setUnlockNum(Integer unlockNum) {
		this.unlockNum = unlockNum;
	}

	public Integer getUnlockGold() {
		return unlockGold;
	}

	public void setUnlockGold(Integer unlockGold) {
		this.unlockGold = unlockGold;
	}

	public String getSealSettingName() {
		return sealSettingName;
	}

	public void setSealSettingName(String sealSettingName) {
		this.sealSettingName = sealSettingName;
	}

	public Integer getSealSettingId() {
		return sealSettingId;
	}

	public void setSealSettingId(Integer sealSettingId) {
		this.sealSettingId = sealSettingId;
	}
}
