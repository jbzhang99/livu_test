package com.rcplatform.livechat.enums;

/**
 * Created by Yang Peng on 2017/6/20.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public enum ReportEroticismEnum implements IEnum {

	UN_KNOW(1, "未知"),
	EROTICISM(0, "色情"),

	NORMAL(2, "正常"),

	LIKELY(3, "色情相似的"),

	NO_PHOTO(4, "没有截图"),

	IDENTIFY_FAIL(5, "鉴别图片失败"),

	EROTICISM_CONFIRM(100, "色情confirm"),

	EROTICISM_LIKELY(101, "色情likely"),

	OOMPH_CONFIRM(102, "性感confirm"),

	OOMPH_LIKELY(103, "性感likely"),

	GENDER_FEMALE_CONFIRM(199, "女性confirm"),

	GENDER_FEMALE_LIKELY(200, "女性likely"),

	GENDER_MALE_CONFIRM(201, "男性confirm"),

	GENDER_MALE_LIKELY(202, "男性likely");

	// 枚举值
	private final int key;

	// 枚举描述
	private final String desc;


	ReportEroticismEnum(int key, String desc) {
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
