package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.request.PraiseChangeRecordDto;
import com.rcplatform.livechat.dto.response.UserPraiseDto;
import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.videochat.model.PraiseChangeRecord;
import com.rcplatform.videochat.model.PraiseGift;

import java.util.List;

/**
 * Created by fj on 2017/11/9.
 */
public interface IPraiseGiftModule {

    List<PraiseGift> getPraiseGift(Integer countryId);

    UserPraiseDto getUserPraise(Integer userId);

    UserPraiseDto addExchangePraiseRecord(PraiseChangeRecordDto praiseChangeRecordDto) throws BaseException;
}
