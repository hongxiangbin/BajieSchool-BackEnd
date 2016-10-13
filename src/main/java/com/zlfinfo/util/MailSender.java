package com.zlfinfo.util;

/**
 * Created by Administrator on 2016/4/9.
 */

import com.zlfinfo.model.Mail;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import java.util.List;


/**
 * 邮件发送的方法。
 *
 * @author Administrator
 */
public class MailSender {

    public static final String HOST = "smtp.ym.163.com";
    public static final String SENDER = "bajieschool@zlfinfo.com.cn";
    public static final String NAME = "八戒上学网络科技有限公司";
    public static final String USERNAME = "bajieschool@zlfinfo.com.cn";
    public static final String PASSWORD = "19930620";
    public static final String SUBJECT = "八戒上学验证码";

    /**
     * send one by one
     *
     * @param receiver
     * @return
     */
    public boolean send(String receiver) {

        String message = "[请勿回复]<br/>您的八戒上学APP验证码为 <b>" + MathToolkit.generateCaptcha() + " </b>; 该验证码10分钟内有效！";
        Mail mail = new Mail(MailSender.HOST, MailSender.SENDER, receiver, MailSender.NAME, MailSender.USERNAME, MailSender.PASSWORD, MailSender.SUBJECT, message);
        HtmlEmail htmlEmail = new HtmlEmail();
        try {
            htmlEmail.setHostName(mail.getHost());
            htmlEmail.setCharset(Mail.ENCODEING);
            htmlEmail.addTo(mail.getReceiver());
            htmlEmail.setFrom(mail.getSender(), mail.getName());
            htmlEmail.setAuthentication(mail.getUsername(), mail.getPassword());
            htmlEmail.setSubject(mail.getSubject());
            htmlEmail.setMsg(mail.getMessage());
            htmlEmail.send();
            return true;
        } catch (EmailException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * send via group
     *
     * @param recieverList
     */
    public void sendGroup(List<String> recieverList) {
        for (int i = 0; i < recieverList.size(); i++) {
            this.send(recieverList.get(i));
        }
    }

}
