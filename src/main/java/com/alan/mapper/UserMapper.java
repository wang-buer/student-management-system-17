package com.alan.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.alan.pojo.User;

import java.util.List;


public interface UserMapper extends BaseMapper<User>{
    //分页查询
    List<User> findUserByPage(Pagination page,User user);

    //登录验证
    List<User> checkUser(User user);

    User findUserByUsername(String username);

    //不分页查询
    List<User> findAllUser(User user);
}
