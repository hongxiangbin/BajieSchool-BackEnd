package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.LoginStatusMapper;
import com.zlfinfo.model.LoginStatus;
import com.zlfinfo.service.LoginStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/22.
 */
@Service
public class LoginStatusServiceImpl implements LoginStatusService {
    @Autowired
    private LoginStatusMapper loginStatusMapper;

    @Override
    public void updateStatus(LoginStatus loginStatus) {
        loginStatusMapper.updateStatus(loginStatus);
    }

    @Override
    public int insertStatus(LoginStatus loginStatus) {
        return loginStatusMapper.insertStatus(loginStatus);
    }

    @Override
    public int selectStatusByUsername(String username) {
        return loginStatusMapper.selectStatus(username);
    }

}