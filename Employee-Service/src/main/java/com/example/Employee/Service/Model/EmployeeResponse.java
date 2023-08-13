package com.example.Employee.Service.Model;

import lombok.Data;

@Data
public class EmployeeResponse {
    Integer id;
    String name;
    String department;
    Integer contact;
    AddressResponse addressResponse;
}
