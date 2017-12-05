package com.rcplatform.livechat.dto.response;

import com.rcplatform.videochat.bean.KeyValue;
import com.rcplatform.videochat.model.PayStatDay;

import java.util.List;

/**
 * Created by yaoyuan on 2017/6/9.
 */
public class PayStatDayResp extends PayStatDay {

    private List<KeyValue> iosCommodityStatisticsList;

    private List<KeyValue> androidCommodityStatisticsList;

    public List<KeyValue> getIosCommodityStatisticsList() {
        return iosCommodityStatisticsList;
    }

    public void setIosCommodityStatisticsList(List<KeyValue> iosCommodityStatisticsList) {
        this.iosCommodityStatisticsList = iosCommodityStatisticsList;
    }

    public List<KeyValue> getAndroidCommodityStatisticsList() {
        return androidCommodityStatisticsList;
    }

    public void setAndroidCommodityStatisticsList(List<KeyValue> androidCommodityStatisticsList) {
        this.androidCommodityStatisticsList = androidCommodityStatisticsList;
    }
}
