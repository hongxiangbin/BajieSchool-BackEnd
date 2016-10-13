package com.zlfinfo.mapper;

import com.zlfinfo.model.Captcha;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaptchaMapper {

    List<Captcha> selectDate(@Param("email") String email);

    int deleteByPrimaryKey(Integer id);

    int insert(Captcha record);

    int insertSelective(Captcha record);

    Captcha selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Captcha record);

    int updateByPrimaryKey(Captcha record);
}