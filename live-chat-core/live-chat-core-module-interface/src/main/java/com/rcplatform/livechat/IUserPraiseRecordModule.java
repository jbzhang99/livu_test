package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.request.UserPraiseDto;
import com.rcplatform.livechat.exception.BaseException;

public interface IUserPraiseRecordModule {


    Integer addUerPraise(UserPraiseDto userPraiseDto) throws BaseException;


    Integer getUserPraise(Integer userId);
}
