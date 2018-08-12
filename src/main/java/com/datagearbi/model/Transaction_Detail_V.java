package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the Transaction_Detail_V database table.
 * 
 */
@Entity
@NamedQuery(name="Transaction_Detail_V.findAll", query="SELECT t FROM Transaction_Detail_V t")
@Table(name="Transaction_Detail_V",schema="DGAMLCORE")
public class Transaction_Detail_V implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Acct_Key")
	private int acct_Key;

	@Column(name="Beneficiary_Name")
	private String beneficiary_Name;

	@Column(name="Beneficiary_Number")
	private String beneficiary_Number;

	@Column(name="Branch_Name")
	private String branch_Name;

	@Column(name="Branch_No")
	private String branch_No;

	@Column(name="Ccy_Amt")
	private BigDecimal ccy_Amt;

	@Column(name="Ccy_Amt_In_Acct_Ccy")
	private BigDecimal ccy_Amt_In_Acct_Ccy;

	@Column(name="Ccy_Amt_In_Trans_Ccy")
	private BigDecimal ccy_Amt_In_Trans_Ccy;

	@Column(name="Cntry_CD_3")
	private String cntry_CD_3;

	@Column(name="Cntry_Name")
	private String cntry_Name;

	@Column(name="Curr_Cd")
	private String curr_Cd;

	@Column(name="Curr_Name")
	private String curr_Name;

	@Column(name="Date_Key")
	private int date_Key;

	@Column(name="Emp_FName")
	private String emp_FName;

	@Column(name="Emp_No")
	private String emp_No;

	@Column(name="Mech_Desc")
	private String mech_Desc;

	@Column(name="Remitter_Name")
	private String remitter_Name;

	@Column(name="Remitter_Number")
	private String remitter_Number;

	@Column(name="Sec_Acct_Key")
	private int sec_Acct_Key;

	@Column(name="Trans_Cr_Db_Ind_Desc")
	private String trans_Cr_Db_Ind_Desc;

	@Column(name="Trans_Desc")
	private String trans_Desc;
    @Id
	@Column(name="Trans_Ref_No")
	private String trans_Ref_No;

	public Transaction_Detail_V() {
	}

	public int getAcct_Key() {
		return this.acct_Key;
	}

	public void setAcct_Key(int acct_Key) {
		this.acct_Key = acct_Key;
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

	public String getBranch_Name() {
		return this.branch_Name;
	}

	public void setBranch_Name(String branch_Name) {
		this.branch_Name = branch_Name;
	}

	public String getBranch_No() {
		return this.branch_No;
	}

	public void setBranch_No(String branch_No) {
		this.branch_No = branch_No;
	}

	public BigDecimal getCcy_Amt() {
		return this.ccy_Amt;
	}

	public void setCcy_Amt(BigDecimal ccy_Amt) {
		this.ccy_Amt = ccy_Amt;
	}

	public BigDecimal getCcy_Amt_In_Acct_Ccy() {
		return this.ccy_Amt_In_Acct_Ccy;
	}

	public void setCcy_Amt_In_Acct_Ccy(BigDecimal ccy_Amt_In_Acct_Ccy) {
		this.ccy_Amt_In_Acct_Ccy = ccy_Amt_In_Acct_Ccy;
	}

	public BigDecimal getCcy_Amt_In_Trans_Ccy() {
		return this.ccy_Amt_In_Trans_Ccy;
	}

	public void setCcy_Amt_In_Trans_Ccy(BigDecimal ccy_Amt_In_Trans_Ccy) {
		this.ccy_Amt_In_Trans_Ccy = ccy_Amt_In_Trans_Ccy;
	}

	public String getCntry_CD_3() {
		return this.cntry_CD_3;
	}

	public void setCntry_CD_3(String cntry_CD_3) {
		this.cntry_CD_3 = cntry_CD_3;
	}

	public String getCntry_Name() {
		return this.cntry_Name;
	}

	public void setCntry_Name(String cntry_Name) {
		this.cntry_Name = cntry_Name;
	}

	public String getCurr_Cd() {
		return this.curr_Cd;
	}

	public void setCurr_Cd(String curr_Cd) {
		this.curr_Cd = curr_Cd;
	}

	public String getCurr_Name() {
		return this.curr_Name;
	}

	public void setCurr_Name(String curr_Name) {
		this.curr_Name = curr_Name;
	}

	public int getDate_Key() {
		return this.date_Key;
	}

	public void setDate_Key(int date_Key) {
		this.date_Key = date_Key;
	}

	public String getEmp_FName() {
		return this.emp_FName;
	}

	public void setEmp_FName(String emp_FName) {
		this.emp_FName = emp_FName;
	}

	public String getEmp_No() {
		return this.emp_No;
	}

	public void setEmp_No(String emp_No) {
		this.emp_No = emp_No;
	}

	public String getMech_Desc() {
		return this.mech_Desc;
	}

	public void setMech_Desc(String mech_Desc) {
		this.mech_Desc = mech_Desc;
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

	public int getSec_Acct_Key() {
		return this.sec_Acct_Key;
	}

	public void setSec_Acct_Key(int sec_Acct_Key) {
		this.sec_Acct_Key = sec_Acct_Key;
	}

	public String getTrans_Cr_Db_Ind_Desc() {
		return this.trans_Cr_Db_Ind_Desc;
	}

	public void setTrans_Cr_Db_Ind_Desc(String trans_Cr_Db_Ind_Desc) {
		this.trans_Cr_Db_Ind_Desc = trans_Cr_Db_Ind_Desc;
	}

	public String getTrans_Desc() {
		return this.trans_Desc;
	}

	public void setTrans_Desc(String trans_Desc) {
		this.trans_Desc = trans_Desc;
	}

	public String getTrans_Ref_No() {
		return this.trans_Ref_No;
	}

	public void setTrans_Ref_No(String trans_Ref_No) {
		this.trans_Ref_No = trans_Ref_No;
	}

}