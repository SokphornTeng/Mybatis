package com.mybatic.mybaticPractice.Model.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class Employee {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String fullName;
    private Integer age;
    private String email;
}
