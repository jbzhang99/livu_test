package com.rcplatform.livechat.controller;

import com.alibaba.fastjson.JSONObject;
import com.rcplatform.livechat.dto.request.*;
import com.rcplatform.livechat.dto.response.EvaluateResp;
import com.rcplatform.livechat.dto.response.UserRelationDto;
import com.rcplatform.livechat.dto.response.UserRespDto;
import com.rcplatform.livechat.response.Page;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Date;
import java.util.List;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface UserApi {

    String getUserListUrl = "/api/{version}/users";

    String updateUserLoginTokenUrl = "/api/{version}/users";

    String updateUserUrl = "/api/{version}/users";

    String usersUrl = "/api/{version}/users/actives";//获取活跃列表

    String checkEmailUrl = "/api/{version}/users/emails";//检查邮箱是否注册

    String updateUserLoginTokenEmailUrl = "/api/{version}/users/emails";//邮箱登录

    String addEmailUserUrl = "/api/{version}/users/emails";//邮箱注册

    String addEvaluateUrl = "/api/{version}/users/evaluates/{freeCommodityId}";

    String findPasswordUrl = "/api/{version}/users/forgets";

    String loadUserDiffUrl = "/api/{version}/users/load";//加载redis用户信息

    String updatePassword = "/api/{version}/users/passwords";

    String resetPasswordUrl = "/api/{version}/users/resetPassword";//网页端重置密码

    String updateUserStatusUrl = "/api/{version}/users/statuses";//用户退出

    String addThreePartyUserUrl = "/api/{version}/users/threeParties";//第三方登录

    String getUserUrl = "/api/{version}/users/{userId}";//获取用户个人信息

    String addThreePartyUserNew = "/api/{version}/users/3rdParties";

    String getActiveUsers = "/api/{version}/users/activeUsers";

    String getNewActiveUsers = "/api/{version}/users/activeNewUsers";

    String getTopUrl = "/api/{version}/users/top";

    @GET(getUserListUrl)
    Call<List<UserRelationDto>> getUserList(@Path("version") String version,
                                            @Query("friendUserIdList") List<Integer> friendUserIdList);

    @PATCH(updateUserLoginTokenUrl)
    Call<UserRespDto> updateUserLoginToken(@Path("version") String version,
                                           @Body UserAutoLoginDto userAutoLoginDto,
                                           @Header("Accept-Language") String language);

    @Multipart
    @PUT(updateUserUrl)
    Call<UserRespDto> updateUser(@Path("version") String version,
                                 @Query("data") String data,
                                 @Part MultipartBody.Part headImg,
                                 @Part MultipartBody.Part background);

    @GET(usersUrl)
    Call<Page<UserRelationDto>> users(@Path("version") String version,
                                      @Query("userId") Integer userId,
                                      @Query("page") Integer page,
                                      @Query("size") Integer size,
                                      @Query("gender") Integer gender);

    @GET(checkEmailUrl)
    Call<JSONObject> checkEmail(@Path("version") String version,
                                @Query("email") String email);

    @PATCH(updateUserLoginTokenEmailUrl)
    Call<UserRespDto> updateUserLoginTokenEmail(@Path("version") String version,
                                                @Body UserEmailLoginDto userEmailLoginDto,
                                                @Header("Accept-Language") String language);

    @Multipart
    @POST(addEmailUserUrl)
    Call<UserRespDto> addEmailUser(@Path("version") String version,
                                   @Query("data") String data,
                                   @Part MultipartBody.Part headImg,
                                   @Query("timeZone") Integer timeZone);

    @POST(addEvaluateUrl)
    Call<EvaluateResp> addEvaluate(@Path("version") String version,
                                   @Path("freeCommodityId") Integer freeCommodityId);

    @POST(findPasswordUrl)
    Call<Integer> findPassword(@Path("version") String version,
                               @Body UserEmailDto userEmailDto);


    @GET(loadUserDiffUrl)
    Call<Integer> loadUserDiff(@Path("version") String version,
                               @Query("beginDate") Date beginDate,
                               @Query("endDate") Date endDate);


    @PUT(updatePassword)
    Call<Integer> updatePassword(@Path("version") String version,
                                 @Body UserPasswordReqDto userPasswordReqDto);


    @POST(resetPasswordUrl)
    Call<Integer> resetPassword(@Path("version") String version,
                                @Body ResetPasswordReqDto resetPasswordReqDto);


    @PUT(updateUserStatusUrl)
    Call<Integer> updateUserStatus(@Path("version") String version);


    @POST(addThreePartyUserUrl)
    Call<UserRespDto> addThreePartyUser(@Path("version") String version,
                                        @Body UserThreePartyLoginDto userThreePartyLoginDto,
                                        @Header("Accept-Language") String language);

    @Multipart
    @POST("/api/{version}/users/3rdParties")
    Call<UserRespDto> addThreePartyUserNew(@Path("version") String version, @Part MultipartBody.Part file, @Part("data") RequestBody userThreePartyLoginDto);


    @GET(getUserUrl)
    Call<UserRespDto> getUser(@Path("version") String version,
                              @Path("userId") String userId);


    @POST
    Call<Object> deleteImage(@Url String url, @Body DelImageDto delImageDto);

    @POST(getActiveUsers)
    Call<Page<UserRelationDto>> getActiveUsers(@Path("version") String version,
                                               @Body ActiveUserDto activeUserDto);

    @POST(getNewActiveUsers)
    Call<Page<UserRelationDto>> getNewActiveUsers(@Path("version") String version,
                                                  @Body ActiveUserDto activeUserDto);


    @GET("/api/{version}/users/friends/relations")
    Call<String> getRelation(@Path("version")String version, @Query("userId") Integer userId,@Query("friendUserId")Integer friendUserId);


}
