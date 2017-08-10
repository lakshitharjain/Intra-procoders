package com.infrrd.internal.employeemanagement;

import com.infrrd.internal.employeemanagement.entities.Document;
import com.infrrd.internal.employeemanagement.entities.Employee;
import com.infrrd.internal.employeemanagement.repository.DocumentRepository;
import com.infrrd.internal.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeemanagementApplication {

	@Autowired
	private  EmployeeRepository employeeRepository;

	public static void main(String[] args) {

		SpringApplication.run(EmployeemanagementApplication.class, args);
	}

	@Autowired
	public  void setEmployeeRepository() {
		Employee employee=new Employee(16  ,"bleh16@bleh.com", "bleh", 23452345, "ceo","HR", 2345234,"asdfaasfd", 2345234, 1);
		employeeRepository.save(employee );

	}
}
