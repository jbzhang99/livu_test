package com.rcplatform.livechat.enums;

/**
 * Created by Yang Peng on 2017/8/4.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public enum AppVersionIosStatusEnum implements IEnum {


    IN_AUDIT(0, "审核中"),


    NORMAL(1, "正常"),;


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    AppVersionIosStatusEnum(int key, String desc) {
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
