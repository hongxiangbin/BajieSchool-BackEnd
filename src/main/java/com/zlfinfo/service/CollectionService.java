package com.zlfinfo.service;

import com.zlfinfo.model.Collection;

import java.util.List;

/**
 * Created by Administrator on 2016/9/17.
 */
public interface CollectionService {

    List<Collection> selectAllCollection(String username);

    int updateIsShow(Integer id);

}
