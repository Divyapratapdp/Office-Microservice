package com.example.Employee.Service.Model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
@Data
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String department;
    Integer contact;

}
