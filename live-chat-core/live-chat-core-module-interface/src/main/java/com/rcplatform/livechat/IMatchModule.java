package com.rcplatform.livechat;


import com.rcplatform.livechat.dto.request.UserMatchDto;
import com.rcplatform.livechat.dto.response.UserMatchedResp;
import com.rcplatform.livechat.exception.BaseException;

/**
 * Created by Yang Peng on 2016/11/3.
 *
 * @Description: 匹配业务
 */

public interface IMatchModule {

    /**
     * 匹配用户
     */
    UserMatchedResp match(UserMatchDto userMatchDto, Integer appId) throws Exception;


    /**
     * 退出
     */
    void exit(Integer userId, String version) throws BaseException;


    /**
     * 清理用户
     */
    void cleanUser();
}
