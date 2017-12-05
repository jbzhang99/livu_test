package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by yang peng on 2016/8/23.
 */
@ApiModel
public class UserEmailRegisterDto extends UserRegisterDto {


    @NotNull
    @ApiModelProperty(value = "用户邮箱")
    private String userAccount;



    @NotNull
    @ApiModelProperty(value = "用户密码")
    private String password;

//
//    @ApiModelProperty(value = "被邀请码")
//    private String invitationCode;


    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


//    public String getInvitationCode() {
//        return invitationCode;
//    }
//
//    public void setInvitationCode(String invitationCode) {
//        this.invitationCode = invitationCode;
//    }

    @Override
    public String toString() {
        super.toString();
        final StringBuilder sb = new StringBuilder("UserEmailRegisterDto{");
        sb.append("userAccount='").append(userAccount).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
