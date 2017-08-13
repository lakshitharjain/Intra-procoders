package com.infrrd.internal.employeemanagement.domain;

import com.infrrd.internal.employeemanagement.entities.Employee;

/**
 * Personal Details Domain
 *
 * @author Lakshitha
 */
public class PersonalDetailsDomain {

	private int employeeId;

	public int getEmployeeId(Employee e) {
		return e.getEmployeeId();
	}

	public void setEmployeeId(Employee e) {
		this.employeeId = e.getEmployeeId();
	}

}
