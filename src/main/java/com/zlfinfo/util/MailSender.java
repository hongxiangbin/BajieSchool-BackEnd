package com.zlfinfo.util;

/**
 * Created by Administrator on 2016/4/9.
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.LogManager;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.slf4j.Logger;


/**
 * 邮件发送的方法。
 *
 * @author Administrator
 */
public class MailSender {

    private static String host, sender, name, username, password;

    static {
        host = "smtp.163.com";
        sender = "15071243361@163.com";
        name = "15071243361@163.com";
        username = "15071243361@163.com";
        password = "NYY54312";
    }

    public boolean send(Mail mail) {

        HtmlEmail email = new HtmlEmail();
        try {
            email.setHostName(mail.getHost());
            email.setCharset(Mail.ENCODEING);
            email.addTo(mail.getReceiver());
            email.setFrom(mail.getSender(), mail.getName());
            email.setAuthentication(mail.getUsername(), mail.getPassword());
            email.setSubject(mail.getSubject());
            email.setMsg(mail.getMessage());
            email.send();
            return true;
        } catch (EmailException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void sendGroup(List<Mail> mails) {
        for (int i = 0; i < mails.size(); i++) {
            this.send(mails.get(i));
        }
    }

}
