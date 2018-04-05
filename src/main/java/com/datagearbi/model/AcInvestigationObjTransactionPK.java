package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_INVESTIGATION_OBJ_TRANSACTION database table.
 * 
 */
@Embeddable
public class AcInvestigationObjTransactionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="INVESTIGATION_ID")
	private long investigationId;

	@Column(name="ALARMED_OBJ_NUMBER")
	private String alarmedObjNumber;

	@Column(name="ALARMED_OBJ_LEVEL_CODE")
	private String alarmedObjLevelCode;

	@Column(name="TRANSACTION_ID")
	private String transactionId;

	public AcInvestigationObjTransactionPK() {
	}
	public long getInvestigationId() {
		return this.investigationId;
	}
	public void setInvestigationId(long investigationId) {
		this.investigationId = investigationId;
	}
	public String getAlarmedObjNumber() {
		return this.alarmedObjNumber;
	}
	public void setAlarmedObjNumber(String alarmedObjNumber) {
		this.alarmedObjNumber = alarmedObjNumber;
	}
	public String getAlarmedObjLevelCode() {
		return this.alarmedObjLevelCode;
	}
	public void setAlarmedObjLevelCode(String alarmedObjLevelCode) {
		this.alarmedObjLevelCode = alarmedObjLevelCode;
	}
	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcInvestigationObjTransactionPK)) {
			return false;
		}
		AcInvestigationObjTransactionPK castOther = (AcInvestigationObjTransactionPK)other;
		return 
			(this.investigationId == castOther.investigationId)
			&& this.alarmedObjNumber.equals(castOther.alarmedObjNumber)
			&& this.alarmedObjLevelCode.equals(castOther.alarmedObjLevelCode)
			&& this.transactionId.equals(castOther.transactionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.investigationId ^ (this.investigationId >>> 32)));
		hash = hash * prime + this.alarmedObjNumber.hashCode();
		hash = hash * prime + this.alarmedObjLevelCode.hashCode();
		hash = hash * prime + this.transactionId.hashCode();
		
		return hash;
	}
}