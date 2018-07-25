package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the Monthly_Account_Summary database table.
 * 
 */
@Entity
@NamedQuery(name="Monthly_Account_Summary.findAll", query="SELECT m FROM Monthly_Account_Summary m")
public class Monthly_Account_Summary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Monthly_Account_SummaryPK id;

	@Column(name="Acct_Value_Amt")
	private BigDecimal acct_Value_Amt;

	@Column(name="Avg_Acct_Value_Amt")
	private BigDecimal avg_Acct_Value_Amt;

	@Column(name="Avg_Daily_Balance_Amt")
	private BigDecimal avg_Daily_Balance_Amt;

	@Column(name="Beg_Balance_Amt")
	private BigDecimal beg_Balance_Amt;

	@Column(name="Cash_Trans_Count")
	private int cash_Trans_Count;

	@Column(name="Cust_Init_Trans_Count")
	private int cust_Init_Trans_Count;

	@Column(name="Dep_Count")
	private int dep_Count;

	@Column(name="End_Cash_Balance_Amt")
	private BigDecimal end_Cash_Balance_Amt;

	@Column(name="Large_Cr_Amt")
	private BigDecimal large_Cr_Amt;

	@Column(name="Large_Dr_Amt")
	private BigDecimal large_Dr_Amt;

	@Column(name="Max_Acct_Value_Amt")
	private BigDecimal max_Acct_Value_Amt;

	@Column(name="Min_Acct_Value_Amt")
	private BigDecimal min_Acct_Value_Amt;

	@Column(name="Total_Cash_Cr_Amt")
	private BigDecimal total_Cash_Cr_Amt;

	@Column(name="Total_Cash_Dr_Amt")
	private BigDecimal total_Cash_Dr_Amt;

	@Column(name="Total_Cr_Amt")
	private BigDecimal total_Cr_Amt;

	@Column(name="Total_Dr_Amt")
	private BigDecimal total_Dr_Amt;

	@Column(name="Total_Trans_Amt")
	private BigDecimal total_Trans_Amt;

	@Column(name="Total_Wire_Cr_Amt")
	private BigDecimal total_Wire_Cr_Amt;

	@Column(name="Total_Wire_Dr_Amt")
	private BigDecimal total_Wire_Dr_Amt;

	@Column(name="Trans_Count")
	private int trans_Count;

	@Column(name="Wire_Count")
	private int wire_Count;

	@Column(name="Withdrawal_Count")
	private int withdrawal_Count;

	public Monthly_Account_Summary() {
	}

	public Monthly_Account_SummaryPK getId() {
		return this.id;
	}

	public void setId(Monthly_Account_SummaryPK id) {
		this.id = id;
	}

	public BigDecimal getAcct_Value_Amt() {
		return this.acct_Value_Amt;
	}

	public void setAcct_Value_Amt(BigDecimal acct_Value_Amt) {
		this.acct_Value_Amt = acct_Value_Amt;
	}

	public BigDecimal getAvg_Acct_Value_Amt() {
		return this.avg_Acct_Value_Amt;
	}

	public void setAvg_Acct_Value_Amt(BigDecimal avg_Acct_Value_Amt) {
		this.avg_Acct_Value_Amt = avg_Acct_Value_Amt;
	}

	public BigDecimal getAvg_Daily_Balance_Amt() {
		return this.avg_Daily_Balance_Amt;
	}

	public void setAvg_Daily_Balance_Amt(BigDecimal avg_Daily_Balance_Amt) {
		this.avg_Daily_Balance_Amt = avg_Daily_Balance_Amt;
	}

	public BigDecimal getBeg_Balance_Amt() {
		return this.beg_Balance_Amt;
	}

	public void setBeg_Balance_Amt(BigDecimal beg_Balance_Amt) {
		this.beg_Balance_Amt = beg_Balance_Amt;
	}

	public int getCash_Trans_Count() {
		return this.cash_Trans_Count;
	}

	public void setCash_Trans_Count(int cash_Trans_Count) {
		this.cash_Trans_Count = cash_Trans_Count;
	}

	public int getCust_Init_Trans_Count() {
		return this.cust_Init_Trans_Count;
	}

	public void setCust_Init_Trans_Count(int cust_Init_Trans_Count) {
		this.cust_Init_Trans_Count = cust_Init_Trans_Count;
	}

	public int getDep_Count() {
		return this.dep_Count;
	}

	public void setDep_Count(int dep_Count) {
		this.dep_Count = dep_Count;
	}

	public BigDecimal getEnd_Cash_Balance_Amt() {
		return this.end_Cash_Balance_Amt;
	}

	public void setEnd_Cash_Balance_Amt(BigDecimal end_Cash_Balance_Amt) {
		this.end_Cash_Balance_Amt = end_Cash_Balance_Amt;
	}

	public BigDecimal getLarge_Cr_Amt() {
		return this.large_Cr_Amt;
	}

	public void setLarge_Cr_Amt(BigDecimal large_Cr_Amt) {
		this.large_Cr_Amt = large_Cr_Amt;
	}

	public BigDecimal getLarge_Dr_Amt() {
		return this.large_Dr_Amt;
	}

	public void setLarge_Dr_Amt(BigDecimal large_Dr_Amt) {
		this.large_Dr_Amt = large_Dr_Amt;
	}

	public BigDecimal getMax_Acct_Value_Amt() {
		return this.max_Acct_Value_Amt;
	}

	public void setMax_Acct_Value_Amt(BigDecimal max_Acct_Value_Amt) {
		this.max_Acct_Value_Amt = max_Acct_Value_Amt;
	}

	public BigDecimal getMin_Acct_Value_Amt() {
		return this.min_Acct_Value_Amt;
	}

	public void setMin_Acct_Value_Amt(BigDecimal min_Acct_Value_Amt) {
		this.min_Acct_Value_Amt = min_Acct_Value_Amt;
	}

	public BigDecimal getTotal_Cash_Cr_Amt() {
		return this.total_Cash_Cr_Amt;
	}

	public void setTotal_Cash_Cr_Amt(BigDecimal total_Cash_Cr_Amt) {
		this.total_Cash_Cr_Amt = total_Cash_Cr_Amt;
	}

	public BigDecimal getTotal_Cash_Dr_Amt() {
		return this.total_Cash_Dr_Amt;
	}

	public void setTotal_Cash_Dr_Amt(BigDecimal total_Cash_Dr_Amt) {
		this.total_Cash_Dr_Amt = total_Cash_Dr_Amt;
	}

	public BigDecimal getTotal_Cr_Amt() {
		return this.total_Cr_Amt;
	}

	public void setTotal_Cr_Amt(BigDecimal total_Cr_Amt) {
		this.total_Cr_Amt = total_Cr_Amt;
	}

	public BigDecimal getTotal_Dr_Amt() {
		return this.total_Dr_Amt;
	}

	public void setTotal_Dr_Amt(BigDecimal total_Dr_Amt) {
		this.total_Dr_Amt = total_Dr_Amt;
	}

	public BigDecimal getTotal_Trans_Amt() {
		return this.total_Trans_Amt;
	}

	public void setTotal_Trans_Amt(BigDecimal total_Trans_Amt) {
		this.total_Trans_Amt = total_Trans_Amt;
	}

	public BigDecimal getTotal_Wire_Cr_Amt() {
		return this.total_Wire_Cr_Amt;
	}

	public void setTotal_Wire_Cr_Amt(BigDecimal total_Wire_Cr_Amt) {
		this.total_Wire_Cr_Amt = total_Wire_Cr_Amt;
	}

	public BigDecimal getTotal_Wire_Dr_Amt() {
		return this.total_Wire_Dr_Amt;
	}

	public void setTotal_Wire_Dr_Amt(BigDecimal total_Wire_Dr_Amt) {
		this.total_Wire_Dr_Amt = total_Wire_Dr_Amt;
	}

	public int getTrans_Count() {
		return this.trans_Count;
	}

	public void setTrans_Count(int trans_Count) {
		this.trans_Count = trans_Count;
	}

	public int getWire_Count() {
		return this.wire_Count;
	}

	public void setWire_Count(int wire_Count) {
		this.wire_Count = wire_Count;
	}

	public int getWithdrawal_Count() {
		return this.withdrawal_Count;
	}

	public void setWithdrawal_Count(int withdrawal_Count) {
		this.withdrawal_Count = withdrawal_Count;
	}

}