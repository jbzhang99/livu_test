package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.request.PraiseChangeRecordDto;
import com.rcplatform.livechat.dto.response.UserPraiseDto;
import com.rcplatform.videochat.model.PraiseChangeRecord;
import com.rcplatform.videochat.model.PraiseGift;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by fj on 2017/11/9.
 */
public interface PraiseGiftApi {

    String getPraiseGiftUrl = "/api/{version}/praiseGift";

    String getUserPraiseUrl = "/api/{version}/getUserPraise";

    String ddPraiseChangeRecordUrl = "/api/{version}/addExchangePraiseRecord";

    @GET(getPraiseGiftUrl)
    Call<List<PraiseGift>> getPraiseGift(@Path("version") String version,@Query("countryId")Integer countryId);

    @GET(getUserPraiseUrl)
    Call<UserPraiseDto> getUserPraise(@Path("version") String version,@Query("userId")Integer userId);

    @POST(ddPraiseChangeRecordUrl)
    Call<UserPraiseDto> addPraiseChangeRecord(@Path("version") String version,
                                         @Body PraiseChangeRecordDto praiseChangeRecordDto
                                        );
}
