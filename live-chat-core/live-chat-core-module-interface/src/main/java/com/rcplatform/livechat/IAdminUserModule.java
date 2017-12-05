package com.rcplatform.livechat;

import com.rcplatform.videochat.model.UserStatistics;

import java.util.Date;

/**
 * Created by admin on 2017/2/27.
 */
public interface IAdminUserModule {


    public UserStatistics getUserStatistics(Date beiinTime, Date endTime);
}
