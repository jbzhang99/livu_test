package com.rcplatform.livechat.enums;

/**
 * Created by yang peng on 2016/9/12.
 */
public enum ReportPageEnum implements IEnum {

	ALL(0, "未知,ALL"),

	VIDEO(1, "视频页面"),

	SHOW(2, "个人主页"),

	MATCH(3, "匹配记录页面"),

	MESSAGE(4, "message页面"),

	VIDEO_AUTOMATIC(5, "video中程序截图,服务器专用"),

	HEAD_IMG_ILLEGAL(6, "头像色情,服务器专用");


	// 枚举值
	private final int key;

	// 枚举描述
	private final String desc;


	ReportPageEnum(int key, String desc) {
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
