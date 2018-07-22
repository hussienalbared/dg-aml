package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the AC_Routine_Parameter database table.
 * 
 */
@Embeddable
public class AC_Routine_ParameterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Routine_Id")
	private long routine_Id;

	@Column(name="Parm_Name")
	private String parm_Name;

	public AC_Routine_ParameterPK() {
	}
	public long getRoutine_Id() {
		return this.routine_Id;
	}
	public void setRoutine_Id(long routine_Id) {
		this.routine_Id = routine_Id;
	}
	public String getParm_Name() {
		return this.parm_Name;
	}
	public void setParm_Name(String parm_Name) {
		this.parm_Name = parm_Name;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AC_Routine_ParameterPK)) {
			return false;
		}
		AC_Routine_ParameterPK castOther = (AC_Routine_ParameterPK)other;
		return 
			(this.routine_Id == castOther.routine_Id)
			&& this.parm_Name.equals(castOther.parm_Name);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.routine_Id ^ (this.routine_Id >>> 32)));
		hash = hash * prime + this.parm_Name.hashCode();
		
		return hash;
	}
}