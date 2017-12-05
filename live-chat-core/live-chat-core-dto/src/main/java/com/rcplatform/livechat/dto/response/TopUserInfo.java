package com.rcplatform.livechat.dto.response;

import com.rcplatform.videochat.model.User;

/**
 * Created by yaoyuan on 2017/6/13.
 */
public class TopUserInfo extends User {

    private Integer sendGoldNum;

    private Integer receiveStoneNum;

    public Integer getSendGoldNum() {
        return sendGoldNum;
    }

    public void setSendGoldNum(Integer sendGoldNum) {
        this.sendGoldNum = sendGoldNum;
    }

    public Integer getReceiveStoneNum() {
        return receiveStoneNum;
    }

    public void setReceiveStoneNum(Integer receiveStoneNum) {
        this.receiveStoneNum = receiveStoneNum;
    }
}
