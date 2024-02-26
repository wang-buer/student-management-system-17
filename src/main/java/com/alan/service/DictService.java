package com.alan.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.alan.pojo.SysDict;

import java.util.List;


public interface DictService extends IService<SysDict>{
    List<SysDict> findDictByPage(Page<SysDict> page, SysDict dict);

    List<SysDict> findListByDictTypeCode(String dictTypeCode);

    Object addDict(SysDict dict);
}
