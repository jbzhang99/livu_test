package com.rcplatform.livechat;

import com.rcplatform.videochat.model.UserPraiseRecord;

public interface IUserPraiseModule {


    void addUserPraise(UserPraiseRecord userPraiseRecord);


    boolean isPraise(Integer userId, Integer userPraiseId);
}
