package com.mybatic.mybaticPractice.Service;

//import com.mybatic.mybaticPractice.Mapper.DepartmentMapper;
import com.mybatic.mybaticPractice.Mapper.UserMapper;
import com.mybatic.mybaticPractice.Model.Entity.Department;
import com.mybatic.mybaticPractice.Model.Entity.Employee;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class DataServiceImpl implements DataService{

    @Resource
    private UserMapper userMapper;


    @Override
    public void save(Employee employee) {
      userMapper.save(employee);
    }





}
