package com.rcplatform.livechat.enums;

/**
 * Created by yang peng on 2016/8/8.
 */
public enum UserPayRecordPayPlatformEnum implements IEnum {

    GOOGLE(1,"google"),

    IOS(2,"ios"),

    WEB(3,"web");

    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    UserPayRecordPayPlatformEnum(int key, String desc) {
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
