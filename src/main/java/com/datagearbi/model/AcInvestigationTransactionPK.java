package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_INVESTIGATION_TRANSACTION database table.
 * 
 */
@Embeddable
public class AcInvestigationTransactionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="INVESTIGATION_ID")
	private long investigationId;

	@Column(name="ALARM_ID")
	private long alarmId;

	@Column(name="TRANSACTION_ID")
	private String transactionId;

	public AcInvestigationTransactionPK() {
	}
	public long getInvestigationId() {
		return this.investigationId;
	}
	public void setInvestigationId(long investigationId) {
		this.investigationId = investigationId;
	}
	public long getAlarmId() {
		return this.alarmId;
	}
	public void setAlarmId(long alarmId) {
		this.alarmId = alarmId;
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
		if (!(other instanceof AcInvestigationTransactionPK)) {
			return false;
		}
		AcInvestigationTransactionPK castOther = (AcInvestigationTransactionPK)other;
		return 
			(this.investigationId == castOther.investigationId)
			&& (this.alarmId == castOther.alarmId)
			&& this.transactionId.equals(castOther.transactionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.investigationId ^ (this.investigationId >>> 32)));
		hash = hash * prime + ((int) (this.alarmId ^ (this.alarmId >>> 32)));
		hash = hash * prime + this.transactionId.hashCode();
		
		return hash;
	}
}