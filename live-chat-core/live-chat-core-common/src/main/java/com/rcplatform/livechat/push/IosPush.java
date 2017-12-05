package com.rcplatform.livechat.push;

import javapns.devices.Device;
import javapns.devices.implementations.basic.BasicDevice;
import javapns.notification.AppleNotificationServerBasicImpl;
import javapns.notification.PushNotificationManager;
import javapns.notification.PushNotificationPayload;
import javapns.notification.PushedNotification;

import java.util.ArrayList;
import java.util.List;

public class IosPush {


	private String path;


	private String password;


	private Boolean online;

	public IosPush() {
	}

	public IosPush(String path, String password, Boolean online) {
		this.path = path;
		this.password = password;
		this.online = online;
	}


	/************************************************
	 * 测试推送服务器地址：gateway.sandbox.push.apple.com /2195
	 * 产品推送服务器地址：gateway.push.apple.com / 2195
	 *
	 * 需要javaPNS_2.2.jar包
	 ***************************************************/
	/**
	 * 这是一个比较简单的推送方法，
	 * apple的推送方法
	 *
	 * @param tokens    iphone手机获取的token
	 * @param path      这里是一个.p12格式的文件路径，需要去apple官网申请一个
	 * @param password  p12的密码 此处注意导出的证书密码不能为空因为空密码会报错
	 * @param message   推送消息的内容
	 * @param count     应用图标上小红圈上的数值
	 * @param sendCount 单发还是群发 true：单发 false：群发
	 */
	public List<Integer> sendPush(List<String> tokens, String path, String password,
	                              String message, Integer count, boolean sendCount, Integer type, Integer pushId) {
		int failed = 0;
		int successful = 0;
		List<Integer> list = new ArrayList<>();
		try {
			// message是一个json的字符串{“aps”:{“alert”:”iphone推送测试”}}
			PushNotificationPayload payLoad = PushNotificationPayload.alert(message);
			//payLoad.addAlert("iphone推送测试   www.guligei.com"); // 消息内容
			payLoad.addBadge(count); // iphone应用图标上小红圈上的数值
			payLoad.addSound("default"); // 铃音 默认
			payLoad.addCustomDictionary("type", type);
			payLoad.addCustomDictionary("pushId", pushId);
			PushNotificationManager pushManager = new PushNotificationManager();
			// true：表示的是产品发布推送服务 false：表示的是产品测试推送服务
			pushManager.initializeConnection(new AppleNotificationServerBasicImpl(path, password, true));
			List<PushedNotification> notifications = new ArrayList<PushedNotification>();
			// 发送push消息
			if (sendCount) {
				Device device = new BasicDevice();
				device.setToken(tokens.get(0));
				PushedNotification notification = pushManager.sendNotification(device, payLoad, true);
				notifications.add(notification);
				System.out.println(notification.isSuccessful());
			} else {
				List<Device> device = new ArrayList<Device>();
				for (String token : tokens) {
					device.add(new BasicDevice(token));
				}
				notifications = pushManager.sendNotifications(payLoad, device);
			}
			List<PushedNotification> failedNotifications = PushedNotification.findFailedNotifications(notifications);
			List<PushedNotification> successfulNotifications = PushedNotification.findSuccessfulNotifications(notifications);
			failed = failedNotifications.size();
			successful = successfulNotifications.size();
			list.add(failed);
			list.add(successful);
			if (successful > 0 && failed == 0) {
				System.out.print("推送成功" + failedNotifications.toString());
			} else if (successful == 0 && failed > 0) {
				System.out.print("推送失败" + failedNotifications.toString());
			} else if (successful == 0 && failed == 0) {
				System.out.print("推送失败" + failedNotifications.toString());
				System.out.println("No notifications could be sent, probably because of a critical error");
			} else {
				System.out.print("推送失败" + failedNotifications.toString());
			}
			// pushManager.stopConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}


	public Boolean sendPush(String token, String text) throws Exception {
		PushNotificationPayload payLoad = PushNotificationPayload.alert(text);
		payLoad.addBadge(1); // iphone应用图标上小红圈上的数值
		payLoad.addSound("default"); // 铃音 默认
		PushNotificationManager pushManager = new PushNotificationManager();
		// true：表示的是产品发布推送服务 false：表示的是产品测试推送服务
		pushManager.initializeConnection(new AppleNotificationServerBasicImpl(path, password, online));
		Device device = new BasicDevice();
		device.setToken(token.replace(" ", ""));
		PushedNotification notification = pushManager.sendNotification(device, payLoad, true);
		return notification.isSuccessful();
	}


	public Boolean sendPush(String token, String text, String sinch, Integer type){
		PushNotificationPayload payLoad = PushNotificationPayload.alert(text);
		try {
			payLoad.addCustomDictionary("sin", sinch);
			payLoad.addCustomDictionary("type", type);
			payLoad.addBadge(1); // iphone应用图标上小红圈上的数值
			payLoad.addSound("default"); // 铃音 默认
			PushNotificationManager pushManager = new PushNotificationManager();
			// true：表示的是产品发布推送服务 false：表示的是产品测试推送服务
			pushManager.initializeConnection(new AppleNotificationServerBasicImpl(path, password, online));
			Device device = new BasicDevice();
			device.setToken(token.replace(" ", ""));
			PushedNotification notification = pushManager.sendNotification(device, payLoad, true);
			return notification.isSuccessful();
		} catch (Exception e) {
//			e.printStackTrace();
			return false;
		}

	}


	public Boolean sendPush(String token, String text, Integer type) {
		PushNotificationPayload payLoad = PushNotificationPayload.alert(text);
		try {
			payLoad.addCustomDictionary("type", type);
			payLoad.addBadge(1); // iphone应用图标上小红圈上的数值
			payLoad.addSound("default"); // 铃音 默认
			PushNotificationManager pushManager = new PushNotificationManager();
			// true：表示的是产品发布推送服务 false：表示的是产品测试推送服务
			pushManager.initializeConnection(new AppleNotificationServerBasicImpl(path, password, online));
			Device device = new BasicDevice();
			device.setToken(token.replace(" ", ""));
			PushedNotification notification = pushManager.sendNotification(device, payLoad, true);
			return notification.isSuccessful();
		} catch (Exception e) {
//			e.printStackTrace();
			return false;
		}

	}


	public List<Integer> sendPush(List<String> tokens, String message, Integer type) {
		return sendPush(tokens, path, password, message, 1, false, type, -1);
	}

	public List<Integer> sendPush(List<String> tokens, String message, Integer type, Integer pushId) {
		return sendPush(tokens, path, password, message, 1, false, type, pushId);
	}


	public void sendPush(List<String> tokens, String message) throws Exception {
		PushNotificationPayload payLoad = PushNotificationPayload.alert(message);
		payLoad.addBadge(1); // iphone应用图标上小红圈上的数值
		payLoad.addSound("default"); // 铃音 默认
		PushNotificationManager pushManager = new PushNotificationManager();
		// true：表示的是产品发布推送服务 false：表示的是产品测试推送服务
		pushManager.initializeConnection(new AppleNotificationServerBasicImpl(path, password, online));
		List<Device> device = new ArrayList<Device>();
		for (String token : tokens) {
			device.add(new BasicDevice(token.replace(" ", "")));
		}
		pushManager.sendNotifications(payLoad, device);
	}

	/**
	 * TODO
	 *
	 * @param args
	 */
	public static void main(String[] args) {
	    /*IosPush send = new IosPush();
        List<String> tokens = new ArrayList<String>();
		tokens.add("dae576cfdc18b5bcadddf7aa3f9d8c0f2b37a75af16063300eea85bfb5536b31");
		String path = "F:/gaea/service/deploy/VideoChatApp/livechat_distribution_push.p12";
		String password = "11111111";
		//String message = "{'aps':{'alert':'iphone推送测试 www.baidu.com'}}";
		String message = "iphone 推送测试";
		Integer count = 1;
		boolean sendCount = true;
		send.sendPush(tokens,path,password,message,count,sendCount);*/
		IosPush iosPush = new IosPush();
		iosPush.setPassword("livu2017");
		iosPush.setPath("D:/livu_distribution_push.p12");
		iosPush.setOnline(false);
		try {
			Boolean reslt = iosPush.sendPush("8eac9948 3b6fa7fd a1068068 28a7881e b8b53608 608baf30 1b560fb8 bf4adbef", "哈哈哈");
			System.out.println(reslt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getOnline() {
		return online;
	}

	public void setOnline(Boolean online) {
		this.online = online;
	}
}
