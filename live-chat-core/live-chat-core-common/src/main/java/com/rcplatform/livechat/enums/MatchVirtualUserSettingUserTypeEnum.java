package com.rcplatform.livechat.enums;

public enum MatchVirtualUserSettingUserTypeEnum implements IEnum {


    OLD_USER(0, "老用户"),

    NEW_USER(1, "新用户");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    MatchVirtualUserSettingUserTypeEnum(int key, String desc) {
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
