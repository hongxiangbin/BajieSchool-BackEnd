package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Banner;
import com.zlfinfo.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
@Controller
public class BannerController extends BaseController {

    @Autowired
    private BannerService bannerService;

    @RequestMapping(value = "/banner", method = RequestMethod.GET)
    @ResponseBody
    public Object showAllBanner(HttpServletResponse httpServletResponse) {
        List<Banner> bannerList = bannerService.selectAllBanner();
        return null != bannerList ? renderSuccess(bannerList, httpServletResponse) : renderError("Banner查询失败",
                httpServletResponse);

    }

}
