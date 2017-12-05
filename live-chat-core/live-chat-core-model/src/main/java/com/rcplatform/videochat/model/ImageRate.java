package com.rcplatform.videochat.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by fj on 2017/7/26.
 */
@Table(name = "rc_image_rate")
public class ImageRate {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 1 色情, 2 性别不符
     */
    private Integer type;

    /**
     * 1 男性 2 女性
     */
    private Integer gender;

    /**
     * 概率下限
     */
    @Column(name = "min_rate")
    private Float minRate;

    /**
     * 概率上限
     */
    @Column(name = "max_rate")
    private Float maxRate;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 19999 livechat ,20000 livechat
     */
    @Column(name = "app_id")
    private Integer appId;

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
     * 获取1 色情, 2 性别不符
     *
     * @return type - 1 色情, 2 性别不符
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1 色情, 2 性别不符
     *
     * @param type 1 色情, 2 性别不符
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取1 男性 2 女性
     *
     * @return gender - 1 男性 2 女性
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置1 男性 2 女性
     *
     * @param gender 1 男性 2 女性
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取概率下限
     *
     * @return min_rate - 概率下限
     */
    public Float getMinRate() {
        return minRate;
    }

    /**
     * 设置概率下限
     *
     * @param minRate 概率下限
     */
    public void setMinRate(Float minRate) {
        this.minRate = minRate;
    }

    /**
     * 获取概率上限
     *
     * @return max_rate - 概率上限
     */
    public Float getMaxRate() {
        return maxRate;
    }

    /**
     * 设置概率上限
     *
     * @param maxRate 概率上限
     */
    public void setMaxRate(Float maxRate) {
        this.maxRate = maxRate;
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

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }
}
