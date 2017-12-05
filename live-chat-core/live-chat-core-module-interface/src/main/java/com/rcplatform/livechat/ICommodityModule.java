package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.response.CommodityDto;
import com.rcplatform.livechat.exception.BaseException;

import java.util.List;

/**
 * Created by yang peng on 2016/8/8.
 */

public interface ICommodityModule {


    /**
     * 获取商品列表
     *
     * @return
     */

    List<CommodityDto> getList(Integer appId, Integer userId, String version) throws BaseException;




    List<CommodityDto> getCommodity(Integer appId, Integer userId, String version) throws BaseException;
}
