package com.rcplatform.livechat;

import com.rcplatform.livechat.response.Page;
import com.rcplatform.videochat.model.Activity;

/**
 * Created by fj on 2017/5/9.
 */
public interface IVideoActivityModule {

    Page<Activity> getActivityByType(Integer pageNo, Integer pageSize, Integer type);

}
