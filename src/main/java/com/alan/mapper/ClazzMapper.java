package com.alan.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.alan.pojo.Clazz;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ClazzMapper extends BaseMapper<Clazz>{
    List<Clazz> getListByPage(Page<Clazz> page,@Param("name") String name);

    List<Clazz> getAllClazz(@Param("majorId") String majorId);
}
