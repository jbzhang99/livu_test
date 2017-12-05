package com.rcplatform.livechat.enums;

/**
 * Created by yaoyuan on 2017/7/4.
 */
public enum ReportSettingUserType implements IEnum {


    FREE_MALE(1,"男性"),


    FEMALE(3,"女性"),

    ;


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    ReportSettingUserType(int key, String desc){
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
