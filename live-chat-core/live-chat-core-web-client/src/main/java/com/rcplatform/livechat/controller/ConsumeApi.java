package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.request.UserMatchPayReqDto;
import com.rcplatform.livechat.dto.response.UserConsumeResp;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface ConsumeApi {

    String consumeUrl = "/api/{version}/users/commodities";

    @POST(consumeUrl)
    Call<UserConsumeResp> consume(@Path("version") String version,
                                  @Body UserMatchPayReqDto userMatchPayReqDto);
}
