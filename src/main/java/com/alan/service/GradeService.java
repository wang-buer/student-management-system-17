package com.alan.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.alan.pojo.Grade;

import java.util.List;


public interface GradeService extends IService<Grade>{
    List<Grade> viewStudent(Page<Grade> page, String id);
    Object updateScore(Grade grade);
}
