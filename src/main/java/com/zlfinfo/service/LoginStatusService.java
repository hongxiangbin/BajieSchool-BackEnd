package com.zlfinfo.service;

import com.zlfinfo.model.LoginStatus;

/**
 * Created by Administrator on 2016/8/22.
 */
public interface LoginStatusService {

    void updateStatus(LoginStatus loginStatus);

    int insertStatus(LoginStatus loginStatus);

    int selectStatusByUsername(String username);
}
