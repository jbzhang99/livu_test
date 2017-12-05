package com.rcplatform.livechat.enums;

/**
 * Created by yaoyuan on 2017/8/9.
 */
public enum ImageRateEnum implements IEnum {


    LIV_U_VIOLATIONS_MALE(67,"LivU男性色情图片概率"),
    LIV_U_VIOLATIONS_FEMALE(68,"LivU女性色情图片概率"),
    LIV_U_GENDER_DISCREPANCY(69,"LivU性别不符图片概率"),
    LIVE_CHAT_VIOLATIONS_MALE(70,"LiveChat男性色情图片概率"),
    LIVE_CHAT_VIOLATIONS_FEMALE(71,"LiveChat女性色情图片概率"),
    LIVE_CHAT_GENDER_DISCREPANCY(72,"LiveChat性别不符概率");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;

    ImageRateEnum(int key, String desc) {
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
