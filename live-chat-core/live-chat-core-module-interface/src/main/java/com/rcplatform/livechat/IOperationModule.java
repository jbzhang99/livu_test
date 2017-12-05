package com.rcplatform.livechat;

import com.rcplatform.livechat.dto.response.OperationResp;

import java.util.List;

/**
 * Created by admin on 2017/3/2.
 */
public interface IOperationModule {



    List<OperationResp>  getOperation();
}
