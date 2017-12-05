package com.rcplatform.videochat.model;

import com.rcplatform.livechat.enums.SwitchEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_eroticism_block_setting")
@ApiModel
public class EroticismBlockSetting implements Serializable {

    public EroticismBlockSetting() {
    }


    public EroticismBlockSetting(Integer appId, Integer increaseGold, SwitchEnum roleSwitch,
                                 Integer gender, Integer userLevelId) {
        this.appId = appId;
        this.increaseGold = increaseGold;
        this.roleSwitch = roleSwitch;
        this.gender = gender;
        this.userLevelId = userLevelId;
    }

    /**
     * id
     */
    @Id
    @ApiModelProperty(value = "id")
    private Integer id;

    /**
     * app id
     */
    @Column(name = "app_id")
    @ApiModelProperty(value = "app id")
    private Integer appId;

    /**
     * the block increase gold
     */
    @Column(name = "increase_gold")
    @ApiModelProperty(value = "the block increase gold")
    private Integer increaseGold;


    @Column(name = "day_unlock_count")
    private Integer dayUnlockCount;

    /**
     * the role switch
     */
    @Column(name = "role_switch")
    @ApiModelProperty(value = "the role switch")
    private SwitchEnum roleSwitch;

    /**
     * the source 0 video 1 video report 2 match report 3 head image
     */
    @ApiModelProperty(value = "the source 0 video 1 video report 2 match report 3 head image")
    private Integer source;


    @Column(name = "gender")
    @ApiModelProperty(value = "gender")
    private Integer gender;


    @Column(name = "user_level_id")
    @ApiModelProperty(value = "the user level id")
    private Integer userLevelId;

    @Transient
    private String userLevelName;
    /**
     * create time
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "create time")
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


    public Integer getIncreaseGold() {
        return increaseGold;
    }

    public void setIncreaseGold(Integer increaseGold) {
        this.increaseGold = increaseGold;
    }


    public SwitchEnum getRoleSwitch() {
        return roleSwitch;
    }

    public void setRoleSwitch(SwitchEnum roleSwitch) {
        this.roleSwitch = roleSwitch;
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


    public Integer getDayUnlockCount() {
        return dayUnlockCount;
    }

    public void setDayUnlockCount(Integer dayUnlockCount) {
        this.dayUnlockCount = dayUnlockCount;
    }

    public String getUserLevelName() {
        return userLevelName;
    }

    public void setUserLevelName(String userLevelName) {
        this.userLevelName = userLevelName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EroticismBlockSetting{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", increaseGold=").append(increaseGold);
        sb.append(", dayUnlockCount=").append(dayUnlockCount);
        sb.append(", roleSwitch=").append(roleSwitch);
        sb.append(", source=").append(source);
        sb.append(", gender=").append(gender);
        sb.append(", userLevelId=").append(userLevelId);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}