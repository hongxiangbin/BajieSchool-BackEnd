package com.zlfinfo.mapper;

import com.zlfinfo.model.Collection;

import java.util.List;

public interface CollectionMapper {
    int insertCollection(Collection collection);

    List<Collection> selectAllCollection(String username);

    int updateIsShow(Integer id);
}