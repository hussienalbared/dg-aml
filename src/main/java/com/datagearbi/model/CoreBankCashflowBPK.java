package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CORE_BANK_CASHFLOW_B database table.
 * 
 */
@Embeddable
public class CoreBankCashflowBPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CFBKNO")
	private int cfbkno;

	@Column(name="CFBKTRN")
	private long cfbktrn;

	public CoreBankCashflowBPK() {
	}
	public int getCfbkno() {
		return this.cfbkno;
	}
	public void setCfbkno(int cfbkno) {
		this.cfbkno = cfbkno;
	}
	public long getCfbktrn() {
		return this.cfbktrn;
	}
	public void setCfbktrn(long cfbktrn) {
		this.cfbktrn = cfbktrn;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CoreBankCashflowBPK)) {
			return false;
		}
		CoreBankCashflowBPK castOther = (CoreBankCashflowBPK)other;
		return 
			(this.cfbkno == castOther.cfbkno)
			&& (this.cfbktrn == castOther.cfbktrn);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cfbkno;
		hash = hash * prime + ((int) (this.cfbktrn ^ (this.cfbktrn >>> 32)));
		
		return hash;
	}
}