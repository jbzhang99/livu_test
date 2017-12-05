package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.request.PromotionDto;
import com.rcplatform.videochat.model.VideoSetting;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * Created by
 */
public interface VideoSettingApi {

    String getVideoSettingUrl = "/api/{version}/videoSetting";

    @GET(getVideoSettingUrl)
    Call<List<VideoSetting>> getVideoSetting(@Path("version") String version);
}
