package com.zlfinfo.service;

import com.zlfinfo.model.Study;

import java.util.List;

/**
 * Created by Administrator on 2016/8/25.
 */
public interface StudyService {

    List<Study> selectStudyByTypeNUser(Integer type, String username);
}
