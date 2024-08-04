package com.mybatic.mybaticPractice.Mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatic.mybaticPractice.Model.Entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper  extends BaseMapper<Employee> {

    void save(@Param("addUser") Employee employee);



}
