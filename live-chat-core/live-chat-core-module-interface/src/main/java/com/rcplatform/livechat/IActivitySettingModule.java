package com.rcplatform.livechat;

import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.videochat.model.ActivitySetting;

import java.util.List;

public interface IActivitySettingModule {


    List<ActivitySetting> getActivitySetting(String version, Integer userId) throws BaseException;
}
