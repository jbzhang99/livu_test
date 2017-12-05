package com.rcplatform.livechat.enums;

/**
 * Created by admin on 2017/4/20.
 */
public enum  CheckPersonEnum implements IEnum {



    UN_PASS(0,"不合格"),


    PASS(1,"合格"),


    UN_KNOW(2,"未知");

    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    CheckPersonEnum(int key, String desc) {
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
