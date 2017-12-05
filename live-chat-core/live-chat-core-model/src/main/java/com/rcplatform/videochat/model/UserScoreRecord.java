package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_score_record")
@ApiModel
public class UserScoreRecord implements Serializable {


    public UserScoreRecord() {
    }

    public UserScoreRecord(Integer userId, Integer scoreUserId, Integer score, Date createTime, Integer countryId, Integer gender) {
        this.userId = userId;
        this.scoreUserId = scoreUserId;
        this.score = score;
        this.createTime = createTime;
        this.countryId = countryId;
        this.gender = gender;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value = "用户id")
    private Integer userId;


    @Column(name = "score_user_id")
    @ApiModelProperty(value = "被打分的userId")
    private Integer scoreUserId;

    /**
     * 得分
     */
    @ApiModelProperty(value = "得分")
    private Integer score;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @Column(name = "country_id")
    @ApiModelProperty(value = "用户所在国家")
    private Integer countryId;


    @ApiModelProperty(name = "用户性别")
    @Column(name = "gender")
    private Integer gender;

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
     * 获取得分
     *
     * @return score - 得分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置得分
     *
     * @param score 得分
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Integer getScoreUserId() {
        return scoreUserId;
    }

    public void setScoreUserId(Integer scoreUserId) {
        this.scoreUserId = scoreUserId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserScoreRecord{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", scoreUserId=").append(scoreUserId);
        sb.append(", score=").append(score);
        sb.append(", createTime=").append(createTime);
        sb.append(", countryId=").append(countryId);
        sb.append(", gender=").append(gender);
        sb.append('}');
        return sb.toString();
    }
}