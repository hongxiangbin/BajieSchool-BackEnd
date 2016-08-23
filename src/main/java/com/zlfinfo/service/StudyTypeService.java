package com.zlfinfo.service;

import com.zlfinfo.model.StudyType;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public interface StudyTypeService {

    List<StudyType> selectStudyTypesByUsername(String username);

    List<StudyType> selectUnchosenStudyTypes(String username);

    List<StudyType> selectAllStudyTypes();
}
