package com.alan.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.alan.mapper.GradeMapper;
import com.alan.pojo.CourseTeacher;
import com.alan.pojo.Grade;
import com.alan.service.CourseTeacherService;
import com.alan.service.GradeService;
import com.alan.utils.EnumCode;
import com.alan.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GradeServiceImpl extends ServiceImpl<GradeMapper,Grade> implements GradeService {
    @Autowired
    private CourseTeacherService courseTeacherService;

    @Override
    public List<Grade> viewStudent(Page<Grade> page,String id) {
        //根据id查找课程-老师表信息，拿到课程id和老师id
        CourseTeacher courseTeacher = courseTeacherService.selectById(id);
        return super.baseMapper.viewStudent(courseTeacher);
    }

    @Transactional
    @Override
    public Object updateScore(Grade grade) {
        Integer count = super.baseMapper.updateById(grade);
        if(count>0){
            return ResultUtil.result(EnumCode.OK.getValue(),"录入成绩，成功");
        }else {
            return ResultUtil.result(EnumCode.OK.getValue(),"录入成绩，失败");
        }

    }
}
