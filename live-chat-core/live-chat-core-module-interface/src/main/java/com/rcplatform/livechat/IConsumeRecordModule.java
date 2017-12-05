package com.rcplatform.livechat;

import com.rcplatform.videochat.model.StatisticsDay;

import java.util.Date;

/**
 * Created by admin on 2017/3/1.
 */
public interface IConsumeRecordModule {


    StatisticsDay getConsumeRecord(Date beginDate,Date endDate);
}
