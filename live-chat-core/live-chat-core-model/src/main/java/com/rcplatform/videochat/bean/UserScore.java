package com.rcplatform.videochat.bean;

import java.io.Serializable;

/**
 * Created by 药耀源 on 2017/5/12.
 */
public class UserScore implements Serializable {

    public UserScore() {
    }

    public UserScore(Integer userId, Double score) {
        this.userId = userId;
        this.score = score;
    }

    private Integer userId;

    private Double score;

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
