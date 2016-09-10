package com.zlfinfo.service;

import com.zlfinfo.model.Setting;

/**
 * Created by Administrator on 2016/9/10.
 */
public interface SettingService {

    int insert(Setting setting);

    int updateSetting(Setting setting);
}
