package com.rcplatform.livechat.constant;

/**
 * Created by Yang Peng on 2017/7/10.
 *
 * @Description: appId
 */
public class AppIdConstant {


    public static final Integer OLD_APP_ID = 19999;


    public static final Integer NEW_APP_ID = 20000;


    public static Integer getAppId(Integer appId) {
        if (appId == null || !appId.equals(NEW_APP_ID)) {
            return OLD_APP_ID;
        } else {
            return NEW_APP_ID;
        }
    }
}
