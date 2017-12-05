package com.rcplatform.livechat.enums;

/**
 * Created by admin on 2017/2/15.
 */
public enum CommodityTypeEnum implements IEnum {

    SPECIAL(0, "特殊包"),

    NORMAL(1, "普通包"),

    FIRST_USER(2, "新人包");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    CommodityTypeEnum(int key, String desc) {
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
