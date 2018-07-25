package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the AC_Risk_Assessment_Classifier database table.
 * 
 */
@Embeddable
public class AC_Risk_Assessment_ClassifierPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Risk_Assmnt_Id")
	private long risk_Assmnt_Id;

	@Column(name="Risk_Class_Id")
	private long risk_Class_Id;

	public AC_Risk_Assessment_ClassifierPK() {
	}
	public long getRisk_Assmnt_Id() {
		return this.risk_Assmnt_Id;
	}
	public void setRisk_Assmnt_Id(long risk_Assmnt_Id) {
		this.risk_Assmnt_Id = risk_Assmnt_Id;
	}
	public long getRisk_Class_Id() {
		return this.risk_Class_Id;
	}
	public void setRisk_Class_Id(long risk_Class_Id) {
		this.risk_Class_Id = risk_Class_Id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AC_Risk_Assessment_ClassifierPK)) {
			return false;
		}
		AC_Risk_Assessment_ClassifierPK castOther = (AC_Risk_Assessment_ClassifierPK)other;
		return 
			(this.risk_Assmnt_Id == castOther.risk_Assmnt_Id)
			&& (this.risk_Class_Id == castOther.risk_Class_Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.risk_Assmnt_Id ^ (this.risk_Assmnt_Id >>> 32)));
		hash = hash * prime + ((int) (this.risk_Class_Id ^ (this.risk_Class_Id >>> 32)));
		
		return hash;
	}
}