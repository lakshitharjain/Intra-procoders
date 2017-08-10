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
@Table(name="EMPLOYEE")
public class CheckList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4855033653988831690L;
	
	
	private int checkListId;
	private String checkListValue;
	private boolean completed;
	private String modifiedBy;
	private long modifiedOn;
	private String createdBy;
	private long createdOn;
	private int status;
	
	
	@Id
	@GeneratedValue
	@Column(name="checklist_id")
	public int getCheckListId() {
		return checkListId;
	}
	public void setCheckListId(int checkListId) {
		this.checkListId = checkListId;
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

	@ManyToOne
	@JoinColumn(name = "checklist_type", table = "CHECKLIST_MASTER")
	private CheckList checklist;

	
	@Column(name = "checklist_type")
	public CheckList getchecklist() {
		return checklist;
	}

	public void setChecklist(CheckList checklist) {
		this.checklist=checklist;
	}

	@Column(name="checklist_value")
	public String getCheckListValue() {
		return checkListValue;
	}
	public void setCheckListValue(String checkListValue) {
		this.checkListValue = checkListValue;
	}
	
	@Column(name="completed")
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	@Column(name="modified_by")
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	@Column(name="modified_on")
	public long getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(long modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	
	@Column(name="created_by")
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	@Column(name="created_on")
	public long getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(long createdOn) {
		this.createdOn = createdOn;
	}
	
	@Column(name="status")
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "CheckList [checkListId=" + checkListId + ", employeeId=" + employee + ", checkListType="
				+ checklist + ", checkListValue=" + checkListValue + ", completed=" + completed + ", modifiedBy="
				+ modifiedBy + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", status=" + status + "]";
	}
	
	
	
	
	
	

}
