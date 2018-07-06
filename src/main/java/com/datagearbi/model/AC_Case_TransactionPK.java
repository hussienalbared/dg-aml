package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_Case_Transaction database table.
 * 
 */
@Embeddable
public class AC_Case_TransactionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Case_ID")
	private long case_ID;

	@Column(name="Alarm_Id")
	private long alarm_Id;

	@Column(name="Trans_Id")
	private String trans_Id;

	public AC_Case_TransactionPK() {
	}
	public long getCase_ID() {
		return this.case_ID;
	}
	public void setCase_ID(long case_ID) {
		this.case_ID = case_ID;
	}
	public long getAlarm_Id() {
		return this.alarm_Id;
	}
	public void setAlarm_Id(long alarm_Id) {
		this.alarm_Id = alarm_Id;
	}
	public String getTrans_Id() {
		return this.trans_Id;
	}
	public void setTrans_Id(String trans_Id) {
		this.trans_Id = trans_Id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AC_Case_TransactionPK)) {
			return false;
		}
		AC_Case_TransactionPK castOther = (AC_Case_TransactionPK)other;
		return 
			(this.case_ID == castOther.case_ID)
			&& (this.alarm_Id == castOther.alarm_Id)
			&& this.trans_Id.equals(castOther.trans_Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.case_ID ^ (this.case_ID >>> 32)));
		hash = hash * prime + ((int) (this.alarm_Id ^ (this.alarm_Id >>> 32)));
		hash = hash * prime + this.trans_Id.hashCode();
		
		return hash;
	}
}