package com.rcplatform.livechat.enums;

/**
 * Created by 药耀源 on 2017/5/11.
 */
public enum TopTypeEnum implements IEnum {
    SEND_GIFT_DAY(1, "送出礼物日榜"),
    SEND_GIFT_WEEK(2, "送出礼物周榜"),
    RECEIVE_GIFT_DAY(3, "收到礼物日榜"),
    RECEIVE_GIFT_WEEK(4, "收到礼物周榜");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;

    TopTypeEnum(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    @Override
    public int key() {
        return 0;
    }

    @Override
    public String desc() {
        return null;
    }
}
