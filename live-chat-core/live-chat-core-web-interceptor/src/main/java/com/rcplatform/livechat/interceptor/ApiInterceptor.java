package com.rcplatform.livechat.interceptor;

import com.alibaba.dubbo.config.annotation.Reference;
import com.google.common.collect.Sets;
import com.rcplatform.livechat.IUserVerifyModule;
import com.rcplatform.livechat.bean.SealingInfo;
import com.rcplatform.livechat.bean.UserValidate;
import com.rcplatform.livechat.constant.HttpErrorMessage;
import com.rcplatform.livechat.enums.StatEnum;
import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.livechat.exception.HttpException;
import com.rcplatform.livechat.util.MD5;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Set;

/**
 * Created by admin on 2017/2/9.
 */

public class ApiInterceptor implements HandlerInterceptor {

	private Logger logger = LoggerFactory.getLogger(ApiInterceptor.class);


	@Reference(timeout = 10000, version = "2.0.0")
	private IUserVerifyModule userVerifyModule;


	private static final Set<String> REPORT_SET = Sets.newHashSet("/users/matches/randoms");

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		logger.info(String.format("使用 %s 请求 %s", request.getMethod(), request.getRequestURI()));
		String url = request.getRequestURL().toString();
		String nonce = request.getParameter("nonce");
		String userId = request.getParameter("userId");
		String timestamp = request.getParameter("timestamp");
		String deviceId = request.getParameter("deviceId");
		String sign = request.getParameter("sign");
		Enumeration params = request.getParameterNames();
		while (params.hasMoreElements()) {
			String paramName = (String) params.nextElement();
			logger.info("Parameter Name - " + paramName + ", Value - " + request.getParameter(paramName));
		}
		if (StringUtils.isEmpty(sign) || StringUtils.isEmpty(nonce) || StringUtils.isEmpty(userId) || StringUtils.isEmpty(timestamp) || StringUtils.isEmpty(deviceId)) {
			throw new HttpException(HttpStatus.UNAUTHORIZED.value(), HttpErrorMessage.LACK_PARAMETER);
		} else {
			UserValidate userValidate = userVerifyModule.checkUser(Integer.parseInt(userId));
			if (userValidate == null || StringUtils.isEmpty(userValidate.getToken())) {
				logger.error("token为 null 请求");
				throw new HttpException(HttpStatus.FORBIDDEN.value(), HttpErrorMessage.USER_NOT_LOGIN);
			}
			checkUserDevice(userValidate, deviceId);
			checkReport(userValidate, url);
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(url).append(userValidate.getToken()).append(deviceId).append(nonce).append(timestamp).append(userId);
			String md5Code = MD5.getMD5Code(stringBuilder.toString());
			logger.info("md5前：" + stringBuilder.toString());
			logger.info("md5后：" + MD5.getMD5Code(stringBuilder.toString()));
			if (!md5Code.equals(sign)) {
				logger.error("-----------签名错误请求:" + MD5.getMD5Code(stringBuilder.toString()) + "收到的sign值:" +
						sign + "---url:" + url + "?" + request.getQueryString());
				throw new HttpException(HttpStatus.FORBIDDEN.value(), HttpErrorMessage.SIGN_ERROR);
			}
//            else
//            if ((System.currentTimeMillis() - Long.parseLong(timestamp)) > 5 * 60 * 1000) {
//                logger.error("-----------超时请求----------"+url + "?" + request.getQueryString());
//                throw new HttpException(HttpStatus.FORBIDDEN.value(), HttpErrorMessage.TIME_TO_LONG);
//            }

		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}


	/**
	 * 检查用户的登录设备
	 *
	 * @param deviceId
	 * @return
	 */
	private void checkUserDevice(UserValidate userValidate, String deviceId) throws BaseException {
		if (userValidate != null && !deviceId.equals(userValidate.getDeviceId())) {
			throw new BaseException(StatEnum.USER_OTHER_DEVICE, userValidate.getDeviceName());
		}
	}


	/**
	 * 检查用户是否被举报
	 *
	 * @return
	 */
	private void checkReport(UserValidate userValidate, String url) throws BaseException, MalformedURLException {
		String path = new URL(url).getPath().replaceFirst("/", "");
		int pos = StringUtils.ordinalIndexOf(path, "/", 2);
		String p = path.substring(pos);
		if (REPORT_SET.contains(p) && userValidate != null && userValidate.getSealing() != null && userValidate.getSealing()) {
			throw new BaseException(StatEnum.USER_REPORT,
					new SealingInfo(userValidate.getSealingTime(),
							userValidate.getSealingReason(),
							userValidate.getSealingCount(),
							userValidate.getGold(), userValidate.getForbidTime()));
		}
	}
}
