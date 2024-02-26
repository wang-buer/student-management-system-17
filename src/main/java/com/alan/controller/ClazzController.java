package com.alan.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.alan.pojo.Clazz;
import com.alan.service.ClazzService;
import com.alan.utils.EnumCode;
import com.alan.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("clazz")
public class ClazzController {
    @Autowired
    private ClazzService clazzService;

    @GetMapping("/list")
    public Object getListByPage(Integer startPage,Integer pageSize,String name){
        Page<Clazz> page = new Page<>(startPage,pageSize);
        List<Clazz> list = clazzService.getListByPage(page,name);
        return ResultUtil.result(EnumCode.OK.getValue(),"请求成功",list,page.getTotal());
    }

    @PostMapping("/add")
    public Object addClazz(Clazz clazz){
        return clazzService.addClazz(clazz);
    }

    @PostMapping("/delete")
    public Object deleteClazz(Clazz clazz){
        String[] ids = clazz.getIds();
        if (null == ids || ids.length == 0) {
            return ResultUtil.result(EnumCode.BAD_REQUEST.getValue(), EnumCode.BAD_REQUEST.getText());
        }
        return clazzService.deleteClazz(ids);
    }

    @GetMapping("/findAllClazz")
    public Object getAllClazz(String majorId){
        List<Clazz> list = clazzService.getAllClazz(majorId);
        return ResultUtil.result(EnumCode.OK.getValue(),"请求成功",list);
    }
}
