package com.infrrd.internal.employeemanagement.entities;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * Checklist Entity
 */
@Entity
@Table(name = "CHECKLIST")
public class Checklist implements Serializable {


    private static final long serialVersionUID = 4855033653988831690L;


    private int checklistId;
    private String checklistValue;
    private boolean completed;
    private String modifiedBy;
    private Timestamp modifiedOn;
    private String createdBy;
    private Timestamp createdOn;
    private int status;
    private ChecklistMaster checklistMaster;
    private Employee employee;


    /**
     * Method to get checklist ID
     *
     * @return checklist ID
     */
    @Id
    @GeneratedValue
    @Column(name = "checklist_id")
    public int getchecklistId() {
        return checklistId;
    }


    /**
     * Sets the checklist ID to input specified as parameter
     *
     * @param checklistId checklist ID
     */
    public void setchecklistId(int checklistId) {
        this.checklistId = checklistId;
    }

    /**
     * Method to get checklistMater object
     *
     * @return checklistMaster object
     */
    @ManyToOne
    public ChecklistMaster getchecklistMaster() {
        return checklistMaster;
    }


    /**
     * Method to set checklistMaster reference in checklist
     *
     * @param checklistMaster reference object of checklistMaster
     */
    public void setchecklistMaster(ChecklistMaster checklistMaster) {
        this.checklistMaster = checklistMaster;
    }


    @ManyToOne
    /**
     * Method to get employee referred
     * @return employee object
     */
    public Employee getEmployee() {
        return employee;
    }


    /**
     * Method to set employee object
     *
     * @param employee employee for which checklist is meant
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    /**
     * Method to get checklist Value
     *
     * @return checklist Value
     */
    @Column(name = "checklist_value")
    public String getchecklistValue() {
        return checklistValue;
    }


    /**
     * Method to set checklist Value
     *
     * @param checklistValue Its a String determining checklist Value
     */
    public void setchecklistValue(String checklistValue) {
        this.checklistValue = checklistValue;
    }


    /**
     * Method to check status of checklist
     *
     * @return boolean determining checklist status
     */
    @Column(name = "completed")
    public boolean isCompleted() {
        return completed;
    }


    /**
     * Method to set checklist status
     *
     * @param completed boolean determining checklist status
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
     * @param modifiedBy Name of the Modifier
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
     * @param modifiedOn Date determining Modification date
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
     * @param createdBy Creator Name
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }


    @Column(name = "created_on")
    /**
     * Method to get Date on which the checklist is created
     * @return Date on which the checklist is created
     */
    public Timestamp getCreatedOn() {
        return createdOn;
    }


    /**
     * Method to set Date on which the checklist is created
     *
     * @param createdOn the checklist is createdOn
     */
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Method to get checklist status
     *
     * @return checklist status
     */
    @Column(name = "status")
    public int getStatus() {
        return status;
    }


    /**
     * Method to set checklist status
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
        return "checklist [checklistId=" + checklistId + ", employeeId=" + employee + ", checklistType=" + checklistMaster
                + ", checklistValue=" + checklistValue + ", completed=" + completed + ", modifiedBy=" + modifiedBy + ", modifiedOn="
                + modifiedOn + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", status=" + status + "]";
    }


}