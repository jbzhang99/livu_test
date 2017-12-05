package com.rcplatform.livechat.dto.response.admin;

import com.rcplatform.videochat.model.Admin;
import com.rcplatform.videochat.model.AdminFunction;

import java.util.List;

/**
 * Created by admin on 2016/12/19.
 */
public class AdminFunctionDto extends Admin {

    private List<AdminFunction> list;

    private String token;

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

    public List<AdminFunction> getList() {
        return list;
    }

    public void setList(List<AdminFunction> list) {
        this.list = list;
    }
}
