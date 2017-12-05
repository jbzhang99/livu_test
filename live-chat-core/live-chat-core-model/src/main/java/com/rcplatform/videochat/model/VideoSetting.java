package com.rcplatform.videochat.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_video_setting")
public class VideoSetting  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 任务开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 任务结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "country_name")
    private String countryName;

    /**
     * 性别:1男，2女
     */
    private Integer gender;

    /**
     * 年龄17-24，25-30，30-35，35+，all
     */
    private String age;

    /**
     * 时长区间最小值
     */
    @Column(name = "min_time")
    private Integer minTime;

    /**
     * 时长区间最大值
     */
    @Column(name = "max_time")
    private Integer maxTime;

    /**
     * 起录时间
     */
    @Column(name = "record_stime")
    private Integer recordStime;

    /**
     *单人播放次数
     */
    @Column(name = "times")
    private Integer times;

    /**
     * 19999:livechat,20000:livu
     */
    @Column(name = "app_id")
    private Integer appId;


    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取任务开始时间
     *
     * @return start_time - 任务开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置任务开始时间
     *
     * @param startTime 任务开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取任务结束时间
     *
     * @return end_time - 任务结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置任务结束时间
     *
     * @param endTime 任务结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return country_id
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * @param countryId
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * @return country_name
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 获取性别:1男，2女
     *
     * @return gender - 性别:1男，2女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别:1男，2女
     *
     * @param gender 性别:1男，2女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取年龄17-24，25-30，30-35，35+，all
     *
     * @return age - 年龄17-24，25-30，30-35，35+，all
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置年龄17-24，25-30，30-35，35+，all
     *
     * @param age 年龄17-24，25-30，30-35，35+，all
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 获取时长区间最小值
     *
     * @return min_time - 时长区间最小值
     */
    public Integer getMinTime() {
        return minTime;
    }

    /**
     * 设置时长区间最小值
     *
     * @param minTime 时长区间最小值
     */
    public void setMinTime(Integer minTime) {
        this.minTime = minTime;
    }

    /**
     * 获取时长区间最大值
     *
     * @return max_time - 时长区间最大值
     */
    public Integer getMaxTime() {
        return maxTime;
    }

    /**
     * 设置时长区间最大值
     *
     * @param maxTime 时长区间最大值
     */
    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }

    /**
     * 获取起录时间
     *
     * @return record_stime - 起录时间
     */
    public Integer getRecordStime() {
        return recordStime;
    }

    /**
     * 设置起录时间
     *
     * @param recordStime 起录时间
     */
    public void setRecordStime(Integer recordStime) {
        this.recordStime = recordStime;
    }


    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }
}