package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the SAMA_report_V database table.
 * 
 */
@Embeddable
@NamedQuery(name="SAMA_report_V.findAll", query="SELECT s FROM SAMA_report_V s")
public class SAMA_report_V implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCTBNM")
	private String acctbnm;

	@Column(name="ACCTNO")
	private String acctno;

	@Column(name="BRNM")
	private String brnm;

	@Column(name="BRTYDESC")
	private String brtydesc;

	@Column(name="calendar_date")
	private Timestamp calendarDate;

	@Column(name="CFCURRAMT")
	private BigDecimal cfcurramt;

	@Column(name="currency_name")
	private String currencyName;

	@Column(name="PCZCONM")
	private String pczconm;

	@Column(name="PID")
	private String pid;

	@Column(name="PNM")
	private String pnm;

	@Column(name="primary_medium_desc")
	private String primaryMediumDesc;

	@Column(name="secondary_medium_desc")
	private String secondaryMediumDesc;

	public SAMA_report_V() {
	}

	public String getAcctbnm() {
		return this.acctbnm;
	}

	public void setAcctbnm(String acctbnm) {
		this.acctbnm = acctbnm;
	}

	public String getAcctno() {
		return this.acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public String getBrnm() {
		return this.brnm;
	}

	public void setBrnm(String brnm) {
		this.brnm = brnm;
	}

	public String getBrtydesc() {
		return this.brtydesc;
	}

	public void setBrtydesc(String brtydesc) {
		this.brtydesc = brtydesc;
	}

	public Timestamp getCalendarDate() {
		return this.calendarDate;
	}

	public void setCalendarDate(Timestamp calendarDate) {
		this.calendarDate = calendarDate;
	}

	public BigDecimal getCfcurramt() {
		return this.cfcurramt;
	}

	public void setCfcurramt(BigDecimal cfcurramt) {
		this.cfcurramt = cfcurramt;
	}

	public String getCurrencyName() {
		return this.currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getPczconm() {
		return this.pczconm;
	}

	public void setPczconm(String pczconm) {
		this.pczconm = pczconm;
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPnm() {
		return this.pnm;
	}

	public void setPnm(String pnm) {
		this.pnm = pnm;
	}

	public String getPrimaryMediumDesc() {
		return this.primaryMediumDesc;
	}

	public void setPrimaryMediumDesc(String primaryMediumDesc) {
		this.primaryMediumDesc = primaryMediumDesc;
	}

	public String getSecondaryMediumDesc() {
		return this.secondaryMediumDesc;
	}

	public void setSecondaryMediumDesc(String secondaryMediumDesc) {
		this.secondaryMediumDesc = secondaryMediumDesc;
	}

}