package com.rcplatform.livechat;

import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.videochat.model.OfficialHelperMessage;

import java.util.List;

/**
 * Created by yaoyuan on 2017/8/14.
 */
public interface IOfficialHelperMessageModule {

    List<Integer> getRecentMessageIds(Integer countryId, Integer userId) throws BaseException;

    List<OfficialHelperMessage> getOfficialHelperMessageByIds(List<Integer> ids);
}
