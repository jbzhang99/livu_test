package com.rcplatform.videochat.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by fj on 2017/9/4.
 */
@Table(name = "rc_video_operate_record")
public class VideoOperateRecord {

    public VideoOperateRecord() {
    }

    public VideoOperateRecord(Integer userId,String userName, Integer operate, Date createTime,Integer videoId) {
        this.userId = userId;
        this.userName = userName;
        this.operate = operate;
        this.createTime = createTime;
        this.videoId = videoId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private String userName;

    private Integer operate;

    private Date createTime;

    private Integer videoId;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getOperate() {
        return operate;
    }

    public void setOperate(Integer operate) {
        this.operate = operate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }
}
