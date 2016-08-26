package com.zlfinfo.mapper;

import com.zlfinfo.model.MyInfo;

/**
 * Created by Administrator on 2016/8/26.
 */
public interface MyInfoMapper {

    MyInfo selectMyInfo(String username);
}
