package com.alan.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.alan.pojo.Course;

import java.text.ParseException;
import java.util.List;


public interface CourseService extends IService<Course>{
    List<Course> getListByPage(Page<Course> page, String name);

    Object addCourse(Course course) throws ParseException;

    Object deleteCourse(String[] ids);

    List<Course> getNotSelectedCourse(Page<Course> page, String studentId);

    List<Course> getSelectedCourse(Page<Course> page, String studentId);

    Object addCourseToStudent(Course course);

    List<Course> getCourseByTeacher(Page<Course> page,String teacherId);

}
