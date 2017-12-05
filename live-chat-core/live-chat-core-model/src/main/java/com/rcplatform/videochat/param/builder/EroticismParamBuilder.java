package com.rcplatform.videochat.param.builder;


import com.rcplatform.videochat.param.EroticismParam;

/**
 * Created by ruihuagong on 2017/10/10.
 */
public class EroticismParamBuilder extends EroticismParam {


	public static EroticismParamBuilder instance() {
		return new EroticismParamBuilder();
	}

	public EroticismParamBuilder appId(Integer appId) {
		this.setAppId(appId);
		return this;
	}

	public EroticismParamBuilder gender(Integer gender) {
		this.setGender(gender);
		return this;
	}

	public EroticismParamBuilder imageUrl(String imageUrl) {
		this.setImageUrl(imageUrl);
		return this;
	}

	public EroticismParamBuilder userId(Integer userId) {
		this.setUserId(userId);
		return this;
	}

	public EroticismParamBuilder version(String version) {
		this.setVersion(version);
		return this;
	}

	public EroticismParamBuilder location(Integer location) {
		this.setLocation(location);
		return this;
	}

	public EroticismParamBuilder matchId(String matchId) {
		this.setMatchId(matchId);
		return this;
	}

	public EroticismParam build() {
		EroticismParam eroticismParam = new EroticismParam();
		eroticismParam.setAppId(this.getAppId());
		eroticismParam.setGender(this.getGender());
		eroticismParam.setImageUrl(this.getImageUrl());
		eroticismParam.setLocation(this.getLocation());
		eroticismParam.setMatchId(this.getMatchId());
		eroticismParam.setVersion(this.getVersion());
		eroticismParam.setUserId(this.getUserId());
		return eroticismParam;
	}
}


