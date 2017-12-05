package com.rcplatform.livechat.enums;

/**
 * Created by yaoyuan on 2017/8/21.
 */
public enum ActivityStatusEnum implements IEnum {
    UN_START(1, "活动尚未开始"),

    ON_GOING(2, "活动进行中"),

    END(3, "活动结束");


    ActivityStatusEnum(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;

    @Override
    public int key() {
        return key;
    }

    @Override
    public String desc() {
        return desc;
    }
}
