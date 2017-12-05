package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_eroticism_block_day_setting")
@ApiModel
public class EroticismBlockDaySetting implements Serializable {

    public EroticismBlockDaySetting() {
    }

    public EroticismBlockDaySetting(Integer appId, Integer eroticismCount, Integer blockTime,
                                    Integer gender, Integer userLevelId) {
        this.appId = appId;
        this.eroticismCount = eroticismCount;
        this.blockTime = blockTime;
        this.gender = gender;
        this.userLevelId = userLevelId;
    }

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
     * one user eroticism every day
     */
    @Column(name = "eroticism_count")
    @ApiModelProperty(value="one user eroticism every day")
    private Integer eroticismCount;

    /**
     * user block time , minute unit
     */
    @Column(name = "block_time")
    @ApiModelProperty(value="user block time , minute unit")
    private Integer blockTime;

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

    @Transient
    private String userLevelName;

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
     * 获取one user eroticism every day
     *
     * @return eroticism_count - one user eroticism every day
     */
    public Integer getEroticismCount() {
        return eroticismCount;
    }

    /**
     * 设置one user eroticism every day
     *
     * @param eroticismCount one user eroticism every day
     */
    public void setEroticismCount(Integer eroticismCount) {
        this.eroticismCount = eroticismCount;
    }

    /**
     * 获取user block time , minute unit
     *
     * @return block_time - user block time , minute unit
     */
    public Integer getBlockTime() {
        return blockTime;
    }

    /**
     * 设置user block time , minute unit
     *
     * @param blockTime user block time , minute unit
     */
    public void setBlockTime(Integer blockTime) {
        this.blockTime = blockTime;
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

    public String getUserLevelName() {
        return userLevelName;
    }

    public void setUserLevelName(String userLevelName) {
        this.userLevelName = userLevelName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EroticismBlockDaySetting{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", eroticismCount=").append(eroticismCount);
        sb.append(", blockTime=").append(blockTime);
        sb.append(", source=").append(source);
        sb.append(", gender=").append(gender);
        sb.append(", userLevelId=").append(userLevelId);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}