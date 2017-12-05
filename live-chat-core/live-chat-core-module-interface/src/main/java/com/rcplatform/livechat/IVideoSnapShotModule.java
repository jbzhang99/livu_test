package com.rcplatform.livechat;

import com.rcplatform.livechat.enums.ReportEroticismEnum;
import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.videochat.model.VideoSnapshots;

/**
 * Created by Yang Peng on 2017/8/2.
 *
 * @Description: 视频截图服务
 */
public interface IVideoSnapShotModule {


	/**
	 * 处理色情截图
	 *
	 * @param version        版本号
	 * @param videoSnapshots 截图
	 * @throws BaseException
	 */
	boolean handleViolations(String version, VideoSnapshots videoSnapshots, String matchId) throws BaseException;


	/**
	 * 处理性别不符截图
	 *
	 * @param person         人物判断
	 * @param version        版本
	 * @param videoSnapshots 截图信息
	 * @throws BaseException
	 */
	void handleGenderDiscrepancy(Integer person, String version, VideoSnapshots videoSnapshots) throws BaseException;


	/**
	 * 处理色情截图 - new
	 *
	 * @param version             版本号
	 * @param videoSnapshots      截图
	 * @param reportEroticismEnum 图谱返回结果
	 * @throws BaseException
	 */
	boolean handleViolations(String version, VideoSnapshots videoSnapshots, String matchId,
	                         ReportEroticismEnum reportEroticismEnum) throws BaseException;


	/**
	 * 处理性别 - new
	 *
	 * @param version
	 * @param videoSnapshots
	 * @param reportEroticismEnum
	 * @throws BaseException
	 */
	void handleGenderDiscrepancy(String version, VideoSnapshots videoSnapshots,
	                             ReportEroticismEnum reportEroticismEnum, String matchId) throws BaseException;


}
