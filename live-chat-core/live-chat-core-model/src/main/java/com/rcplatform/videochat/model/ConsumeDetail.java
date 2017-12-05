package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_consume_detail")
@ApiModel
public class ConsumeDetail implements Serializable {
    /**
     * id
     */
    @Id
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * 消费品id,和 consume_detail 的主键关联
     */
    @Column(name = "consume_id")
    @ApiModelProperty(value="消费品id,和 consume_detail 的主键关联")
    private Integer consumeId;

    /**
     * 应用id
     */
    @Column(name = "app_id")
    @ApiModelProperty(value="应用id")
    private Integer appId;

    /**
     * 平台类型
     */
    @Column(name = "platform_type")
    @ApiModelProperty(value="平台类型")
    private Integer platformType;

    /**
     * 金币数
     */
    @ApiModelProperty(value="金币数")
    private BigDecimal price;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取消费品id,和 consume_detail 的主键关联
     *
     * @return consume_id - 消费品id,和 consume_detail 的主键关联
     */
    public Integer getConsumeId() {
        return consumeId;
    }

    /**
     * 设置消费品id,和 consume_detail 的主键关联
     *
     * @param consumeId 消费品id,和 consume_detail 的主键关联
     */
    public void setConsumeId(Integer consumeId) {
        this.consumeId = consumeId;
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
     * 获取平台类型
     *
     * @return platform_type - 平台类型
     */
    public Integer getPlatformType() {
        return platformType;
    }

    /**
     * 设置平台类型
     *
     * @param platformType 平台类型
     */
    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    /**
     * 获取金币数
     *
     * @return price - 金币数
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置金币数
     *
     * @param price 金币数
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", consumeId=").append(consumeId);
        sb.append(", appId=").append(appId);
        sb.append(", platformType=").append(platformType);
        sb.append(", price=").append(price);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}