package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.dto.request.ReportReqDto;
import com.rcplatform.videochat.model.Report;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public interface UserReportApi {

    String addReportUrl = "/api/{version}/users/reports";

    @POST(addReportUrl)
    Call<Report> addReport(@Path("version") String version,
                           @Body ReportReqDto reportReqDto);



    @Multipart
    @POST("/api/{version}/users/reports/images")
    Call<String> addReportImage(@Path("version")String version,
                                @Part MultipartBody.Part file,
                                @Query("userId") Integer userId,
                                @Part("data") RequestBody reportReqDto);
}
