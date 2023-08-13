package com.example.Employee.Service.Repository;

import com.example.Employee.Service.Model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel,Integer> {
}
