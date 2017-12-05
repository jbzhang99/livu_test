package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.request.PromotionDto;

import java.util.List;

/**
 * Created by fj on 2017/8/8.
 */
public interface IPromotionModule {

     List<PromotionDto> getPromotions(Integer appId, Integer languageId);
}
