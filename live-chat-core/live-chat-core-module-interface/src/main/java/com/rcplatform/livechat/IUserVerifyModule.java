package com.rcplatform.livechat;

import com.rcplatform.livechat.bean.UserValidate;
import com.rcplatform.livechat.exception.BaseException;

/**
 * Created by admin on 2017/4/7.
 */
public interface IUserVerifyModule {



    UserValidate checkUser(Integer userId) throws BaseException;
}
