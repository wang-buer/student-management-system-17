package com.alan.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.alan.pojo.CourseTeacher;
import com.alan.pojo.Grade;

import java.util.List;


public interface GradeMapper extends BaseMapper<Grade>{
    List<Grade> viewStudent(CourseTeacher courseTeacher);
}
