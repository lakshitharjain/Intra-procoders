package com.infrrd.internal.employeemanagement.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CHECKLIST_MASTER")
public class CheckListMaster implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6996156925398952698L;
	
	
	private int checkListType;
	private String checkListName;
	private String modifiedBy;
	private long modifiedOn;
	private String createdBy;
	private long createdOn;
	private int status;
	
	@Id
	@GeneratedValue
	@Column(name="checklist_type")
	public int getCheckListType() {
		return checkListType;
	}
	public void setCheckListType(int checkListType) {
		this.checkListType = checkListType;
	}
	
	@Column(name="checklist_name")
	public String getCheckListName() {
		return checkListName;
	}
	public void setCheckListName(String checkListName) {
		this.checkListName = checkListName;
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
		return "CheckListMaster [checkListType=" + checkListType + ", checkListName=" + checkListName + ", modifiedBy="
				+ modifiedBy + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", status=" + status + "]";
	}
	
	

}
