package com.infrrd.internal.employeemanagement.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SKILLS")
public class Skills implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2466480565840422574L;
	
	private int SkillId;
	private String modifiedBy;
	private long modifiedOn;
	private String createdBy;
	private long createdOn;
	private int status;
	
	@Id
	@Column(name = "skill_id")
	public int getSkillId() {
		return SkillId;
	}
	public void setSkillId(int skillId) {
		SkillId = skillId;
	}
	

	@ManyToOne
	@JoinColumn(name = "employee_id", table = "EMPLOYEE")
	private Employee employee;

	
	@Column(name = "employee_id")
	public Employee getEmployeeId() {
		return employee;
	}

	public void setEmployeeId(Employee employee) {
		this.employee = employee;
	}
	
	@ManyToOne
	@JoinColumn(name = "skill_type", table = "SKILLS_MASTER")
	private Skills skill;

	
	@Column(name = "skill_type")
	public Skills getskill() {
		return skill;
	}

	public void setSkill(Skills skills) {
		this.skill=skills;;
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
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Skills [SkillId=" + SkillId + ", employeeId=" + employee + ", skillType=" + skill
				+ ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", status=" + status + "]";
	}
	
	
}
