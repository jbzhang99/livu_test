package com.rcplatform.livechat.enums;

/**
 * Created by ruihuagong on 2017/10/11.
 */
public enum ReportTypeEnum implements IEnum {

	VIDEO_AUTO_REPORT(0, "视频自动举报"),

	USER_REPORT(1, "用户手自动举报");

	// 枚举值
	private final int key;

	// 枚举描述
	private final String desc;

	ReportTypeEnum(int key, String desc) {
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
