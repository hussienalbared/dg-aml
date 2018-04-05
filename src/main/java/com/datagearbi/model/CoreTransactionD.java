package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CORE_TRANSACTION_D database table.
 * 
 */
@Entity
@Table(name="CORE_TRANSACTION_D")
@NamedQuery(name="CoreTransactionD.findAll", query="SELECT c FROM CoreTransactionD c")
public class CoreTransactionD implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_key")
	private int transactionKey;

	@Column(name="TCHKNO")
	private String tchkno;

	@Column(name="TDATEKEY")
	private BigDecimal tdatekey;

	@Column(name="TDNO")
	private String tdno;

	@Column(name="TMECID")
	private String tmecid;

	@Column(name="TSNM")
	private String tsnm;

	@Column(name="TTDS")
	private String ttds;

	@Column(name="TTRN")
	private String ttrn;

	public CoreTransactionD() {
	}

	public int getTransactionKey() {
		return this.transactionKey;
	}

	public void setTransactionKey(int transactionKey) {
		this.transactionKey = transactionKey;
	}

	public String getTchkno() {
		return this.tchkno;
	}

	public void setTchkno(String tchkno) {
		this.tchkno = tchkno;
	}

	public BigDecimal getTdatekey() {
		return this.tdatekey;
	}

	public void setTdatekey(BigDecimal tdatekey) {
		this.tdatekey = tdatekey;
	}

	public String getTdno() {
		return this.tdno;
	}

	public void setTdno(String tdno) {
		this.tdno = tdno;
	}

	public String getTmecid() {
		return this.tmecid;
	}

	public void setTmecid(String tmecid) {
		this.tmecid = tmecid;
	}

	public String getTsnm() {
		return this.tsnm;
	}

	public void setTsnm(String tsnm) {
		this.tsnm = tsnm;
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