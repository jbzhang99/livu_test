package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_eroticism_block_total_setting")
@ApiModel
public class EroticismBlockTotalSetting implements Serializable {
    /**
     * id
     */
    @Id
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * app id
     */
    @Column(name = "app_id")
    @ApiModelProperty(value="app id")
    private Integer appId;

    /**
     * one user eroticism total 
     */
    @Column(name = "eroticism_count")
    @ApiModelProperty(value="one user eroticism total ")
    private Integer eroticismCount;

    /**
     * unblock user money
     */
    @Column(name = "unblock_price")
    @ApiModelProperty(value="unblock user money")
    private BigDecimal unblockPrice;

    /**
     * the source 0 video 1 video report 2 match report 3 head image
     */
    @ApiModelProperty(value="the source 0 video 1 video report 2 match report 3 head image")
    private Integer source;


    @Column(name = "gender")
    @ApiModelProperty(value = "gender")
    private Integer gender;


    @Column(name = "user_level_id")
    @ApiModelProperty(value = "the user level id")
    private Integer userLevelId;
    /**
     * create time
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="create time")
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
     * 获取app id
     *
     * @return app_id - app id
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * 设置app id
     *
     * @param appId app id
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取one user eroticism total 
     *
     * @return eroticism_count - one user eroticism total 
     */
    public Integer getEroticismCount() {
        return eroticismCount;
    }

    /**
     * 设置one user eroticism total 
     *
     * @param eroticismCount one user eroticism total 
     */
    public void setEroticismCount(Integer eroticismCount) {
        this.eroticismCount = eroticismCount;
    }

    /**
     * 获取unblock user money
     *
     * @return unblock_price - unblock user money
     */
    public BigDecimal getUnblockPrice() {
        return unblockPrice;
    }

    /**
     * 设置unblock user money
     *
     * @param unblockPrice unblock user money
     */
    public void setUnblockPrice(BigDecimal unblockPrice) {
        this.unblockPrice = unblockPrice;
    }

    /**
     * 获取the source 0 video 1 video report 2 match report 3 head image
     *
     * @return source - the source 0 video 1 video report 2 match report 3 head image
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 设置the source 0 video 1 video report 2 match report 3 head image
     *
     * @param source the source 0 video 1 video report 2 match report 3 head image
     */
    public void setSource(Integer source) {
        this.source = source;
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


    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(Integer userLevelId) {
        this.userLevelId = userLevelId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EroticismBlockTotalSetting{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", eroticismCount=").append(eroticismCount);
        sb.append(", unblockPrice=").append(unblockPrice);
        sb.append(", source=").append(source);
        sb.append(", gender=").append(gender);
        sb.append(", userLevelId=").append(userLevelId);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}