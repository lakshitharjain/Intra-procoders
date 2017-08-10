package com.infrrd.internal.employeemanagement.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {

	public Employee()
    {
        super();
    }

    public Employee(int employeeId, String emailId, String employeeName, long dateOfJoining, String designation,
			String modifiedBy, long modifiedOn, String createdBy, long createdOn, int status) {
		super();
		this.employeeId = employeeId;
		this.emailId = emailId;
		this.employeeName = employeeName;
		this.dateOfJoining = dateOfJoining;
		this.designation = designation;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.status = status;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -991420900057289878L;

	private int employeeId;
	private String emailId;
	private String employeeName;
	private long dateOfJoining;
	private String designation;
	private String modifiedBy;
	private long modifiedOn;
	private String createdBy;
	private long createdOn;
	private int status;

	@Id
	@Column(name = "employee_id")
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "email_id")
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "employee_name")
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Column(name = "date_of_joining")
	public long getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(long dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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
		return "Employee [employeeId=" + employeeId + ", emailId=" + emailId + ", employeeName=" + employeeName
				+ ", dateOfJoining=" + dateOfJoining + ", designation=" + designation + ", modifiedBy=" + modifiedBy
				+ ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", status="
				+ status + "]";
	}
}
