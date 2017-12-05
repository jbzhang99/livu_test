package com.rcplatform.livechat.enums;

/**
 * Created by Yang Peng on 2017/7/10.
 *
 * @Description: 推送类型 0 好友上线消息 1 头像违规 2.举报后反馈 3.性别被更改 4. 充值成功 5. 获得奖励
 */
public enum PushLanguageSettingTypeEnum implements IEnum {


    ROUSE(0, "LiveChat唤醒"),

    FRIEND_ONLINE(1, "好友上线"),

    REPORT_FEEDBACK(2, "举报反馈"),

    GENDER_CHANGE(3, "性别更改"),

    RECHARGE_SUCCESS(4, "充值成功"),

    GET_REWARD(5, "获得奖励"),

    DISCRIMINATE(6, "语言暴力"),

    UN_FORBID(7, "解封"),

    IMAGE_VIOLATION(8, "头像色情"),

    IMAGE_GENDER_UN_MATCH(9, "性别头像不匹配"),

    OPERATION(10, "LivU运营push"),

    EROTICISM_TAG(11, "被打色情标签"),

    LIVU_ROUSE(12, "liv唤醒"),

    LIVU_ONLINE(13, "liv 上线"),

    BE_INVITATION_GIVE_GOLD(14, "被邀请人赠送金币"),

    INVITATION_GIVE_GOLD(15, "邀请人赠送金币"),

    APP_STROR(16, "跳转商店"),

    WEB_SITE(17, "跳转H5"),

    UN_BLOCK(18, "解封推送"),

    PRAISE_SEND_GOODS(19,"积分兑换礼物发货通知"),

    PRAISE_CHANGE_COMPLETE(20,"兑换完成通知"),;

    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    PushLanguageSettingTypeEnum(int key, String desc) {
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
