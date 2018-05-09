package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_Alarm_Risk_Factor database table.
 * 
 */
@Embeddable
public class AC_Alarm_Risk_FactorPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Obj_No")
	private String obj_No;

	@Column(name="Alarm_No")
	private long alarm_No;

	@Column(name="Routine_Id")
	private long routine_Id;

	public AC_Alarm_Risk_FactorPK() {
	}
	public String getObj_No() {
		return this.obj_No;
	}
	public void setObj_No(String obj_No) {
		this.obj_No = obj_No;
	}
	public long getAlarm_No() {
		return this.alarm_No;
	}
	public void setAlarm_No(long alarm_No) {
		this.alarm_No = alarm_No;
	}
	public long getRoutine_Id() {
		return this.routine_Id;
	}
	public void setRoutine_Id(long routine_Id) {
		this.routine_Id = routine_Id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AC_Alarm_Risk_FactorPK)) {
			return false;
		}
		AC_Alarm_Risk_FactorPK castOther = (AC_Alarm_Risk_FactorPK)other;
		return 
			this.obj_No.equals(castOther.obj_No)
			&& (this.alarm_No == castOther.alarm_No)
			&& (this.routine_Id == castOther.routine_Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.obj_No.hashCode();
		hash = hash * prime + ((int) (this.alarm_No ^ (this.alarm_No >>> 32)));
		hash = hash * prime + ((int) (this.routine_Id ^ (this.routine_Id >>> 32)));
		
		return hash;
	}
}