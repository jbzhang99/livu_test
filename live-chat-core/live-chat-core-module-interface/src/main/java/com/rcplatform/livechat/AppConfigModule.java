package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.response.BaseInfoDto;
import com.rcplatform.livechat.enums.ConfigType;

import java.util.List;

/**
 * Created by admin on 2017/2/8.
 */
public interface AppConfigModule {



    BaseInfoDto getBaseInfo(List<ConfigType> types,String version,Integer appId,Integer platformType);
}
