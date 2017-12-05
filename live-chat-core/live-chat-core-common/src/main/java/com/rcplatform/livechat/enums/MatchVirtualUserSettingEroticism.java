package com.rcplatform.livechat.enums;

public enum MatchVirtualUserSettingEroticism implements IEnum {


    /**
     * 0 从未色情  1 曾经色情  2 正在色情
     */
    NO_EROTICISM(0, "从未色情"),

    BEFORE_EROTICISM(1, "曾经色情"),

    NOW_EROTICISM(2, "正在色情");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    MatchVirtualUserSettingEroticism(int key, String desc) {
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
