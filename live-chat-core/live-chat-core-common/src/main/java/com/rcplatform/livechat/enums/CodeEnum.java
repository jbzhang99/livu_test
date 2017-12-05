package com.rcplatform.livechat.enums;

/**
 * Created by admin on 2016/12/28.
 */
public enum CodeEnum {


    PARAM_ERROR(400,"参数不能为空"),


    NOT_EMPTY(10001,"用户注册email重复"),


    NOT_DECODE(10002,"用户名或密码错误"),


    LACK_GOLD(10003,"金币不足"),


    USER_REGISTER(10004,"支付失败"),


    NOT_ALLOW_FILE(10005,"你已被举报"),


    NOT_FILE_SIZE(10006,"用户已在其他设备上登录"),


    AGE_NOT_ENOUGH(10007,"你的年龄小于17岁"),


    SYSTEM_ERROR(10008,"该设备注册账号已超过限制"),


    USER_NOT_EXIST(10009,"用户不存在"),


    VIDEO_RECORD_NOT＿EXIT(10010,"用户视频记录不存在"),


    VIDEO_CONSUME_NOT_EXIT(10011,"消费品id不存在"),


    VIDEO_RECORD_EXPIRED(10012,"视频记录已失效");








    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    CodeEnum(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }


    public int key() {
        return key;
    }


    public String desc() {
        return desc;
    }
}
