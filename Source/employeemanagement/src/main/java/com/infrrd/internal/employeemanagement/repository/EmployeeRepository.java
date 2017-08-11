package com.infrrd.internal.employeemanagement.repository;

import com.infrrd.internal.employeemanagement.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public List<Employee> findByEmployeeId(int employeeId);

}
