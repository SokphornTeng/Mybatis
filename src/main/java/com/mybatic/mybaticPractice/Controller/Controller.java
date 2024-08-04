package com.mybatic.mybaticPractice.Controller;

import com.mybatic.mybaticPractice.Model.Entity.Employee;
import com.mybatic.mybaticPractice.Service.DataServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Resource
    private DataServiceImpl dataService;

    @PostMapping("/addEmployee")
    public String save(@RequestBody Employee employee){
        dataService.save(employee);
        return "Success";
    }

}
