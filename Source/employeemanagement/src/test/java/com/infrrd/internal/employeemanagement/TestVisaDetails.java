package com.infrrd.internal.employeemanagement;

import java.sql.Timestamp;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import com.infrrd.internal.employeemanagement.entities.VisaDetails;
import com.infrrd.internal.employeemanagement.repository.VisaDetailsRepository;

public class TestVisaDetails {
	@Autowired
	private VisaDetailsRepository VisaDetailsRepository;

	@Autowired
	VisaDetails visaDetails = new VisaDetails(5, true, new Timestamp(System.currentTimeMillis()), "INDIA", "H1", "HR",
			new Timestamp(System.currentTimeMillis()), "HR", new Timestamp(System.currentTimeMillis()), 1);

	@Test
	public void testSave() throws Exception {
		SpringApplication.run(TestVisaDetails.class);
		VisaDetailsRepository.save(visaDetails);
	}

}
