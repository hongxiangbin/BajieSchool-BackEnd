package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Captcha;
import com.zlfinfo.service.CaptchaService;
import com.zlfinfo.util.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Created by 29140 on 2016/10/13.
 */
@Controller
public class CaptchaController extends BaseController {

    @Autowired
    private CaptchaService captchaService;

    @RequestMapping(value = "/captcha", method = RequestMethod.GET)
    @ResponseBody
    public Object sendCaptcha(@RequestParam String email, HttpServletResponse httpServletResponse) {
        List<Captcha> captchaList = captchaService.selectCaptchaDate(email);

        if (null != captchaList) {
            if (captchaList.size() > 0) {
                if (new Date().getTime() - captchaList.get(0).getDate().getTime() > 60 * 1000) {
                    if (new MailSender().send(email)) {
                        captchaService.insertCaptcha(new Captcha(null, MailSender.captchaCode, email, new Date()));
                        return renderSuccess("验证码发送成功!", httpServletResponse);
                    } else {
                        return renderSuccess("验证码发送失败!", httpServletResponse);
                    }
                } else {
                    return renderError("请1分钟后重试!", httpServletResponse);
                }
            } else {
                if (new MailSender().send(email)) {
                    captchaService.insertCaptcha(new Captcha(null, MailSender.captchaCode, email, new Date()));
                    return renderSuccess("验证码发送成功!", httpServletResponse);
                } else {
                    return renderSuccess("验证码发送失败!", httpServletResponse);
                }
            }
        } else {
            return renderError("验证码信息查询失败!", httpServletResponse);
        }

    }

}
