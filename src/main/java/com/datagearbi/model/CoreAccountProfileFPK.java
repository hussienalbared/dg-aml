package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CORE_ACCOUNT_PROFILE_F database table.
 * 
 */
@Embeddable
public class CoreAccountProfileFPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ACCTPRNO")
	private String acctprno;

	@Column(name="ACCTPRMOKEY")
	private long acctprmokey;

	public CoreAccountProfileFPK() {
	}
	public String getAcctprno() {
		return this.acctprno;
	}
	public void setAcctprno(String acctprno) {
		this.acctprno = acctprno;
	}
	public long getAcctprmokey() {
		return this.acctprmokey;
	}
	public void setAcctprmokey(long acctprmokey) {
		this.acctprmokey = acctprmokey;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CoreAccountProfileFPK)) {
			return false;
		}
		CoreAccountProfileFPK castOther = (CoreAccountProfileFPK)other;
		return 
			this.acctprno.equals(castOther.acctprno)
			&& (this.acctprmokey == castOther.acctprmokey);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.acctprno.hashCode();
		hash = hash * prime + ((int) (this.acctprmokey ^ (this.acctprmokey >>> 32)));
		
		return hash;
	}
}