package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the AC_Case_Object database table.
 * 
 */
@Embeddable
public class AC_Case_ObjectPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Case_Id")
	private long case_Id;

	@Column(name="Obj_Level_Cd")
	private String obj_Level_Cd;

	@Column(name="Obj_Key")
	private long obj_Key;

	public AC_Case_ObjectPK() {
	}
	public long getCase_Id() {
		return this.case_Id;
	}
	public void setCase_Id(long case_Id) {
		this.case_Id = case_Id;
	}
	public String getObj_Level_Cd() {
		return this.obj_Level_Cd;
	}
	public void setObj_Level_Cd(String obj_Level_Cd) {
		this.obj_Level_Cd = obj_Level_Cd;
	}
	public long getObj_Key() {
		return this.obj_Key;
	}
	public void setObj_Key(long obj_Key) {
		this.obj_Key = obj_Key;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AC_Case_ObjectPK)) {
			return false;
		}
		AC_Case_ObjectPK castOther = (AC_Case_ObjectPK)other;
		return 
			(this.case_Id == castOther.case_Id)
			&& this.obj_Level_Cd.equals(castOther.obj_Level_Cd)
			&& (this.obj_Key == castOther.obj_Key);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.case_Id ^ (this.case_Id >>> 32)));
		hash = hash * prime + this.obj_Level_Cd.hashCode();
		hash = hash * prime + ((int) (this.obj_Key ^ (this.obj_Key >>> 32)));
		
		return hash;
	}
}