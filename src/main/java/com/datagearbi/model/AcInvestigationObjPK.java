package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_INVESTIGATION_OBJ database table.
 * 
 */
@Embeddable
public class AcInvestigationObjPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="investigation_id")
	private long investigationId;

	@Column(name="obj_level_code")
	private String objLevelCode;

	@Column(name="obj_key")
	private long objKey;

	public AcInvestigationObjPK() {
	}
	public long getInvestigationId() {
		return this.investigationId;
	}
	public void setInvestigationId(long investigationId) {
		this.investigationId = investigationId;
	}
	public String getObjLevelCode() {
		return this.objLevelCode;
	}
	public void setObjLevelCode(String objLevelCode) {
		this.objLevelCode = objLevelCode;
	}
	public long getObjKey() {
		return this.objKey;
	}
	public void setObjKey(long objKey) {
		this.objKey = objKey;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcInvestigationObjPK)) {
			return false;
		}
		AcInvestigationObjPK castOther = (AcInvestigationObjPK)other;
		return 
			(this.investigationId == castOther.investigationId)
			&& this.objLevelCode.equals(castOther.objLevelCode)
			&& (this.objKey == castOther.objKey);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.investigationId ^ (this.investigationId >>> 32)));
		hash = hash * prime + this.objLevelCode.hashCode();
		hash = hash * prime + ((int) (this.objKey ^ (this.objKey >>> 32)));
		
		return hash;
	}
}