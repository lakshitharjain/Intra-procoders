package com.infrrd.internal.employeemanagement.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VISA_DETAILS")
public class VisaDetails implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1992926637469721647L;
	
	
	int visaId;			
	boolean visaStatus;	
	long expiryDate;
	String country;
	String visaType;
	String modifiedBy;
	long modifiedOn;
	String createdBy;
	long createdOn;
	int status;
	
	
	@Id
	@GeneratedValue
	@Column(name = "visa_id")
	public int getVisa_id() {
		return visaId;
	}
	public void setVisa_id(int visaId) {
		this.visaId = visaId;
	}

	@ManyToOne
	@JoinColumn(name = "employee_id", table = "EMPLOYEE")
	private Employee employee;

	
	@Column(name = "employee_id")
	public Employee getEmployeeId() {
		return employee;
	}

	public void setEmployeeId(Employee employee) {
		this.employee = employee;
	}
	
	@Column(name = "visa_status")
	public boolean isVisa_status() {
		return visaStatus;
	}
	public void setVisa_status(boolean visa_status) {
		this.visaStatus = visa_status;
	}
	@Column(name = "expiry_date")
	public long getExpiry_date() {
		return expiryDate;
	}
	public void setExpiry_date(long expiry_date) {
		this.expiryDate = expiry_date;
	}
	@Column(name = "country")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Column(name = "visa_type")
	public String getVisa_type() {
		return visaType;
	}
	public void setVisa_type(String visaType) {
		this.visaType = visaType;
	}
	@Column(name = "modified_by")
	public String getModified_by() {
		return modifiedBy;
	}
	public void setModified_by(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	@Column(name = "modified_on")
	public long getModified_on() {
		return modifiedOn;
	}
	public void setModified_on(long modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	
	@Column(name = "created_by")
	public String getCreated_by() {
		return createdBy;
	}
	public void setCreated_by(String createdBy) {
		this.createdBy = createdBy;
	}
	@Column(name = "created_on")
	public long getCreated_on() {
		return createdOn;
	}
	public void setCreated_on(long createdOn) {
		this.createdOn = createdOn;
	}
	@Column(name = "status")
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "visaDetails [visaId=" + visaId + ", employeeId=" + employee + ", visaStatus=" + visaStatus
				+ ", expiryDate=" + expiryDate + ", country=" + country + ", visaType=" + visaType + ", modifiedBy="
				+ modifiedBy + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", status=" + status + "]";
	}
	
}
