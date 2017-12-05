package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.request.GreetRecordDto;
import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.videochat.model.UserPower;

import java.util.List;

/**
 * Created by Yang Peng on 2017/5/16.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public interface IUserPowerModule {


    /**
     * 更新用户的打招呼记录
     *
     * @param userId
     * @param messageUserId
     * @return 打招呼的用户id列表
     */
    GreetRecordDto updateUserPower(Integer userId, Integer messageUserId) throws BaseException;


    /**
     * 获取用户的打招呼记录
     *
     * @param userId
     * @return 打招呼的用户id列表
     */
    GreetRecordDto getUserPower(Integer userId);


    List<UserPower> getUserPower(Integer userId, Integer appId) throws BaseException;
}
