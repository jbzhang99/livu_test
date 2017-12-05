package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.response.BaseInfoDto;
import com.rcplatform.videochat.model.DynamicSticker;
import com.rcplatform.videochat.model.StickerType;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface AppConfigApi {

    String appConfigUrl = "/api/{version}/configs";

    String dynamicStickerUrl = "/api/{version}/dynamicSticker";

    String dynamicStickersUrl = "/api/{version}/dynamicStickers";

    String dynamicStickerTypesUrl = "/api/{version}/dynamicStickerTypes";

    @GET(appConfigUrl)
    Call<BaseInfoDto> getAppConfig(@Path("version") String version,
                                   @Query("types") String types);

    @GET(dynamicStickerUrl)
    Call<List<DynamicSticker>> getDynamicSticker(@Path("version") String version);

    @GET(dynamicStickersUrl)
    Call<List<DynamicSticker>> getDynamicStickers(@Query("appId")Integer appId,
                                                  @Query("stickerType")Integer stickerType,
                                                  @Query("gender")Integer gender,
                                                  @Query("platform")Integer platform,
                                                  @Query("version")String version);

    @GET(dynamicStickerTypesUrl)
    Call<List<StickerType>> getDynamicStickerTypes(@Path("version") String version);
}
