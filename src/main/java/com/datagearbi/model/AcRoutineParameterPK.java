package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_ROUTINE_PARAMETER database table.
 * 
 */
@Embeddable
public class AcRoutineParameterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="routine_id")
	private long routineId;

	@Column(name="parm_name")
	private String parmName;

	public AcRoutineParameterPK() {
	}
	public long getRoutineId() {
		return this.routineId;
	}
	public void setRoutineId(long routineId) {
		this.routineId = routineId;
	}
	public String getParmName() {
		return this.parmName;
	}
	public void setParmName(String parmName) {
		this.parmName = parmName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcRoutineParameterPK)) {
			return false;
		}
		AcRoutineParameterPK castOther = (AcRoutineParameterPK)other;
		return 
			(this.routineId == castOther.routineId)
			&& this.parmName.equals(castOther.parmName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.routineId ^ (this.routineId >>> 32)));
		hash = hash * prime + this.parmName.hashCode();
		
		return hash;
	}
}