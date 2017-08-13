package com.infrrd.internal.employeemanagement.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import com.infrrd.internal.employeemanagement.entities.Employee;

public class NewVisaDetailsDomain implements Serializable {
	/**
	 * New Visa Details Domain
	 *
	 * @author Lakshitha
	 */
	private static final long serialVersionUID = 4744635828035464177L;
	protected Employee employee;
	protected boolean visaStatus;
	protected Timestamp expiryDate;
	protected String country;
	protected String visaType;
	protected int status;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public boolean isVisaStatus() {
		return visaStatus;
	}

	public void setVisaStatus(boolean visaStatus) {
		this.visaStatus = visaStatus;
	}

	public Timestamp getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getVisaType() {
		return visaType;
	}

	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "NewVisaDetailsDomain [employee=" + employee + ", visaStatus=" + visaStatus + ", expiryDate="
				+ expiryDate + ", country=" + country + ", visaType=" + visaType + ", status=" + status + "]";
	}

}
