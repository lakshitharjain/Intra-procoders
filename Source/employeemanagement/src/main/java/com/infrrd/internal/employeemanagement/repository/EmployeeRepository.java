package com.infrrd.internal.employeemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infrrd.internal.employeemanagement.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	public List<Employee> findByEmployeeId(int employeeId); 

}
