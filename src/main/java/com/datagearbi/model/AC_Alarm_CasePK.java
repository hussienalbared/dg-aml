package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_Alarm_Case database table.
 * 
 */
@Embeddable
public class AC_Alarm_CasePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Case_Id")
	private long case_Id;

	@Column(name="Alarm_Id")
	private long alarm_Id;

	public AC_Alarm_CasePK() {
	}
	public long getCase_Id() {
		return this.case_Id;
	}
	public void setCase_Id(long case_Id) {
		this.case_Id = case_Id;
	}
	public long getAlarm_Id() {
		return this.alarm_Id;
	}
	public void setAlarm_Id(long alarm_Id) {
		this.alarm_Id = alarm_Id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AC_Alarm_CasePK)) {
			return false;
		}
		AC_Alarm_CasePK castOther = (AC_Alarm_CasePK)other;
		return 
			(this.case_Id == castOther.case_Id)
			&& (this.alarm_Id == castOther.alarm_Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.case_Id ^ (this.case_Id >>> 32)));
		hash = hash * prime + ((int) (this.alarm_Id ^ (this.alarm_Id >>> 32)));
		
		return hash;
	}
}