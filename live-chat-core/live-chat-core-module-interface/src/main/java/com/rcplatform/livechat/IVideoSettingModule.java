package com.rcplatform.livechat;

import com.rcplatform.videochat.model.VideoSetting;

import java.util.List;

/**
 * Created by fj on 2017/8/28.
 */
public interface IVideoSettingModule {

    List<VideoSetting> getVideoSetting(Integer appId);

}
