package com.infrrd.internal.employeemanagement.services;

import com.infrrd.internal.employeemanagement.domain.NewPersonalDetailsDomain;
import com.infrrd.internal.employeemanagement.domain.PersonalDetailsDomain;
import com.infrrd.internal.employeemanagement.entities.PersonalDetails;
import com.infrrd.internal.employeemanagement.exceptions.InvalidInputException;
import com.infrrd.internal.employeemanagement.exceptions.PersonalDetailsNotFoundException;

/**
 * Personal Details Service
 *
 * @author Lakshitha
 */
public interface PersonalDetailsService {
	public PersonalDetailsDomain addPersonalDetails(NewPersonalDetailsDomain newDomain) throws InvalidInputException;

	public PersonalDetailsDomain getPersonalDetails(NewPersonalDetailsDomain eid)
			throws PersonalDetailsNotFoundException;

	public PersonalDetailsDomain updatePersonalDetails(PersonalDetails personalDetails)
			throws PersonalDetailsNotFoundException;

	public boolean deletePersonalDetailsByEmployeeId(PersonalDetails eid) throws PersonalDetailsNotFoundException;
}
