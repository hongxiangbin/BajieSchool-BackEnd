package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.CollectionMapper;
import com.zlfinfo.model.Collection;
import com.zlfinfo.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/9/17.
 */
@Service
public class CollectionServiceImpl implements CollectionService {

    @Autowired
    private CollectionMapper collectionMapper;

    @Override
    public List<Collection> selectAllCollection(String username) {
        return collectionMapper.selectAllCollection(username);
    }

    @Override
    public int updateIsShow(Integer id) {
        return collectionMapper.updateIsShow(id);
    }
}
