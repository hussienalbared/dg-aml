package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Customer_X_Account database table.
 * 
 */
@Embeddable
public class Customer_X_AccountPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Acct_Key")
	private int acct_Key;

	@Column(name="Cust_Key")
	private int cust_Key;

	@Column(name="Role_Key")
	private int role_Key;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Chg_Begin_Date")
	private java.util.Date chg_Begin_Date;

	public Customer_X_AccountPK() {
	}
	public int getAcct_Key() {
		return this.acct_Key;
	}
	public void setAcct_Key(int acct_Key) {
		this.acct_Key = acct_Key;
	}
	public int getCust_Key() {
		return this.cust_Key;
	}
	public void setCust_Key(int cust_Key) {
		this.cust_Key = cust_Key;
	}
	public int getRole_Key() {
		return this.role_Key;
	}
	public void setRole_Key(int role_Key) {
		this.role_Key = role_Key;
	}
	public java.util.Date getChg_Begin_Date() {
		return this.chg_Begin_Date;
	}
	public void setChg_Begin_Date(java.util.Date chg_Begin_Date) {
		this.chg_Begin_Date = chg_Begin_Date;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Customer_X_AccountPK)) {
			return false;
		}
		Customer_X_AccountPK castOther = (Customer_X_AccountPK)other;
		return 
			(this.acct_Key == castOther.acct_Key)
			&& (this.cust_Key == castOther.cust_Key)
			&& (this.role_Key == castOther.role_Key)
			&& this.chg_Begin_Date.equals(castOther.chg_Begin_Date);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.acct_Key;
		hash = hash * prime + this.cust_Key;
		hash = hash * prime + this.role_Key;
		hash = hash * prime + this.chg_Begin_Date.hashCode();
		
		return hash;
	}
}