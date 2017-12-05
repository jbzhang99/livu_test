package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.request.UserMatchPayReqDto;
import com.rcplatform.livechat.dto.response.UserConsumeResp;
import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.videochat.model.Consume;

import java.util.List;

/**
 * Created by admin on 2017/2/10.
 */
public interface IConsumeModule {


    /**
     * 支付
     *
     * @param userMatchPayReqDto
     * @return
     */

    UserConsumeResp consume(UserMatchPayReqDto userMatchPayReqDto, Integer userId, Integer appId) throws Exception;


    List<Consume> getConsumes(Integer userId, Integer appId) throws BaseException;
}
