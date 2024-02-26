package com.alan.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.alan.pojo.Clazz;

import java.util.List;


public interface ClazzService extends IService<Clazz>{
    List<Clazz> getListByPage(Page<Clazz> page,String name);
    public Object addClazz(Clazz clazz);

    List<Clazz> getAllClazz(String majorId);

    Object deleteClazz(String[] ids);
}
