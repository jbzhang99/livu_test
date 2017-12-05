package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.response.UserRelationDto;
import com.rcplatform.livechat.response.Page;
import com.rcplatform.videochat.model.Blacklist;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface BlackListApi {

    String blacklistsUrl = "/api/{version}/blacklists";
    String putUserToBlacklistUrl = "/api/{version}/blacklists/{blacklistUserId}";
    String removeUserFromBlacklistUrl = "/api/{version}/blacklists/{friendUserId}";

    @GET(blacklistsUrl)
    Call<Page<UserRelationDto>> getList(@Path("version") String version,
                                        @Query("page") Integer page,
                                        @Query("size") Integer size,
                                        @Query("sort") String sort,
                                        @Query("direction") String direction);


    @POST(putUserToBlacklistUrl)
    Call<Blacklist> addBlackList(@Path("version") String version,
                                 @Path("blacklistUserId") Integer blacklistUserId);

    @DELETE(removeUserFromBlacklistUrl)
    Call<Integer> remove(@Path("version") String version,
                         @Path("friendUserId") int friendUserId);
}
