package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.request.AddGoldRecordReqDto;
import com.rcplatform.livechat.dto.response.AddGoldResp;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface AdSwitchApi {



    String addGoldUrl = "/api/{version}/addGold";

    @POST(addGoldUrl)
    Call<AddGoldResp> addGold(@Path("version") String version,
                              @Query("timeZone") Integer timeZone,
                              @Body AddGoldRecordReqDto addGoldRecordReqDto);
}
