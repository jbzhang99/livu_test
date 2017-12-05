package com.rcplatform.livechat.enums;

/**
 * Created by ruihuagong on 2017/10/12.
 */
public enum PopupReportEnum implements IEnum {

	POPUP_PLATFORM_REAL(-1, "客服端实际弹框"),

	POPUP_SERVER_REAL(-2, "服务端实际返回应该弹框"),

	POPUP_NOT_DEAL(0, "不处理"),

	POPUP_REPORT(1, "举报"),

	POPUP_NOT_REPORT(2, "不举报");

	// 枚举值
	private final int key;

	// 枚举描述
	private final String desc;


	PopupReportEnum(int key, String desc) {
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
