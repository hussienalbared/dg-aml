package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the Account_Third_X_Customer database table.
 * 
 */
@Embeddable
public class Account_Third_X_CustomerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Acct_Key")
	private int acct_Key;

	@Column(name="Ext_Cust_Acct_Key")
	private int ext_Cust_Acct_Key;

	@Column(name="Role_Key")
	private int role_Key;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Chg_Begin_Date")
	private java.util.Date chg_Begin_Date;

	public Account_Third_X_CustomerPK() {
	}
	public int getAcct_Key() {
		return this.acct_Key;
	}
	public void setAcct_Key(int acct_Key) {
		this.acct_Key = acct_Key;
	}
	public int getExt_Cust_Acct_Key() {
		return this.ext_Cust_Acct_Key;
	}
	public void setExt_Cust_Acct_Key(int ext_Cust_Acct_Key) {
		this.ext_Cust_Acct_Key = ext_Cust_Acct_Key;
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
		if (!(other instanceof Account_Third_X_CustomerPK)) {
			return false;
		}
		Account_Third_X_CustomerPK castOther = (Account_Third_X_CustomerPK)other;
		return 
			(this.acct_Key == castOther.acct_Key)
			&& (this.ext_Cust_Acct_Key == castOther.ext_Cust_Acct_Key)
			&& (this.role_Key == castOther.role_Key)
			&& this.chg_Begin_Date.equals(castOther.chg_Begin_Date);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.acct_Key;
		hash = hash * prime + this.ext_Cust_Acct_Key;
		hash = hash * prime + this.role_Key;
		hash = hash * prime + this.chg_Begin_Date.hashCode();
		
		return hash;
	}
}