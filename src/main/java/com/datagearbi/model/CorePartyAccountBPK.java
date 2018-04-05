package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CORE_PARTY_ACCOUNT_B database table.
 * 
 */
@Embeddable
public class CorePartyAccountBPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="account_key")
	private int accountKey;

	@Column(name="party_key")
	private int partyKey;

	@Column(name="PACCTRKEY")
	private long pacctrkey;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="change_begin_date")
	private java.util.Date changeBeginDate;

	public CorePartyAccountBPK() {
	}
	public int getAccountKey() {
		return this.accountKey;
	}
	public void setAccountKey(int accountKey) {
		this.accountKey = accountKey;
	}
	public int getPartyKey() {
		return this.partyKey;
	}
	public void setPartyKey(int partyKey) {
		this.partyKey = partyKey;
	}
	public long getPacctrkey() {
		return this.pacctrkey;
	}
	public void setPacctrkey(long pacctrkey) {
		this.pacctrkey = pacctrkey;
	}
	public java.util.Date getChangeBeginDate() {
		return this.changeBeginDate;
	}
	public void setChangeBeginDate(java.util.Date changeBeginDate) {
		this.changeBeginDate = changeBeginDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CorePartyAccountBPK)) {
			return false;
		}
		CorePartyAccountBPK castOther = (CorePartyAccountBPK)other;
		return 
			(this.accountKey == castOther.accountKey)
			&& (this.partyKey == castOther.partyKey)
			&& (this.pacctrkey == castOther.pacctrkey)
			&& this.changeBeginDate.equals(castOther.changeBeginDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.accountKey;
		hash = hash * prime + this.partyKey;
		hash = hash * prime + ((int) (this.pacctrkey ^ (this.pacctrkey >>> 32)));
		hash = hash * prime + this.changeBeginDate.hashCode();
		
		return hash;
	}
}