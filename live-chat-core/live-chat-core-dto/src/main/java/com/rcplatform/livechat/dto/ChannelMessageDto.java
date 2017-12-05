package com.rcplatform.livechat.dto;

import java.io.Serializable;

/**
 * Created by Yang Peng on 2017/7/11.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public class ChannelMessageDto implements Serializable {


    public ChannelMessageDto() {
    }

    public ChannelMessageDto(String channelName, String content, Integer type, Integer messageId) {
        this.channelName = channelName;
        this.content = content;
        this.type = type;
        this.messageId = messageId;
    }

    private Integer messageId;

    /**
     * 频道名称
     */
    private String channelName;

    /**
     * 消息内容
     */
    private String content;

    private Integer type;


    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

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

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ChannelMessageDto{");
        sb.append("messageId=").append(messageId);
        sb.append(", channelName='").append(channelName).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
