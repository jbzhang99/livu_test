package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.response.UserRelationDto;
import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.videochat.model.Blacklist;
import com.rcplatform.livechat.response.Page;
import org.springframework.data.domain.Sort;

/**
 *
 * Created by yang peng on 2016/8/5.
 */

public interface IBlacklistModule {



    /**
     * 加入黑名单
     * @return
     */
    Blacklist addBlackList(Integer blacklistUserId, Integer userId) throws BaseException;

    /**
     * 获取黑名单列表
     * @return
     */

    Page<UserRelationDto> getList(Integer userId, Integer page, Integer size, String sort, Sort.Direction direction) throws BaseException;


    /**
     * 将用户从黑名单中移除
     * @return
     */
    void remove(Integer userId,Integer friendUserId) throws BaseException;

}
