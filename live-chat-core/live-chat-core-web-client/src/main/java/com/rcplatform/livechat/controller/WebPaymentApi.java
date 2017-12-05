package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.request.UserWebGoldDto;
import com.rcplatform.livechat.dto.response.UserRespDto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by Yang Peng on 2017/5/23.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public interface WebPaymentApi {


    @PUT("/api/{version}/web/users")
    Call<UserRespDto> webPayment(@Path("version") String version, @Body UserWebGoldDto userWebGoldDto);
}
