package com.rcplatform.livechat.mybatis.plugin;

public interface MyBatisInterceptor {

	public Object invoke(MyBatisInvocation handler) throws Throwable;
}
