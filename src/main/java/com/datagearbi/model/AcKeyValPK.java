package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_KEY_VAL database table.
 * 
 */
@Embeddable
public class AcKeyValPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="kv_type_name")
	private String kvTypeName;

	@Column(name="kv_type_code")
	private String kvTypeCode;

	@Column(name="kv_language_desc")
	private String kvLanguageDesc;

	public AcKeyValPK() {
	}
	public String getKvTypeName() {
		return this.kvTypeName;
	}
	public void setKvTypeName(String kvTypeName) {
		this.kvTypeName = kvTypeName;
	}
	public String getKvTypeCode() {
		return this.kvTypeCode;
	}
	public void setKvTypeCode(String kvTypeCode) {
		this.kvTypeCode = kvTypeCode;
	}
	public String getKvLanguageDesc() {
		return this.kvLanguageDesc;
	}
	public void setKvLanguageDesc(String kvLanguageDesc) {
		this.kvLanguageDesc = kvLanguageDesc;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcKeyValPK)) {
			return false;
		}
		AcKeyValPK castOther = (AcKeyValPK)other;
		return 
			this.kvTypeName.equals(castOther.kvTypeName)
			&& this.kvTypeCode.equals(castOther.kvTypeCode)
			&& this.kvLanguageDesc.equals(castOther.kvLanguageDesc);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.kvTypeName.hashCode();
		hash = hash * prime + this.kvTypeCode.hashCode();
		hash = hash * prime + this.kvLanguageDesc.hashCode();
		
		return hash;
	}
}