package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.response.UserRespDto;
import com.rcplatform.livechat.enums.CheckPersonEnum;
import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.videochat.model.DeleteImage;
import com.rcplatform.videochat.model.User;

/**
 * Created by Yang Peng on 2017/7/26.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public interface IUserHeadImgBackgroundModule {


    /**
     * 删除用户的图片
     *
     * @param deleteImage 图片删除对象
     */
    void deleteUserImage(UserRespDto userRespDto, DeleteImage deleteImage, String headImg, String background, String version) throws BaseException;


    void checkPerson(CheckPersonEnum checkPersonEnum, Integer userId, Integer gender, String headImg, String background) throws BaseException;



    User getUserHeadImgBackground(Integer userId) throws BaseException;



}
