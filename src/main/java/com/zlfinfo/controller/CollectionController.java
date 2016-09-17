package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Collection;
import com.zlfinfo.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/9/17.
 */
@Controller
public class CollectionController extends BaseController {

    @Autowired
    private CollectionService collectionService;

    @RequestMapping(value = "/collection/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Object showCollection(@PathVariable String username, HttpServletResponse httpServletResponse) {
        List<Collection> collectionList = collectionService.selectAllCollection(username);

        return null != collectionList ? renderSuccess(collectionList, httpServletResponse) : renderError("收藏查询失败！",
                httpServletResponse);
    }

    @RequestMapping(value = "/collection/chshow/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object changeIsShow(@PathVariable Integer id, HttpServletResponse httpServletResponse) {
        int num = collectionService.updateIsShow(id);
        return num > 0 ? renderSuccess("收藏删除成功！", httpServletResponse) : renderError("收藏删除失败！", httpServletResponse);

    }

}
