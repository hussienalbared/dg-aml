package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the OBJ_Detail_V database table.
 * 
 */
@Embeddable
@NamedQuery(name="OBJ_Detail_V.findAll", query="SELECT o FROM OBJ_Detail_V o")
public class OBJ_Detail_V implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Acct_Key")
	private int acct_Key;

	@Column(name="Beneficiary_Name")
	private String beneficiary_Name;

	@Column(name="Branch_Key")
	private int branch_Key;

	@Column(name="Ccy_Amt")
	private BigDecimal ccy_Amt;

	@Column(name="Cust_Key")
	private int cust_Key;

	@Column(name="Cust_Type_Desc")
	private String cust_Type_Desc;

	@Column(name="Date_Key")
	private int date_Key;

	@Column(name="Emp_FName")
	private String emp_FName;

	@Column(name="Mech_Desc")
	private String mech_Desc;

	@Column(name="Prim_Med_Desc")
	private String prim_Med_Desc;

	@Column(name="Sec_Med_Desc")
	private String sec_Med_Desc;

	@Column(name="Time_Key")
	private int time_Key;

	@Column(name="Trans_Cr_Db_Ind_Desc")
	private String trans_Cr_Db_Ind_Desc;

	@Column(name="Trans_Desc")
	private String trans_Desc;

	@Column(name="Trans_Ref_No")
	private String trans_Ref_No;

	@Column(name="Trans_Status_Key")
	private int trans_Status_Key;

	@Column(name="Transaction_date")
	private Timestamp transaction_date;

	public OBJ_Detail_V() {
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

	public int getBranch_Key() {
		return this.branch_Key;
	}

	public void setBranch_Key(int branch_Key) {
		this.branch_Key = branch_Key;
	}

	public BigDecimal getCcy_Amt() {
		return this.ccy_Amt;
	}

	public void setCcy_Amt(BigDecimal ccy_Amt) {
		this.ccy_Amt = ccy_Amt;
	}

	public int getCust_Key() {
		return this.cust_Key;
	}

	public void setCust_Key(int cust_Key) {
		this.cust_Key = cust_Key;
	}

	public String getCust_Type_Desc() {
		return this.cust_Type_Desc;
	}

	public void setCust_Type_Desc(String cust_Type_Desc) {
		this.cust_Type_Desc = cust_Type_Desc;
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

	public String getMech_Desc() {
		return this.mech_Desc;
	}

	public void setMech_Desc(String mech_Desc) {
		this.mech_Desc = mech_Desc;
	}

	public String getPrim_Med_Desc() {
		return this.prim_Med_Desc;
	}

	public void setPrim_Med_Desc(String prim_Med_Desc) {
		this.prim_Med_Desc = prim_Med_Desc;
	}

	public String getSec_Med_Desc() {
		return this.sec_Med_Desc;
	}

	public void setSec_Med_Desc(String sec_Med_Desc) {
		this.sec_Med_Desc = sec_Med_Desc;
	}

	public int getTime_Key() {
		return this.time_Key;
	}

	public void setTime_Key(int time_Key) {
		this.time_Key = time_Key;
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

	public int getTrans_Status_Key() {
		return this.trans_Status_Key;
	}

	public void setTrans_Status_Key(int trans_Status_Key) {
		this.trans_Status_Key = trans_Status_Key;
	}

	public Timestamp getTransaction_date() {
		return this.transaction_date;
	}

	public void setTransaction_date(Timestamp transaction_date) {
		this.transaction_date = transaction_date;
	}

}