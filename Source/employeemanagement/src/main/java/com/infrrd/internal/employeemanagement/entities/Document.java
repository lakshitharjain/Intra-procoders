package com.infrrd.internal.employeemanagement.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DOCUMENT")

public class Document implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -991420900057289878L;


	private int documentId;
	private int documentType;
	private String filePath;
	private boolean verified;
	private boolean uploaded;
	private String modifiedBy;
	private long modifiedOn;
	private String createdBy;
	private long createdOn;
	private int status;


	public Document() {
	}

	public Document(int documentId, int documentType, String filePath, boolean verified, boolean uploaded, String modifiedBy, long modifiedOn, String createdBy, long createdOn, int status, Employee employee) {
		this.documentId = documentId;
		this.documentType = documentType;
		this.filePath = filePath;
		this.verified = verified;
		this.uploaded = uploaded;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.status = status;
		this.employee = employee;
	}


	@Id
	@Column(name = "document_id")
	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	@ManyToOne
    @JoinColumn(name = "employee_id")
	private Employee employee;
	public Employee getEmployeeId() {
		return employee;
	}

	public void setEmployeeId(Employee employee) {
		this.employee = employee;
	}

	@Column(name = "document_type")
	public int getDocumentType() {
		return documentType;
	}

	public void setDocumentType(int documentType) {
		this.documentType = documentType;
	}

	@Column(name = "file_path")
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Column(name= "verified")
	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	@Column(name= "uploaded")
	public boolean isUploaded() {
		return uploaded;
	}

	public void setUploaded(boolean uploaded) {
		this.uploaded = uploaded;
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

	@Column(name="status")
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Employee [documentId=" + documentId + ", employeeId=" + employee +  ", documentType=" + documentType
				+ ", filePath=" + filePath + ", verified=" + verified + ", uploaded=" + uploaded + ", modifiedBy="
				+ modifiedBy + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", status=" + status + "]";
	}
}
