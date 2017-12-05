package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.request.MatchAddRecordReqDto;
import com.rcplatform.livechat.dto.request.UserMatchDto;
import com.rcplatform.livechat.dto.response.UserMatchedResp;
import com.rcplatform.livechat.response.Page;
import com.rcplatform.videochat.model.UserMatched;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface UserMatchedApi {

    String addMatchUrl = "/api/{version}/users/matches/records";//添加一条用户匹配记录

    String matchUserNewUrl = "/api/{version}/users/matches/randoms";//匹配用户一个用户

    String exitMatchUrl = "/api/{version}/users/matches";//用户退出匹配

    String getMatchListUrl = "/api/{version}/users/matches/records";//获取匹配记录列表

    String deleteMatchUrl = "/api/{version}/users/matches/records";//删除匹配记录


    @POST(addMatchUrl)
    Call<List<UserMatched>> addMatch(@Path("version") String version,
                                     @Body MatchAddRecordReqDto matchAddRecordReqDto);

    @GET(matchUserNewUrl)
    Call<UserMatchedResp> matchUserNew(@Path("version") String version,
                                       @Query("type") Integer type,
                                       @Query("gender") Integer gender);

    @DELETE(exitMatchUrl)
    Call<Integer> exitMatch(@Path("version") String version);

    @GET(getMatchListUrl)
    Call<Page<UserMatchDto>> getMatchList(@Path("version") String version,
                                          @Query("page") Integer page,
                                          @Query("size") Integer size,
                                          @Query("sort") String sort,
                                          @Query("direction") String direction,
                                          @Query("matchRecordId") Integer matchRecordId);

    @DELETE(deleteMatchUrl)
    Call<Integer> deleteMatch(@Path("version") String version);

}
