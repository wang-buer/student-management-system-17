package com.alan.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.alan.pojo.Institute;
import com.alan.service.InstituteService;
import com.alan.utils.EnumCode;
import com.alan.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("institute")
public class InstituteController {

    @Autowired
    private InstituteService instituteService;

    @GetMapping("/list")
    public Object getInstituteByPage(Integer startPage,Integer pageSize,String name){
        Page<Institute> page = new Page<>(startPage,pageSize);
        List<Institute> list = instituteService.getInstituteByPage(page,name);
        return ResultUtil.result(EnumCode.OK.getValue(),"请求成功",list,page.getTotal());
    }

    //添加学院
    @PostMapping("/add")
    public Object addInstitute(Institute institute){
        return instituteService.addInstitute(institute);
    }
    //添加学院
    @PostMapping("/delete")
    public Object deleteInstitute(Institute institute){
        String[] ids = institute.getIds();
        if (null == ids || ids.length == 0) {
            return ResultUtil.result(EnumCode.BAD_REQUEST.getValue(), EnumCode.BAD_REQUEST.getText());
        }
        return instituteService.deleteInstitute(ids);
    }
    //学院下拉列表
    @GetMapping("/findAllInstitute")
    public Object findAllInstitute(){
        List<Institute> list = instituteService.findAllInstitute();
        return ResultUtil.result(EnumCode.OK.getValue(),"请求成功",list);
    }
}
