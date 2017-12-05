package com.rcplatform.livechat.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rcplatform.livechat.response.HttpData;
import com.rcplatform.livechat.util.DesUtil;
import com.rcplatform.livechat.util.MD5;
import com.rcplatform.livechat.util.RsaUtil;
import okhttp3.*;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by 药耀源 on 2017/4/13.
 */
public class Http {

//    public static Boolean ifProd = false;
//    private static OkHttpClient client;
//    private static Retrofit retrofit;
//    static String deviceId = "hellohellohellohello";
//    static String userId = "643";
//    static String nonce = "abc";
//    static String baseUrl = "http://localhost:8900";
////    static String baseUrl = "https://newlivechat.rcplatformhk.com";
//    static String accessToken = "2ff71ed8-343a-480e-b4e0-d16d1cbb9180";


//    public static Boolean ifProd = true;
//    private static OkHttpClient client;
//    private static Retrofit retrofit;
//    static String deviceId = "hellohellohellohello";
//    static String userId = "2664510";
//    static String nonce = "abc";
//    static String baseUrl = "https://newlivechat.rcplatformhk.com";
//    static String accessToken = "9270a62a-d8c8-48e2-8142-73d3170f44df";
//
//    public static Boolean ifProd = false;
//    private OkHttpClient client;
//    private Retrofit retrofit;
//    private String deviceId = "hellohellohellohello";
//    private String userId = "669";
//    private String nonce = "abc";
//    private String baseUrl = "http://localhost:8900";
//    private String accessToken = "797b6ef3-7740-4bd9-b3ab-9fdc90f768d5";

    private static  Logger logger = LoggerFactory.getLogger(Http.class);

    private OkHttpClient client;

    private Retrofit retrofit;

    private String baseUrl;

    private Boolean ifProd;

    private String deviceId;

    private String userId;

    private String nonce;


    private String accessToken;



    public Http(String baseUrl, Boolean ifProd, String deviceId, String userId, String nonce, String accessToken) {
        this.baseUrl = baseUrl;
        this.ifProd = ifProd;
        this.deviceId = deviceId;
        this.userId = userId;
        this.nonce = nonce;
        this.accessToken = accessToken;
    }



    private static String timestamp = String.valueOf(System.currentTimeMillis());


    class CommonParamInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request oldRequest = chain.request();
            if (accessToken==null) {
                Request request = chain.request();
                return chain.proceed(request);
            }
            String url = oldRequest.url().toString();
            int i = url.indexOf("?");
            if (i > 0)
                url = url.substring(0, i);

            // 添加新的参数
            HttpUrl.Builder authorizedUrlBuilder = oldRequest.url()
                    .newBuilder()
                    .scheme(oldRequest.url().scheme())
                    .host(oldRequest.url().host())
                    .addQueryParameter("timestamp", timestamp)
                    .addQueryParameter("deviceId", deviceId)
                    .addQueryParameter("nonce", nonce)
                    .addQueryParameter("userId", userId)
                    .addQueryParameter("sign", getSign(url));

            // 新的请求
            Request newRequest = oldRequest.newBuilder()
                    .method(oldRequest.method(), oldRequest.body())
                    .url(authorizedUrlBuilder.build())
                    .build();

            logger.info(this.getClass().getName() + "拦截器");
            Response response = chain.proceed(newRequest);
            BufferedSource bufferedSource = Okio.buffer(response.body().source());
            String tempStr = bufferedSource.readUtf8();
            bufferedSource.close();
            Response build = response
                    .newBuilder()
                    .body(ResponseBody.create(response.body().contentType(), tempStr))
                    .build();
            logger.info("返回的原始内容是" + tempStr);
            return build;
        }
    }

    class RsaInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            if (!ifProd) {
                Request request = chain.request();
                return chain.proceed(request);
            }
            Request request = chain.request();
            RequestBody requestBody = request.body();
            Request newRequest = null;
            if (requestBody != null) {
                try {
                    String data = "";
                    BufferedSink buffer = new Buffer();
                    requestBody.writeTo(buffer);
                    data = buffer.buffer().readUtf8();
                    buffer.close();
                    logger.info("请求参数" + data);
                    newRequest = request.newBuilder()
                            .method(request.method(), RequestBody.create(requestBody.contentType(), encryptJson(data)))
                            .build();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Response proceed = chain.proceed(newRequest == null ? request : newRequest);

            ResponseBody responseBody = proceed.body();

            BufferedSource bufferedSource = Okio.buffer(responseBody.source());
            String tempStr = bufferedSource.readUtf8();
            bufferedSource.close();
            Response build = null;
            try {
                logger.info("解密后的内容是" + decryptJson(tempStr));
                build = proceed
                        .newBuilder()
                        .body(ResponseBody.create(responseBody.contentType(), decryptJson(tempStr)))
                        .build();

            } catch (Exception e) {
                e.printStackTrace();
            }
            return build;
        }
    }


    public Retrofit getRetrofit() {
        if (retrofit == null) {
            synchronized (Http.class) {
                if (retrofit == null) {
                    client = new OkHttpClient
                            .Builder()
                            .addInterceptor(new CommonParamInterceptor())  //参数添加
                            .addInterceptor(new RsaInterceptor())
                            .connectTimeout(20, TimeUnit.SECONDS)
                            .readTimeout(20, TimeUnit.SECONDS)
                            .writeTimeout(20, TimeUnit.SECONDS)
                            .build();

                    // 获取retrofit的实例
                    retrofit = new Retrofit
                            .Builder()
                            .baseUrl(baseUrl)  //自己配置
                            .client(client)
                            .addConverterFactory(FastJsonConverterFactory.create())
                            .build();
                }
            }
        }
        return retrofit;
    }


    private String getSign(String url) {
        StringBuffer sb = new StringBuffer().append(url).append(accessToken).append(deviceId)
                .append(nonce).append(timestamp).append(userId);

        logger.info("MD5前" + sb.toString());
        logger.info("MD5后" + MD5.getMD5Code(sb.toString()));
        return MD5.getMD5Code(sb.toString());
    }

    private  String encryptJson(String obj) throws Exception {
        String random = RandomStringUtils.randomAlphanumeric(8);
        try {
            String key = RsaUtil.encryptRequest(random);
            String decrypt = DesUtil.encrypt(obj, random);
            logger.info("解密后的参数" + DesUtil.decrypt(decrypt, random));
            HttpData httpdata = new HttpData(key, decrypt);
            logger.info("加密后的内容是" + JSON.toJSONString(httpdata));
            return JSON.toJSONString(httpdata);
        } catch (Exception e) {
            throw new Exception("加密失败");
        }
    }

    private String decryptJson(String response) throws Exception {
        HttpData httpData = JSONObject.parseObject(response, HttpData.class);
        try {
            String key = RsaUtil.decryptResponse(httpData.getKey());
            String decrypt = DesUtil.decrypt(httpData.getData(), key);
            return decrypt;
        } catch (Exception e) {
            throw new Exception("解密失败");
        }
    }
}
