package com.bnpparibas.hackathon.employee.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bnpparibas.hackathon.employee.api.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
