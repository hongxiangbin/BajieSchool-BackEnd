package com.zlfinfo.mapper;

import com.zlfinfo.model.StudyType;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public interface StudyTypeMapper {

    List<StudyType> selectStudyTypesByUsername(String username);

    List<StudyType> selectUnchosenStudyTypes(String username);

    List<StudyType> selectAllStudyTypes();
}
