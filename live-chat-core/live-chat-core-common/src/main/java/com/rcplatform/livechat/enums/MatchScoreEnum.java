package com.rcplatform.livechat.enums;

/**
 * Created by ruihuagong on 2017/9/8.
 */
public enum MatchScoreEnum implements IEnum {


	BAD_SCORE(-5, "差评"), MID_SCORE(5, "中评"), GOOD_SCORE(10, "好评");

	private int key;

	private String desc;

	MatchScoreEnum(int key, String desc) {
		this.key = key;
		this.desc = desc;
	}

	@Override
	public int key() {
		return this.key;
	}

	@Override
	public String desc() {
		return this.desc;
	}

}
