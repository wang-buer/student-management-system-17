package com.alan.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.alan.mapper.RoleMapper;
import com.alan.pojo.Role;
import com.alan.service.RoleService;
import com.alan.utils.EnumCode;
import com.alan.utils.ResultUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    /**
     * @desc: 查询角色
     */
    public List<Role> findRoleByPage(Page<Role> page,String roleName) {
        return super.baseMapper.findRoleByPage(page,roleName);
    }

    /**
     * @desc: 新增角色
     */
    @Transactional
    public Object addRoles(Role vo) {
        Role r = new Role();
        r.setName(vo.getName());
        r.setRoleDesc(vo.getRoleDesc());
        super.baseMapper.insert(r);
        return ResultUtil.result(EnumCode.OK.getValue(), "新增成功");
    }

    /**
     * @desc: 删除角色
     */
    @Transactional
    public Object delRole(String[] ids) {

        for (String id : ids) {
            super.baseMapper.deleteById(id);
        }
        return ResultUtil.result(EnumCode.OK.getValue(), "删除成功");
    }

    /**
     * 绑定角色下拉框
     */
   public List<Role> findAllRoles() {
       return super.baseMapper.findAllRoles();
   }
}
