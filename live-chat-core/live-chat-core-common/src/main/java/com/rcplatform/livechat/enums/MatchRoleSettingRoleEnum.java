package com.rcplatform.livechat.enums;

/**
 * Created by Yang Peng on 2017/8/8.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public enum MatchRoleSettingRoleEnum implements IEnum {


    PAY_GENDER(1, "付费花金币"),

    FREE_GENDER(2, "免费花金币"),

    FREE_NEW(3, "免费新用户"),

    FREE_OLD(4, "免费老用户"),

    PAY_ALL(5, "付费未花金币"),

    EROTICISM_VIP(6, "色情vip ab"),

    EROTICISM_VIP_C(7, "色情vip c"),

    EROTICISM_BEHAVIOR_VIP(8, "色情行为vip ab"),

    EROTICISM_BEHAVIOR_VIP_C(9, "色情行为c"),

    GIRL_EROTICISM(10, "女性色情"),

    GIRL_AUTO_EROTICISM(11, "女性自动色情"),

    GIRL_NORMAL(12, "女性正常"),

    EROTICISM_MAN(13, "当前男性免费"),

    EROTICISM_BEFORE_MAN(14, "曾经色情男性");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    MatchRoleSettingRoleEnum(int key, String desc) {
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
