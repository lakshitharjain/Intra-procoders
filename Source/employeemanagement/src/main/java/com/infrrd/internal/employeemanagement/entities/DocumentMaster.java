package com.infrrd.internal.employeemanagement.entities;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DocumentMaster Entity
 *
 * @author Anand
 */
@Entity
@Table(name = "DocumentMaster")
public class DocumentMaster implements Serializable {

    /**
     * default DocumentMaster constructor
     */
    public DocumentMaster() {

    }

    /**
     * DefaultMaster parameterized constructor
     *
     * @param documentType
     * @param documentName
     * @param modifiedBy
     * @param modifiedOn
     * @param createdBy
     * @param createdOn
     * @param status
     */
    public DocumentMaster(int documentType, String documentName, String modifiedBy, Timestamp modifiedOn, String createdBy,
                          Timestamp createdOn, int status) {
        super();
        this.documentType = documentType;
        this.documentName = documentName;
        this.modifiedBy = modifiedBy;
        this.modifiedOn = modifiedOn;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.status = status;
    }

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

    private String modifiedBy;

    private Timestamp modifiedOn;

    private String createdBy;

    private Timestamp createdOn;

    private int status;

    /**
     * method to get documentType
     *
     * @return documentType
     */
    @Column(name = "document_type")
    public int getDocumentType() {
        return documentType;
    }

    /**
     * method to set  documentType
     *
     * @param documentType
     */
    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }

    /**
     * method to get documentName
     *
     * @return documentName
     */
    @Column(name = "document_name")
    public String getDocumentName() {
        return documentName;
    }

    /**
     * method to set documentName
     *
     * @param documentName
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * method to get modifiedBy
     *
     * @return modifiedBy
     */
    @Column(name = "modified_by")
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * method to set modifiedBy
     *
     * @param modifiedBy
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * method to get modifiedOn
     *
     * @return modifiedOn
     */
    @Column(name = "modified_on")
    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    /**
     * method to set modifiedOn
     *
     * @param modifiedOn
     */
    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    /**
     * method to get  createdBy
     *
     * @return createdBy
     */
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * method to set createdBy
     *
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * method to get createdBy
     *
     * @return createdBy
     */
    @Column(name = "created_on")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    /**
     * method to set createdBy
     *
     * @param createdOn
     */
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * method to get status
     *
     * @return status
     */
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    /**
     * method to set status
     *
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

}