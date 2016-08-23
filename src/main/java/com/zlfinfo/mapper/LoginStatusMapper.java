package com.zlfinfo.mapper;

import com.zlfinfo.model.LoginStatus;

/**
 * Created by Administrator on 2016/8/22.
 */
public interface LoginStatusMapper {

    int updateStatus(LoginStatus loginStatus);

    int insertStatus(LoginStatus loginStatus);

    int selectStatus(String username);
}
