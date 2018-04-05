package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_ALARM_INVESTIGATION database table.
 * 
 */
@Embeddable
public class AcAlarmInvestigationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="investigation_id")
	private long investigationId;

	@Column(name="alarm_id")
	private long alarmId;

	public AcAlarmInvestigationPK() {
	}
	public long getInvestigationId() {
		return this.investigationId;
	}
	public void setInvestigationId(long investigationId) {
		this.investigationId = investigationId;
	}
	public long getAlarmId() {
		return this.alarmId;
	}
	public void setAlarmId(long alarmId) {
		this.alarmId = alarmId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcAlarmInvestigationPK)) {
			return false;
		}
		AcAlarmInvestigationPK castOther = (AcAlarmInvestigationPK)other;
		return 
			(this.investigationId == castOther.investigationId)
			&& (this.alarmId == castOther.alarmId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.investigationId ^ (this.investigationId >>> 32)));
		hash = hash * prime + ((int) (this.alarmId ^ (this.alarmId >>> 32)));
		
		return hash;
	}
}