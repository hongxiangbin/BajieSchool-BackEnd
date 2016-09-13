package com.zlfinfo.mapper;

import com.zlfinfo.model.University;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2016/8/22.
 */
public interface UniversityMapper {

    List<University> selectAllUniversity();

    University selectUniversity(@Param("uid")Integer uid);

}
