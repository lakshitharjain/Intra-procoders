package com.infrrd.internal.employeemanagement.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "DOCUMENT")


/**
 * Document Entities class
 * @author Anand
 *
 */
public class Document implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -991420900057289878L;


    private int documentId;
    @OneToOne
    private DocumentMaster documentMaster;
    private String filePath;
    private boolean verified;
    private boolean uploaded;
    private String modifiedBy;
    private Timestamp modifiedOn;
    private String createdBy;
    private Timestamp createdOn;
    private int status;

    @ManyToOne
    private Employee employee;

    /**
     * default Document constructor
     */
    public Document() {
    }

    /**
     * Parameterized Document constructor
     *
     * @param documentId
     * @param documentMaster
     * @param filePath
     * @param verified
     * @param uploaded
     * @param modifiedBy
     * @param modifiedOn
     * @param createdBy
     * @param createdOn
     * @param status
     * @param employee
     */
    public Document(int documentId, DocumentMaster documentMaster, String filePath, boolean verified, boolean uploaded,
                    String modifiedBy, Timestamp modifiedOn, String createdBy, Timestamp createdOn, int status, Employee employee) {
        super();
        this.documentId = documentId;
        this.documentMaster = documentMaster;
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


    /**
     * @return document id.
     */
    @Id
    @Column(name = "document_id")
    public int getDocumentId() {
        return documentId;
    }


    /**
     * @param documentId
     */
    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    /**
     * Method to get employee
     *
     * @return employee
     */
    @JoinColumn(name = "employee_id")
    public Employee getEmployeeId() {
        return employee;
    }

    /**
     * @param employee
     */
    public void setEmployeeId(Employee employee) {
        this.employee = employee;
    }

    /**
     * method to get documentMaster
     *
     * @return document type
     */
    public DocumentMaster getDocumentMaster() {
        return documentMaster;
    }

    /**
     * method to set document type
     *
     * @param documentMaster
     */
    public void setDocumentMaster(DocumentMaster documentMaster) {
        this.documentMaster = documentMaster;
    }

    /**
     * method to get file path
     *
     * @return file path
     */
    @Column(name = "file_path")
    public String getFilePath() {
        return filePath;
    }

    /**
     * method to set filePath
     *
     * @param filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * @return verified
     */
    @Column(name = "verified")
    public boolean isVerified() {
        return verified;
    }

    /**
     * method to set
     *
     * @param verified
     */
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    /**
     * @return uploaded
     */
    @Column(name = "uploaded")
    public boolean isUploaded() {
        return uploaded;
    }

    /**
     * @param uploaded
     */
    public void setUploaded(boolean uploaded) {
        this.uploaded = uploaded;
    }

    /**
     * @return modified by
     */
    @Column(name = "modified_by")
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * @param modifiedBy
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * @return modifiedOn
     */
    @Column(name = "modified_on")
    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    /**
     * @param modifiedOn
     */
    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    /**
     * @return createdBy
     */
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return createdOn
     */
    @Column(name = "created_on")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    /**
     * @param createdOn
     */
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * @return status
     */
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Overridden toString() method
     */
    @Override
    public String toString() {
        return "Document [documentId=" + documentId + ", documentMaster=" + documentMaster + ", filePath=" + filePath
                + ", verified=" + verified + ", uploaded=" + uploaded + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn
                + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", status=" + status + ", employee=" + employee + "]";
    }
}