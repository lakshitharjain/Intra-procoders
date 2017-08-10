package com.infrrd.internal.employeemanagement.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="DocumentMaster")
public class DocumentMaster implements Serializable {
	@Override
	public String toString() {
		return "DocumentMaster [documentType=" + documentType + ", documentName=" + documentName + ", modifiedBy="
				+ modifiedBy + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", status=" + status + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8531267203985306174L;

	@Id 
	@GeneratedValue
	private int documentType;
		
	private String documentName;
		
	private long modifiedBy;
		
	private long modifiedOn;
		
	private long createdBy;
		
	private long createdOn;
		
	private boolean status;

	@Column (name="document_type")
	public int getDocumentType() {
		return documentType;
	}

	public void setDocumentType(int documentType) {
		this.documentType = documentType;
	}

	@Column (name="document_name")
	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	@Column (name="modified_by")
	public long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Column (name="modified_on")
	public long getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(long modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	@Column (name="created_by")
	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	@Column (name="created_on")
	public long getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(long createdOn) {
		this.createdOn = createdOn;
	}

	@Column (name="status")
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
