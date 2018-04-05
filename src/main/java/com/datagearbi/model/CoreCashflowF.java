package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CORE_CASHFLOW_F database table.
 * 
 */
@Entity
@Table(name="CORE_CASHFLOW_F")
@NamedQuery(name="CoreCashflowF.findAll", query="SELECT c FROM CoreCashflowF c")
public class CoreCashflowF implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CFTRN")
	private long cftrn;

	@Column(name="branch_key")
	private int branchKey;

	@Column(name="CF2NDACCTNO")
	private BigDecimal cf2ndacctno;

	@Column(name="CF3RDPIND")
	private String cf3rdpind;

	@Column(name="CFACCTNO")
	private BigDecimal cfacctno;

	@Column(name="CFASCNO")
	private BigDecimal cfascno;

	@Column(name="CFBEXPNO")
	private BigDecimal cfbexpno;

	@Column(name="CFBRNO")
	private String cfbrno;

	@Column(name="CFCURRAMT")
	private BigDecimal cfcurramt;

	@Column(name="CFCURRAMTACCTCCY")
	private BigDecimal cfcurramtacctccy;

	@Column(name="CFCURRAMTTXNCCY")
	private BigDecimal cfcurramttxnccy;

	@Column(name="CFDATEKEY")
	private BigDecimal cfdatekey;

	@Column(name="CFEXCPNO")
	private BigDecimal cfexcpno;

	@Column(name="CFPOSTDAKEY")
	private BigDecimal cfpostdakey;

	@Column(name="CFRELTIND")
	private String cfreltind;

	@Column(name="CFREXPNO")
	private BigDecimal cfrexpno;

	@Column(name="CFTCOCD")
	private BigDecimal cftcocd;

	@Column(name="CFTCURRCD")
	private BigDecimal cftcurrcd;

	@Column(name="CFTSTATKEY")
	private BigDecimal cftstatkey;

	@Column(name="CFTTKEY")
	private BigDecimal cfttkey;

	@Column(name="delta_ccy_amount")
	private BigDecimal deltaCcyAmount;

	@Column(name="secondary_account_key")
	private BigDecimal secondaryAccountKey;

	@Column(name="time_key")
	private BigDecimal timeKey;

	public CoreCashflowF() {
	}

	public long getCftrn() {
		return this.cftrn;
	}

	public void setCftrn(long cftrn) {
		this.cftrn = cftrn;
	}

	public int getBranchKey() {
		return this.branchKey;
	}

	public void setBranchKey(int branchKey) {
		this.branchKey = branchKey;
	}

	public BigDecimal getCf2ndacctno() {
		return this.cf2ndacctno;
	}

	public void setCf2ndacctno(BigDecimal cf2ndacctno) {
		this.cf2ndacctno = cf2ndacctno;
	}

	public String getCf3rdpind() {
		return this.cf3rdpind;
	}

	public void setCf3rdpind(String cf3rdpind) {
		this.cf3rdpind = cf3rdpind;
	}

	public BigDecimal getCfacctno() {
		return this.cfacctno;
	}

	public void setCfacctno(BigDecimal cfacctno) {
		this.cfacctno = cfacctno;
	}

	public BigDecimal getCfascno() {
		return this.cfascno;
	}

	public void setCfascno(BigDecimal cfascno) {
		this.cfascno = cfascno;
	}

	public BigDecimal getCfbexpno() {
		return this.cfbexpno;
	}

	public void setCfbexpno(BigDecimal cfbexpno) {
		this.cfbexpno = cfbexpno;
	}

	public String getCfbrno() {
		return this.cfbrno;
	}

	public void setCfbrno(String cfbrno) {
		this.cfbrno = cfbrno;
	}

	public BigDecimal getCfcurramt() {
		return this.cfcurramt;
	}

	public void setCfcurramt(BigDecimal cfcurramt) {
		this.cfcurramt = cfcurramt;
	}

	public BigDecimal getCfcurramtacctccy() {
		return this.cfcurramtacctccy;
	}

	public void setCfcurramtacctccy(BigDecimal cfcurramtacctccy) {
		this.cfcurramtacctccy = cfcurramtacctccy;
	}

	public BigDecimal getCfcurramttxnccy() {
		return this.cfcurramttxnccy;
	}

	public void setCfcurramttxnccy(BigDecimal cfcurramttxnccy) {
		this.cfcurramttxnccy = cfcurramttxnccy;
	}

	public BigDecimal getCfdatekey() {
		return this.cfdatekey;
	}

	public void setCfdatekey(BigDecimal cfdatekey) {
		this.cfdatekey = cfdatekey;
	}

	public BigDecimal getCfexcpno() {
		return this.cfexcpno;
	}

	public void setCfexcpno(BigDecimal cfexcpno) {
		this.cfexcpno = cfexcpno;
	}

	public BigDecimal getCfpostdakey() {
		return this.cfpostdakey;
	}

	public void setCfpostdakey(BigDecimal cfpostdakey) {
		this.cfpostdakey = cfpostdakey;
	}

	public String getCfreltind() {
		return this.cfreltind;
	}

	public void setCfreltind(String cfreltind) {
		this.cfreltind = cfreltind;
	}

	public BigDecimal getCfrexpno() {
		return this.cfrexpno;
	}

	public void setCfrexpno(BigDecimal cfrexpno) {
		this.cfrexpno = cfrexpno;
	}

	public BigDecimal getCftcocd() {
		return this.cftcocd;
	}

	public void setCftcocd(BigDecimal cftcocd) {
		this.cftcocd = cftcocd;
	}

	public BigDecimal getCftcurrcd() {
		return this.cftcurrcd;
	}

	public void setCftcurrcd(BigDecimal cftcurrcd) {
		this.cftcurrcd = cftcurrcd;
	}

	public BigDecimal getCftstatkey() {
		return this.cftstatkey;
	}

	public void setCftstatkey(BigDecimal cftstatkey) {
		this.cftstatkey = cftstatkey;
	}

	public BigDecimal getCfttkey() {
		return this.cfttkey;
	}

	public void setCfttkey(BigDecimal cfttkey) {
		this.cfttkey = cfttkey;
	}

	public BigDecimal getDeltaCcyAmount() {
		return this.deltaCcyAmount;
	}

	public void setDeltaCcyAmount(BigDecimal deltaCcyAmount) {
		this.deltaCcyAmount = deltaCcyAmount;
	}

	public BigDecimal getSecondaryAccountKey() {
		return this.secondaryAccountKey;
	}

	public void setSecondaryAccountKey(BigDecimal secondaryAccountKey) {
		this.secondaryAccountKey = secondaryAccountKey;
	}

	public BigDecimal getTimeKey() {
		return this.timeKey;
	}

	public void setTimeKey(BigDecimal timeKey) {
		this.timeKey = timeKey;
	}

}