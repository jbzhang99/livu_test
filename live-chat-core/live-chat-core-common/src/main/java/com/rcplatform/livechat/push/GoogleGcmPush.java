package com.rcplatform.livechat.push;

import com.alibaba.fastjson.JSON;
import com.google.android.gcm.server.*;
import com.rcplatform.livechat.constant.AppIdConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

import static com.rcplatform.livechat.constant.AppIdConstant.OLD_APP_ID;

public class GoogleGcmPush {

	private static Logger logger = LoggerFactory.getLogger(GoogleGcmPush.class);

	private static final String OLD_API_KEY = "AIzaSyB_E74nTl3RSoVNfqjud7c5b4vZecrR_gg";


	private static final String NEW_API_KEY = "AIzaSyClCljLDX_TyLRGo8cJcJd1jPApm0qCLyE";

	//    private static String deviceRegId = "dDAi0YP4JQQ:APA91bFwWD0N8-TSvW4j8C0ey4kAW4nhH8RhkZ49ANrzGE1tqhXVGZywvPCLNgENJW0bJQw2Sg0pGq0tvS4nIwz9G_WJlvbIqdmhQtMtb1f-D17PdpqYEk6lxYIY0t6FymOnvV-64VJK";
	private static String deviceRegId = "fHy-WxYSQdo:APA91bG5Oa-mkNGKQEDEKscsnHqHhWt_OfUO0LPYdeK3HRTg3p0cbQoYqSLQuEkdtZBbeM7WEmRVXmwbB-N-sY5ntjdGp8zWBrcaThGFPxHyX73J2Rk5XkGsA_TJ-5LCRNjVnFW-usbJ";


//
//    f6mi0k0ORls:APA91bFgTWPCHKajCJzOUEmWQRNpvKgU5JAG0QCF9-qGUhSnwdAsx9UuD5XjFy4U-C2XOtz914X3XyckTchF4U9q7X6pqKf2e-goJRLm5PuMiEFJbnI1OEpej9IoI_9ynHajiFgJS0NC
//    dyHHkLJbILs:APA91bHh1D30ueDqyuxV_p5lWRPHvUSNsxhb7CGN1TF8gsgQjEZQqE_TiLAELXe653m6-Newkd_V_aGR_2nAU3S5OPp3VlQQhoczQc5V4yjtXDs1EjQ8xX2P3fAAzGrYQzTiZws9Tdes

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sender sender = new Sender(OLD_API_KEY);
		PushMessage pushMessage = new PushMessage();
		pushMessage.setContent("你的封号已被解封，请继续色情");
		pushMessage.setType(1);
		pushMessage.setPushId(19);
		Message message = new Message.Builder().addData("message", JSON.toJSONString(pushMessage)).build();
		Result result = null;
		System.out.println(message);
		try {
			result = sender.send(message, deviceRegId, 5);
			System.out.println(result);
			System.out.println("id:" + result.getMessageId());
			System.out.println("result:" + result.getCanonicalRegistrationId());
			System.out.println("error:" + result.getErrorCodeName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		//为空，则消息未发送给任何设备
		if (result.getMessageId() != null) {
			String canonicalRegId = result.getCanonicalRegistrationId();
			System.out.println("id:" + canonicalRegId);
			//用户注册了新的注册id，或者谷歌服务器刷新了注册id。
			//用户注册了新id，旧的id会被保存一段时间。此时使用旧id发送消息，设备即使已使用新id，依然可以收到
			if (canonicalRegId != null) {
				// same device has more than on registration ID: update database
			}
		} else {
			String error = result.getErrorCodeName();
			if (error.equals(Constants.ERROR_NOT_REGISTERED)) {
				// application has been removed from device - unregister database
			}
		}
	}


	public static MulticastResult push(Integer appId, PushMessage pushMessage, List<String> deviceRedIdList) {
		Sender sender = new Sender(getApiKey(appId));
		logger.info("appId" + appId + ";apiKey" + getApiKey(appId));
		Message message = new Message.Builder().addData("message", JSON.toJSONString(pushMessage)).build();
		MulticastResult result = null;
		try {
			result = sender.send(message, deviceRedIdList, 0);
			logger.info("GCM 返回的结果是" + JSON.toJSONString(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}


	public static void push(Integer appId, List<String> tokens, String text) throws IOException {
		String apiKey = getApiKey(appId);
		Sender sender = new Sender(apiKey);
		Message message = new Message.Builder().addData("message", text).build();
		for (String token : tokens) {
			sender.send(message, token, 0);
		}
	}


	public static Boolean push(Integer appId, String token, String text) {
		try {
			Sender sender = new Sender(getApiKey(appId));
			Message message = new Message.Builder().addData("message", text).build();
			Result result = sender.send(message, token, 0);
			return (result != null && result.getMessageId() != null);
		} catch (Exception e) {
			return false;
		}

	}


	public static Boolean push(Integer appId, String token, PushMessage pushMessage) {
		return push(appId, token, JSON.toJSONString(pushMessage));
	}


	public static String getApiKey(Integer appId) {
		Integer id = AppIdConstant.getAppId(appId);
		if (id.equals(OLD_APP_ID)) {
			return OLD_API_KEY;
		} else {
			return NEW_API_KEY;
		}

	}

}
