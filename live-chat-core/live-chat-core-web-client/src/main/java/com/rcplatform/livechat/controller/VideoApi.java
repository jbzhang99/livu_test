package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.request.UserMatchLeaveReqDto;
import com.rcplatform.videochat.model.VideoRecord;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface VideoApi {

    String addVideoRecordUrl = "/api/{version}/users/videos";


    @POST(addVideoRecordUrl)
    Call<VideoRecord> addVideoRecord(@Path("version") String version,
                                     @Body UserMatchLeaveReqDto userMatchLeaveReqDto);
}
