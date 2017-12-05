package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.request.ReportReqDto;
import com.rcplatform.livechat.enums.PopupReportEnum;
import com.rcplatform.livechat.exception.BaseException;

/**
 * Created by admin on 2017/2/10.
 */
public interface IUserReportModule {


	/**
	 * 举报用户
	 *
	 * @param reportReqDto
	 * @return
	 */
	void addReport(ReportReqDto reportReqDto, Integer userId, String version) throws Exception;

	/**
	 * 处理popup举报
	 *
	 * @param userId          举报用户的编号
	 * @param reportUserId    被举报用户的编号
	 * @param popupReportEnum 举报类型
	 * @param appId
	 * @param matchId
	 * @param version
	 */
	void dealPopupReport(Integer userId, Integer reportUserId, PopupReportEnum popupReportEnum, Integer appId, String matchId,
	                     String version) throws BaseException;
}
