package com.alan.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.alan.mapper.CourseTeacherMapper;
import com.alan.pojo.CourseTeacher;
import com.alan.service.CourseTeacherService;
import org.springframework.stereotype.Service;


@Service
public class CourseTeacherServiceImpl extends ServiceImpl<CourseTeacherMapper,CourseTeacher> implements CourseTeacherService {
}
