package com.rcplatform.videochat.param;

/**
 * Created by ruihuagong on 2017/10/10.
 */
public class EroticismParam {

	/**
	 * 应用编号
	 */
	private Integer appId;

	/**
	 * 性别
	 */
	private Integer gender;

	/**
	 * 视频截图图片地址
	 */
	private String imageUrl;

	/**
	 * 用户编号
	 */
	private Integer userId;

	/**
	 * 版本号
	 */
	private String version;

	/**
	 * 视频播放地址
	 */
	private Integer location;

	/**
	 * 房间号
	 */
	private String matchId;

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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getLocation() {
		return location;
	}

	public void setLocation(Integer location) {
		this.location = location;
	}

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}
}


