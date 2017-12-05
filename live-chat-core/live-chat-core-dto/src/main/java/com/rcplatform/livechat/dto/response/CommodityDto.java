package com.rcplatform.livechat.dto.response;

import com.rcplatform.livechat.enums.SwitchEnum;
import com.rcplatform.videochat.model.CommodityDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by yang peng on 2016/11/17.
 */
@ApiModel
public class CommodityDto implements Serializable{


    /**
     * 主键
     */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 应用id
     */
    @ApiModelProperty(value="应用id")
    private Integer appId;

    /**
     * 商品的名称
     */
    @ApiModelProperty(value="商品的名称")
    private String commodityName;

    /**
     * 商品的图片
     */
    @ApiModelProperty(value="商品的图片")
    private String commodityImage;

    /**
     * 商品的金额
     */
    @ApiModelProperty(value="商品的金额")
    private String money;

    /**
     * 商品对应的app版本号
     */
    @ApiModelProperty(value="商品对应的app版本号")
    private String version;

    /**
     * 商品对应的平台 0 全部 1 ios 2android
     */
    @ApiModelProperty(value="商品对应的平台 0 全部 1 ios 2android")
    private Integer platformType;


    /**
     * 是否有额外的奖励 1. 有 2 没有
     */
    @ApiModelProperty(value="是否有额外的奖励 1. 有 2 没有")
    private Integer bonus;


    /**
     * 金币的数量
     */
    @ApiModelProperty(value="金币的数量")
    private String goldNum;


    /**
     * 商品的优惠金额
     */
    @ApiModelProperty(value="商品的优惠金额")
    private String bonusNum;



    /**
     * android 产品id
     */
    @ApiModelProperty(value="android 产品id")
    private String productId;

    /**
     * ios 产品id
     */
    @ApiModelProperty(value="ios 产品id")
    private String iosProductId;

    /**
     * 创建的时间
     */
    @ApiModelProperty(value="创建的时间")
    private Date createTime;



    @ApiModelProperty(value = "商品类型 0 special 1 normal 2 new")
    private Integer commodityType;



    @ApiModelProperty(value = "标识 0 正常 1 hot 2 special")
    private Integer tab;



    @ApiModelProperty(value = "排序")
    @Column(name = "order_num")
    private Integer orderNum;

    @Column(name = "android_switch")
    private SwitchEnum androidSwitch;

    @Column(name = "ios_switch")
    private SwitchEnum iosSwitch;

    CommodityDetail detail;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityImage() {
        return commodityImage;
    }

    public void setCommodityImage(String commodityImage) {
        this.commodityImage = commodityImage;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public String getGoldNum() {

        return goldNum;
    }

    public void setGoldNum(String goldNum) {
        this.goldNum = goldNum;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public String getBonusNum() {
        return bonusNum;
    }

    public void setBonusNum(String bonusNum) {
        this.bonusNum = bonusNum;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getIosProductId() {
        return iosProductId;
    }

    public void setIosProductId(String iosProductId) {
        this.iosProductId = iosProductId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Integer getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(Integer commodityType) {
        this.commodityType = commodityType;
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

    public CommodityDetail getDetail() {
        return detail;
    }

    public void setDetail(CommodityDetail detail) {
        this.detail = detail;
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


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommodityDto{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", commodityName='").append(commodityName).append('\'');
        sb.append(", commodityImage='").append(commodityImage).append('\'');
        sb.append(", money='").append(money).append('\'');
        sb.append(", version='").append(version).append('\'');
        sb.append(", platformType=").append(platformType);
        sb.append(", bonus=").append(bonus);
        sb.append(", goldNum='").append(goldNum).append('\'');
        sb.append(", bonusNum='").append(bonusNum).append('\'');
        sb.append(", productId='").append(productId).append('\'');
        sb.append(", iosProductId='").append(iosProductId).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", commodityType=").append(commodityType);
        sb.append(", tab=").append(tab);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", detail=").append(detail);
        sb.append('}');
        return sb.toString();
    }
}
