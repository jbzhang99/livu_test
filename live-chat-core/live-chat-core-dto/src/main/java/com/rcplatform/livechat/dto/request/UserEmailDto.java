package com.rcplatform.livechat.dto.request;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * 邮箱检测数据载体
 * Created by yang on 2016/7/30.
 */

public class UserEmailDto implements Serializable {


    /**
     * email 邮箱
     */

    @Email
    @NotEmpty
    private String email;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("email", email)
                .toString();
    }
}
