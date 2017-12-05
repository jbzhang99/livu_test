package com.rcplatform.livechat.enums;

/**
 * Created by admin on 2017/3/30.
 */
public enum  FreeCommoditySwitchEnum implements IEnum {

    NO_STAR(0,"no start"),

    OPEN(1,"打开"),

    CLOSE(2,"关闭");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    FreeCommoditySwitchEnum(int key, String desc) {
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
