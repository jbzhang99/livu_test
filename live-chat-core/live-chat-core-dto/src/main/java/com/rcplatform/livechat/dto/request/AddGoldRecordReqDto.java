package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2017/3/23.
 */
@ApiModel
public class AddGoldRecordReqDto extends IfShowAdReqDto{


    public AddGoldRecordReqDto(String addGoldToken) {
        this.addGoldToken = addGoldToken;
    }

    public AddGoldRecordReqDto(Integer platfromType, String addGoldToken) {
        super(platfromType);
        this.addGoldToken = addGoldToken;
    }

    public AddGoldRecordReqDto(){
    }

    @ApiModelProperty(value = "添加金币秘钥,由  '客户端token' + ';' + '时间戳' 采用rsa加密后组成")
    private String addGoldToken;


    public String getAddGoldToken() {
        return addGoldToken;
    }

    public void setAddGoldToken(String addGoldToken) {
        this.addGoldToken = addGoldToken;
    }
}
