package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_vip_commodity")
@ApiModel
public class VipCommodity implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * vip 名称
     */
    @Column(name = "vip_name")
    @ApiModelProperty(value="vip 名称")
    private String vipName;

    /**
     * vip 商品价格
     */
    @ApiModelProperty(value="vip 商品价格")
    private BigDecimal price;

    /**
     * app store 产品id
     */
    @Column(name = "app_store_product_id")
    @ApiModelProperty(value="app store 产品id")
    private String appStoreProductId;

    /**
     * google play 产品id
     */
    @Column(name = "google_play_product_id")
    @ApiModelProperty(value="google play 产品id")
    private String googlePlayProductId;

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
     * 获取vip 名称
     *
     * @return vip_name - vip 名称
     */
    public String getVipName() {
        return vipName;
    }

    /**
     * 设置vip 名称
     *
     * @param vipName vip 名称
     */
    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    /**
     * 获取vip 商品价格
     *
     * @return price - vip 商品价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置vip 商品价格
     *
     * @param price vip 商品价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取app store 产品id
     *
     * @return app_store_product_id - app store 产品id
     */
    public String getAppStoreProductId() {
        return appStoreProductId;
    }

    /**
     * 设置app store 产品id
     *
     * @param appStoreProductId app store 产品id
     */
    public void setAppStoreProductId(String appStoreProductId) {
        this.appStoreProductId = appStoreProductId;
    }

    /**
     * 获取google play 产品id
     *
     * @return google_play_product_id - google play 产品id
     */
    public String getGooglePlayProductId() {
        return googlePlayProductId;
    }

    /**
     * 设置google play 产品id
     *
     * @param googlePlayProductId google play 产品id
     */
    public void setGooglePlayProductId(String googlePlayProductId) {
        this.googlePlayProductId = googlePlayProductId;
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
        sb.append(", vipName=").append(vipName);
        sb.append(", price=").append(price);
        sb.append(", appStoreProductId=").append(appStoreProductId);
        sb.append(", googlePlayProductId=").append(googlePlayProductId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}