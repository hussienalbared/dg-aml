package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the DGAML008_Payment_Out_Country database table.
 * 
 */
@Embeddable
@NamedQuery(name="DGAML008_Payment_Out_Country.findAll", query="SELECT d FROM DGAML008_Payment_Out_Country d")
public class DGAML008_Payment_Out_Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Acct_Name")
	private String acct_Name;

	@Column(name="Acct_Type_Desc")
	private String acct_Type_Desc;

	@Column(name="Benef_Ext_Cust_Key")
	private int benef_Ext_Cust_Key;

	@Column(name="Branch_Key")
	private int branch_Key;

	@Column(name="Ccy_Amt")
	private BigDecimal ccy_Amt;

	@Column(name="Ccy_Amt_In_Acct_Ccy")
	private BigDecimal ccy_Amt_In_Acct_Ccy;

	@Column(name="Ccy_Amt_In_Trans_Ccy")
	private BigDecimal ccy_Amt_In_Trans_Ccy;

	@Column(name="Cntry_Key")
	private int cntry_Key;

	@Column(name="Cust_Emp_Ind")
	private String cust_Emp_Ind;

	@Column(name="Cust_Key")
	private int cust_Key;

	@Column(name="Cust_Name")
	private String cust_Name;

	@Column(name="Cust_No")
	private String cust_No;

	@Column(name="Cust_Type_Desc")
	private String cust_Type_Desc;

	@Column(name="Date_Key")
	private int date_Key;

	@Column(name="Emp_Key")
	private int emp_Key;

	@Column(name="Expr16")
	private String expr16;

	@Column(name="Expr6")
	private int expr6;

	@Column(name="Expr7")
	private String expr7;

	@Column(name="Political_Exp_Prsn_Ind")
	private String political_Exp_Prsn_Ind;

	@Column(name="Post_Date_Key")
	private int post_Date_Key;

	@Column(name="Relate_Ind")
	private String relate_Ind;

	@Column(name="Remit_Ext_Cust_Key")
	private int remit_Ext_Cust_Key;

	@Column(name="Sec_Acct_Key")
	private int sec_Acct_Key;

	@Column(name="Third_Cust_Ind")
	private String third_Cust_Ind;

	@Column(name="Time_Key")
	private int time_Key;

	@Column(name="Trans_Ccy_Key")
	private int trans_Ccy_Key;

	@Column(name="Trans_Key")
	private int trans_Key;

	@Column(name="Trans_Status_Key")
	private int trans_Status_Key;

	@Column(name="Trans_Type_Key")
	private int trans_Type_Key;

	public DGAML008_Payment_Out_Country() {
	}

	public String getAcct_Name() {
		return this.acct_Name;
	}

	public void setAcct_Name(String acct_Name) {
		this.acct_Name = acct_Name;
	}

	public String getAcct_Type_Desc() {
		return this.acct_Type_Desc;
	}

	public void setAcct_Type_Desc(String acct_Type_Desc) {
		this.acct_Type_Desc = acct_Type_Desc;
	}

	public int getBenef_Ext_Cust_Key() {
		return this.benef_Ext_Cust_Key;
	}

	public void setBenef_Ext_Cust_Key(int benef_Ext_Cust_Key) {
		this.benef_Ext_Cust_Key = benef_Ext_Cust_Key;
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

	public int getCntry_Key() {
		return this.cntry_Key;
	}

	public void setCntry_Key(int cntry_Key) {
		this.cntry_Key = cntry_Key;
	}

	public String getCust_Emp_Ind() {
		return this.cust_Emp_Ind;
	}

	public void setCust_Emp_Ind(String cust_Emp_Ind) {
		this.cust_Emp_Ind = cust_Emp_Ind;
	}

	public int getCust_Key() {
		return this.cust_Key;
	}

	public void setCust_Key(int cust_Key) {
		this.cust_Key = cust_Key;
	}

	public String getCust_Name() {
		return this.cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public String getCust_No() {
		return this.cust_No;
	}

	public void setCust_No(String cust_No) {
		this.cust_No = cust_No;
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

	public int getEmp_Key() {
		return this.emp_Key;
	}

	public void setEmp_Key(int emp_Key) {
		this.emp_Key = emp_Key;
	}

	public String getExpr16() {
		return this.expr16;
	}

	public void setExpr16(String expr16) {
		this.expr16 = expr16;
	}

	public int getExpr6() {
		return this.expr6;
	}

	public void setExpr6(int expr6) {
		this.expr6 = expr6;
	}

	public String getExpr7() {
		return this.expr7;
	}

	public void setExpr7(String expr7) {
		this.expr7 = expr7;
	}

	public String getPolitical_Exp_Prsn_Ind() {
		return this.political_Exp_Prsn_Ind;
	}

	public void setPolitical_Exp_Prsn_Ind(String political_Exp_Prsn_Ind) {
		this.political_Exp_Prsn_Ind = political_Exp_Prsn_Ind;
	}

	public int getPost_Date_Key() {
		return this.post_Date_Key;
	}

	public void setPost_Date_Key(int post_Date_Key) {
		this.post_Date_Key = post_Date_Key;
	}

	public String getRelate_Ind() {
		return this.relate_Ind;
	}

	public void setRelate_Ind(String relate_Ind) {
		this.relate_Ind = relate_Ind;
	}

	public int getRemit_Ext_Cust_Key() {
		return this.remit_Ext_Cust_Key;
	}

	public void setRemit_Ext_Cust_Key(int remit_Ext_Cust_Key) {
		this.remit_Ext_Cust_Key = remit_Ext_Cust_Key;
	}

	public int getSec_Acct_Key() {
		return this.sec_Acct_Key;
	}

	public void setSec_Acct_Key(int sec_Acct_Key) {
		this.sec_Acct_Key = sec_Acct_Key;
	}

	public String getThird_Cust_Ind() {
		return this.third_Cust_Ind;
	}

	public void setThird_Cust_Ind(String third_Cust_Ind) {
		this.third_Cust_Ind = third_Cust_Ind;
	}

	public int getTime_Key() {
		return this.time_Key;
	}

	public void setTime_Key(int time_Key) {
		this.time_Key = time_Key;
	}

	public int getTrans_Ccy_Key() {
		return this.trans_Ccy_Key;
	}

	public void setTrans_Ccy_Key(int trans_Ccy_Key) {
		this.trans_Ccy_Key = trans_Ccy_Key;
	}

	public int getTrans_Key() {
		return this.trans_Key;
	}

	public void setTrans_Key(int trans_Key) {
		this.trans_Key = trans_Key;
	}

	public int getTrans_Status_Key() {
		return this.trans_Status_Key;
	}

	public void setTrans_Status_Key(int trans_Status_Key) {
		this.trans_Status_Key = trans_Status_Key;
	}

	public int getTrans_Type_Key() {
		return this.trans_Type_Key;
	}

	public void setTrans_Type_Key(int trans_Type_Key) {
		this.trans_Type_Key = trans_Type_Key;
	}

}