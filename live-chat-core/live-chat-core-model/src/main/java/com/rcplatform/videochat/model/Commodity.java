package com.rcplatform.videochat.model;

import com.rcplatform.livechat.enums.SwitchEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_commodity")
@ApiModel
public class Commodity implements Serializable {

    public Commodity() {
    }

    public Commodity(Integer platformType) {
        this.platformType = platformType;
    }


    public Commodity(Integer platformType, Integer commodityType) {
        this.platformType = platformType;
        this.commodityType = commodityType;
    }

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 应用id
     */
    @Column(name = "app_id")
    @ApiModelProperty(value = "应用id")
    private Integer appId;

    /**
     * 商品的名称
     */
    @Column(name = "commodity_name")
    @ApiModelProperty(value = "商品的名称")
    private String commodityName;

    /**
     * 商品的图片
     */
    @Column(name = "commodity_image")
    @ApiModelProperty(value = "商品的图片")
    private String commodityImage;

    /**
     * 商品的金额
     */
    @ApiModelProperty(value = "商品的金额")
    private BigDecimal money;

    /**
     * 商品对应的app版本号
     */
    @ApiModelProperty(value = "商品对应的app版本号")
    private String version;

    /**
     * 商品对应的平台 0 全部 1 ios 2android
     */
    @Column(name = "platform_type")
    @ApiModelProperty(value = "商品对应的平台 0 全部 1 ios 2android")
    private Integer platformType;

    /**
     * 金币的数量
     */
    @Column(name = "gold_num")
    @ApiModelProperty(value = "金币的数量")
    private BigDecimal goldNum;

    /**
     * 是否有额外的奖励 1. 有 2 没有
     */
    @ApiModelProperty(value = "是否有额外的奖励 1. 有 2 没有")
    private Integer bonus;

    /**
     * 商品的优惠金额
     */
    @Column(name = "bonus_num")
    @ApiModelProperty(value = "商品的优惠金额")
    private BigDecimal bonusNum;

    /**
     * android 产品id
     */
    @Column(name = "product_id")
    @ApiModelProperty(value = "android 产品id")
    private String productId;

    /**
     * ios 产品id
     */
    @Column(name = "ios_product_id")
    @ApiModelProperty(value = "ios 产品id")
    private String iosProductId;


    @Column(name = "commodity_type")
    @ApiModelProperty(value = "商品类型 1 属于所有用户的商品 2 属于未支付过用户的商品")
    private Integer commodityType;

    @ApiModelProperty(value = "android开关")
    @Column(name = "android_switch")
    private SwitchEnum androidSwitch;


    @ApiModelProperty(value = "ios 开关")
    @Column(name = "ios_switch")
    private SwitchEnum iosSwitch;


    @ApiModelProperty(value = "标识 0 正常 1 hot 2 special")
    private Integer tab;


    @ApiModelProperty(value = "排序")
    @Column(name = "order_num")
    private Integer orderNum;
    /**
     * 创建的时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "创建的时间")
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
     * 获取商品的名称
     *
     * @return commodity_name - 商品的名称
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * 设置商品的名称
     *
     * @param commodityName 商品的名称
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    /**
     * 获取商品的图片
     *
     * @return commodity_image - 商品的图片
     */
    public String getCommodityImage() {
        return commodityImage;
    }

    /**
     * 设置商品的图片
     *
     * @param commodityImage 商品的图片
     */
    public void setCommodityImage(String commodityImage) {
        this.commodityImage = commodityImage;
    }

    /**
     * 获取商品的金额
     *
     * @return money - 商品的金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置商品的金额
     *
     * @param money 商品的金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取商品对应的app版本号
     *
     * @return version - 商品对应的app版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置商品对应的app版本号
     *
     * @param version 商品对应的app版本号
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取商品对应的平台 0 全部 1 ios 2android
     *
     * @return platform_type - 商品对应的平台 0 全部 1 ios 2android
     */
    public Integer getPlatformType() {
        return platformType;
    }

    /**
     * 设置商品对应的平台 0 全部 1 ios 2android
     *
     * @param platformType 商品对应的平台 0 全部 1 ios 2android
     */
    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    /**
     * 获取金币的数量
     *
     * @return gold_num - 金币的数量
     */
    public BigDecimal getGoldNum() {
        return goldNum;
    }

    /**
     * 设置金币的数量
     *
     * @param goldNum 金币的数量
     */
    public void setGoldNum(BigDecimal goldNum) {
        this.goldNum = goldNum;
    }

    /**
     * 获取是否有额外的奖励 1. 有 2 没有
     *
     * @return bonus - 是否有额外的奖励 1. 有 2 没有
     */
    public Integer getBonus() {
        return bonus;
    }

    /**
     * 设置是否有额外的奖励 1. 有 2 没有
     *
     * @param bonus 是否有额外的奖励 1. 有 2 没有
     */
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    /**
     * 获取商品的优惠金额
     *
     * @return bonus_num - 商品的优惠金额
     */
    public BigDecimal getBonusNum() {
        return bonusNum;
    }

    /**
     * 设置商品的优惠金额
     *
     * @param bonusNum 商品的优惠金额
     */
    public void setBonusNum(BigDecimal bonusNum) {
        this.bonusNum = bonusNum;
    }

    /**
     * 获取android 产品id
     *
     * @return product_id - android 产品id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置android 产品id
     *
     * @param productId android 产品id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取ios 产品id
     *
     * @return ios_product_id - ios 产品id
     */
    public String getIosProductId() {
        return iosProductId;
    }

    /**
     * 设置ios 产品id
     *
     * @param iosProductId ios 产品id
     */
    public void setIosProductId(String iosProductId) {
        this.iosProductId = iosProductId;
    }

    /**
     * 获取创建的时间
     *
     * @return create_time - 创建的时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建的时间
     *
     * @param createTime 创建的时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Integer getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(Integer commodityType) {
        this.commodityType = commodityType;
    }


    public SwitchEnum getAndroidSwitch() {
        return androidSwitch;
    }

    public void setAndroidSwitch(SwitchEnum androidSwitch) {
        this.androidSwitch = androidSwitch;
    }


    public SwitchEnum getIosSwitch() {
        return iosSwitch;
    }

    public void setIosSwitch(SwitchEnum iosSwitch) {
        this.iosSwitch = iosSwitch;
    }

    public Integer getTab() {
        return tab;
    }

    public void setTab(Integer tab) {
        this.tab = tab;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Commodity{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", commodityName='").append(commodityName).append('\'');
        sb.append(", commodityImage='").append(commodityImage).append('\'');
        sb.append(", money=").append(money);
        sb.append(", version='").append(version).append('\'');
        sb.append(", platformType=").append(platformType);
        sb.append(", goldNum=").append(goldNum);
        sb.append(", bonus=").append(bonus);
        sb.append(", bonusNum=").append(bonusNum);
        sb.append(", productId='").append(productId).append('\'');
        sb.append(", iosProductId='").append(iosProductId).append('\'');
        sb.append(", commodityType=").append(commodityType);
        sb.append(", androidSwitch=").append(androidSwitch);
        sb.append(", iosSwitch=").append(iosSwitch);
        sb.append(", tab=").append(tab);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}