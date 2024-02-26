package com.alan.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.alan.pojo.SysDict;

import java.util.List;


public interface DictMapper extends BaseMapper<SysDict>{
    List<SysDict> findDictByPage(Page<SysDict> page, SysDict dict);

    List<SysDict> findListByDictTypeCode(String dictTypeCode);
}
