package com.alan.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.alan.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TeacherMapper extends BaseMapper<Teacher>{
    List<Teacher> getListByPage(Page<Teacher> page,@Param("name") String name);

    List<Teacher> findAllTeacher();
}
