package com.alan.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.alan.pojo.Institute;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface InstituteMapper extends BaseMapper<Institute>{
    List<Institute> getInstituteByPage(Page<Institute> page,@Param("name") String name);

    public List<Institute> findAllInstitute();
}
