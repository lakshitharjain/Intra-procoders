package com.infrrd.internal.employeemanagement.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Employee Entity which is related to the EMPLOYEE table
 *
 * @author Anandu
 */

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {

    private static final long serialVersionUID = -991420900057289878L;
    private int employeeId;
    private String emailId;
    private String employeeName;
    private Timestamp dateOfJoining;
    private String designation;
    private String modifiedBy;
    private Timestamp modifiedOn;
    private String createdBy;
    private Timestamp createdOn;
    private int status;
    @OneToMany(mappedBy = "employee")
    private List<Document> Documents;
    /**
     * Constructor for the Employee entity
     */
    public Employee() {
        super();
    }

    /**
     * Constructor for the Employee entity
     *
     * @param employeeId
     * @param emailId
     * @param employeeName
     * @param dateOfJoining
     * @param designation
     * @param modifiedBy
     * @param modifiedOn
     * @param createdBy
     * @param createdOn
     * @param status
     */

    public Employee(int employeeId, String emailId, String employeeName, Timestamp dateOfJoining, String designation,
                    String modifiedBy, Timestamp modifiedOn, String createdBy, Timestamp createdOn, int status) {
        super();
        this.employeeId = employeeId;
        this.emailId = emailId;
        this.employeeName = employeeName;
        this.dateOfJoining = dateOfJoining;
        this.designation = designation;
        this.modifiedBy = modifiedBy;
        this.modifiedOn = modifiedOn;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.status = status;
    }

    /**
     * Gets the Employee ID
     *
     * @return employeeId
     */
    @Id
    @Column(name = "employee_id")
    public int getEmployeeId() {
        return employeeId;
    }


    /**
     * Sets the the employee ID
     *
     * @param employeeId
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Gets the EmailId of the employee
     *
     * @return emailId
     */
    @Column(name = "email_id")
    public String getEmailId() {
        return emailId;
    }

    /**
     * Sets the Email Id of the employee
     *
     * @param emailId
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * Gets  the Employee Name
     *
     * @return employee_name
     */
    @Column(name = "employee_name")
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Sets the Employee Name
     *
     * @param employeeName
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * Gets the Date of JJoining of the employee
     *
     * @return dateOfJoining
     */
    @Column(name = "date_of_joining")
    public Timestamp getDateOfJoining() {
        return dateOfJoining;
    }

    /**
     * Sets the Date of Joining of the Employee
     *
     * @param dateOfJoining
     */
    public void setDateOfJoining(Timestamp dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    /**
     * Gets the Designation of the Employee
     *
     * @return designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the Designation of the Employee
     *
     * @param designation
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * Gets the Modified persons name
     *
     * @return modifiedBy
     */
    @Column(name = "modified_by")
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the Modified by persons Name
     *
     * @param modifiedBy
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Gets the Modified on date
     *
     * @return modifiedOn
     */
    @Column(name = "modified_on")
    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    /**
     * Sets the Modified on date
     *
     * @param modifiedOn
     */
    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    /**
     * Gtes the created by name
     *
     * @return createdBY
     */
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * sets the createdBY Name
     *
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets the Created on Date
     *
     * @return createdOn
     */
    @Column(name = "created_on")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the Created on date
     *
     * @param createdOn
     */
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Gets the Status of the Record
     *
     * @return status
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the Status of the status
     *
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * The to string of the employee entity
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", emailId=" + emailId + ", employeeName=" + employeeName
                + ", dateOfJoining=" + dateOfJoining + ", designation=" + designation + ", modifiedBy=" + modifiedBy
                + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", status="
                + status + "]";
    }
}
