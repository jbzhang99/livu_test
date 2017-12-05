package com.rcplatform.videochat.model;

import com.rcplatform.livechat.enums.SwitchEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_match_setting")
@ApiModel
public class MatchSetting implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * ios 版本
     */
    @Column(name = "ios_version")
    @ApiModelProperty(value = " ios 版本")
    private String iosVersion;

    /**
     * android 版本
     */
    @Column(name = "android_version")
    @ApiModelProperty(value = " android 版本")
    private String androidVersion;

    /**
     * ios 开关
     */
    @Column(name = "ios_switch")
    @ApiModelProperty(value = "ios 开关")
    private SwitchEnum iosSwitch;

    /**
     * android 开关
     */
    @Column(name = "android_switch")
    @ApiModelProperty(value = "android 开关")
    private SwitchEnum androidSwitch;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;


    @Column(name = "eroticism_tag_match_count")
    @ApiModelProperty(value = "色情标签计数")
    private Integer eroticismTagMatchCount;


    @ApiModelProperty(value = "权重")
    private Double weight;


    @Column(name = "consume_weight")
    private Double consumeWeight;


    @Column(name = "score_weight")
    private Double scoreWeight;


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
     * @return ios_version - 用户id
     */
    public String getIosVersion() {
        return iosVersion;
    }

    /**
     * 设置用户id
     *
     * @param iosVersion 用户id
     */
    public void setIosVersion(String iosVersion) {
        this.iosVersion = iosVersion;
    }

    /**
     * 获取图片地址
     *
     * @return android_version - 图片地址
     */
    public String getAndroidVersion() {
        return androidVersion;
    }

    /**
     * 设置图片地址
     *
     * @param androidVersion 图片地址
     */
    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }


    public SwitchEnum getIosSwitch() {
        return iosSwitch;
    }

    public void setIosSwitch(SwitchEnum iosSwitch) {
        this.iosSwitch = iosSwitch;
    }

    public SwitchEnum getAndroidSwitch() {
        return androidSwitch;
    }

    public void setAndroidSwitch(SwitchEnum androidSwitch) {
        this.androidSwitch = androidSwitch;
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


    public Integer getEroticismTagMatchCount() {
        return eroticismTagMatchCount;
    }

    public void setEroticismTagMatchCount(Integer eroticismTagMatchCount) {
        this.eroticismTagMatchCount = eroticismTagMatchCount;
    }


    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }


    public Double getConsumeWeight() {
        return consumeWeight;
    }

    public void setConsumeWeight(Double consumeWeight) {
        this.consumeWeight = consumeWeight;
    }

    public Double getScoreWeight() {
        return scoreWeight;
    }

    public void setScoreWeight(Double scoreWeight) {
        this.scoreWeight = scoreWeight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MatchSetting{");
        sb.append("id=").append(id);
        sb.append(", iosVersion='").append(iosVersion).append('\'');
        sb.append(", androidVersion='").append(androidVersion).append('\'');
        sb.append(", iosSwitch=").append(iosSwitch);
        sb.append(", androidSwitch=").append(androidSwitch);
        sb.append(", createTime=").append(createTime);
        sb.append(", eroticismTagMatchCount=").append(eroticismTagMatchCount);
        sb.append(", weight=").append(weight);
        sb.append(", consumeWeight=").append(consumeWeight);
        sb.append(", scoreWeight=").append(scoreWeight);
        sb.append('}');
        return sb.toString();
    }
}