package com.alan.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("t_course_teacher")
public class CourseTeacher implements Serializable{
    private String id;
    @TableField("course_id")
    private String courseId;   //课程id
    @TableField("teacher_id")
    private String teacherId;  //老师id
}
