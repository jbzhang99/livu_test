package com.rcplatform.livechat;


import com.rcplatform.livechat.dto.response.AddGoldResp;
import com.rcplatform.livechat.exception.BaseException;

/**
 * Created by 药耀源 on 2017/3/22.
 */
public interface IAdSwitchModule {




    AddGoldResp addGold(Integer userId, String version, Integer platform, Integer timeZone, Integer appId) throws BaseException;
}
