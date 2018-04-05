package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the suspected_transactions_V database table.
 * 
 */
@Embeddable
@Table(name="suspected_transactions_V")
@NamedQuery(name="Suspected_transactions_V.findAll", query="SELECT s FROM Suspected_transactions_V s")
public class Suspected_transactions_V implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCTNO")
	private String acctno;

	@Column(name="CFCURRAMT")
	private BigDecimal cfcurramt;

	@Column(name="CFDATEKEY")
	private BigDecimal cfdatekey;

	@Column(name="transaction_cdi_desc")
	private String transactionCdiDesc;

	@Column(name="TTDS")
	private String ttds;

	@Column(name="TTRN")
	private String ttrn;

	public Suspected_transactions_V() {
	}

	public String getAcctno() {
		return this.acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public BigDecimal getCfcurramt() {
		return this.cfcurramt;
	}

	public void setCfcurramt(BigDecimal cfcurramt) {
		this.cfcurramt = cfcurramt;
	}

	public BigDecimal getCfdatekey() {
		return this.cfdatekey;
	}

	public void setCfdatekey(BigDecimal cfdatekey) {
		this.cfdatekey = cfdatekey;
	}

	public String getTransactionCdiDesc() {
		return this.transactionCdiDesc;
	}

	public void setTransactionCdiDesc(String transactionCdiDesc) {
		this.transactionCdiDesc = transactionCdiDesc;
	}

	public String getTtds() {
		return this.ttds;
	}

	public void setTtds(String ttds) {
		this.ttds = ttds;
	}

	public String getTtrn() {
		return this.ttrn;
	}

	public void setTtrn(String ttrn) {
		this.ttrn = ttrn;
	}

}