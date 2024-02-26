package com.alan.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.alan.pojo.Teacher;

import java.util.List;


public interface TeacherService extends IService<Teacher>{
    List<Teacher> getListByPage(Page<Teacher> page,String name);
    Object addTeacher(Teacher teacher);
    List<Teacher> findAllTeacher();
}
