package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Setting;
import com.zlfinfo.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/9/10.
 */
@Controller
public class SettingController extends BaseController {
    @Autowired
    private SettingService settingService;


    @RequestMapping(value = "/setting/update", method = RequestMethod.POST)
    @ResponseBody
    public void updateSetting(@RequestParam String username, @RequestParam String isUpdate, @RequestParam String
            isShareLoc, @RequestParam String isShowImg) {
        Setting setting = new Setting(username, isUpdate, isShareLoc, isShowImg, null, null, null);
        settingService.updateSetting(setting);
    }

}
