package com.rcplatform.livechat.dto.response.admin;

import com.rcplatform.livechat.response.Page;
import com.rcplatform.videochat.model.UserPayRecord;

import java.io.Serializable;

/**
 * Created by admin on 2017/3/3.
 */
public class UserPayCountResp implements Serializable {


    private Integer payCount;


    private Integer goldSum;


    private Integer moneySum;


    private Page<UserPayRecord> page;



    public Integer getPayCount() {
        return payCount;
    }

    public void setPayCount(Integer payCount) {
        this.payCount = payCount;
    }

    public Integer getGoldSum() {
        return goldSum;
    }

    public void setGoldSum(Integer goldSum) {
        this.goldSum = goldSum;
    }

    public Integer getMoneySum() {
        return moneySum;
    }

    public void setMoneySum(Integer moneySum) {
        this.moneySum = moneySum;
    }

    public Page<UserPayRecord> getPage() {
        return page;
    }

    public void setPage(Page<UserPayRecord> page) {
        this.page = page;
    }
}
