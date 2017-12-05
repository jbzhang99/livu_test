package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.response.UserImageResp;
import com.rcplatform.livechat.dto.response.UserImageSonResp;
import com.rcplatform.videochat.model.DeleteImage;
import com.rcplatform.videochat.model.UserImage;

import java.util.List;

/**
 * Created by Yang Peng on 2017/5/3.
 *
 * @Description: 用户相册服务
 */
public interface IUserImageModule {


    /**
     * 添加或修改用户相册
     * @param addUserImages 添加相册列表
     * @param updateUserImages 更新相册列表
     * @param userId 用户id
     * @param headImgUrl 用户头像
     * @param backgroundUrl 用户背景
     * @return 用户相册信息 附加性别和老图片地址，用于删除
     */
    UserImageSonResp addUpdateUserImages(List<UserImage> addUserImages, List<UserImage> updateUserImages,
                                         List<UserImage> oldUrlUpdateUserImages, Integer userId,
                                         String headImgUrl, String backgroundUrl,List<Integer> deleteImageIds);


    /**
     * 获取用户相册
     * @param userId 用户id
     * @return 用户相册信息
     */
    UserImageResp getUserImages(Integer userId);


    /**
     * 删除用户相册
     * @param userImageIds 用户相册id
     */
    void deleteUserImages(List<Integer> userImageIds);


    /**
     * 删除用户相册，并将符合要求的图片换成头像
     */
    void replaceHeadImg(Integer userId);


    /**
     * 删除用户相册，并保存删除记录
     * @param deleteImage 删除的图片对象列表
     * @param userImageIds 用户相册id
     * @param userId 用户id
     */
    void deleteUserImage(List<DeleteImage> deleteImage, List<Integer> userImageIds,Integer userId);
}
