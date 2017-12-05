package com.rcplatform.livechat;


/**
 * 用户服务类
 * Created by yang peng on 2016/7/25.
 */

import com.rcplatform.livechat.dto.request.*;
import com.rcplatform.livechat.dto.response.EvaluateResp;
import com.rcplatform.livechat.dto.response.UserRelationDto;
import com.rcplatform.livechat.dto.response.UserRespDto;
import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.livechat.response.Page;

import java.util.List;


public interface IUserModule {


    /**
     * 检测邮箱是否已注册
     *
     * @return
     */
    Boolean checkEmail(String email);


    /**
     * 邮箱注册
     *
     * @param userEmailRegisterDto
     * @return
     */

    UserRespDto addEmailUser(UserEmailRegisterDto userEmailRegisterDto, String ip, String version, Integer timeZone) throws Exception;


    /**
     * 自动登陆
     *
     * @param userAutoLoginDto
     * @return
     */

    UserRespDto updateUserLoginToken(final UserAutoLoginDto userAutoLoginDto,
                                     Integer userId,
                                     final String acceptLanguage,
                                     final String ip,
                                     String version) throws Exception;


    /**
     * 邮箱登陆
     *
     * @param userEmailLoginDto
     * @return
     */

    UserRespDto updateUserLoginToken(UserEmailLoginDto userEmailLoginDto, String acceptLanguage, String ip, String version) throws Exception;


    /**
     * 第三方登录
     *
     * @param userThreePartyLoginDto
     * @return
     */

    UserRespDto addThreePartyUser(UserThreePartyLoginDto userThreePartyLoginDto, String acceptLanguage, String ip, String version) throws Exception;


    /**
     * 忘记密码
     *
     * @param userEmailDto
     * @return
     */
    String findPassword(UserEmailDto userEmailDto) throws Exception;


    /**
     * 获取个人信息
     *
     * @param userId
     * @return
     */

    UserRespDto getUser(Integer userId, Integer myUserId) throws Exception;


    /**
     * 修改用户密码
     *
     * @param userPasswordReqDto
     * @return
     */

    void updatePassword(UserPasswordReqDto userPasswordReqDto, Integer userId) throws Exception;


    /**
     * 修改用户基本信息
     *
     * @param userModifyReqDto
     * @return
     */

    UserRespDto updateUser(UserModifyReqDto userModifyReqDto, Integer userId) throws Exception;


    /**
     * 网页端重置密码
     *
     * @return
     */

    void resetPassword(ResetPasswordReqDto resetPasswordReqDto) throws Exception;


    /**
     * 获取活跃用户数
     */
    Page<UserRelationDto> getActiveUsers(Integer userId, ActiveUserDto activeUserDto, Integer page, Integer size);


    EvaluateResp addEvaluate(Integer userId, Integer freeCommodityId, Integer appId) throws Exception;


    void updateUserStatus(Integer userId) throws Exception;


    /**
     * 根据用户id列表 获取用户基本信息
     *
     * @param friendUserIdList
     * @return
     */
    List<UserRelationDto> getUserList(List<Integer> friendUserIdList, Integer userId) throws BaseException;


    /**
     * 获取用户信息及关系
     *
     * @param userId       用户id
     * @param friendUserId 朋友关系
     * @return 用户信息
     */
    UserRespDto getUserAndRelation(Integer userId, Integer friendUserId) throws Exception;

    /**
     * 删除一个用户
     *
     * @param userDeleteDto 用户信息
     * @param userId        用户id
     */
    void deleteUser(UserDeleteDto userDeleteDto, Integer userId) throws BaseException;


    UserRespDto getUserByOtherId(String userOtherId) throws BaseException;

    void invitationUserFriend(Integer userId,String deviceId, String[] invitationCodes, Integer type);


    void invitationUserFriend(Integer userId,String deviceId, String[] invitationCodes, Integer type, Integer appId,
                              Integer platformType);

}
