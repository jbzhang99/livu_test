package com.rcplatform.livechat;


import com.rcplatform.livechat.dto.response.UserRelationDto;
import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.livechat.response.Page;
import com.rcplatform.videochat.model.UserFriend;

/**
 * Created by yang peng on 2016/8/5.
 */

public interface IUserFriendModule {


    /**
     * 获取朋友列表
     *
     * @return
     */
    Page<UserRelationDto> getFriendList(Integer userId, Integer page, Integer size) throws BaseException;


    /**
     * 添加朋友
     *
     * @return
     */

    UserFriend addFriend(Integer userId, Integer friendUserId, Integer appId) throws BaseException;


    Integer getUserRelation(Integer userId, Integer friendUserId);

}
