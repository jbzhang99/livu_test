package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.request.UserGiftDto;
import com.rcplatform.livechat.dto.response.UserGiftCountResp;
import com.rcplatform.livechat.dto.response.UserGiftResp;
import com.rcplatform.livechat.dto.response.UserGiftSumResp;
import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.videochat.model.UserGift;
import com.rcplatform.livechat.response.Page;
import org.springframework.data.domain.Sort;

/**
 * Created by Yang Peng on 2017/2/13.
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */

public interface IUserGiftModule {


    /**
     * 发送一个礼物
     * @param userId
     * @param userGiftDto
     * @return
     * @throws BaseException
     */
    UserGift addUserGift(Integer userId, UserGiftDto userGiftDto) throws BaseException;


    /**
     * 发送一个礼物并成为好友
     * @param userId
     * @param userGiftDto
     * @return
     * @throws BaseException
     */
    UserGift addUserGiftAndFriend(Integer userId,UserGiftDto userGiftDto) throws  BaseException;


    Page<UserGiftResp> getUserGiftPage(Integer userId, Integer page, Integer size, String sort, Sort.Direction direction);



    Page<UserGiftSumResp> getUserGiftSumPage(Integer userId,Integer page,Integer size);


    Page<UserGiftSumResp> getUserGiftDetail(Integer userId,Integer page,Integer size);



    UserGiftCountResp getUserGiftCount(Integer receiveUserId);
}
