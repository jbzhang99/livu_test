package com.rcplatform.videochat.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by fj on 2017/8/25.
 * 审核开关
 */
@Table(name = "rc_review_setting")
public class ReviewSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 版本号
     */
    private String version;

    /**
     * 1:开启2:关闭
     */
    private Integer status;

    /**
     * 1:规则1 2:规则2
     */
    private Integer regular;

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
     * 获取版本号
     *
     * @return version - 版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取1:开启2:关闭
     *
     * @return status - 1:开启2:关闭
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1:开启2:关闭
     *
     * @param status 1:开启2:关闭
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取1:规则1 2:规则2
     *
     * @return regular - 1:规则1 2:规则2
     */
    public Integer getRegular() {
        return regular;
    }

    /**
     * 设置1:规则1 2:规则2
     *
     * @param regular 1:规则1 2:规则2
     */
    public void setRegular(Integer regular) {
        this.regular = regular;
    }
}