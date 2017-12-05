package com.rcplatform.livechat.enums;

/**
 * Created by Yang Peng on 2017/6/20.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public enum  ReportPersonEnum  implements IEnum{


    PASS(1,"通过"),

    UN_PASS(0,"不通过"),

    UN_KNOW(2,"未知"),

    NO_PHOTO(3,"无图片"),

    IDENTIFY_FAIL(5,"鉴别图片失败"),

    ;


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    ReportPersonEnum(int key, String desc) {
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
