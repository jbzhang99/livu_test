package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 药耀源 on 2017/5/16.
 */
@Table(name = "rc_user_score")
@ApiModel
public class UserScoreModel {

    public UserScoreModel() {
    }

    public UserScoreModel(Integer userId, Double score) {
        this.userId = userId;
        this.score = score;
    }

    @Id
    @ApiModelProperty(value="")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "score")
    private Double score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
