package com.rcplatform.livechat.enums;

/**
 * Created by Yang Peng on 2017/5/15.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public enum  OnlineVerifyEnum implements IEnum{

    LOST(0,"已失效"),

    SUCCESS(1,"success"),

    FAIL(2,"fail");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    OnlineVerifyEnum(int key, String desc) {
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
