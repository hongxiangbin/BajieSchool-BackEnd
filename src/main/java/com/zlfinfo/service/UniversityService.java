package com.zlfinfo.service;

import com.zlfinfo.model.University;

import java.util.List;

/**
 * Created by Administrator on 2016/8/22.
 */
public interface UniversityService {

    List<University> selectAllUniversity();

    University selectUniversity();

}
