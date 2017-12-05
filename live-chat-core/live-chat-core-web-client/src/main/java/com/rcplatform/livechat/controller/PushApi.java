package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.request.PushDto;
import com.rcplatform.livechat.dto.response.PushResp;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface PushApi {

    String sendPushUrl = "/api/{version}/pushes";

    @POST(sendPushUrl)
    Call<PushResp> sendPush(@Path("version") String version,
                            @Body PushDto pushDto);
}
