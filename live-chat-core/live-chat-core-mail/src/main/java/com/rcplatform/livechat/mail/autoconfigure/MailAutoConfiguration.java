package com.rcplatform.livechat.mail.autoconfigure;

import com.rcplatform.livechat.mail.service.MailService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.thymeleaf.TemplateEngine;

import java.util.Properties;

/**
 * Created by Yang Peng on 2017/5/10.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@Configuration
@EnableConfigurationProperties(MailProperties.class)
public class MailAutoConfiguration {


    private MailProperties mailProperties;


    public MailAutoConfiguration(MailProperties mailProperties) {
        this.mailProperties = mailProperties;
    }


    @Bean
    @Primary
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost(mailProperties.getMailSender().get("host"));
        javaMailSender.setUsername(mailProperties.getMailSender().get("username"));
        javaMailSender.setPassword(mailProperties.getMailSender().get("password"));
        javaMailSender.setPort(Integer.parseInt(mailProperties.getMailSender().get("port")));
        Properties props = javaMailSender.getJavaMailProperties();
        props.put("mail.smtp.auth", mailProperties.getMailSender().get("mail.smtp.auth"));
        props.put("mail.smtp.timeout", mailProperties.getMailSender().get("mail.smtp.timeout"));
        props.put("mail.smtp.socketFactory.class", mailProperties.getMailSender().get("mail.smtp.socketFactory.class"));
        return javaMailSender;
    }


    @Bean
    @Primary
    public MailService mailService(TemplateEngine templateEngine) {
        return new MailService(templateEngine, javaMailSender(),
                "email", threadPoolTaskExecutor(), mailProperties.getMailSender().get("username"));
    }


    @Bean
    public JavaMailSender exceptionJavaMailSender() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost(mailProperties.getException().get("host"));
        javaMailSender.setUsername(mailProperties.getException().get("username"));
        javaMailSender.setPassword(mailProperties.getException().get("password"));
        Properties props = javaMailSender.getJavaMailProperties();
        props.put("mail.smtp.auth", mailProperties.getException().get("mail.smtp.auth"));
        props.put("mail.smtp.timeout", mailProperties.getException().get("mail.smtp.timeout"));
        return javaMailSender;
    }


    @Bean
    public MailService exceptionMailService(TemplateEngine templateEngine) {
        return new MailService(templateEngine, exceptionJavaMailSender(), "exception-email", exceptionThreadPoolTaskExecutor(),
                mailProperties.getException().get("username"), mailProperties.getException().get("toEmail"));
    }


    ThreadPoolTaskExecutor exceptionThreadPoolTaskExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setMaxPoolSize(10);
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }

    ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setMaxPoolSize(10);
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }
}
