package com.zlfinfo.test;

import com.zlfinfo.util.MailSender;
import org.junit.Test;

/**
 * Created by 29140 on 2016/10/12.
 */
public class MailTest {

    @Test
    public void sendMail() {

        boolean isSendOK = new MailSender().send("249048056@qq.com");

        if (true == isSendOK) {
            System.out.println("发送成功!");
        } else {
            System.out.println("发送失败!");
        }
    }
}