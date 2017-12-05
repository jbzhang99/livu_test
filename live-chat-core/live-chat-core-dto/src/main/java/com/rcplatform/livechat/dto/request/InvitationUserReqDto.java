package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Arrays;

/**
 * Created by yaoyuan on 2017/8/16.
 */
@ApiModel
public class InvitationUserReqDto {

    public InvitationUserReqDto() {
    }

    @ApiModelProperty(value = "1 邀请者， 2 被邀请者，3 安装")
    private Integer type;

    @ApiModelProperty(value = "邀请码的数组")
    private String[] invitationCodes;

    public String[] getInvitationCodes() {
        return invitationCodes;
    }

    public void setInvitationCodes(String[] invitationCodes) {
        this.invitationCodes = invitationCodes;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InvitationUserReqDto{");
        sb.append("type=").append(type);
        sb.append(", invitationCodes=").append(invitationCodes == null ? "null" : Arrays.asList(invitationCodes).toString());
        sb.append('}');
        return sb.toString();
    }
}
