package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.request.UserGiftDto;
import com.rcplatform.livechat.dto.response.UserGiftCountResp;
import com.rcplatform.livechat.dto.response.UserGiftResp;
import com.rcplatform.livechat.dto.response.UserGiftSumResp;
import com.rcplatform.livechat.response.Page;
import com.rcplatform.videochat.model.UserGift;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface UserGiftApi {

    String addUserGiftUrl = "/api/{version}/users/gifts";//向某个用户发出一个礼物

    String getUserGiftPageUrl = "/api/{version}/users/gifts/{userId}";//获取用户收到的礼物列表

    String getUserGiftCountUrl = "/api/{version}/users/gifts/max/{receiveUserId}";//获取一个用户收到的礼物总数和钻石数最高的五件

    String getUserGiftSumPageUrl = "/api/{version}/users/gifts/stones/{userId}";//获取用户收到的礼物的钻石汇总（客态）

    String getUserGiftDetailUrl = "/api/{version}/users/gifts/stones/details";//获取用户收到的礼物的钻石汇总(主态，包含明细）

    @POST(addUserGiftUrl)
    Call<UserGift> addUserGift(@Path("version") String version,
                               @Body UserGiftDto userGiftDto);

    @GET(getUserGiftPageUrl)
    Call<Page<UserGiftResp>> getUserGiftPage(@Path("version") String version,
                                             @Path("userId") Integer userId,
                                             @Query("page") Integer page,
                                             @Query("size") Integer size,
                                             @Query("sort") String sort,
                                             @Query("direction") String direction);

    @GET(getUserGiftCountUrl)
    Call<UserGiftCountResp> getUserGiftCount(@Path("version") String version,
                                             @Path("receiveUserId") Integer receiveUserId);

    @GET(getUserGiftSumPageUrl)
    Call<Page<UserGiftSumResp>> getUserGiftSumPage(@Path("version") String version,
                                                   @Path("userId") int userId,
                                                   @Query("page") Integer page,
                                                   @Query("size") Integer size);

    @GET(getUserGiftDetailUrl)
    Call<Page<UserGiftSumResp>> getUserGiftDetail(@Path("version") String version,
                                                  @Query("page") Integer page,
                                                  @Query("size") Integer size);
}
