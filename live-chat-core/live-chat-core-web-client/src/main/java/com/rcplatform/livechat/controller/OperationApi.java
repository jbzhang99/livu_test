package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.response.OperationResp;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface OperationApi {

    String getOperationUrl = "/api/{version}/operations";

    @GET(getOperationUrl)
    Call<List<OperationResp>> getOperation(@Path("version") String version);
}
