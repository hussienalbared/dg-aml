package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AC_UI_AVAILABILITY database table.
 * 
 */
@Embeddable
@Table(name="AC_UI_AVAILABILITY")
@NamedQuery(name="AcUiAvailability.findAll", query="SELECT a FROM AcUiAvailability a")
public class AcUiAvailability implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ui_availability_ind")
	private String uiAvailabilityInd;

	public AcUiAvailability() {
	}

	public String getUiAvailabilityInd() {
		return this.uiAvailabilityInd;
	}

	public void setUiAvailabilityInd(String uiAvailabilityInd) {
		this.uiAvailabilityInd = uiAvailabilityInd;
	}

}