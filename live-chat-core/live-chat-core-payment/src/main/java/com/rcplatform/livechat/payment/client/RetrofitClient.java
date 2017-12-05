package com.rcplatform.livechat.payment.client;

import com.rcplatform.livechat.payment.converter.FastJsonConverterFactory;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yang Peng on 2017/5/10.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public class RetrofitClient {


    private String baseUrl;


    public RetrofitClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Retrofit getRetrofit() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .build();
        return  new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(FastJsonConverterFactory.create())
                .build();
    }



}
