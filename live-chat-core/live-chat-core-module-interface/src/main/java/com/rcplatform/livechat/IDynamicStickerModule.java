package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.request.admin.DynamicStickerDto;
import com.rcplatform.videochat.model.DynamicSticker;
import com.rcplatform.videochat.model.StickerType;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by yaoyuan on 2017/7/11.
 */
public interface IDynamicStickerModule {

    List<DynamicSticker> getDynamicSticker();

    List<DynamicStickerDto> getDynamicStickers(Integer appId, Integer stickerType,Integer gender,Integer platform,String version);

    List<StickerType> dynamicStickerTypes();
}
