package com.rcplatform.livechat.dto.response.admin;

import com.rcplatform.videochat.model.NPush;

/**
 * Created by yaoyuan on 2017/6/27.
 */
public class NPushResp extends NPush {

    private Integer shouldPushNum;

    private Integer pushNum;

    public Integer getShouldPushNum() {
        return shouldPushNum;
    }

    public void setShouldPushNum(Integer shouldPushNum) {
        this.shouldPushNum = shouldPushNum;
    }

    public Integer getPushNum() {
        return pushNum;
    }

    public void setPushNum(Integer pushNum) {
        this.pushNum = pushNum;
    }
}
