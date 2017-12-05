package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.response.UserRelationDto;
import com.rcplatform.livechat.response.Page;
import com.rcplatform.videochat.model.UserFriend;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface UserFriendApi {

    String getFriendListUrl = "/api/{version}/users/friends";

    String addFriendUrl = "/api/{version}/users/friends/{friendUserId}";

    @GET(getFriendListUrl)
    Call<Page<UserRelationDto>> getFriendList(@Path("version") String version,
                                              @Query("page") Integer page,
                                              @Query("size") Integer size,
                                              @Query("sort") String sort,
                                              @Query("direction") String direction);

    @POST(addFriendUrl)
    Call<UserFriend> addFriend(@Path("version") String version,
                               @Path("friendUserId") Integer friendUserId);
}
