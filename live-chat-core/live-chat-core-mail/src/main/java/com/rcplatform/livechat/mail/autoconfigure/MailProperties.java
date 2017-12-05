package com.rcplatform.livechat.mail.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * Created by Yang Peng on 2017/5/9.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@ConfigurationProperties(prefix = MailProperties.MAIL)
public class MailProperties {


    static  final  String MAIL = "mail";


    private Map<String,String> exception;


    private Map<String,String> mailSender;





    public Map<String, String> getException() {
        return exception;
    }

    public void setException(Map<String, String> exception) {
        this.exception = exception;
    }

    public Map<String, String> getMailSender() {
        return mailSender;
    }

    public void setMailSender(Map<String, String> mailSender) {
        this.mailSender = mailSender;
    }
}
