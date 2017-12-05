package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_charge_record")
@ApiModel
public class ChargeRecord implements Serializable {

    public ChargeRecord(Integer userId, BigDecimal chargeGold, Integer mode, BigDecimal totalGold, Integer appId) {
        this.userId = userId;
        this.chargeGold = chargeGold;
        this.mode = mode;
        this.totalGold = totalGold;
        this.appId = appId;
    }


    public ChargeRecord() {
    }
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    @Column(name = "app_id")
    private Integer appId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * 充值金币数量
     */
    @Column(name = "charge_gold")
    @ApiModelProperty(value="充值金币数量")
    private BigDecimal chargeGold;

    /**
     * 充值方式
     */
    @ApiModelProperty(value="充值方式")
    private Integer mode;

    /**
     * 用户充值后金币数
     */
    @Column(name = "total_gold")
    @ApiModelProperty(value="用户充值后金币数")
    private BigDecimal totalGold;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

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
     * 获取充值金币数量
     *
     * @return charge_gold - 充值金币数量
     */
    public BigDecimal getChargeGold() {
        return chargeGold;
    }

    /**
     * 设置充值金币数量
     *
     * @param chargeGold 充值金币数量
     */
    public void setChargeGold(BigDecimal chargeGold) {
        this.chargeGold = chargeGold;
    }

    /**
     * 获取充值方式
     *
     * @return mode - 充值方式
     */
    public Integer getMode() {
        return mode;
    }

    /**
     * 设置充值方式
     *
     * @param mode 充值方式
     */
    public void setMode(Integer mode) {
        this.mode = mode;
    }

    /**
     * 获取用户充值后金币数
     *
     * @return total_gold - 用户充值后金币数
     */
    public BigDecimal getTotalGold() {
        return totalGold;
    }

    /**
     * 设置用户充值后金币数
     *
     * @param totalGold 用户充值后金币数
     */
    public void setTotalGold(BigDecimal totalGold) {
        this.totalGold = totalGold;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ChargeRecord{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", userId=").append(userId);
        sb.append(", chargeGold=").append(chargeGold);
        sb.append(", mode=").append(mode);
        sb.append(", totalGold=").append(totalGold);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}