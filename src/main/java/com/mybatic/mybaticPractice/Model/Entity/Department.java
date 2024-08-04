package com.mybatic.mybaticPractice.Model.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Department {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private Long employee_id;
    private String deptName;

}
