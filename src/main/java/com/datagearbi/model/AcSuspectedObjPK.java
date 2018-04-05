package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ac_suspected_objs database table.
 * 
 */
@Embeddable
public class AcSuspectedObjPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="obj_key")
	private int objKey;

	@Column(name="obj_level_code")
	private String objLevelCode;

	public AcSuspectedObjPK() {
	}
	
	
	public AcSuspectedObjPK(int objKey, String objLevelCode) {
		this.objKey = objKey;
		this.objLevelCode = objLevelCode;
	}


	public int getObjKey() {
		return this.objKey;
	}
	public void setObjKey(int objKey) {
		this.objKey = objKey;
	}
	public String getObjLevelCode() {
		return this.objLevelCode;
	}
	public void setObjLevelCode(String objLevelCode) {
		this.objLevelCode = objLevelCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcSuspectedObjPK)) {
			return false;
		}
		AcSuspectedObjPK castOther = (AcSuspectedObjPK)other;
		return 
			(this.objKey == castOther.objKey)
			&& this.objLevelCode.equals(castOther.objLevelCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.objKey;
		hash = hash * prime + this.objLevelCode.hashCode();
		
		return hash;
	}
}