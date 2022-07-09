package com.greatlearning.controller;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/savedata")
    public Employee saveData(@RequestBody Employee employee){
        return employeeServiceImpl.saveData(employee);
    }

    @GetMapping("/")
    public List<Employee> getAllData(){
        return employeeServiceImpl.getAllData();
    }

    @DeleteMapping("/{empId}")
    public String deleteDataById(@PathVariable int empId){

        employeeServiceImpl.deleteDataById(empId);
        return "Data Deleted Successfully";
    }
}
