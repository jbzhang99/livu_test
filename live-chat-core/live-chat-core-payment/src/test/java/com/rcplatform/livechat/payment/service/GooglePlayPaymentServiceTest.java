package com.rcplatform.livechat.payment.service;

import com.alibaba.fastjson.JSONObject;
import com.rcplatform.livechat.payment.bean.GooglePlayOauthResponse;
import com.rcplatform.livechat.payment.bean.GooglePlayProductResponse;
import com.rcplatform.livechat.payment.bean.ProductSignedData;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Yang Peng on 2017/5/11.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public class GooglePlayPaymentServiceTest {


    @Test
    public void getProduct() throws Exception {
        GooglePlayPaymentService googlePlayPaymentService = new GooglePlayPaymentService("https://www.googleapis.com/");
        String str = "{\"orderId\":\"GPA.3371-3001-8899-75439\",\"packageName\":\"com.videochat.livu\",\"productId\":\"coinspackage_300\",\"purchaseTime\":1501134799375,\"purchaseState\":0,\"developerPayload\":\"0fb54063-589f-4bd7-ab7b-b26d9f4078c2\",\"purchaseToken\":\"cfipobeeokbidikllnlpembe.AO-J1Oz1pGhr-W4EGdSPwzV3PsdHvc_40dXYKeAHuH0R1g40F_8hK8QnCFkNguz5qmOkjFM2rvoHWJ0RWC6TBP2aU_ZXZ1xmjofJTlYGsrhGh7jf4OBrS5RZxaMa3JJTEJ1GdQTH-2Is\"}";
        ProductSignedData ProductSignedData = JSONObject.parseObject(str, ProductSignedData.class);
        GooglePlayProductResponse response = googlePlayPaymentService.productVerify(ProductSignedData.getPackageName(), ProductSignedData.getProductId(), ProductSignedData.getPurchaseToken(), "ya29.GlyVBA74ln4LZtNMmwZO3C3wsJmCSi7h8PKzAgeftEOl_B8Vp8TpynDkRjqLzo29NWlFd9RnZF6WuByHrWAn5uJvLjYEfgUT7XI6hm6cJ4ffjDeoPbHGql_7tBas3g");
        System.out.println(response);
    }


    @Test
    public void getToken() throws IOException {
        GooglePlayPaymentService googlePlayPaymentService = new GooglePlayPaymentService("https://www.googleapis.com/");
        GooglePlayOauthResponse token = googlePlayPaymentService.getToken("4/7Xf9oWebg93aHCuFV0Vo68CeDgVWyq3VMW6C4SMaTvE#",
                "91054324669-7gipktnagt5ijivoe9u0u5t5dlhi8fpn.apps.googleusercontent.com", "hgEe_LqPJoXMDR9oeIEH7gAs",
                "https://livu-238f3.firebaseapp.com/__/auth/handler");
        System.out.println(token);
    }


    @Test
    public void freshToken() throws IOException {
        GooglePlayPaymentService googlePlayPaymentService = new GooglePlayPaymentService("https://www.googleapis.com/");
        GooglePlayOauthResponse response = googlePlayPaymentService.freshToken("91054324669-7gipktnagt5ijivoe9u0u5t5dlhi8fpn.apps.googleusercontent.com", "hgEe_LqPJoXMDR9oeIEH7gAs",
                "1/ilKU8vSj8rLYtt2YuIEM1nzkNcb9Q2dh4v0ugew0rEI");
        System.out.println(response);
    }


    @Test
    public void verfify() throws Exception {
        String signedData = "{\"orderId\":\"GPA.3389-7943-7158-95019\",\"packageName\":\"com.rcplatform.livechat\",\"productId\":\"special_offer_1\",\"purchaseTime\":1506585329815,\"purchaseState\":0,\"developerPayload\":\"1cc931d9-e0b8-456a-aaea-ee9ee09417c8\",\"purchaseToken\":\"cncdkmhemlfnfgoahhjgncee.AO-J1OwrFuoTXkGQ6e_xFnBl7IZqyeL8dbS2LmYhpx0QRCeHuixSMfqtxY1Q6w_51WJiKN9-pmeX9QB9PECJgxgM_stq3Ng8S63WsxqlTtYmjAM0DzwtXRJcsTiPLnGxGeTI-gf6W6pr\"}";
        String signature = "SazlU80NcWwTAZQ0OS2KOttsNaXiiqLBIzIIXDdiEg07Px9gmxRFvWcaNAdDw1nbNwg7xKJzDgYYuT0yrTZbc/ZN11jdybXC+wRWlinyLqemd3rszXMR86VAUDSLzpFG9w7saV2PoW81vbsgh3rbNMjq8PD3J+XuOIv3fN5sSLrO8cfLK+iLyRYRgQThvyvVRSb+YUqZfJzPlM3wtTNxkpJI2J/c9SbzvDGte4B8s3LHbzJImtQZld9jIuPN3S4prNMknRqc9a5B41oAcyBW0m0vkPY6GB0GfN9OpiUA89GGvypBa7WpA6/q1aKgMswQgsd4XfOu49A+FcMFgiaMsA==";
        ProductSignedData productSignedData = JSONObject.parseObject(signedData, ProductSignedData.class);
        GooglePlayPaymentService googlePlayPaymentService = new GooglePlayPaymentService("https://www.googleapis.com/");
        GooglePlayProductResponse googlePlayProductResponse = googlePlayPaymentService.productVerify(productSignedData.getPackageName(), productSignedData.getProductId(), productSignedData.getPurchaseToken(), "ya29.Gl3UBDagqQwZmRP1ulb22BJqLlFKug8h_402O5AF5cqnx77jH35FuF_ixZcmxVt1yA2dxMxwOniRWHsipP8EfBuu4qmqdpwxqNE7j3j7zUywOZIGs6sFZDMz42k74u8");
        System.out.println(googlePlayProductResponse);
    }
}