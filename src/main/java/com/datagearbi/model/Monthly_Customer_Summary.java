package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the Monthly_Customer_Summary database table.
 * 
 */
@Entity
@NamedQuery(name="Monthly_Customer_Summary.findAll", query="SELECT m FROM Monthly_Customer_Summary m")
public class Monthly_Customer_Summary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Monthly_Customer_SummaryPK id;

	@Column(name="Acct_Value_Amt")
	private BigDecimal acct_Value_Amt;

	@Column(name="Agg_Assets_Amt")
	private BigDecimal agg_Assets_Amt;

	@Column(name="Cash_Trans_Count")
	private int cash_Trans_Count;

	@Column(name="Dep_Count")
	private int dep_Count;

	@Column(name="Fund_Pymt_Service_Count")
	private int fund_Pymt_Service_Count;

	@Column(name="Fund_Transfer_Count")
	private int fund_Transfer_Count;

	@Column(name="Large_Cr_Amt")
	private BigDecimal large_Cr_Amt;

	@Column(name="Large_Dr_Amt")
	private BigDecimal large_Dr_Amt;

	@Column(name="Mntry_Inst_Count")
	private int mntry_Inst_Count;

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

	public Monthly_Customer_Summary() {
	}

	public Monthly_Customer_SummaryPK getId() {
		return this.id;
	}

	public void setId(Monthly_Customer_SummaryPK id) {
		this.id = id;
	}

	public BigDecimal getAcct_Value_Amt() {
		return this.acct_Value_Amt;
	}

	public void setAcct_Value_Amt(BigDecimal acct_Value_Amt) {
		this.acct_Value_Amt = acct_Value_Amt;
	}

	public BigDecimal getAgg_Assets_Amt() {
		return this.agg_Assets_Amt;
	}

	public void setAgg_Assets_Amt(BigDecimal agg_Assets_Amt) {
		this.agg_Assets_Amt = agg_Assets_Amt;
	}

	public int getCash_Trans_Count() {
		return this.cash_Trans_Count;
	}

	public void setCash_Trans_Count(int cash_Trans_Count) {
		this.cash_Trans_Count = cash_Trans_Count;
	}

	public int getDep_Count() {
		return this.dep_Count;
	}

	public void setDep_Count(int dep_Count) {
		this.dep_Count = dep_Count;
	}

	public int getFund_Pymt_Service_Count() {
		return this.fund_Pymt_Service_Count;
	}

	public void setFund_Pymt_Service_Count(int fund_Pymt_Service_Count) {
		this.fund_Pymt_Service_Count = fund_Pymt_Service_Count;
	}

	public int getFund_Transfer_Count() {
		return this.fund_Transfer_Count;
	}

	public void setFund_Transfer_Count(int fund_Transfer_Count) {
		this.fund_Transfer_Count = fund_Transfer_Count;
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

	public int getMntry_Inst_Count() {
		return this.mntry_Inst_Count;
	}

	public void setMntry_Inst_Count(int mntry_Inst_Count) {
		this.mntry_Inst_Count = mntry_Inst_Count;
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