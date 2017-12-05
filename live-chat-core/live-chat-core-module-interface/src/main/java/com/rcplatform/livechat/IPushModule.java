package com.rcplatform.livechat;


import com.rcplatform.livechat.dto.request.PushDto;
import com.rcplatform.livechat.dto.response.PushResp;

/**
 * Created by admin on 2016/12/7.
 */


public interface IPushModule {


    PushResp sendPush(Integer appId, PushDto pushDto) throws Exception;


    void sendUnBlockPush() throws Exception;

}
