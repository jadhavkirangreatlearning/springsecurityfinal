package com.greatlearning.service;

import com.greatlearning.model.Employee;
import com.greatlearning.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    public Employee saveData(Employee employee){
        return employeeRepoImpl.save(employee);


    }

    public List<Employee> getAllData(){
        return employeeRepoImpl.findAll();
    }

    public void deleteDataById(int empId){
        employeeRepoImpl.deleteById(empId);
    }
}
