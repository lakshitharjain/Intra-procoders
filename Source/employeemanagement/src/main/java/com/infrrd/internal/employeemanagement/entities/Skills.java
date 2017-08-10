package com.infrrd.internal.employeemanagement.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Skills Entity TO store the Skills of the Employees
 *
 * @author Raviprasanna
 */
@Entity
@Table(name = "SKILLS")
public class Skills implements Serializable {


    private static final long serialVersionUID = -2466480565840422574L;

    private int skillId;
    private String modifiedBy;
    private long modifiedOn;
    private String createdBy;
    private long createdOn;
    private int status;
    private SkillsMaster skillsMaster;
    private Employee employee;

    /**
     * Default Skills constructor
     */
    public Skills() {
    }

    /**
     * parametrized Skills constructor
     *
     * @param skillId
     * @param modifiedBy
     * @param modifiedOn
     * @param createdBy
     * @param createdOn
     * @param status
     * @param skillsMaster
     * @param employee
     */
    public Skills(int skillId, String modifiedBy, long modifiedOn, String createdBy, long createdOn, int status, SkillsMaster skillsMaster, Employee employee) {
        this.skillId = skillId;
        this.modifiedBy = modifiedBy;
        this.modifiedOn = modifiedOn;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.status = status;
        this.skillsMaster = skillsMaster;
        this.employee = employee;
    }

    @Id
    @Column(name = "skill_id")
    /**
     * Method to get skill id
     * @return skillId
     */
    public int getSkillId() {
        return skillId;
    }

    /**
     * Method to set skill id
     *
     * @param skillId
     */
    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }


    @ManyToOne
    @JoinColumn(name = "employee_id", table = "EMPLOYEE")
    /**
     * Method to get employee id
     * @return employee
     */
    public Employee getEmployeeId() {
        return employee;
    }

    /**
     * Method to set employee id
     *
     * @param employee
     */
    public void setEmployeeId(Employee employee) {
        this.employee = employee;
    }

    @ManyToOne
    @JoinColumn(name = "skill_type", table = "SKILLS_MASTER")
    /**
     * Method to get skill
     * @return skillsMaster
     */
    public SkillsMaster getskill() {
        return skillsMaster;
    }

    /**
     * Method to set skill
     *
     * @param skillsMaster
     */
    public void setSkill(SkillsMaster skillsMaster) {
        this.skillsMaster = skillsMaster;
    }

    @Column(name = "modified_by")
    /**
     * Method to get the user who modified
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Method to set the user who modified
     *
     * @param modifiedBy
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Column(name = "modified_on")
    /**
     * Method to get the time when modified
     * @return modifiedOn
     */
    public long getModifiedOn() {
        return modifiedOn;
    }

    /**
     * Method to set the time when modified
     *
     * @param modifiedOn
     */
    public void setModifiedOn(long modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    @Column(name = "created_by")
    /**
     *Method to get the user who created
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Method to set the user who created
     *
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name = "created_on")
    /**
     * Method to get the time when created
     * @return createdOn
     */
    public long getCreatedOn() {
        return createdOn;
    }

    /**
     * Method to set the time when created
     *
     * @param createdOn
     */
    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Method to get status
     *
     * @return status
     */
    public int getStatus() {
        return status;
    }

    /**
     * Method to set status
     *
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Skills [SkillId=" + skillId + ", employeeId=" + employee + ", skillType=" + skillsMaster
                + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy
                + ", createdOn=" + createdOn + ", status=" + status + "]";
    }


}
