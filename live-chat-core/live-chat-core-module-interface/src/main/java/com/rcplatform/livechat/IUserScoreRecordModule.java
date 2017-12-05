package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.request.UserScoreRecordDto;
import com.rcplatform.livechat.exception.BaseException;

/**
 * Created by Yang Peng on 2017/7/4.
 *
 * @Description: 视频后用户得分服务层
 */
public interface IUserScoreRecordModule {



    void addUserScoreRecord(UserScoreRecordDto userScoreRecordDto,Integer userId) throws BaseException;

}
