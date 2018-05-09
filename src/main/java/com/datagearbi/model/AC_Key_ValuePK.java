package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_Key_Value database table.
 * 
 */
@Embeddable
public class AC_Key_ValuePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Kval_Type_Name")
	private String kval_Type_Name;

	@Column(name="Kval_Type_Cd")
	private String kval_Type_Cd;

	@Column(name="Kval_Lang_Desc")
	private String kval_Lang_Desc;

	public AC_Key_ValuePK() {
	}
	public String getKval_Type_Name() {
		return this.kval_Type_Name;
	}
	public void setKval_Type_Name(String kval_Type_Name) {
		this.kval_Type_Name = kval_Type_Name;
	}
	public String getKval_Type_Cd() {
		return this.kval_Type_Cd;
	}
	public void setKval_Type_Cd(String kval_Type_Cd) {
		this.kval_Type_Cd = kval_Type_Cd;
	}
	public String getKval_Lang_Desc() {
		return this.kval_Lang_Desc;
	}
	public void setKval_Lang_Desc(String kval_Lang_Desc) {
		this.kval_Lang_Desc = kval_Lang_Desc;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AC_Key_ValuePK)) {
			return false;
		}
		AC_Key_ValuePK castOther = (AC_Key_ValuePK)other;
		return 
			this.kval_Type_Name.equals(castOther.kval_Type_Name)
			&& this.kval_Type_Cd.equals(castOther.kval_Type_Cd)
			&& this.kval_Lang_Desc.equals(castOther.kval_Lang_Desc);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.kval_Type_Name.hashCode();
		hash = hash * prime + this.kval_Type_Cd.hashCode();
		hash = hash * prime + this.kval_Lang_Desc.hashCode();
		
		return hash;
	}
}