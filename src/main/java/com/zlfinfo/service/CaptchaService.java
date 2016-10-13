package com.zlfinfo.service;


import com.zlfinfo.model.Captcha;

import java.util.List;

/**
 * Created by 29140 on 2016/10/13.
 */
public interface CaptchaService {

    List<Captcha> selectCaptchaDate(String email);

}
