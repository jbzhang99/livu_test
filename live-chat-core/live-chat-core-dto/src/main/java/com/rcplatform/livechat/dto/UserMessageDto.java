package com.rcplatform.livechat.dto;

import java.io.Serializable;

/**
 * Created by Yang Peng on 2017/7/11.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public class UserMessageDto implements Serializable{

    public UserMessageDto() {
    }


    public UserMessageDto(Integer userId, Integer languageId, Integer type) {
        this.userId = userId;
        this.languageId = languageId;
        this.type = type;
    }

    public UserMessageDto(Integer userId, Integer languageId, Integer type, Object extra) {
        this.userId = userId;
        this.languageId = languageId;
        this.type = type;
        this.extra = extra;
    }

    /**
     * 用户id
     */
    private Integer userId;


    /**
     * 语言id
     */
    private Integer languageId;


    /**
     * 消息类型
     */
    private Integer type;


    /**
     * 附带消息
     */
    private Object extra;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserMessageDto{");
        sb.append("userId=").append(userId);
        sb.append(", languageId=").append(languageId);
        sb.append(", type=").append(type);
        sb.append(", extra=").append(extra);
        sb.append('}');
        return sb.toString();
    }
}
