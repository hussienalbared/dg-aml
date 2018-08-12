package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the AC_Suspected_Object database table.
 * 
 */
@Embeddable
public class AC_Suspected_ObjectPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Alarmed_Obj_level_Cd")
	private String alarmed_Obj_level_Cd;

	@Column(name="Alarmed_Obj_Key")
	private long alarmed_Obj_Key;

	public AC_Suspected_ObjectPK(String alarmed_Obj_level_Cd, long alarmed_Obj_Key) {
		this.alarmed_Obj_level_Cd = alarmed_Obj_level_Cd;
		this.alarmed_Obj_Key = alarmed_Obj_Key;
	}
	
	public AC_Suspected_ObjectPK() {
	}
	public String getAlarmed_Obj_level_Cd() {
		return this.alarmed_Obj_level_Cd;
	}
	public void setAlarmed_Obj_level_Cd(String alarmed_Obj_level_Cd) {
		this.alarmed_Obj_level_Cd = alarmed_Obj_level_Cd;
	}
	public long getAlarmed_Obj_Key() {
		return this.alarmed_Obj_Key;
	}
	public void setAlarmed_Obj_Key(long alarmed_Obj_Key) {
		this.alarmed_Obj_Key = alarmed_Obj_Key;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AC_Suspected_ObjectPK)) {
			return false;
		}
		AC_Suspected_ObjectPK castOther = (AC_Suspected_ObjectPK)other;
		return 
			this.alarmed_Obj_level_Cd.equals(castOther.alarmed_Obj_level_Cd)
			&& (this.alarmed_Obj_Key == castOther.alarmed_Obj_Key);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.alarmed_Obj_level_Cd.hashCode();
		hash = hash * prime + ((int) (this.alarmed_Obj_Key ^ (this.alarmed_Obj_Key >>> 32)));
		
		return hash;
	}
}