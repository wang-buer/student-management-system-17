package com.alan.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.alan.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StudentMapper extends BaseMapper<Student>{
    List<Student> getListByPage(Page<Student> page, @Param("name") String name);
    Integer getStudentCount(@Param("majorId") String majorId);
}
