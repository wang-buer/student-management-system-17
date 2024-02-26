package com.alan.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.alan.pojo.Teacher;
import com.alan.service.TeacherService;
import com.alan.utils.EnumCode;
import com.alan.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/list")
    public Object getListByPage(Integer startPage,Integer pageSize,String name){
        Page<Teacher> page = new Page<>(startPage,pageSize);
        List<Teacher> list = teacherService.getListByPage(page,name);
        return ResultUtil.result(EnumCode.OK.getValue(),"请求成功",list,page.getTotal());
    }

    @PostMapping("/add")
    public Object addTeacher (Teacher teacher){
        return teacherService.addTeacher(teacher);
    }

    @GetMapping("/findAllTeacher")
    public Object findAllTeacher() {
        List<Teacher> allTeacher = teacherService.findAllTeacher();
        return ResultUtil.result(EnumCode.OK.getValue(),"请求成功",allTeacher);
    }
}
