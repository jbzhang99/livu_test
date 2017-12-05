package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * Created by yang peng on 2016/8/5.
 */
@ApiModel
public class UserPasswordReqDto implements Serializable {


    @ApiModelProperty(value = "用户密码")
    @NotEmpty
    private String password;


    @ApiModelProperty(value = "新用户密码")
    @NotEmpty
    private String newPassword;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserPasswordReqDto{");
        sb.append("password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
