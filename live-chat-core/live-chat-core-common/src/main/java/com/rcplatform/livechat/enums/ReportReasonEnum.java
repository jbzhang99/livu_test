package com.rcplatform.livechat.enums;

/**
 * Created by admin on 2017/1/11.
 */
public enum ReportReasonEnum implements IEnum {

    GENDER_DISCREPANCY(1,"性别不符"),

    VIOLATIONS(2,"色情裸露"),

    OTHER(3,"其他"),

    NO_REASON(4,"无原因"),

    FRAUD(5,"恶意诈骗"),

    VIOLENCE_LANGUAGE(6,"语言暴力"),

    DISCRIMINATE(7,"攻击歧视"),

    MATCH_VIOLATIONS(8,"匹配记录页面举报色情裸露,服务器专用"),

    HEAD_VIOLATIONS(9,"头像色情,服务器专用");



    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    ReportReasonEnum(int key, String desc) {
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
