package com.alan.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.alan.exception.MyException;
import com.alan.mapper.DictMapper;
import com.alan.pojo.SysDict;
import com.alan.service.DictService;
import com.alan.utils.EnumCode;
import com.alan.utils.ResultUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class DictServiceImpl extends ServiceImpl<DictMapper,SysDict> implements DictService {


    @Override
    public List<SysDict> findDictByPage(Page<SysDict> page, SysDict dict) {
        return super.baseMapper.findDictByPage(page,dict);
    }

    @Override
    public List<SysDict> findListByDictTypeCode(String dictTypeCode) {
        return super.baseMapper.findListByDictTypeCode(dictTypeCode);
    }

    @Transactional
    @Override
    public Object addDict(SysDict dict) {
        Map<String,Object> map = new HashMap<>();
        map.put("dict_code",dict.getDictCode().trim());
        map.put("dict_type_code",dict.getDictTypeCode().trim());
        List<SysDict> list = super.baseMapper.selectByMap(map);
        if (list.size() > 0) {
            throw new MyException(ResultUtil.result(EnumCode.BAD_REQUEST.getValue(), "该字典已存在", null));
        }
        SysDict d = new SysDict();
        d.setDictCode(dict.getDictCode().trim());
        d.setDictValue(dict.getDictValue().trim());
        d.setDictTypeCode(dict.getDictTypeCode().trim());
        d.setDictDesc(dict.getDictDesc());
        d.setDictOrder(dict.getDictOrder());
        super.baseMapper.insert(d);
        return ResultUtil.result(EnumCode.OK.getValue(), "新增成功");
    }
}
