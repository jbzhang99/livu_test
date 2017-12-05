package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.request.GooglePayReqDto;
import com.rcplatform.livechat.dto.request.IosPayReqDto;
import com.rcplatform.livechat.dto.response.CommodityDto;
import com.rcplatform.livechat.dto.response.UserPayDto;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface CommodityApi {

    String getCommoditiesUrl = "/api/{version}/commodities";
    String googlePayUrl = "/api/{version}/commodities/google";
    String iosPayUrl = "/api/{version}/commodities/ios";

    @GET(getCommoditiesUrl)
    Call<List<CommodityDto>> getCommodities(@Path("version") String version,
                                            @Query("appId") Integer appId);

    @POST(googlePayUrl)
    Call<UserPayDto> googlePay(@Path("version") String version,
                               @Body GooglePayReqDto googlePayReqDto);

    @POST(iosPayUrl)
    Call<UserPayDto> iosPay(@Path("version") String version,
                            @Body IosPayReqDto iosPayReqDto);
}
