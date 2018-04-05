package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_ACCOUNT_PROFILE_ALARM database table.
 * 
 */
@Embeddable
public class AcAccountProfileAlarmPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="alarm_id")
	private long alarmId;

	@Column(name="month_key")
	private long monthKey;

	@Column(name="account_number")
	private String accountNumber;

	public AcAccountProfileAlarmPK() {
	}
	public long getAlarmId() {
		return this.alarmId;
	}
	public void setAlarmId(long alarmId) {
		this.alarmId = alarmId;
	}
	public long getMonthKey() {
		return this.monthKey;
	}
	public void setMonthKey(long monthKey) {
		this.monthKey = monthKey;
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcAccountProfileAlarmPK)) {
			return false;
		}
		AcAccountProfileAlarmPK castOther = (AcAccountProfileAlarmPK)other;
		return 
			(this.alarmId == castOther.alarmId)
			&& (this.monthKey == castOther.monthKey)
			&& this.accountNumber.equals(castOther.accountNumber);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.alarmId ^ (this.alarmId >>> 32)));
		hash = hash * prime + ((int) (this.monthKey ^ (this.monthKey >>> 32)));
		hash = hash * prime + this.accountNumber.hashCode();
		
		return hash;
	}
}