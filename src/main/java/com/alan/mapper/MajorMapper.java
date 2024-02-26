package com.alan.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.alan.pojo.Major;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MajorMapper extends BaseMapper<Major>{
    public List<Major> getListByPage(Page<Major> page, @Param("name") String name);

    public List<Major> findAllMajor(@Param("instituteId") String instituteId);
}
