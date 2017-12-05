package com.rcplatform.livechat.dto;

import java.io.Serializable;

/**
 * Created by Yang Peng on 2017/7/18.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public class MessageDto implements Serializable{


    public MessageDto() {
    }

    public MessageDto(String content, Integer type, Object extra) {
        this.content = content;
        this.type = type;
        this.extra = extra;
    }

    /**
     * 消息内容
     */
    private String content;


    /**
     * 消息类型
     */
    private Integer type;


    /**
     * 其他数据
     */
    private Object extra;



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        final StringBuilder sb = new StringBuilder("MessageDto{");
        sb.append("content='").append(content).append('\'');
        sb.append(", type=").append(type);
        sb.append(", extra=").append(extra);
        sb.append('}');
        return sb.toString();
    }
}
