package com.zlfinfo.mapper;

import com.zlfinfo.model.Setting;

public interface SettingMapper {
    int deleteByPrimaryKey(String username);

    int insert(Setting record);

    int insertSelective(Setting record);

    Setting selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(Setting record);

    int updateByPrimaryKey(Setting record);
}