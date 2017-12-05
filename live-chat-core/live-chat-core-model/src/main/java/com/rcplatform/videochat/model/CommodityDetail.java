package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_commodity_detail")
@ApiModel
public class CommodityDetail implements Serializable {
    /**
     * id
     */
    @Id
    @ApiModelProperty(value = "id")
    private Integer id;

    /**
     * commodity id join to rc_commodity
     */
    @Column(name = "commodity_id")
    @ApiModelProperty(value = "商品id")
    private Integer commodityId;

    /**
     * the count down time
     */
    @Column(name = "count_down")
    @ApiModelProperty(value = "倒计时 秒")
    private Integer countDown;

    /**
     * match count number show commodity
     */
    @Column(name = "match_count")
    @ApiModelProperty(value = "匹配次数")
    private Integer matchCount;

    /**
     * old price for commodity
     */
    @Column(name = "old_price")
    @ApiModelProperty(value = "老的价格")
    private BigDecimal oldPrice;

    /**
     * the probability for commodity show
     */
    @ApiModelProperty(value = "概率")
    private Integer probability;

    /**
     * show for user is pay or not  0 no  1 yes
     */
    @Column(name = "pay_property")
    @ApiModelProperty(value = "0 非付费用户展示 1 付费用户展示")
    private Integer payProperty;

    /**
     * the commodity show location 0 normal, 1 match ,2 home page
     */
    @ApiModelProperty(value = "展示位置 0 normal, 1 match ,2 home page")
    private Integer location;

    /**
     * create time
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
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
     * 获取commodity id join to rc_commodity
     *
     * @return commodity_id - commodity id join to rc_commodity
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置commodity id join to rc_commodity
     *
     * @param commodityId commodity id join to rc_commodity
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取the count down time
     *
     * @return count_down - the count down time
     */
    public Integer getCountDown() {
        return countDown;
    }

    /**
     * 设置the count down time
     *
     * @param countDown the count down time
     */
    public void setCountDown(Integer countDown) {
        this.countDown = countDown;
    }

    /**
     * 获取match count number show commodity
     *
     * @return match_count - match count number show commodity
     */
    public Integer getMatchCount() {
        return matchCount;
    }

    /**
     * 设置match count number show commodity
     *
     * @param matchCount match count number show commodity
     */
    public void setMatchCount(Integer matchCount) {
        this.matchCount = matchCount;
    }

    /**
     * 获取old price for commodity
     *
     * @return old_price - old price for commodity
     */
    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    /**
     * 设置old price for commodity
     *
     * @param oldPrice old price for commodity
     */
    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    /**
     * 获取the probability for commodity show
     *
     * @return probability - the probability for commodity show
     */
    public Integer getProbability() {
        return probability;
    }

    /**
     * 设置the probability for commodity show
     *
     * @param probability the probability for commodity show
     */
    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    /**
     * 获取show for user is pay or not  0 no  1 yes
     *
     * @return pay_property - show for user is pay or not  0 no  1 yes
     */
    public Integer getPayProperty() {
        return payProperty;
    }

    /**
     * 设置show for user is pay or not  0 no  1 yes
     *
     * @param payProperty show for user is pay or not  0 no  1 yes
     */
    public void setPayProperty(Integer payProperty) {
        this.payProperty = payProperty;
    }

    /**
     * 获取the commodity show location 0 normal, 1 match ,2 home page
     *
     * @return location - the commodity show location 0 normal, 1 match ,2 home page
     */
    public Integer getLocation() {
        return location;
    }

    /**
     * 设置the commodity show location 0 normal, 1 match ,2 home page
     *
     * @param location the commodity show location 0 normal, 1 match ,2 home page
     */
    public void setLocation(Integer location) {
        this.location = location;
    }

    /**
     * 获取create time
     *
     * @return create_time - create time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置create time
     *
     * @param createTime create time
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
        sb.append(", commodityId=").append(commodityId);
        sb.append(", countDown=").append(countDown);
        sb.append(", matchCount=").append(matchCount);
        sb.append(", oldPrice=").append(oldPrice);
        sb.append(", probability=").append(probability);
        sb.append(", payProperty=").append(payProperty);
        sb.append(", location=").append(location);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}