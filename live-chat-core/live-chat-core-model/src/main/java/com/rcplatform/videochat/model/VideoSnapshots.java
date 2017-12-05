package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_video_snapshots")
@ApiModel
public class VideoSnapshots implements Serializable {

	public VideoSnapshots() {
	}


	public VideoSnapshots(Integer userId,
	                      String url,
	                      Integer location,
	                      Integer gender,
	                      Integer appId,
	                      Date createTime) {
		this.userId = userId;
		this.url = url;
		this.location = location;
		this.gender = gender;
		this.appId = appId;
		this.createTime = createTime;
	}


	/**
	 * 主键
	 */
	@Id
	@ApiModelProperty(value = "主键")
	private Integer id;


	@ApiModelProperty(value = "应用Id")
	private Integer appId;

	/**
	 * 用户id
	 */
	@Column(name = "user_id")
	@ApiModelProperty(value = "用户id")
	private Integer userId;

	/**
	 * 图片地址
	 */
	@ApiModelProperty(value = "图片地址")
	private String url;

	/**
	 * 视频截图位置
	 */
	@ApiModelProperty(value = "视频截图位置")
	private Integer location;


	@ApiModelProperty(value = "性别")
	private Integer gender;
	/**
	 * 创建时间
	 */
	@Column(name = "create_time")
	@ApiModelProperty(value = "创建时间")
	private Date createTime;

	@Column(name = "violations_rate")
	@ApiModelProperty(value = "黄图概率")
	private Double violationsRate;

	@Column(name = "violations_review")
	@ApiModelProperty(value = "黄图是否需要复审")
	private Integer violationsReview;

	@Column(name = "violations_label")
	@ApiModelProperty(value = "0：色情； 1：性感； 2：正常；")
	private Integer violationsLabel;

	@Column(name = "gender_rate")
	@ApiModelProperty(value = "性别概率")
	private Double genderRate;

	@Column(name = "gender_review")
	@ApiModelProperty(value = "性别不付是否需要要复审")
	private Integer genderReview;

	@Column(name = "gender_label")
	@ApiModelProperty(value = "0：一个老年男人； 1：一个老年女人； 2：一个青年男人； 3：一个青年女人； 4：一个小男孩； 5：一个小女孩； 6：一个婴儿； 7：多个老年男人； 8：多个老年女人； 9：多个老年男女； 10：多个青年男人； 11：多个青年女人； 12：多个青年男女； 13：多个小男孩； 14：多个小女孩； 15：多个小男孩和小女孩； 16：多个婴儿； 17：多个男人和女人； 18：多个男人； 19：多个女人； 20：没有人； 21：一个中年男人； 22：一个中年女人； 23：多个中年男人； 24：多个中年女人； 25：多个中年男女；")
	private Integer genderLabel;

	/**
	 * 0 未付费，1 付费
	 */
	@Column(name = "pay_status")
	private Integer payStatus;


	/**
	 * 用户级别id
	 */
	@Column(name = "user_level_id")
	private Integer userLevelId;

	/**
	 * 房间编号
	 */
	@Column(name = "room_id")
	private String roomId;

	/**
	 * 0: 疑似性别审核 1:确认男性审核
	 */
	@Column(name = "review_type")
	private Integer reviewType;

	private Boolean userEroticism;

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
	 * 获取用户id
	 *
	 * @return user_id - 用户id
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 设置用户id
	 *
	 * @param userId 用户id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * 获取图片地址
	 *
	 * @return url - 图片地址
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 设置图片地址
	 *
	 * @param url 图片地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取创建时间
	 *
	 * @return create_time - 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	/**
	 * 设置创建时间
	 *
	 * @param createTime 创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getLocation() {
		return location;
	}

	public void setLocation(Integer location) {
		this.location = location;
	}

	public Double getViolationsRate() {
		return violationsRate;
	}

	public void setViolationsRate(Double violationsRate) {
		this.violationsRate = violationsRate;
	}

	public Integer getViolationsReview() {
		return violationsReview;
	}

	public void setViolationsReview(Integer violationsReview) {
		this.violationsReview = violationsReview;
	}

	public Integer getViolationsLabel() {
		return violationsLabel;
	}

	public void setViolationsLabel(Integer violationsLabel) {
		this.violationsLabel = violationsLabel;
	}

	public Double getGenderRate() {
		return genderRate;
	}

	public void setGenderRate(Double genderRate) {
		this.genderRate = genderRate;
	}

	public Integer getGenderReview() {
		return genderReview;
	}

	public void setGenderReview(Integer genderReview) {
		this.genderReview = genderReview;
	}

	public Integer getGenderLabel() {
		return genderLabel;
	}

	public void setGenderLabel(Integer genderLabel) {
		this.genderLabel = genderLabel;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public Integer getUserLevelId() {
		return userLevelId;
	}

	public void setUserLevelId(Integer userLevelId) {
		this.userLevelId = userLevelId;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public Integer getReviewType() {
		return reviewType;
	}

	public void setReviewType(Integer reviewType) {
		this.reviewType = reviewType;
	}

	public Boolean getUserEroticism() {
		return userEroticism;
	}

	public void setUserEroticism(Boolean userEroticism) {
		this.userEroticism = userEroticism;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("VideoSnapshots{");
		sb.append("id=").append(id);
		sb.append(", appId=").append(appId);
		sb.append(", userId=").append(userId);
		sb.append(", url='").append(url).append('\'');
		sb.append(", location=").append(location);
		sb.append(", gender=").append(gender);
		sb.append(", createTime=").append(createTime);
		sb.append(", violationsRate=").append(violationsRate);
		sb.append(", violationsReview=").append(violationsReview);
		sb.append(", violationsLabel=").append(violationsLabel);
		sb.append(", genderRate=").append(genderRate);
		sb.append(", genderReview=").append(genderReview);
		sb.append(", genderLabel=").append(genderLabel);
		sb.append(", payStatus=").append(payStatus);
		sb.append(", userLevelId=").append(userLevelId);
		sb.append('}');
		return sb.toString();
	}
}