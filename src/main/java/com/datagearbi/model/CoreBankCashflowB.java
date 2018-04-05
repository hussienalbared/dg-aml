package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CORE_BANK_CASHFLOW_B database table.
 * 
 */
@Entity
@Table(name="CORE_BANK_CASHFLOW_B")
@NamedQuery(name="CoreBankCashflowB.findAll", query="SELECT c FROM CoreBankCashflowB c")
public class CoreBankCashflowB implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CoreBankCashflowBPK id;

	@Column(name="CFBKRDS")
	private String cfbkrds;

	@Column(name="CFBKSQNO")
	private BigDecimal cfbksqno;

	public CoreBankCashflowB() {
	}

	public CoreBankCashflowBPK getId() {
		return this.id;
	}

	public void setId(CoreBankCashflowBPK id) {
		this.id = id;
	}

	public String getCfbkrds() {
		return this.cfbkrds;
	}

	public void setCfbkrds(String cfbkrds) {
		this.cfbkrds = cfbkrds;
	}

	public BigDecimal getCfbksqno() {
		return this.cfbksqno;
	}

	public void setCfbksqno(BigDecimal cfbksqno) {
		this.cfbksqno = cfbksqno;
	}

}