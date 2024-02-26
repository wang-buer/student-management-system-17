package com.alan.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.alan.mapper.UserRoleMapper;
import com.alan.pojo.UserRole;
import com.alan.service.UserRoleService;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {
	
}
