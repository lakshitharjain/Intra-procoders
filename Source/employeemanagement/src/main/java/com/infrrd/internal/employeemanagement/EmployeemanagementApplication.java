package com.infrrd.internal.employeemanagement;

import com.infrrd.internal.employeemanagement.entities.Employee;
import com.infrrd.internal.employeemanagement.entities.PersonalDetails;
import com.infrrd.internal.employeemanagement.entities.VisaDetails;
import com.infrrd.internal.employeemanagement.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;

@SpringBootApplication
public class EmployeemanagementApplication {

	@Autowired
	private PersonalDetailsRepository personalDetailsRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	// @Autowired
	// private VisaDetailsRepository VisaDetailsRepository;

	public static void main(String[] args) {

		SpringApplication.run(EmployeemanagementApplication.class, args);
	}

	@Autowired
	public void setEmployeeRepository() {
		Employee employee = new Employee(5, "bleh5@bleh.com", "bleh", new Timestamp(System.currentTimeMillis()), "ceo",
				"HR", new Timestamp(System.currentTimeMillis()), "asdfaasfd", new Timestamp(System.currentTimeMillis()),
				1);
		employeeRepository.save(employee);

	}

//	@Autowired
//	public void setVisaDetailsRepository() {
//		VisaDetails visaDetails = new VisaDetails(3, true, new Timestamp(System.currentTimeMillis()), "INDIA", "H1",
//				"HR", new Timestamp(System.currentTimeMillis()), "HR", new Timestamp(System.currentTimeMillis()), 1);
//		VisaDetailsRepository.save(visaDetails);
//
//	}

	@Autowired
	public void setPersonalDetailsRepository() {
		PersonalDetails personalDetails = new PersonalDetails("123", "JPNagar", "A+", "HR",
				new Timestamp(System.currentTimeMillis()), "HR", new Timestamp(System.currentTimeMillis()), 1);
		personalDetailsRepository.save(personalDetails);

	}
}
