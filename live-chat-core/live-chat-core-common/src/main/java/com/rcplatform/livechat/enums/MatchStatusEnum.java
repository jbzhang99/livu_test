package com.rcplatform.livechat.enums;

/**
 * Created by admin on 2017/2/16.
 */
public enum MatchStatusEnum implements IEnum{


    NORMAL(1,"正常"),

    IN_MATCH(2,"匹配中");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    MatchStatusEnum(int key, String desc) {
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
