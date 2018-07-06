package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Monthly_Customer_Summary database table.
 * 
 */
@Embeddable
public class Monthly_Customer_SummaryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Cust_No")
	private String cust_No;

	@Column(name="Month_Key")
	private int month_Key;

	public Monthly_Customer_SummaryPK() {
	}
	public String getCust_No() {
		return this.cust_No;
	}
	public void setCust_No(String cust_No) {
		this.cust_No = cust_No;
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
		if (!(other instanceof Monthly_Customer_SummaryPK)) {
			return false;
		}
		Monthly_Customer_SummaryPK castOther = (Monthly_Customer_SummaryPK)other;
		return 
			this.cust_No.equals(castOther.cust_No)
			&& (this.month_Key == castOther.month_Key);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cust_No.hashCode();
		hash = hash * prime + this.month_Key;
		
		return hash;
	}
}