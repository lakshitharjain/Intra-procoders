package com.infrrd.internal.employeemanagement.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Skills master Entity for the Skills Master Table
 *
 * @author Anandu
 */

@Entity
@Table(name = "SKILLS_MASTER")
public class SkillsMaster implements Serializable {

    private static final long serialVersionUID = -1736265490127501232L;
    private int skillType;
    private String skillDescription;
    private String modifiedBy;
    private Timestamp modifiedOn;
    private String createdBy;
    private Timestamp createdOn;
    private int status;

    /**
     * SkillsMaster COnstructor
     */
    public SkillsMaster() {
    }

    /**
     * SkillsMaster COnstructor
     * @param skillType
     * @param skillDescription
     * @param modifiedBy
     * @param modifiedOn
     * @param createdBy
     * @param createdOn
     * @param status
     */
    public SkillsMaster(int skillType, String skillDescription, String modifiedBy, Timestamp modifiedOn, String createdBy, Timestamp createdOn, int status) {
        this.skillType = skillType;
        this.skillDescription = skillDescription;
        this.modifiedBy = modifiedBy;
        this.modifiedOn = modifiedOn;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.status = status;
    }

    /**
     * Gets the SkillsType
     *
     * @return skillType
     */
    @Id
    @GeneratedValue
    @Column(name = "skill_type")
    public int getSkillType() {
        return skillType;
    }

    /**
     * Sets the Skill Type
     *
     * @param skillType
     */
    public void setSkillType(int skillType) {
        this.skillType = skillType;
    }

    /**
     * Gets the Description of the Skill
     *
     * @return SkillDescription
     */
    @Column(name = "skill_description")
    public String getSkillDescription() {
        return skillDescription;
    }

    /**
     * Sets the Skills Description
     *
     * @param skillDescription
     */
    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    /**
     * Gets Modified By Name
     *
     * @return modifiedBy
     */
    @Column(name = "modified_by")
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the Modified BY Name
     *
     * @param modifiedBy
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Gets the Modified On Date
     *
     * @return modified On date
     */
    @Column(name = "modified_on")
    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    /**
     * Sets Modified On date
     *
     * @param modifiedOn
     */
    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    /**
     * Gets CreatedBy Name
     *
     * @return createdBY
     */
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets Created By Name
     *
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets the created on date
     *
     * @return createdOn
     */
    @Column(name = "created_on")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the create On date
     *
     * @param createdOn
     */
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Gets the satus of the record
     *
     * @return status
     */
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    /**
     * gets the status of the record
     *
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * The to string method of the Skills Master Entity
     *
     * @return String
     */
    @Override
    public String toString() {
        return "SkillsMaster [skillType=" + skillType + ", skillDescription=" + skillDescription + ", modifiedBy="
                + modifiedBy + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy + ", createdOn=" + createdOn
                + ", status=" + status + "]";
    }
}
