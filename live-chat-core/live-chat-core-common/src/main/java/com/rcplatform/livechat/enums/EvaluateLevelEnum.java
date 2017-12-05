package com.rcplatform.livechat.enums;

/**
 * Created by admin on 2017/4/13.
 */
public enum  EvaluateLevelEnum implements IEnum {


    START4(4,"4星"),

    START5(5,"5星"),

    SHARE(0,"分享"),

    LIKE(1,"点赞");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    EvaluateLevelEnum(int key, String desc) {
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
