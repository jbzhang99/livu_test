package com.rcplatform.livechat;

import com.rcplatform.livechat.exception.BaseException;

/**
 * Created by ruihuagong on 2017/10/23.
 */
public interface IEroticismFemaleModule {

	 /**
	 * 查询用户是否是色情圈用户
	 *
	 * @param userId
	 * @return
	 */
	boolean isFemaleCircleUser(Integer userId) throws BaseException;
}
