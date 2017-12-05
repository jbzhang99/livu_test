package com.rcplatform.livechat;

import com.rcplatform.videochat.model.EmailSendRecord;

/**
 * Created by Yang Peng on 2017/5/16.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public interface IEmailSendRecordModule {



    void addEmailSendRecord(EmailSendRecord emailSendRecord);



    Integer getEmailSendCount(Integer userId);
}
