package com.rcplatform.livechat.enums;

/**
 * Created by yaoyuan on 2017/8/15.
 */
public enum AddGoldEnum implements IEnum {

    AD(0, "看广告"),

    INVITATION_USER(1, "邀请好友"),

    BE_INVITED(2, "被邀请");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;

    AddGoldEnum(int key, String desc) {
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
