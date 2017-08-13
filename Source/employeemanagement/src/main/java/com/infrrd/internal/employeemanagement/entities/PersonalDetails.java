package com.infrrd.internal.employeemanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Personal Details Entities
 *
 * @author Lakshitha
 */
@Entity
@Table(name = "PERSONAL_DETAILS")
public class PersonalDetails implements Serializable {

	private static final long serialVersionUID = 9000896415486788199L;
	// private int employee_id;
	private String phoneNumber;
	private String address;
	private String bloodGroup;
	private String modifiedBy;
	private Timestamp modifiedOn;
	private String createdBy;
	private Timestamp createdOn;
	private int status;

	/**
	 * Default constructor
	 */
	public PersonalDetails() {
		super();
	}

	/**
	 * Constructor that initializes all the attributes for the current object
	 */
	public PersonalDetails(String phoneNumber, String address, String bloodGroup, String modifiedBy,
			Timestamp modifiedOn, String createdBy, Timestamp createdOn, int status) {
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.bloodGroup = bloodGroup;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.status = status;
	}

	/**
	 * Method that returns employee_id
	 */
	// @Id
	// @GeneratedValue
	// @Column(name = "employee_id")
	// public int getEmployee_id() {
	// return employee_id;
	// }
	//
	// public void setEmployee_id(int employee_id) {
	// this.employee_id = employee_id;
	// }

	/**
	 * Method that returns phone_number
	 */
	@Id
	@Column(name = "phone_number")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Method that sets phone_number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Method that returns Address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Method that sets Address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Method that returns blood group
	 */
	@Column(name = "blood_group")
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * Method that sets blood group
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * Method to get the modified_on attribute
	 */
	@Column(name = "modified_by")
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * Method to set the modified_by attribute
	 */

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * Method to set the modified_on attribute
	 */
	@Column(name = "modified_on")
	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	/**
	 * Method to set the modified_on attribute
	 */
	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	/**
	 * Method to get the created_by attribute
	 */
	@Column(name = "created_by")
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * Method to set the created_by attribute
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "created_on")
	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * Method to get the status
	 */
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
		return "PersonalDetails [ phoneNumber=" + phoneNumber + ", address=" + address + ", bloodGroup=" + bloodGroup
				+ ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", status=" + status + "]";
	}

}