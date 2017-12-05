package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.request.ActiveUserDto;
import com.rcplatform.livechat.response.Page;
import com.rcplatform.videochat.model.User;

/**
 * Created by Yang Peng on 2017/5/5.
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public interface IActiveUserModule {
    /**
     * 保存或者更新用户登录信息，更新24小时内注册用户登录信息
     *
     * @param user
     * @return
     * @throws Exception
     */
    Integer updateOrSaveUserLoginStatus(User user);



    /**
     * 保存获取用户信息到活跃用户列表
     * @param user 用户
     * @return
     */
    void saveActiveUser(User user);

    /**
     * 用户更新头像时如果头像鉴黄结果为黄，删除该用户的登录信息
     *
     * @param userId
     * @return
     */
    void deleteUser(Integer userId);

    /**
     * 获取活跃用户的ID，id是根据规则排序的结果
     *
     * @param activeUserDto
     * @param page
     * @param size
     * @return
     */
    Page<Integer> getActiveUser(ActiveUserDto activeUserDto, Integer page, Integer size);

    /**
     * 获取新活跃用户的id，id是根据规则排序的结果
     *
     * @param activeUserDto
     * @param page
     * @param size
     * @return
     */
    Page<Integer> getActiveNewUser(ActiveUserDto activeUserDto, Integer page, Integer size);


    /**
     * 更新活跃用户
     * @param user
     */
    void updateActiveUser(User user);
}
