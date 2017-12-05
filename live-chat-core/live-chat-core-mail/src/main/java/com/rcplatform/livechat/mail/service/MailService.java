package com.rcplatform.livechat.mail.service;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Map;

/**
 * Created by Yang Peng on 2017/5/9.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public class MailService {


    private TemplateEngine templateEngine;


    private JavaMailSender javaMailSender;


    private String template;


    private ThreadPoolTaskExecutor threadPoolTaskExecutor;


    private String fromEmail;


    private String toEmail;


    public MailService(TemplateEngine templateEngine, JavaMailSender javaMailSender, String template,
                       ThreadPoolTaskExecutor threadPoolTaskExecutor, String fromEmail, String toEmail) {
        this.templateEngine = templateEngine;
        this.javaMailSender = javaMailSender;
        this.template = template;
        this.threadPoolTaskExecutor = threadPoolTaskExecutor;
        this.fromEmail = fromEmail;
        this.toEmail = toEmail;
    }

    public MailService(TemplateEngine templateEngine, JavaMailSender javaMailSender, String template,
                       ThreadPoolTaskExecutor threadPoolTaskExecutor, String fromEmail) {
        this.templateEngine = templateEngine;
        this.javaMailSender = javaMailSender;
        this.template = template;
        this.threadPoolTaskExecutor = threadPoolTaskExecutor;
        this.fromEmail = fromEmail;
    }



    public void sendMessage(Map<String,String> map, String subject, String toEmail) throws MessagingException {
        // Prepare the evaluation context
        final Context ctx = new Context();
        for(Map.Entry<String,String> entry:map.entrySet()){
            ctx.setVariable(entry.getKey(),entry.getValue());
        }
        // Prepare message using a Spring helper
        final MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        final MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8"); // true = multipart
        messageHelper.setSubject(subject);
        messageHelper.setFrom(fromEmail);
        messageHelper.setTo(toEmail);
        // Create the HTML body using Thymeleaf
        final String htmlContent = this.templateEngine.process(template, ctx);
        messageHelper.setText(htmlContent, true); // true = isHtml
        // Send mail
        javaMailSender.send(mimeMessage);
    }


    public void sendMessage(Map<String,String> map, String subject) throws MessagingException {
       sendMessage(map,subject,toEmail);
    }


    public void asyncSendMessage(Map<String,String> map, String subject, String toEmail){
        threadPoolTaskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    sendMessage(map,subject,toEmail);
                } catch (MessagingException e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public void asyncSendMessage(Map<String,String> map, String subject){
        threadPoolTaskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    sendMessage(map,subject);
                } catch (MessagingException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
