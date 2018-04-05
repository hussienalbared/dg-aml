package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_ACCOUNT_EVENT_ALARM database table.
 * 
 */
@Embeddable
public class AcAccountEventAlarmPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="alarm_id")
	private long alarmId;

	@Column(name="transaction_key")
	private long transactionKey;

	public AcAccountEventAlarmPK() {
	}
	public long getAlarmId() {
		return this.alarmId;
	}
	public void setAlarmId(long alarmId) {
		this.alarmId = alarmId;
	}
	public long getTransactionKey() {
		return this.transactionKey;
	}
	public void setTransactionKey(long transactionKey) {
		this.transactionKey = transactionKey;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcAccountEventAlarmPK)) {
			return false;
		}
		AcAccountEventAlarmPK castOther = (AcAccountEventAlarmPK)other;
		return 
			(this.alarmId == castOther.alarmId)
			&& (this.transactionKey == castOther.transactionKey);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.alarmId ^ (this.alarmId >>> 32)));
		hash = hash * prime + ((int) (this.transactionKey ^ (this.transactionKey >>> 32)));
		
		return hash;
	}
}