package com.rcplatform.livechat.constant;

/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Menue,Inc Copyright (c) 2016年3月7日 下午5:53:42
 * <p>
 * Team:Menue Beijing
 * <p>
 *
 * @author yuan.baohua@menue.com.cn
 * @version 1.0.0
 */
public class RedisKeyConstant {

    /**
     * 应用名称
     */
    public static final String app_name = "videochat";


    /**
     * 管理员账号
     */
    public static final String ADMIN = "admin";


    /**
     * 用户分数string key
     */
    public static final String SCORE = "score";


    /**
     * 用户信息集合 string
     */
    public static final String USER_INFO = "user_info";


    /**
     * 用户差集 set
     */
    public static final String DIFF = "diff";


    /**
     * 用户的验证信息 string
     */
    public static final String USER_VALIDATE = "user_validate";


    /**
     * 用户国家 set
     */
    public static final String COUNTRY = "country";


    /**
     * 语言 set
     */
    public static final String LANGUAGE = "language";


    /**
     * 用户生存时间 hash
     */
    public static final String LIVE = "live";


    /**
     * 用户之间的关系key string
     */
    public static final String RELATION = "re";


    /**
     * 用户之间的临时排除集合 set
     */
    public static final String TEMP = "temp";


    /**
     * 用户性别集合 hash
     */
    public static final String HASH_GENDER = "hash_gender";


    /**
     * 每个用户匹配计数
     */
    public static final String USER_MATCH_COUNT = "user_match_count";


    /**
     * 礼物金币
     */
    public static final String GIFT_GOLD = "gift_gold";


    /**
     * 匹配消耗金币
     */
    public static final String MATCH_GOLD = "match_gold";


    /**
     * 匹配计数
     */
    public static final String MATCH_COUNT = "match_count";


    /**
     * 性别不符
     */
    public static final String USER_GENDER_DISCREPANCY = "user_gender_discrepancy";


    /**
     * 色情
     */
    public static final String EROTICISM_VERIFICATION = "eroticism_verification";


    /**
     * 性别
     */
    public static final String GENDER_VERIFICATION = "gender_verification";


    /**
     * 用户支付记录
     */
    public static final String USER_PAY_RECORD = "user_pay_record";

    /**
     * 正在进行的活动
     */
    public static final String ACTIVITY_ON_GOING_INFO = "activity_on_going_info";


    public static final String TOP_SCORE_LIST = "top_score_list";


    /**
     * 虚拟用户
     */
    public static final String VIRTUAL_USER = "virtual_user";


    /**
     * 虚拟用户集合
     */
    public static final String VIRTUAL_USER_SET = "virtual_user_set";


    /**
     * 虚拟用户差集
     */
    public static final String VIRTUAL_USER_DIFF = "virtual_user_diff";


    /**
     * 用户当天色情计数
     */
    public static final String EROTICISM_COUNT = "eroticism_count";


    /**
     * 用户正在举报人数
     */
    public static final String BLOCKING = "blocking";


    /**
     * 用户当天被举报记录
     */
    public static final String USER_BLOCKING = "user_blocking";


    /**
     * 视频色情
     */
    public static final String VIDEO_EROTICISM = "video_eroticism";

    /**
     * 视频中性别检查
     */
    public static final String VIDEO_GENDER_CHECK = "video_gender_check";

    /**
     * 色情女圈子
     * 色轻女存储格式 key -> eroticism_female_circle:appId:gender  value -> userId
     */
    public static final String EROTICISM_FEMALE_CIRCLE = "eroticism_female_circle";

    /**
     * 色情圈条件
     */
    public static final String EROTICISM_CIRCLE_CONDITION = "eroticism_circle_condition";

    /**
     * popup 不举报的次数
     */
    public static final String POPUP_OR_VIDEO_REPORT = "popup_video_report";

    /**
     * 虚拟用户集合 - 色情用户`
     */
    public static final String VIRTUAL_EROTICISM_USER_SET = "virtual_eroticism_user_set";

    /**
     * 色情vip匹配集合
     */
    public static final String EROTICISM_VIP = "eroticism_vip";

    /**
     * 用户色情总次数
     */
    public static final String EROTICISM_TOTAL_COUNT = "eroticism_total_count";

    /**
     * 男性confirm次数
     */
    public static final String MALE_CONFIRM_COUNT = "male_confirm_count";

    /**
     * 定向女不匹配的女性
     */
    public static final String PAY_NOT_MATCH_FEMALE_USER = "pay_not_match_female_user";

    /**
     * 不再进入色情圈的用户
     */
    public static final String EXCLUDE_CIRCLE_USER = "exclude_circle_user";

    /**
     * 当前用户视频色情记录
     */
    public static final String EROTICISM_VIDEO_USER_SETS = "eroticism_video_user_sets";

    /**
     * 视频截图检查 记录色情标识
     */
    public static final String TEMP_VIDEO_IMAGE_CHECK = "temp_video_image_check";


    public static final String USER_PRAISE = "user_praise";


    public static final String MATCH_RECORD = "match_record";

}
