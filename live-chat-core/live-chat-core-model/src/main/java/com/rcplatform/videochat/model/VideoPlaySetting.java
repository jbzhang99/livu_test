package com.rcplatform.videochat.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by fj on 2017/8/31.
 */
@Table(name = "rc_video_play_setting")
public class VideoPlaySetting implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 任务开始时间
     */
    @Column(name = "start_time")
    private Integer startTime;

    /**
     * 任务结束时间
     */
    @Column(name = "end_time")
    private Integer endTime;


    /**
     * 19999:livechat,20000:livu
     */
    @Column(name = "app_id")
    private Integer appId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }
}
