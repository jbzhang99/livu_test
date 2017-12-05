package com.rcplatform.livechat.dto.request;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by yang peng on 2016/8/2.
 */

public class UserMatchDto implements Serializable {

    public UserMatchDto() {
    }


    public UserMatchDto(Integer userId, Integer type, Integer gender, Integer language, String version) {
        this.userId = userId;
        this.type = type;
        this.gender = gender;
        this.language = language;
        this.version = version;
    }

    /**
     * 用户id
     */

    @NotNull
    private Integer userId;

    /**
     * 切换类型
     */

    @NotNull
    private Integer type;

    /**
     * 筛选条件
     */

    @NotNull
    private Integer gender;


    /**
     * 语言id
     */
    private Integer language;


    /**
     * 版本号
     */
    private String version;


    /**
     * 平台类型
     */
    private Integer platform;


    public Integer getUserId() {
        return userId;
    }


    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }


    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserMatchDto{");
        sb.append("userId=").append(userId);
        sb.append(", type=").append(type);
        sb.append(", gender=").append(gender);
        sb.append(", language=").append(language);
        sb.append(", version='").append(version).append('\'');
        sb.append(", platform=").append(platform);
        sb.append('}');
        return sb.toString();
    }
}
