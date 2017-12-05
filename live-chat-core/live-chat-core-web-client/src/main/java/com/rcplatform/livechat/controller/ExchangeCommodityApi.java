package com.rcplatform.livechat.controller;

import com.rcplatform.videochat.model.ExchangeCommodity;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface ExchangeCommodityApi {

    String getExchangeCommodityUrl = "/api/{version}/exchangeCommodity";

    @GET(getExchangeCommodityUrl)
    Call<List<ExchangeCommodity>> getExchangeCommodity(@Path("version") String version);
}
