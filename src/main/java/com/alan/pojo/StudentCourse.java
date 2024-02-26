package com.alan.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("t_student_course")
public class StudentCourse implements Serializable{
    private String id;
    @TableField("student_id")
    private String studentId;   //学生id
    @TableField("course_id")
    private String courseId;    //课程id
}
