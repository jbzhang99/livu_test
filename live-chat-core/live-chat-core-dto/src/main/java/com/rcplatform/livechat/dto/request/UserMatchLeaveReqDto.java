package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by yang peng on 2016/8/2.
 */
@ApiModel
public class UserMatchLeaveReqDto implements Serializable {

	/**
	 * 匹配的用户
	 */
	@NotNull
	@ApiModelProperty(value = "匹配的用户id")
	private Integer matchUserId;


	/**
	 * 用户视频时长
	 */
	@NotNull
	@ApiModelProperty(value = "用户视频时长")
	private Integer videoTime;


	@ApiModelProperty(value = "用户性别")
	private Integer gender = 0;


	@ApiModelProperty(value = "匹配到的用户性别")
	private Integer matchedGender = 0;

	/**
	 * 用户离开的时机 1.正在视频时离开 2.视频结束后离开
	 */
	@NotNull
	@ApiModelProperty(value = "用户离开的时机 1.正在视频时离开 2.视频结束后离开")
	private Integer type;


	@ApiModelProperty(value = "是否是好友视频 1 非好友 2 好友")
	private Integer isFriend = 1;


	@ApiModelProperty(value = "匹配条件 数字与随机匹配接口相同")
	private Integer genderCondition = -1;


	@ApiModelProperty(value = "本次视频是否付费，0.未付费 1.付费")
	private Integer isPay = 0;


	@ApiModelProperty(value = "版本号")
	private String version;


	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getMatchedGender() {
		return matchedGender;
	}

	public void setMatchedGender(Integer matchedGender) {
		this.matchedGender = matchedGender;
	}

	public Integer getMatchUserId() {
		return matchUserId;
	}

	public void setMatchUserId(Integer matchUserId) {
		this.matchUserId = matchUserId;
	}

	public Integer getVideoTime() {
		return videoTime;
	}

	public void setVideoTime(Integer videoTime) {
		this.videoTime = videoTime;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getIsFriend() {
		return isFriend;
	}

	public void setIsFriend(Integer isFriend) {
		this.isFriend = isFriend;
	}


	public Integer getIsPay() {
		return isPay;
	}

	public void setIsPay(Integer isPay) {
		this.isPay = isPay;
	}


	public Integer getGenderCondition() {
		return genderCondition;
	}

	public void setGenderCondition(Integer genderCondition) {
		this.genderCondition = genderCondition;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UserMatchLeaveReqDto{");
		sb.append("matchUserId=").append(matchUserId);
		sb.append(", videoTime=").append(videoTime);
		sb.append(", gender=").append(gender);
		sb.append(", matchedGender=").append(matchedGender);
		sb.append(", type=").append(type);
		sb.append(", isFriend=").append(isFriend);
		sb.append(", genderCondition=").append(genderCondition);
		sb.append(", isPay=").append(isPay);
		sb.append(", version='").append(version).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
