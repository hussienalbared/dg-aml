package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_Monthly_Acct_Summery_Alarm database table.
 * 
 */
@Embeddable
public class AC_Monthly_Acct_Summery_AlarmPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Alarm_Id")
	private long alarm_Id;

	@Column(name="Month_Key")
	private int month_Key;

	@Column(name="Acct_No")
	private String acct_No;

	public AC_Monthly_Acct_Summery_AlarmPK() {
	}
	public long getAlarm_Id() {
		return this.alarm_Id;
	}
	public void setAlarm_Id(long alarm_Id) {
		this.alarm_Id = alarm_Id;
	}
	public int getMonth_Key() {
		return this.month_Key;
	}
	public void setMonth_Key(int month_Key) {
		this.month_Key = month_Key;
	}
	public String getAcct_No() {
		return this.acct_No;
	}
	public void setAcct_No(String acct_No) {
		this.acct_No = acct_No;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AC_Monthly_Acct_Summery_AlarmPK)) {
			return false;
		}
		AC_Monthly_Acct_Summery_AlarmPK castOther = (AC_Monthly_Acct_Summery_AlarmPK)other;
		return 
			(this.alarm_Id == castOther.alarm_Id)
			&& (this.month_Key == castOther.month_Key)
			&& this.acct_No.equals(castOther.acct_No);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.alarm_Id ^ (this.alarm_Id >>> 32)));
		hash = hash * prime + this.month_Key;
		hash = hash * prime + this.acct_No.hashCode();
		
		return hash;
	}
}