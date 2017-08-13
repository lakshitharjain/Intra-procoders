package com.infrrd.internal.employeemanagement.domain;

import java.io.Serializable;

public class NewPersonalDetailsDomain implements Serializable {
	/**
	 * New Personal Details Domain
	 *
	 * @author Lakshitha
	 */
	private static final long serialVersionUID = 2662683792227913921L;
	private String phoneNumber;
	private String address;
	private String bloodGroup;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "NewPersonalDetailsDomain [phoneNumber=" + phoneNumber + ", address=" + address + ", bloodGroup="
				+ bloodGroup + "]";
	}

}
