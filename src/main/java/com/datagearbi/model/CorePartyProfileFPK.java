package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CORE_PARTY_PROFILE_F database table.
 * 
 */
@Embeddable
public class CorePartyProfileFPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PPRNO")
	private String pprno;

	@Column(name="PPRMOKEY")
	private long pprmokey;

	public CorePartyProfileFPK() {
	}
	public String getPprno() {
		return this.pprno;
	}
	public void setPprno(String pprno) {
		this.pprno = pprno;
	}
	public long getPprmokey() {
		return this.pprmokey;
	}
	public void setPprmokey(long pprmokey) {
		this.pprmokey = pprmokey;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CorePartyProfileFPK)) {
			return false;
		}
		CorePartyProfileFPK castOther = (CorePartyProfileFPK)other;
		return 
			this.pprno.equals(castOther.pprno)
			&& (this.pprmokey == castOther.pprmokey);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.pprno.hashCode();
		hash = hash * prime + ((int) (this.pprmokey ^ (this.pprmokey >>> 32)));
		
		return hash;
	}
}