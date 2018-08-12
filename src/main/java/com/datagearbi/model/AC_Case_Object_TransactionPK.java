package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the AC_Case_Object_Transaction database table.
 * 
 */
@Embeddable
public class AC_Case_Object_TransactionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Case_Id")
	private long case_Id;

	@Column(name="Alarmed_Obj_No")
	private String alarmed_Obj_No;

	@Column(name="Alarmed_Obj_Level_Cd")
	private String alarmed_Obj_Level_Cd;

	@Column(name="Trans_Id")
	private String trans_Id;

	public AC_Case_Object_TransactionPK() {
	}
	public long getCase_Id() {
		return this.case_Id;
	}
	public void setCase_Id(long case_Id) {
		this.case_Id = case_Id;
	}
	public String getAlarmed_Obj_No() {
		return this.alarmed_Obj_No;
	}
	public void setAlarmed_Obj_No(String alarmed_Obj_No) {
		this.alarmed_Obj_No = alarmed_Obj_No;
	}
	public String getAlarmed_Obj_Level_Cd() {
		return this.alarmed_Obj_Level_Cd;
	}
	public void setAlarmed_Obj_Level_Cd(String alarmed_Obj_Level_Cd) {
		this.alarmed_Obj_Level_Cd = alarmed_Obj_Level_Cd;
	}
	public String getTrans_Id() {
		return this.trans_Id;
	}
	public void setTrans_Id(String trans_Id) {
		this.trans_Id = trans_Id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AC_Case_Object_TransactionPK)) {
			return false;
		}
		AC_Case_Object_TransactionPK castOther = (AC_Case_Object_TransactionPK)other;
		return 
			(this.case_Id == castOther.case_Id)
			&& this.alarmed_Obj_No.equals(castOther.alarmed_Obj_No)
			&& this.alarmed_Obj_Level_Cd.equals(castOther.alarmed_Obj_Level_Cd)
			&& this.trans_Id.equals(castOther.trans_Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.case_Id ^ (this.case_Id >>> 32)));
		hash = hash * prime + this.alarmed_Obj_No.hashCode();
		hash = hash * prime + this.alarmed_Obj_Level_Cd.hashCode();
		hash = hash * prime + this.trans_Id.hashCode();
		
		return hash;
	}
}