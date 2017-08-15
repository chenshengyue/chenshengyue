package com.csy.dao.mapper.grade;

import com.csy.model.grade.Grade;
import com.csy.model.grade.GradeConditions;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeMapper {
    int countByExample(GradeConditions example);

    int deleteByExample(GradeConditions example);

    int deleteByPrimaryKey(Integer id);

    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> selectByExample(GradeConditions example);

    Grade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Grade record, @Param("example") GradeConditions example);

    int updateByExample(@Param("record") Grade record, @Param("example") GradeConditions example);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}