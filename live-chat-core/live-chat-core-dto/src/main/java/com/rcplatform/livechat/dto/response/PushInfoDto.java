package com.rcplatform.livechat.dto.response;


import com.rcplatform.videochat.model.PushInfo;

/**
 * Created by admin on 2017/1/11.
 */

public class PushInfoDto extends PushInfo {



    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
