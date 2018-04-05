package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CORE_ACCOUNT_EVENT_F database table.
 * 
 */
@Entity
@Table(name="CORE_ACCOUNT_EVENT_F")
@NamedQuery(name="CoreAccountEventF.findAll", query="SELECT c FROM CoreAccountEventF c")
public class CoreAccountEventF implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_key")
	private int transactionKey;

	@Column(name="ACCTECTRN")
	private String acctectrn;

	@Column(name="ACCTEVACCTNO")
	private BigDecimal acctevacctno;

	@Column(name="ACCTEVBRNO")
	private BigDecimal acctevbrno;

	@Column(name="ACCTEVCOCD")
	private BigDecimal acctevcocd;

	@Column(name="ACCTEVDATEKEY")
	private BigDecimal acctevdatekey;

	@Column(name="ACCTEVHHMMSS")
	private BigDecimal acctevhhmmss;

	@Column(name="ACCTEVTSTATKEY")
	private BigDecimal acctevtstatkey;

	@Column(name="ACCTEVTTYKEY")
	private BigDecimal acctevttykey;

	public CoreAccountEventF() {
	}

	public int getTransactionKey() {
		return this.transactionKey;
	}

	public void setTransactionKey(int transactionKey) {
		this.transactionKey = transactionKey;
	}

	public String getAcctectrn() {
		return this.acctectrn;
	}

	public void setAcctectrn(String acctectrn) {
		this.acctectrn = acctectrn;
	}

	public BigDecimal getAcctevacctno() {
		return this.acctevacctno;
	}

	public void setAcctevacctno(BigDecimal acctevacctno) {
		this.acctevacctno = acctevacctno;
	}

	public BigDecimal getAcctevbrno() {
		return this.acctevbrno;
	}

	public void setAcctevbrno(BigDecimal acctevbrno) {
		this.acctevbrno = acctevbrno;
	}

	public BigDecimal getAcctevcocd() {
		return this.acctevcocd;
	}

	public void setAcctevcocd(BigDecimal acctevcocd) {
		this.acctevcocd = acctevcocd;
	}

	public BigDecimal getAcctevdatekey() {
		return this.acctevdatekey;
	}

	public void setAcctevdatekey(BigDecimal acctevdatekey) {
		this.acctevdatekey = acctevdatekey;
	}

	public BigDecimal getAcctevhhmmss() {
		return this.acctevhhmmss;
	}

	public void setAcctevhhmmss(BigDecimal acctevhhmmss) {
		this.acctevhhmmss = acctevhhmmss;
	}

	public BigDecimal getAcctevtstatkey() {
		return this.acctevtstatkey;
	}

	public void setAcctevtstatkey(BigDecimal acctevtstatkey) {
		this.acctevtstatkey = acctevtstatkey;
	}

	public BigDecimal getAcctevttykey() {
		return this.acctevttykey;
	}

	public void setAcctevttykey(BigDecimal acctevttykey) {
		this.acctevttykey = acctevttykey;
	}

}