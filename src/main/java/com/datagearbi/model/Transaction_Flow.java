package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the Transaction_Flow database table.
 * 
 */
@Entity
@NamedQuery(name="Transaction_Flow.findAll", query="SELECT t FROM Transaction_Flow t")
@Table(name="Transaction_Flow",schema="DGAMLCORE")
public class Transaction_Flow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Trans_Key")
	private int trans_Key;

	@Column(name="Acct_Key")
	private int acct_Key;

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

	@Column(name="Date_Key")
	private int date_Key;

	@Column(name="Delta_Ccy_Amt")
	private String delta_Ccy_Amt;

	@Column(name="Emp_Key")
	private int emp_Key;

	@Column(name="Exec_Cust_Key")
	private int exec_Cust_Key;

	@Column(name="Exec_Ext_Cust_Key")
	private int exec_Ext_Cust_Key;

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

	@Column(name="Trans_Status_Key")
	private int trans_Status_Key;

	@Column(name="Trans_Type_Key")
	private int trans_Type_Key;

	public Transaction_Flow() {
	}

	public int getTrans_Key() {
		return this.trans_Key;
	}

	public void setTrans_Key(int trans_Key) {
		this.trans_Key = trans_Key;
	}

	public int getAcct_Key() {
		return this.acct_Key;
	}

	public void setAcct_Key(int acct_Key) {
		this.acct_Key = acct_Key;
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

	public int getDate_Key() {
		return this.date_Key;
	}

	public void setDate_Key(int date_Key) {
		this.date_Key = date_Key;
	}

	public String getDelta_Ccy_Amt() {
		return this.delta_Ccy_Amt;
	}

	public void setDelta_Ccy_Amt(String delta_Ccy_Amt) {
		this.delta_Ccy_Amt = delta_Ccy_Amt;
	}

	public int getEmp_Key() {
		return this.emp_Key;
	}

	public void setEmp_Key(int emp_Key) {
		this.emp_Key = emp_Key;
	}

	public int getExec_Cust_Key() {
		return this.exec_Cust_Key;
	}

	public void setExec_Cust_Key(int exec_Cust_Key) {
		this.exec_Cust_Key = exec_Cust_Key;
	}

	public int getExec_Ext_Cust_Key() {
		return this.exec_Ext_Cust_Key;
	}

	public void setExec_Ext_Cust_Key(int exec_Ext_Cust_Key) {
		this.exec_Ext_Cust_Key = exec_Ext_Cust_Key;
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