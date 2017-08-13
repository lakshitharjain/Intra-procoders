package com.infrrd.internal.employeemanagement.domain;

import java.io.Serializable;

public class VisaDetailsDomain extends NewVisaDetailsDomain implements Serializable {
	/**
	 * Visa Details Domain
	 *
	 * @author Lakshitha
	 */
	private static final long serialVersionUID = 6230424017278889082L;
	private int visaId;

	public VisaDetailsDomain() {
		super();
	}

	public int getVisaId() {
		return visaId;
	}

	public void setVisaId(int visaId) {
		this.visaId = visaId;
	}

	@Override
	public String toString() {
		return "VisaDetailsDomain [visaId=" + visaId + ", employee=" + employee + ", visaStatus=" + visaStatus
				+ ", expiryDate=" + expiryDate + ", country=" + country + ", visaType=" + visaType + ", status="
				+ status + "]";
	}

}
