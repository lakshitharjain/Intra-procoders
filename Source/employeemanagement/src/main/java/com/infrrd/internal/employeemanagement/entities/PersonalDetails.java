package com.infrrd.internal.employeemanagement.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONAL_DETAILS")
public class PersonalDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9000896415486788199L;
	
	private String phoneNumber;
	private String address;
	private String bloodGroup;
	private String modifiedBy;
	private long modifiedOn;
	private String createdBy;
	private long createdOn;
	private int status;
	
	@Id
	private Employee employee;

	
	@Column(name = "employee_id")
	public Employee getEmployeeId() {
		return employee;
	}

	public void setEmployeeId(Employee employee) {
		this.employee = employee;
	}

	@Column(name = "phone_number")
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name = "blood_group")
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	@Column(name = "modified_by")
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	@Column(name = "modified_on")
	public long getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(long modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	
	@Column(name = "created_by")
	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	@Column(name = "created_on")
	public long getCreatedOn() {
		return createdOn;
	}
	

	public void setCreatedOn(long createdOn) {
		this.createdOn = createdOn;
	}
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "PersonalDetails [employeeId=" + employee + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", bloodGroup=" + bloodGroup + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn
				+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", status=" + status + "]";
	}
	
	

}
