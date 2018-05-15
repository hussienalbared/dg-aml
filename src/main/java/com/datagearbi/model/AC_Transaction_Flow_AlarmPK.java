package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_Transaction_Flow_Alarm database table.
 * 
 */
@Embeddable
public class AC_Transaction_Flow_AlarmPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Alarm_Id")
	private long alarm_Id;

	@Column(name="Trans_Key")
	private long trans_Key;

	public AC_Transaction_Flow_AlarmPK() {
	}
	public long getAlarm_Id() {
		return this.alarm_Id;
	}
	public void setAlarm_Id(long alarm_Id) {
		this.alarm_Id = alarm_Id;
	}
	public long getTrans_Key() {
		return this.trans_Key;
	}
	public void setTrans_Key(long trans_Key) {
		this.trans_Key = trans_Key;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AC_Transaction_Flow_AlarmPK)) {
			return false;
		}
		AC_Transaction_Flow_AlarmPK castOther = (AC_Transaction_Flow_AlarmPK)other;
		return 
			(this.alarm_Id == castOther.alarm_Id)
			&& (this.trans_Key == castOther.trans_Key);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.alarm_Id ^ (this.alarm_Id >>> 32)));
		hash = hash * prime + ((int) (this.trans_Key ^ (this.trans_Key >>> 32)));
		
		return hash;
	}
}