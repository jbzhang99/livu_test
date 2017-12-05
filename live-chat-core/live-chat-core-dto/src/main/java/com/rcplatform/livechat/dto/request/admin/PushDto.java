package com.rcplatform.livechat.dto.request.admin;


import com.rcplatform.videochat.model.Push;
import com.rcplatform.videochat.model.PushLanguage;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by yang peng on 2016/9/12.
 */

public class PushDto extends Push {

    @NotNull
    private Integer adminId;



    private String userIdList;


    private List<PushLanguage> pushLanguages;



    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }


    public String getUserIdList() {
        return userIdList;
    }

    public void setUserIdList(String userIdList) {
        this.userIdList = userIdList;
    }

    public List<PushLanguage> getPushLanguages() {
        return pushLanguages;
    }

    public void setPushLanguages(List<PushLanguage> pushLanguages) {
        this.pushLanguages = pushLanguages;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PushDto{");
        sb.append("adminId=").append(adminId);
        sb.append(", pushLanguages=").append(pushLanguages);
        sb.append('}');
        return sb.toString();
    }
}
