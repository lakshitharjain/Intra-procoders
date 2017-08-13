package com.infrrd.internal.employeemanagement.entities;

/**
 * Entity class for implementing checkList at the time of employee transfer
 *
 * @author Ankit
 */

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "CHECKLIST")
public class Checklist implements Serializable {

	private static final long serialVersionUID = 4855033653988831690L;

	private int checklistId;
	private String checkListValue;
	private boolean completed;
	private String modifiedBy;
	private Timestamp modifiedOn;
	private String createdBy;
	private Timestamp createdOn;
	private int status;
	private ChecklistMaster checklistMaster;
	private Employee employee;

	/**
	 * Method to get Checklist ID
	 *
	 * @return Checklist ID
	 */
	@Id
	@GeneratedValue
	@Column(name = "checklist_id")
	public int getCheckListId() {
		return checklistId;
	}

	/**
	 * Sets the checkList ID to input specified as parameter
	 *
	 * @param checkListId
	 *            CheckList ID
	 */
	public void setCheckListId(int checkListId) {
		this.checklistId = checkListId;
	}

	/**
	 * Method to get CheckListMater object
	 *
	 * @return CheckListMaster object
	 */
	@ManyToOne
	public ChecklistMaster getChecklistMaster() {
		return checklistMaster;
	}

	/**
	 * Method to set CheckListMaster reference in CheckList
	 *
	 * @param checklistMaster
	 *            reference object of CheckListMaster
	 */
	public void setChecklistMaster(ChecklistMaster checklistMaster) {
		this.checklistMaster = checklistMaster;
	}

	@ManyToOne
	/**
	 * Method to get employee referred
	 * 
	 * @return employee object
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * Method to set employee object
	 *
	 * @param employee
	 *            employee for which checklist is meant
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * Method to get CheckList Value
	 *
	 * @return CheckList Value
	 */
	@Column(name = "checklist_value")
	public String getCheckListValue() {
		return checkListValue;
	}

	/**
	 * Method to set CheckList Value
	 *
	 * @param checkListValue
	 *            Its a String determining checkList Value
	 */
	public void setCheckListValue(String checkListValue) {
		this.checkListValue = checkListValue;
	}

	/**
	 * Method to check status of CheckList
	 *
	 * @return boolean determining checklist status
	 */
	@Column(name = "completed")
	public boolean isCompleted() {
		return completed;
	}

	/**
	 * Method to set Checklist status
	 *
	 * @param completed
	 *            boolean determining checklist status
	 */
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	/**
	 * Method to get Modifier name
	 *
	 * @return Name of the Modifier
	 */
	@Column(name = "modified_by")
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * Method to set Modifier name
	 *
	 * @param modifiedBy
	 *            Name of the Modifier
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * Method to get Last modification Date
	 *
	 * @return Last modification Date
	 */
	@Column(name = "modified_on")
	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	/**
	 * Method to set Last modification Date
	 *
	 * @param modifiedOn
	 *            Date determining Modification date
	 */
	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	/**
	 * Method to get Creator Name
	 *
	 * @return Creator Name
	 */
	@Column(name = "created_by")
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * Method to set Creator Name
	 *
	 * @param createdBy
	 *            Creator Name
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "created_on")
	/**
	 * Method to get Date on which the checkList is created
	 * 
	 * @return Date on which the checkList is created
	 */
	public Timestamp getCreatedOn() {
		return createdOn;
	}

	/**
	 * Method to set Date on which the checkList is created
	 *
	 * @param createdOn
	 */
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * Method to get checkList status
	 *
	 * @return checklist status
	 */
	@Column(name = "status")
	public int getStatus() {
		return status;
	}

	/**
	 * Method to set checkList status
	 *
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * Method to format checklist object as a printed String
	 */
	@Override
	public String toString() {
		return "CheckList [checkListId=" + checklistId + ", employeeId=" + employee + ", checkListType="
				+ checklistMaster + ", checkListValue=" + checkListValue + ", completed=" + completed + ", modifiedBy="
				+ modifiedBy + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", status=" + status + "]";
	}

}
