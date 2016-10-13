package com.zlfinfo.service.impl;


import com.zlfinfo.mapper.CaptchaMapper;
import com.zlfinfo.model.Captcha;
import com.zlfinfo.service.CaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 29140 on 2016/10/13.
 */
@Service
public class CaptchaServiceImpl implements CaptchaService {

    @Autowired
    private CaptchaMapper captchaMapper;

    @Override
    public List<Captcha> selectCaptchaDate(String email) {
        return captchaMapper.selectDate(email);
    }
}
