package com.alan.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("t_institute")
public class Institute implements Serializable{
    private String id;
    private String name;              //学院名
    @TableField("institute_number")
    private String instituteNumber;  //学院编码
    @TableField(exist = false)
    private String[] ids;            //id集合
}
