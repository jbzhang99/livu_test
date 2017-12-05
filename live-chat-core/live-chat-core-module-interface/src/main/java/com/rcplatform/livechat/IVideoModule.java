package com.rcplatform.livechat;


import com.alibaba.fastjson.JSONObject;
import com.rcplatform.livechat.dto.request.UserMatchLeaveReqDto;
import com.rcplatform.livechat.dto.response.MatchPopupSignDto;
import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.videochat.model.VideoRecord;

/**
 * Created by yang peng on 2016/8/3.
 */

public interface IVideoModule {



	/**
	 * 添加视频并返回色情标识
	 *
	 * @param userMatchLeaveReqDto
	 * @param userId
	 * @param appId
	 * @return
	 * @throws BaseException
	 */
	MatchPopupSignDto addVideoRecordAndBackSQSign(UserMatchLeaveReqDto userMatchLeaveReqDto,
	                                              Integer userId, Integer appId, String matchId) throws BaseException;


}
