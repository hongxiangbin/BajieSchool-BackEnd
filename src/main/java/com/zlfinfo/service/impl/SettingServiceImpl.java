package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.SettingMapper;
import com.zlfinfo.model.Setting;
import com.zlfinfo.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/10.
 */
@Service
public class SettingServiceImpl implements SettingService {

    @Autowired
    private SettingMapper settingMapper;

    @Override
    public int insert(Setting setting) {
        return 0;
    }

    @Override
    public int updateSetting(Setting setting) {
        return settingMapper.updateSetting(setting);
    }
}
