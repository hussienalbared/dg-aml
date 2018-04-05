package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the transaction_detail_V database table.
 * 
 */
@Embeddable
@Table(name="transaction_detail_V")
@NamedQuery(name="Transaction_detail_V.findAll", query="SELECT t FROM Transaction_detail_V t")
public class Transaction_detail_V implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ASCFNM")
	private String ascfnm;

	@Column(name="ASCNO")
	private String ascno;

	@Column(name="Beneficiary_Name")
	private String beneficiary_Name;

	@Column(name="Beneficiary_Number")
	private String beneficiary_Number;

	@Column(name="BRNM")
	private String brnm;

	@Column(name="BRNO")
	private String brno;

	@Column(name="CF2NDACCTNO")
	private BigDecimal cf2ndacctno;

	@Column(name="CFACCTNO")
	private BigDecimal cfacctno;

	@Column(name="CFCURRAMT")
	private BigDecimal cfcurramt;

	@Column(name="CFCURRAMTACCTCCY")
	private BigDecimal cfcurramtacctccy;

	@Column(name="CFCURRAMTTXNCCY")
	private BigDecimal cfcurramttxnccy;

	@Column(name="CFDATEKEY")
	private BigDecimal cfdatekey;

	@Column(name="country_code_3")
	private String countryCode3;

	@Column(name="country_name")
	private String countryName;

	@Column(name="currency_code")
	private String currencyCode;

	@Column(name="currency_name")
	private String currencyName;

	@Column(name="mechanism_desc")
	private String mechanismDesc;

	@Column(name="Remitter_Name")
	private String remitter_Name;

	@Column(name="Remitter_Number")
	private String remitter_Number;

	@Column(name="transaction_cdi_desc")
	private String transactionCdiDesc;

	@Column(name="TTDS")
	private String ttds;

	@Column(name="TTRN")
	private String ttrn;

	public Transaction_detail_V() {
	}

	public String getAscfnm() {
		return this.ascfnm;
	}

	public void setAscfnm(String ascfnm) {
		this.ascfnm = ascfnm;
	}

	public String getAscno() {
		return this.ascno;
	}

	public void setAscno(String ascno) {
		this.ascno = ascno;
	}

	public String getBeneficiary_Name() {
		return this.beneficiary_Name;
	}

	public void setBeneficiary_Name(String beneficiary_Name) {
		this.beneficiary_Name = beneficiary_Name;
	}

	public String getBeneficiary_Number() {
		return this.beneficiary_Number;
	}

	public void setBeneficiary_Number(String beneficiary_Number) {
		this.beneficiary_Number = beneficiary_Number;
	}

	public String getBrnm() {
		return this.brnm;
	}

	public void setBrnm(String brnm) {
		this.brnm = brnm;
	}

	public String getBrno() {
		return this.brno;
	}

	public void setBrno(String brno) {
		this.brno = brno;
	}

	public BigDecimal getCf2ndacctno() {
		return this.cf2ndacctno;
	}

	public void setCf2ndacctno(BigDecimal cf2ndacctno) {
		this.cf2ndacctno = cf2ndacctno;
	}

	public BigDecimal getCfacctno() {
		return this.cfacctno;
	}

	public void setCfacctno(BigDecimal cfacctno) {
		this.cfacctno = cfacctno;
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

	public String getCountryCode3() {
		return this.countryCode3;
	}

	public void setCountryCode3(String countryCode3) {
		this.countryCode3 = countryCode3;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyName() {
		return this.currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getMechanismDesc() {
		return this.mechanismDesc;
	}

	public void setMechanismDesc(String mechanismDesc) {
		this.mechanismDesc = mechanismDesc;
	}

	public String getRemitter_Name() {
		return this.remitter_Name;
	}

	public void setRemitter_Name(String remitter_Name) {
		this.remitter_Name = remitter_Name;
	}

	public String getRemitter_Number() {
		return this.remitter_Number;
	}

	public void setRemitter_Number(String remitter_Number) {
		this.remitter_Number = remitter_Number;
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