package com.rcplatform.livechat.push;

/**
 * Created by admin on 2016/12/13.
 */
public class PushMessage {

    public PushMessage() {
    }

    public PushMessage(Integer type, String content) {
        this.type = type;
        this.content = content;
    }

    public PushMessage(Integer type, String content, Integer pushId) {
        this.type = type;
        this.content = content;
        this.pushId = pushId;
    }

    private Integer type;


    private String content;

    private Integer pushId;


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Integer getPushId() {
        return pushId;
    }

    public void setPushId(Integer pushId) {
        this.pushId = pushId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PushMessage{");
        sb.append("type=").append(type);
        sb.append(", content='").append(content).append('\'');
        sb.append(", pushId=").append(pushId);
        sb.append('}');
        return sb.toString();
    }
}
