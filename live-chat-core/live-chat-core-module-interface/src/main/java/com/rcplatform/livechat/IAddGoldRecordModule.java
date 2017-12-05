package com.rcplatform.livechat;

import com.rcplatform.videochat.model.AddGoldRecord;

/**
 * Created by 药耀源 on 2017/5/4.
 */
public interface IAddGoldRecordModule {
    /**
     * 获取用户看广告次数
     * @param userId
     * @return
     */
    Integer getUserSurfAdsCount(Integer userId);

    Integer saveAddGoldRecord(AddGoldRecord addGoldRecord);
}
