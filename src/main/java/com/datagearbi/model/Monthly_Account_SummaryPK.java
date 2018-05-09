package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Monthly_Account_Summary database table.
 * 
 */
@Embeddable
public class Monthly_Account_SummaryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Acct_No")
	private String acct_No;

	@Column(name="Month_Key")
	private int month_Key;

	public Monthly_Account_SummaryPK() {
	}
	public String getAcct_No() {
		return this.acct_No;
	}
	public void setAcct_No(String acct_No) {
		this.acct_No = acct_No;
	}
	public int getMonth_Key() {
		return this.month_Key;
	}
	public void setMonth_Key(int month_Key) {
		this.month_Key = month_Key;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Monthly_Account_SummaryPK)) {
			return false;
		}
		Monthly_Account_SummaryPK castOther = (Monthly_Account_SummaryPK)other;
		return 
			this.acct_No.equals(castOther.acct_No)
			&& (this.month_Key == castOther.month_Key);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.acct_No.hashCode();
		hash = hash * prime + this.month_Key;
		
		return hash;
	}
}