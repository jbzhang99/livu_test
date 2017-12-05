package com.rcplatform.livechat.enums;

/**
 * Created by yang peng on 2016/11/14.
 */
public enum CommodityPlatformTypeEnum implements IEnum {

    BOTH(0,"both"),

    IOS(1,"ios"),

    ANDROID(2,"android");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    CommodityPlatformTypeEnum(int key, String desc) {
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
