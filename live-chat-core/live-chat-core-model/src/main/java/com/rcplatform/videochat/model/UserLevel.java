package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_user_level")
@ApiModel
public class UserLevel implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 应用id
     */
    @Column(name = "app_id")
    @ApiModelProperty(value = "应用id")
    private Integer appId;

    /**
     * 等级名称
     */
    @ApiModelProperty(value = "等级名称")
    private String name;

    /**
     * 最大金额
     */
    @Column(name = "max_money")
    @ApiModelProperty(value = "最大金额")
    private BigDecimal maxMoney;

    /**
     * 最小金额
     */
    @Column(name = "min_money")
    @ApiModelProperty(value = "最小金额")
    private BigDecimal minMoney;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 终端
     */
    @Column(name = "platform_type")
    private Integer platformType;

    @Column(name = "fake_level_id")
    private Integer fakeLevelId;


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
     * 获取应用id
     *
     * @return app_id - 应用id
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * 设置应用id
     *
     * @param appId 应用id
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取等级名称
     *
     * @return name - 等级名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置等级名称
     *
     * @param name 等级名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取最大金额
     *
     * @return max_money - 最大金额
     */
    public BigDecimal getMaxMoney() {
        return maxMoney;
    }

    /**
     * 设置最大金额
     *
     * @param maxMoney 最大金额
     */
    public void setMaxMoney(BigDecimal maxMoney) {
        this.maxMoney = maxMoney;
    }

    /**
     * 获取最小金额
     *
     * @return min_money - 最小金额
     */
    public BigDecimal getMinMoney() {
        return minMoney;
    }

    /**
     * 设置最小金额
     *
     * @param minMoney 最小金额
     */
    public void setMinMoney(BigDecimal minMoney) {
        this.minMoney = minMoney;
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

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public Integer getFakeLevelId() {
        return fakeLevelId;
    }

    public void setFakeLevelId(Integer fakeLevelId) {
        this.fakeLevelId = fakeLevelId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", name=").append(name);
        sb.append(", maxMoney=").append(maxMoney);
        sb.append(", minMoney=").append(minMoney);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}