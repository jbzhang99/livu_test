package com.rcplatform.livechat.enums;

/**
 * Created by admin on 2016/7/14.
 */
public enum StatEnum implements IEnum {


    STAT_SUCCESS(10000,"正常返回"),
    STAT_EMPTY(10004,"无返回数据"),
    STAT_EMAIL_HAS(10005,"用户注册email重复"),
    PASSWORD_ERROR(10006,"用户名或密码错误"),
    USER_NOT_LOGIN(10008,"用户不存在"),
    USER_LOGIN(10009,"用户已经登录"),
    USER_MATCHED(10010,"用户匹配中"),
    TOKEN_ERROR(10011,"token错误"),
    EMAIL_NOFOUND(10012,"邮箱不存在"),
    USER_NOFOUND(10013,"没有找到匹配用户"),
    GOLD_NOT_ENOUGH(10014,"金币不足"),
    NOT_FRIEND(10015,"不是朋友关系"),
    PAY_ERROR(10016,"支付失败"),
    FILE_TYPE_ERROR(10017,"非法的文件类型"),
    FILE_SIZE_ERROR(10018,"文件大小不得超过1M"),
    THREE_PARTY_USER(10019,"你是第三方用户，请直接登录"),
    EMAIL_VERIFY_ERROR(10020,"非法的url参数"),
    VERIFY_TIME_OUT(10021,"你的验证已失效，请重新发送"),
    PASSWORD_MODIFY_ERROR(10021,"用户密码修改失败"),
    USER_REPORT(10022,"你已被举报"),
    USER_OTHER_DEVICE(10023,"用户已在其他设备上登录"),
    USER_IMG_DELETE(10024,"你的头像审核未通过，已被删除"),
    AGE_OVERFLOW(10025,"你的年龄小于17岁"),
    EVALUATE_ALREADY(10026,"你已经评价过了"),
    NO_MORE_DEVICE(10027,"该设备注册账号已超过限制"),
    FREEZE_FOR_EVER(10028,"账号永久冻结"),
    COMMODITY_NOT_EXIT(10030,"不存在的商品id"),
    GIFT_NOT_EXIT(10031,"礼物不存在"),
    EXCHANGE_COMMODITY_NOT_EXIT(10032,"兑换商品不存在"),
    STONE_NOT_ENOUGH(10033,"钻石不足"),
    ORDER_IS_EXIT(10034,"重复的订单id"),
    GOOGLE_DATA_ERROR(10035,"缺少orderId的数据体"),
    CONSUME_NOT_EXIT(10036,"消费品id不存在"),
    USER_TOKEN_IS_EMPTY(10037,"用户token不存在,无法推送push"),
    VERSION_ERROR(10038,"不存在该版本或者该版本添加金币数量不存在"),
    ILLEGALITY_ADD_GOLD(10039,"添加金币请求非法"),
    ADD_GOLD_LIMIT(10040,"添加金币上限"),
    ERROR_FREQUENCY(100041,"添加金币频率异常"),
    USER_INFO_NOT_LACK(10042,"缺少用户信息"),
    EMAIL_SEND_LIMIT(10043,"邮箱发送已超出限制"),
    GREET_RECORD_EXIT(10044,"已存在聊天记录"),
    PAY_REQUEST_SEND_ERROR(10045,"支付通信失败"),
    PUSH_SWITCH_CLOSE(10046,"用户推送已关闭"),
    ALREADY_REPORT(10047,"你已经举报过改用户了"),
    USER_HAS_FORBID(10048,"用户已经封号"),
    DELETE_USER_FAIL(10049,"删除用户失败"),
    BIRTHDAY_ALREADY_MODIFY(10050,"生日已修改过一次了"),
    USER_FRIEND_NOT_EXIST(10051,"用户不存在"),
    ERROR_INVITATION_CODE(10052,"错误的邀请码"),
    INVITATION_CODE_HAS_BEEN_USED(10053,"该邀请码已经被使用"),
    ERROR_DEVICE_ID(10054, "该设备ID属于已经注册的用户"),
    ERROR_KEY(10055,"错误的key"),
    PRAISE_NOT_ENOUGH(10056,"赞数不足"),
    PRAISEGIFT_NOT_MATCH(10057,"礼品赞数不对应"),
    PRAISEGIFT_NOT_EXIST(10058,"礼品不存在")
    ;




    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    StatEnum( int key, String desc ) {
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
