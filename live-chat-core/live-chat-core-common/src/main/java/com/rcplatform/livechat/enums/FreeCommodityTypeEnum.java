package com.rcplatform.livechat.enums;

/**
 * Created by yang peng on 2016/11/15.
 */
public enum FreeCommodityTypeEnum implements IEnum {

    EVALUATE(1,"评价"),

    REGISTER(2,"注册");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    FreeCommodityTypeEnum(int key, String desc) {
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
