package com.zlfinfo.mapper;

import com.zlfinfo.model.Setting;

public interface SettingMapper {
    int insert(Setting record);

    int updateSetting(Setting setting);
}