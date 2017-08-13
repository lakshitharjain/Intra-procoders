package com.infrrd.internal.employeemanagement.services;

import com.infrrd.internal.employeemanagement.entities.Employee;
import com.infrrd.internal.employeemanagement.entities.VisaDetails;
import com.infrrd.internal.employeemanagement.exceptions.EmployeeNotFoundException;
import com.infrrd.internal.employeemanagement.exceptions.InvalidInputException;
import com.infrrd.internal.employeemanagement.exceptions.VisaDetailsNotFoundException;

/**
 * Visa Details Service
 *
 * @author Lakshitha
 */
public interface VisaDetailsService {

	/**
	 * 
	 * @return
	 */
	public boolean addVisaDetails(Employee employee_id, VisaDetails visaStatus, VisaDetails expiry_date,
			VisaDetails Country, VisaDetails visaType) throws InvalidInputException;

	public VisaDetails getVisaDetailsByEmployeeId(Employee employee_id)
			throws InvalidInputException, VisaDetailsNotFoundException, EmployeeNotFoundException;

	public VisaDetails updateVisaDetails(VisaDetails visa) throws InvalidInputException, VisaDetailsNotFoundException;

	public boolean deleteVisaDetails(VisaDetails visaId) throws InvalidInputException, VisaDetailsNotFoundException;
}
