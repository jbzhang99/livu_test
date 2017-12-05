package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.request.ExchangeOrderDto;
import com.rcplatform.livechat.response.Page;
import com.rcplatform.videochat.model.ExchangeOrder;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface ExchangeOrderApi {

    String getExchangeOrderPageUrl = "/api/{version}/exchangeOrder";

    String addExchangeOrderUrl = "/api/{version}/exchangeOrder";

    @GET(getExchangeOrderPageUrl)
    Call<Page<ExchangeOrder>> getExchangeOrderPage(@Path("version") String version,
                                                   @Query("page") Integer page,
                                                   @Query("size") Integer size,
                                                   @Query("sort") String sort,
                                                   @Query("direction") String direction);

    @POST(addExchangeOrderUrl)
    Call<ExchangeOrder> addExchangeOrder(@Path("version") String version,
                                         @Body ExchangeOrderDto exchangeOrderDto);
}
