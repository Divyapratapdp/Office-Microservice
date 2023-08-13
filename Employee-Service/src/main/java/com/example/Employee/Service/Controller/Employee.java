package com.example.Employee.Service.Controller;

import com.example.Employee.Service.Model.EmployeeResponse;
import com.example.Employee.Service.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
    @Autowired
    EmployeeService employeeService;


    @GetMapping("/emp/{id}")
    public ResponseEntity<EmployeeResponse> employee(@PathVariable Integer id){
        EmployeeResponse employeeResponse=employeeService.getEmployee(id);
        return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
    }
}
