package com.rcplatform.livechat.tupuapi;


import com.alibaba.fastjson.JSONObject;

import java.security.PrivateKey;
import java.util.List;

/**
 * Created by admin on 2017/2/17.
 */
public class Api {

    private String secretId;
    private String url;
    private PrivateKey privateKey;

    public Api(String secretId, String pkPath, String requestUrl) {
        if(requestUrl == null) {
            requestUrl = "http://api.open.tuputech.com/v3/recognition/";
        }

        this.secretId = secretId;
        this.url = requestUrl + secretId;
        this.privateKey =SignatureAndVerifyUtil.readPrivateKey(pkPath);
    }

    public JSONObject doApiTest(String fileType, List<String> fileLists, String... tags) {
        if(fileLists != null && !fileLists.isEmpty()) {
            String timestamp = String.valueOf(Math.round((double)System.currentTimeMillis() / 1000.0D));
            String nonce = String.valueOf(Math.random());
            String sign_string = this.secretId + "," + timestamp + "," + nonce;
            String signature =SignatureAndVerifyUtil.Signature(this.privateKey, sign_string);
            String result = null;
            long startTime = System.currentTimeMillis();
            long endTime = 0L;
            float time = 0.0F;

            try {
                if(fileType == "image") {
                    result = HttpConnectionUtil.uploadImage(this.url, this.secretId, timestamp, nonce, signature, fileLists, tags);
                } else if(fileType == "url") {
                    result = HttpConnectionUtil.uploadUri(this.url, timestamp, nonce, signature, fileLists, tags);
                }

                if(result != null && !result.equals("err")) {
                    if(result.equals(new String(result.getBytes("iso8859-1"), "iso8859-1"))) {
                        result = new String(result.getBytes("iso8859-1"), "utf-8");
                    }
                    JSONObject jsonObject = JSONObject.parseObject(result);
                    String result_json = jsonObject.getString("json");
                    String result_signature = jsonObject.getString("signature");
                    boolean verify = SignatureAndVerifyUtil.Verify(result_signature, result_json);
                    endTime = System.currentTimeMillis();
                    time = (float)(endTime - startTime) / 1000.0F;
                    if(verify) {
                        System.out.println("TUPU API: response verify succeed, total time" + time + "s");
                        return JSONObject.parseObject(result_json);
                    } else {
                        System.out.println("TUPU API: response verify failed, total time" + time + "s");
                        return ErrorUtil.getErrorMsg(102, "");
                    }
                } else {
                    System.out.println("TUPU API: response verify failed, total time" + time + "s");
                    return ErrorUtil.getErrorMsg(103, "");
                }
            } catch (Exception var18) {
                System.out.println("TUPU API: response verify failed, total time" + time + "s");
                return ErrorUtil.getErrorMsg(103, var18.getMessage());
            }
        } else {
            return ErrorUtil.getErrorMsg(3, "");
        }
    }
}
