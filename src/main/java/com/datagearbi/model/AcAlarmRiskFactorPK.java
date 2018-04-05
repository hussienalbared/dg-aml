package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_ALARM_RISK_FACTOR database table.
 * 
 */
@Embeddable
public class AcAlarmRiskFactorPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="obj_number")
	private String objNumber;

	@Column(name="alarm_id")
	private long alarmId;

	@Column(name="routine_id")
	private long routineId;

	public AcAlarmRiskFactorPK() {
	}
	public String getObjNumber() {
		return this.objNumber;
	}
	public void setObjNumber(String objNumber) {
		this.objNumber = objNumber;
	}
	public long getAlarmId() {
		return this.alarmId;
	}
	public void setAlarmId(long alarmId) {
		this.alarmId = alarmId;
	}
	public long getRoutineId() {
		return this.routineId;
	}
	public void setRoutineId(long routineId) {
		this.routineId = routineId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcAlarmRiskFactorPK)) {
			return false;
		}
		AcAlarmRiskFactorPK castOther = (AcAlarmRiskFactorPK)other;
		return 
			this.objNumber.equals(castOther.objNumber)
			&& (this.alarmId == castOther.alarmId)
			&& (this.routineId == castOther.routineId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.objNumber.hashCode();
		hash = hash * prime + ((int) (this.alarmId ^ (this.alarmId >>> 32)));
		hash = hash * prime + ((int) (this.routineId ^ (this.routineId >>> 32)));
		
		return hash;
	}
}