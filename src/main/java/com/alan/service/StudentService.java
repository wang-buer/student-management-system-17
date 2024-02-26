package com.alan.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.alan.pojo.Student;

import java.util.List;


public interface StudentService extends IService<Student>{
    List<Student> getListByPage(Page<Student> page, String name);
    Object addStudent(Student student);
    Integer getStudentCount(String majorId);
    Object deleteStudent(String[] ids);
}
