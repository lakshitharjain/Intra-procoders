package com.infrrd.internal.employeemanagement.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * checklist Master Entity
 *
 * @author Anandu
 */
@Entity
@Table(name = "checklist_MASTER")
public class ChecklistMaster implements Serializable {

    private static final long serialVersionUID = 6996156925398952698L;
    private int checklistType;
    private String checklistDescription;
    private String modifiedBy;
    private long modifiedOn;
    private String createdBy;
    private long createdOn;
    private int status;

    /**
     * get the checklist type
     *
     * @return checklistType
     */
    @Id
    @GeneratedValue
    @Column(name = "checklist_type")
    public int getchecklistType() {
        return checklistType;
    }

    /**
     * Sets the Checcklist type
     *
     * @param checklistType
     */
    public void setchecklistType(int checklistType) {
        this.checklistType = checklistType;
    }

    /**
     * Sets the ChecckList type
     *
     * @return checklistDescription
     */
    @Column(name = "checklist_name")
    public String getchecklistDescription() {
        return checklistDescription;
    }

    /**
     * Sets the checklist Name
     *
     * @param checklistDescription
     */
    public void setchecklistDescription(String checklistDescription) {
        this.checklistDescription = checklistDescription;
    }

    /**
     * Sets the checklist Modified By Name
     *
     * @return modifiedBy
     */
    @Column(name = "modified_by")
    public String getModifiedBy() {
        return modifiedBy;
    }


    /**
     * Set Modified By Name
     *
     * @param modifiedBy
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Gets the modifiedBy Name
     *
     * @return modifiedOn
     */
    @Column(name = "modified_on")
    public long getModifiedOn() {
        return modifiedOn;
    }


    /**
     * sets the modified on Date
     *
     * @param modifiedOn
     */
    public void setModifiedOn(long modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    /**
     * Gets Created By Name
     *
     * @return
     */
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the created BY Name
     *
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets the Created on date
     *
     * @return createdOn
     */
    @Column(name = "created_on")
    public long getCreatedOn() {
        return createdOn;
    }

    /**
     * sets the Created on date
     *
     * @param createdOn
     */
    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * gets the status of the record
     *
     * @return status
     */
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    /**
     * sets the status of the record
     *
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * To string of CheckListMaster
     *
     * @return String
     */
    @Override
    public String toString() {
        return "checklistMaster [checklistType=" + checklistType + ", checklistDescription=" + checklistDescription + ", modifiedBy="
                + modifiedBy + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy + ", createdOn=" + createdOn
                + ", status=" + status + "]";
    }
}
