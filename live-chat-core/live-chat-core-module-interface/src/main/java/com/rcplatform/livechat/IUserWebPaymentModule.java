package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.request.UserWebGoldDto;
import com.rcplatform.livechat.dto.response.UserRespDto;
import com.rcplatform.livechat.exception.BaseException;


/**
 * Created by Yang Peng on 2017/5/22.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public interface IUserWebPaymentModule {


    UserRespDto getUser(String userAccount) throws BaseException;




    UserRespDto updateUserGold(UserWebGoldDto userWebGoldDto) throws BaseException;
}
