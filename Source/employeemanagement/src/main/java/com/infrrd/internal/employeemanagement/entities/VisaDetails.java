package com.infrrd.internal.employeemanagement.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * VisaDetails Entity
 * @author Lakshita
 */
@Entity
@Table(name = "VISA_DETAILS")
public class VisaDetails implements Serializable {

    private static final long serialVersionUID = 2561938392184597076L;

    /**
     * Default constructor
     */

    public VisaDetails() {
        super();
    }

    /**
     * Constructor that initializes all the attributes for the current object
     */
    public VisaDetails(int visaId, Boolean visaStatus, Timestamp expiryDate, String country, String visaType,
                       String modifiedBy, Timestamp modifiedOn, String createdBy, Timestamp createdOn, int status) {
        super();
        this.visaId = visaId;
        this.visaStatus = visaStatus;
        this.expiryDate = expiryDate;
        this.country = country;
        this.visaType = visaType;
        this.modifiedBy = modifiedBy;
        this.modifiedOn = modifiedOn;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.status = status;
    }

    int visaId;
    boolean visaStatus;
    Timestamp expiryDate;
    String country;
    String visaType;
    String modifiedBy;
    Timestamp modifiedOn;
    String createdBy;
    Timestamp createdOn;
    int status;

    @Id
    @GeneratedValue
    @Column(name = "visa_id")
    public int getVisa_id() {
        return visaId;
    }

    public void setVisa_id(int visaId) {
        this.visaId = visaId;
    }

    @ManyToOne
    @JoinColumn(name = "employee_id", table = "EMPLOYEE")
    private Employee employee;

    /**
     * Method to return the employee_id
     */
    @Column(name = "employee_id")
    public Employee getEmployeeId() {
        return employee;
    }

    /**
     * Method to set the employee_id
     */
    public void setEmployeeId(Employee employee) {
        this.employee = employee;
    }

    /**
     * Method to return the status of visa
     */
    @Column(name = "visa_status")
    public boolean isVisa_status() {
        return visaStatus;
    }

    /**
     * Method to set the status of visa
     */
    public void setVisa_status(boolean visa_status) {
        this.visaStatus = visa_status;
    }

    /**
     * Method to get the expiry_date of visa
     */
    @Column(name = "expiry_date")
    public Timestamp getExpiry_date() {
        return expiryDate;
    }

    /**
     * Method to set the expiry_date of visa
     */
    public void setExpiry_date(Timestamp expiry_date) {
        this.expiryDate = expiry_date;
    }

    /**
     * Method to get the country
     */
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    /**
     * Method to set the country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Method to get the visa type
     */
    @Column(name = "visa_type")
    public String getVisa_type() {
        return visaType;
    }

    /**
     * Method to set the visa type
     */

    public void setVisa_type(String visaType) {
        this.visaType = visaType;
    }

    /**
     * Method to get the modified_by attribute
     */
    @Column(name = "modified_by")
    public String getModified_by() {
        return modifiedBy;
    }

    /**
     * Method to set the modified_by attribute
     */
    public void setModified_by(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Method to get the modified_on attribute
     */
    @Column(name = "modified_on")
    public Timestamp getModified_on() {
        return modifiedOn;
    }

    /**
     * Method to set the modified_by attribute
     */
    public void setModified_on(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    /**
     * Method to get the created_by attribute
     */
    @Column(name = "created_by")
    public String getCreated_by() {
        return createdBy;
    }

    /**
     * Method to set the created_by attribute
     */
    public void setCreated_by(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Method to get the created_on attribute
     */
    @Column(name = "created_on")
    public Timestamp getCreated_on() {
        return createdOn;
    }

    /**
     * Method to set the created_by attribute
     */
    public void setCreated_on(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Method to get the status
     */
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    /**
     * Method to set the status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "visaDetails [visaId=" + visaId + ", employeeId=" + employee + ", visaStatus=" + visaStatus
                + ", expiryDate=" + expiryDate + ", country=" + country + ", visaType=" + visaType + ", modifiedBy="
                + modifiedBy + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy + ", createdOn=" + createdOn
                + ", status=" + status + "]";
    }

}