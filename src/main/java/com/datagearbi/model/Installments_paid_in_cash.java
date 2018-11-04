package com.datagearbi.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "Installments_paid_in_cash.findAll", query = "SELECT d FROM Installments_paid_in_cash d")
@Table(name = "Installments_paid_in_cash", schema = "dbo")
public class Installments_paid_in_cash {

	private static final long serialVersionUID = 1L;
	@Column(name = "Exec_Cust_Key")
	private int Exec_Cust_Key;

	@Id
	@Column(name = "IdRow")
	private int IdRow;

	@Column(name = "Acct_Emp_Ind")
	private String acct_Emp_Ind;

	@Column(name = "Acct_Key")
	private int acct_Key;

	@Column(name = "Acct_Name")
	private String acct_Name;

	@Column(name = "Acct_No")
	private String acct_No;

	@Column(name = "Acct_Type_Desc")
	private String acct_Type_Desc;

	@Column(name = "Benef_Ext_Cust_Key")
	private int benef_Ext_Cust_Key;

	@Column(name = "Branch_Key")
	private int branch_Key;

	@Column(name = "Ccy_Amt")
	private BigDecimal ccy_Amt;

	@Column(name = "Ccy_Amt_In_Acct_Ccy")
	private BigDecimal ccy_Amt_In_Acct_Ccy;

	@Column(name = "Ccy_Amt_In_Trans_Ccy")
	private BigDecimal ccy_Amt_In_Trans_Ccy;

	@Column(name = "Cntry_Key")
	private int cntry_Key;

	@Column(name = "Cust_Emp_Ind")
	private String cust_Emp_Ind;

	@Column(name = "Cust_Key")
	private int cust_Key;

	@Column(name = "Cust_Name")
	private String cust_Name;

	@Column(name = "Cust_No")
	private String cust_No;

	@Column(name = "Cust_Type_Desc")
	private String cust_Type_Desc;

	@Column(name = "Date_Key")
	private int date_Key;

	@Column(name = "Emp_Key")
	private int emp_Key;

	@Column(name = "Political_Exp_Prsn_Ind")
	private String political_Exp_Prsn_Ind;

	@Column(name = "Post_Date_Key")
	private int post_Date_Key;

	@Column(name = "Relate_Ind")
	private String relate_Ind;

	@Column(name = "Remit_Ext_Cust_Key")
	private int remit_Ext_Cust_Key;

	@Column(name = "Sec_Acct_Key")
	private int sec_Acct_Key;

	@Column(name = "Third_Cust_Ind")
	private String third_Cust_Ind;

	@Column(name = "Time_Key")
	private int time_Key;

	@Column(name = "Trans_Ccy_Key")
	private int trans_Ccy_Key;

	@Column(name = "Trans_Key")
	private int trans_Key;

	@Column(name = "Trans_Status_Key")
	private int trans_Status_Key;

	@Column(name = "Trans_Type_Key")
	private int trans_Type_Key;
	@Column(name = "Prim_Med_Desc")
	private String Prim_Med_Desc;
	@Column(name = "Trans_Cr_Db_Ind_Cd")
	private String Trans_Cr_Db_Ind_Cd;
	@Column(name = "Sec_Med_Desc")
	private String Sec_Med_Desc;

	public String getSec_Med_Desc() {
		return Sec_Med_Desc;
	}

	public void setSec_Med_Desc(String sec_Med_Desc) {
		Sec_Med_Desc = sec_Med_Desc;
	}

	public int getExec_Cust_Key() {
		return Exec_Cust_Key;
	}

	public void setExec_Cust_Key(int exec_Cust_Key) {
		Exec_Cust_Key = exec_Cust_Key;
	}

	public int getIdRow() {
		return IdRow;
	}

	public void setIdRow(int idRow) {
		IdRow = idRow;
	}

	public String getAcct_Emp_Ind() {
		return acct_Emp_Ind;
	}

	public void setAcct_Emp_Ind(String acct_Emp_Ind) {
		this.acct_Emp_Ind = acct_Emp_Ind;
	}

	public int getAcct_Key() {
		return acct_Key;
	}

	public void setAcct_Key(int acct_Key) {
		this.acct_Key = acct_Key;
	}

	public String getAcct_Name() {
		return acct_Name;
	}

	public void setAcct_Name(String acct_Name) {
		this.acct_Name = acct_Name;
	}

	public String getAcct_No() {
		return acct_No;
	}

	public void setAcct_No(String acct_No) {
		this.acct_No = acct_No;
	}

	public String getAcct_Type_Desc() {
		return acct_Type_Desc;
	}

	public void setAcct_Type_Desc(String acct_Type_Desc) {
		this.acct_Type_Desc = acct_Type_Desc;
	}

	public int getBenef_Ext_Cust_Key() {
		return benef_Ext_Cust_Key;
	}

	public void setBenef_Ext_Cust_Key(int benef_Ext_Cust_Key) {
		this.benef_Ext_Cust_Key = benef_Ext_Cust_Key;
	}

	public int getBranch_Key() {
		return branch_Key;
	}

	public void setBranch_Key(int branch_Key) {
		this.branch_Key = branch_Key;
	}

	public BigDecimal getCcy_Amt() {
		return ccy_Amt;
	}

	public void setCcy_Amt(BigDecimal ccy_Amt) {
		this.ccy_Amt = ccy_Amt;
	}

	public BigDecimal getCcy_Amt_In_Acct_Ccy() {
		return ccy_Amt_In_Acct_Ccy;
	}

	public void setCcy_Amt_In_Acct_Ccy(BigDecimal ccy_Amt_In_Acct_Ccy) {
		this.ccy_Amt_In_Acct_Ccy = ccy_Amt_In_Acct_Ccy;
	}

	public BigDecimal getCcy_Amt_In_Trans_Ccy() {
		return ccy_Amt_In_Trans_Ccy;
	}

	public void setCcy_Amt_In_Trans_Ccy(BigDecimal ccy_Amt_In_Trans_Ccy) {
		this.ccy_Amt_In_Trans_Ccy = ccy_Amt_In_Trans_Ccy;
	}

	public int getCntry_Key() {
		return cntry_Key;
	}

	public void setCntry_Key(int cntry_Key) {
		this.cntry_Key = cntry_Key;
	}

	public String getCust_Emp_Ind() {
		return cust_Emp_Ind;
	}

	public void setCust_Emp_Ind(String cust_Emp_Ind) {
		this.cust_Emp_Ind = cust_Emp_Ind;
	}

	public int getCust_Key() {
		return cust_Key;
	}

	public void setCust_Key(int cust_Key) {
		this.cust_Key = cust_Key;
	}

	public String getCust_Name() {
		return cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public String getCust_No() {
		return cust_No;
	}

	public void setCust_No(String cust_No) {
		this.cust_No = cust_No;
	}

	public String getCust_Type_Desc() {
		return cust_Type_Desc;
	}

	public void setCust_Type_Desc(String cust_Type_Desc) {
		this.cust_Type_Desc = cust_Type_Desc;
	}

	public int getDate_Key() {
		return date_Key;
	}

	public void setDate_Key(int date_Key) {
		this.date_Key = date_Key;
	}

	public int getEmp_Key() {
		return emp_Key;
	}

	public void setEmp_Key(int emp_Key) {
		this.emp_Key = emp_Key;
	}

	public String getPolitical_Exp_Prsn_Ind() {
		return political_Exp_Prsn_Ind;
	}

	public void setPolitical_Exp_Prsn_Ind(String political_Exp_Prsn_Ind) {
		this.political_Exp_Prsn_Ind = political_Exp_Prsn_Ind;
	}

	public int getPost_Date_Key() {
		return post_Date_Key;
	}

	public void setPost_Date_Key(int post_Date_Key) {
		this.post_Date_Key = post_Date_Key;
	}

	public String getRelate_Ind() {
		return relate_Ind;
	}

	public void setRelate_Ind(String relate_Ind) {
		this.relate_Ind = relate_Ind;
	}

	public int getRemit_Ext_Cust_Key() {
		return remit_Ext_Cust_Key;
	}

	public void setRemit_Ext_Cust_Key(int remit_Ext_Cust_Key) {
		this.remit_Ext_Cust_Key = remit_Ext_Cust_Key;
	}

	public int getSec_Acct_Key() {
		return sec_Acct_Key;
	}

	public void setSec_Acct_Key(int sec_Acct_Key) {
		this.sec_Acct_Key = sec_Acct_Key;
	}

	public String getThird_Cust_Ind() {
		return third_Cust_Ind;
	}

	public void setThird_Cust_Ind(String third_Cust_Ind) {
		this.third_Cust_Ind = third_Cust_Ind;
	}

	public int getTime_Key() {
		return time_Key;
	}

	public void setTime_Key(int time_Key) {
		this.time_Key = time_Key;
	}

	public int getTrans_Ccy_Key() {
		return trans_Ccy_Key;
	}

	public void setTrans_Ccy_Key(int trans_Ccy_Key) {
		this.trans_Ccy_Key = trans_Ccy_Key;
	}

	public int getTrans_Key() {
		return trans_Key;
	}

	public void setTrans_Key(int trans_Key) {
		this.trans_Key = trans_Key;
	}

	public int getTrans_Status_Key() {
		return trans_Status_Key;
	}

	public void setTrans_Status_Key(int trans_Status_Key) {
		this.trans_Status_Key = trans_Status_Key;
	}

	public int getTrans_Type_Key() {
		return trans_Type_Key;
	}

	public void setTrans_Type_Key(int trans_Type_Key) {
		this.trans_Type_Key = trans_Type_Key;
	}

	public String getPrim_Med_Desc() {
		return Prim_Med_Desc;
	}

	public void setPrim_Med_Desc(String prim_Med_Desc) {
		Prim_Med_Desc = prim_Med_Desc;
	}

	public String getTrans_Cr_Db_Ind_Cd() {
		return Trans_Cr_Db_Ind_Cd;
	}

	public void setTrans_Cr_Db_Ind_Cd(String trans_Cr_Db_Ind_Cd) {
		Trans_Cr_Db_Ind_Cd = trans_Cr_Db_Ind_Cd;
	}

}
