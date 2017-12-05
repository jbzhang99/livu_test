package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_gift")
@ApiModel
public class Gift implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 礼物名称
     */
    @Column(name = "gift_name")
    @ApiModelProperty(value="礼物名称")
    private String giftName;

    /**
     * 礼物大图
     */
    @ApiModelProperty(value="礼物大图")
    private String image;

    /**
     * 礼物小图
     */
    @Column(name = "image_small")
    @ApiModelProperty(value="礼物小图")
    private String imageSmall;

    /**
     * 金币数
     */
    @ApiModelProperty(value="金币数")
    private BigDecimal gold;

    /**
     * 礼物类别
     */
    @Column(name = "gift_type")
    @ApiModelProperty(value="礼物类别 1 普通礼物，2 加好友礼物")
    private Integer giftType;

    /**
     * 兑换比率
     */
    @ApiModelProperty(value="兑换比率")
    private Double rate;

    /**
     * 礼物排序
     */
    @ApiModelProperty(value="礼物排序")
    private Integer number;

    /**
     * 礼物状态 0 上架 1 下架
     */
    @Column(name = "gift_status")
    @ApiModelProperty(value="礼物状态 0 上架 1 下架")
    private Integer giftStatus;

    /**
     * 钻石数
     */
    @ApiModelProperty(value="钻石数")
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
     * 获取礼物名称
     *
     * @return gift_name - 礼物名称
     */
    public String getGiftName() {
        return giftName;
    }

    /**
     * 设置礼物名称
     *
     * @param giftName 礼物名称
     */
    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    /**
     * 获取礼物大图
     *
     * @return image - 礼物大图
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置礼物大图
     *
     * @param image 礼物大图
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取礼物小图
     *
     * @return image_small - 礼物小图
     */
    public String getImageSmall() {
        return imageSmall;
    }

    /**
     * 设置礼物小图
     *
     * @param imageSmall 礼物小图
     */
    public void setImageSmall(String imageSmall) {
        this.imageSmall = imageSmall;
    }

    /**
     * 获取金币数
     *
     * @return gold - 金币数
     */
    public BigDecimal getGold() {
        return gold;
    }

    /**
     * 设置金币数
     *
     * @param gold 金币数
     */
    public void setGold(BigDecimal gold) {
        this.gold = gold;
    }

    /**
     * 获取礼物类别
     *
     * @return gift_type - 礼物类别
     */
    public Integer getGiftType() {
        return giftType;
    }

    /**
     * 设置礼物类别
     *
     * @param giftType 礼物类别
     */
    public void setGiftType(Integer giftType) {
        this.giftType = giftType;
    }

    /**
     * 获取兑换比率
     *
     * @return rate - 兑换比率
     */
    public Double getRate() {
        return rate;
    }

    /**
     * 设置兑换比率
     *
     * @param rate 兑换比率
     */
    public void setRate(Double rate) {
        this.rate = rate;
    }

    /**
     * 获取礼物排序
     *
     * @return number - 礼物排序
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置礼物排序
     *
     * @param number 礼物排序
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取礼物状态 0 上架 1 下架
     *
     * @return gift_status - 礼物状态 0 上架 1 下架
     */
    public Integer getGiftStatus() {
        return giftStatus;
    }

    /**
     * 设置礼物状态 0 上架 1 下架
     *
     * @param giftStatus 礼物状态 0 上架 1 下架
     */
    public void setGiftStatus(Integer giftStatus) {
        this.giftStatus = giftStatus;
    }

    /**
     * 获取钻石数
     *
     * @return stone - 钻石数
     */
    public BigDecimal getStone() {
        return stone;
    }

    /**
     * 设置钻石数
     *
     * @param stone 钻石数
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
        sb.append(", giftName=").append(giftName);
        sb.append(", image=").append(image);
        sb.append(", imageSmall=").append(imageSmall);
        sb.append(", gold=").append(gold);
        sb.append(", giftType=").append(giftType);
        sb.append(", rate=").append(rate);
        sb.append(", number=").append(number);
        sb.append(", giftStatus=").append(giftStatus);
        sb.append(", stone=").append(stone);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}