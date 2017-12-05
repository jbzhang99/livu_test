package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.request.ExchangeOrderDto;
import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.videochat.model.ExchangeOrder;
import com.rcplatform.livechat.response.Page;
import org.springframework.data.domain.Sort;

/**
 * Created by admin on 2017/2/13.
 */
public interface IExchangeOrderModule {



    Page<ExchangeOrder> getExchangeOrderPage(Integer userId, Integer page, Integer size, String sort, Sort.Direction direction);




    ExchangeOrder addExchangeOrder(ExchangeOrderDto exchangeOrderDto, Integer userId) throws BaseException;
}
