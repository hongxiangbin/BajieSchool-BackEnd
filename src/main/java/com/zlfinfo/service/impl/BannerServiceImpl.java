package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.BannerMapper;
import com.zlfinfo.model.Banner;
import com.zlfinfo.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public List<Banner> selectAllBanner() {
        return bannerMapper.selectAllBanner();
    }
}
