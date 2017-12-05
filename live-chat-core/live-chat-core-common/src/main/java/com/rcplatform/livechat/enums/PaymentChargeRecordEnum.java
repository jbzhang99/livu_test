package com.rcplatform.livechat.enums;

/**
 * Created by Yang Peng on 2017/5/26.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public enum  PaymentChargeRecordEnum implements IEnum{



    GOOGLE_PLAY(1,"google"),


    APP_STORE(2,"app store"),


    WEB_PAY_PAL(3,"web pay pal"),


    WEB_CODA_PAY(4,"web coda pay");



    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    PaymentChargeRecordEnum(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    @Override
    public int key() {
        return key;
    }

    @Override
    public String desc() {
        return desc;
    }
}
