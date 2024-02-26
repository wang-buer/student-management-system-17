package com.alan.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.alan.pojo.Institute;

import java.util.List;


public interface InstituteService extends IService<Institute>{
    List<Institute> getInstituteByPage(Page<Institute> page, String name);

    public Object addInstitute(Institute institute);

    public List<Institute> findAllInstitute();

    Object deleteInstitute(String[] ids);
}
