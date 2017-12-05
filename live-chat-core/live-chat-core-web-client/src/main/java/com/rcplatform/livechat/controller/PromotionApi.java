package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.request.PromotionDto;
import com.rcplatform.livechat.dto.response.BaseInfoDto;
import com.rcplatform.videochat.model.DynamicSticker;
import com.rcplatform.videochat.model.StickerType;
import com.rcplatform.videochat.model.VideoPlaySetting;
import com.rcplatform.videochat.model.VideoSetting;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * Created by
 */
public interface PromotionApi {

    String promotionUrl = "/api/{version}/promotions";

    String getVideoSettingUrl = "/api/{version}/videoSetting";

    String getVideoPlaySettingUrl = "/api/{version}/videoPlaySetting";

    @GET(promotionUrl)
    Call<List<PromotionDto>> getPromotions(@Path("version") String version,
                                          @Query("appId")Integer appId,
                                          @Query("languageId")Integer languageId);


    @GET(getVideoSettingUrl)
    Call<List<VideoSetting>> getVideoSetting(@Path("version") String version,@Query("appId")Integer appId);


    @GET(getVideoPlaySettingUrl)
    Call<List<VideoPlaySetting>> getVideoPlaySetting(@Path("version") String version, @Query("appId")Integer appId);
}
