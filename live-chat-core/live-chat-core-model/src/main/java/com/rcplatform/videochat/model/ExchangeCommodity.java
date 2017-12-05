package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_exchange_commodity")
@ApiModel
public class ExchangeCommodity implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 商品名称
     */
    @ApiModelProperty(value="商品名称")
    private String name;

    /**
     * 商品图片
     */
    @ApiModelProperty(value="商品图片")
    private String image;

    /**
     * 商品小图
     */
    @Column(name = "image_small")
    @ApiModelProperty(value="商品小图")
    private String imageSmall;

    /**
     * 可兑换的金额
     */
    @ApiModelProperty(value="可兑换的金额")
    private BigDecimal money;

    /**
     * 兑换商品类型 0 亚马逊卡片 1 paypal
     */
    @Column(name = "exchange_type")
    @ApiModelProperty(value="兑换商品类型 0 亚马逊卡片 1 paypal")
    private Integer exchangeType;

    /**
     * 排序序号
     */
    @ApiModelProperty(value="排序序号")
    private Integer number;

    /**
     * 产品状态
     */
    @Column(name = "commodity_status")
    @ApiModelProperty(value="产品状态")
    private Integer commodityStatus;

    /**
     * 消耗钻石数
     */
    @ApiModelProperty(value="消耗钻石数")
    private BigDecimal stone;

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
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商品图片
     *
     * @return image - 商品图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置商品图片
     *
     * @param image 商品图片
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取商品小图
     *
     * @return image_small - 商品小图
     */
    public String getImageSmall() {
        return imageSmall;
    }

    /**
     * 设置商品小图
     *
     * @param imageSmall 商品小图
     */
    public void setImageSmall(String imageSmall) {
        this.imageSmall = imageSmall;
    }

    /**
     * 获取可兑换的金额
     *
     * @return money - 可兑换的金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置可兑换的金额
     *
     * @param money 可兑换的金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取兑换商品类型 0 亚马逊卡片 1 paypal
     *
     * @return exchange_type - 兑换商品类型 0 亚马逊卡片 1 paypal
     */
    public Integer getExchangeType() {
        return exchangeType;
    }

    /**
     * 设置兑换商品类型 0 亚马逊卡片 1 paypal
     *
     * @param exchangeType 兑换商品类型 0 亚马逊卡片 1 paypal
     */
    public void setExchangeType(Integer exchangeType) {
        this.exchangeType = exchangeType;
    }

    /**
     * 获取排序序号
     *
     * @return number - 排序序号
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置排序序号
     *
     * @param number 排序序号
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取产品状态
     *
     * @return commodity_status - 产品状态
     */
    public Integer getCommodityStatus() {
        return commodityStatus;
    }

    /**
     * 设置产品状态
     *
     * @param commodityStatus 产品状态
     */
    public void setCommodityStatus(Integer commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    /**
     * 获取消耗钻石数
     *
     * @return stone - 消耗钻石数
     */
    public BigDecimal getStone() {
        return stone;
    }

    /**
     * 设置消耗钻石数
     *
     * @param stone 消耗钻石数
     */
    public void setStone(BigDecimal stone) {
        this.stone = stone;
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
        sb.append(", name=").append(name);
        sb.append(", image=").append(image);
        sb.append(", imageSmall=").append(imageSmall);
        sb.append(", money=").append(money);
        sb.append(", exchangeType=").append(exchangeType);
        sb.append(", number=").append(number);
        sb.append(", commodityStatus=").append(commodityStatus);
        sb.append(", stone=").append(stone);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}