package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.request.AppStoreSubDto;
import com.rcplatform.livechat.dto.request.GooglePayReqDto;
import com.rcplatform.livechat.dto.request.GooglePlaySubDto;
import com.rcplatform.livechat.dto.request.IosPayReqDto;
import com.rcplatform.livechat.dto.response.UserPayDto;
import com.rcplatform.videochat.model.UserVip;

/**
 * Created by admin on 2017/4/17.
 */
public interface IUserPaymentModule {


    /**
     * google 支付
     *
     * @param googlePayReqDto
     * @return
     */

    UserPayDto googlePay(GooglePayReqDto googlePayReqDto, Integer userId, String deviceId, Integer appId) throws Exception;


    /**
     * ios内购支付
     *
     * @param iosPayReqDto
     * @return
     */
    UserPayDto iosPay(IosPayReqDto iosPayReqDto, Integer userId, String deviceId, Integer appId, String version) throws Exception;


    /**
     * google play 订阅支付校验
     *
     * @param googlePlaySubDto
     * @param userId
     * @return
     */
    UserVip addGooglePlaySub(GooglePlaySubDto googlePlaySubDto, Integer userId);


    /**
     * app store 订阅支付校验
     *
     * @param appStoreSubDto
     * @param userId
     * @return
     */
    UserVip addAppStoreSubs(AppStoreSubDto appStoreSubDto, Integer userId);


}
