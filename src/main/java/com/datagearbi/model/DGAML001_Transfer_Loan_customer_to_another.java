package com.datagearbi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="DGAML001_Transfer_Loan_customer_to_another")
@NamedQuery(name="DGAML001_Transfer_Loan_customer_to_another.findAll", query="SELECT d FROM DGAML001_Transfer_Loan_customer_to_another d")
public class DGAML001_Transfer_Loan_customer_to_another implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IdRow")
	private int IdRow;
	public void setIdRow(int idRow) {
		IdRow = idRow;
	}
	public int getIdRow() {
		return IdRow;
	}
	
	@Column(name="Acct_No")
	private String acct_no;
	
	@Column(name="Acct_Key")
	private int acct_key;
	
	@Column(name="Acct_Name")
	private String acct_name;
	
	@Column(name="Acct_Type_Desc")
	private String acct_type_desc;
	
	@Column(name="Acct_Emp_Ind")
	private String Acct_Emp_Ind;
	
//	@Column(name="Orig_Loan_Amt",nullable = true)
//	private int Orig_Loan_Amt;
	
	@Column(name="Calendar_Date")
	private Date Calendar_Date;
	
	@Column(name="Acct_Open_Date")
	private Date Acct_Open_Date;
	
	@Column(name="Maturity_Date")
	private Date Maturity_Date;
	
	@Column(name="Date_Key")
	private String Date_Key;
	
	@Column(name="Time_Key")
	private int Time_Key;
	
	@Column(name="Trans_Type_Key")
	private int Trans_Type_Key;
	
	@Column(name="Trans_Key")
	private int Trans_Key;
	
	@Column(name="Trans_Cr_Db_Ind_Cd")
	private char Trans_Cr_Db_Ind_Cd;
	
	@Column(name="Cntry_Key")
	private int Cntry_Key;
	
	@Column(name="Trans_Status_Key")
	private int Trans_Status_Key;
	
	@Column(name="Branch_Key")
	private int Branch_Key;
	
	@Column(name="Prim_Med_Desc")
	private String Prim_Med_Desc;
	
	@Column(name="Cust_Key")
	private int Cust_Key;
	
	@Column(name="Cust_Name")
	private String Cust_Name;
	
	@Column(name="Cust_Type_Desc")
	private String Cust_Type_Desc;
	
	@Column(name="Cust_No")
	private String Cust_No;
	
	@Column(name="Cust_Emp_Ind")
	private String Cust_Emp_Ind;
	
	@Column(name="Political_Exp_Prsn_Ind")
	private String Political_Exp_Prsn_Ind;
	public String getAcct_no() {
		return acct_no;
	}
	public void setAcct_no(String acct_no) {
		this.acct_no = acct_no;
	}
	public int getAcct_key() {
		return acct_key;
	}
	public void setAcct_key(int acct_key) {
		this.acct_key = acct_key;
	}
	public String getAcct_name() {
		return acct_name;
	}
	public void setAcct_name(String acct_name) {
		this.acct_name = acct_name;
	}
	public String getAcct_type_desc() {
		return acct_type_desc;
	}
	public void setAcct_type_desc(String acct_type_desc) {
		this.acct_type_desc = acct_type_desc;
	}
	public String getAcct_Emp_Ind() {
		return Acct_Emp_Ind;
	}
	public void setAcct_Emp_Ind(String acct_Emp_Ind) {
		Acct_Emp_Ind = acct_Emp_Ind;
	}
	public Date getCalendar_Date() {
		return Calendar_Date;
	}
	public void setCalendar_Date(Date calendar_Date) {
		Calendar_Date = calendar_Date;
	}
	public Date getAcct_Open_Date() {
		return Acct_Open_Date;
	}
	public void setAcct_Open_Date(Date acct_Open_Date) {
		Acct_Open_Date = acct_Open_Date;
	}
	public Date getMaturity_Date() {
		return Maturity_Date;
	}
	public void setMaturity_Date(Date maturity_Date) {
		Maturity_Date = maturity_Date;
	}
	public String getDate_Key() {
		return Date_Key;
	}
	public void setDate_Key(String date_Key) {
		Date_Key = date_Key;
	}
	public int getTime_Key() {
		return Time_Key;
	}
	public void setTime_Key(int time_Key) {
		Time_Key = time_Key;
	}
	public int getTrans_Type_Key() {
		return Trans_Type_Key;
	}
	public void setTrans_Type_Key(int trans_Type_Key) {
		Trans_Type_Key = trans_Type_Key;
	}
	public int getTrans_Key() {
		return Trans_Key;
	}
	public void setTrans_Key(int trans_Key) {
		Trans_Key = trans_Key;
	}
	public char getTrans_Cr_Db_Ind_Cd() {
		return Trans_Cr_Db_Ind_Cd;
	}
	public void setTrans_Cr_Db_Ind_Cd(char trans_Cr_Db_Ind_Cd) {
		Trans_Cr_Db_Ind_Cd = trans_Cr_Db_Ind_Cd;
	}
	public int getCntry_Key() {
		return Cntry_Key;
	}
	public void setCntry_Key(int cntry_Key) {
		Cntry_Key = cntry_Key;
	}
	public int getTrans_Status_Key() {
		return Trans_Status_Key;
	}
	public void setTrans_Status_Key(int trans_Status_Key) {
		Trans_Status_Key = trans_Status_Key;
	}
	public int getBranch_Key() {
		return Branch_Key;
	}
	public void setBranch_Key(int branch_Key) {
		Branch_Key = branch_Key;
	}
	public String getPrim_Med_Desc() {
		return Prim_Med_Desc;
	}
	public void setPrim_Med_Desc(String prim_Med_Desc) {
		Prim_Med_Desc = prim_Med_Desc;
	}
	public int getCust_Key() {
		return Cust_Key;
	}
	public void setCust_Key(int cust_Key) {
		Cust_Key = cust_Key;
	}
	public String getCust_Name() {
		return Cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}
	public String getCust_Type_Desc() {
		return Cust_Type_Desc;
	}
	public void setCust_Type_Desc(String cust_Type_Desc) {
		Cust_Type_Desc = cust_Type_Desc;
	}
	public String getCust_No() {
		return Cust_No;
	}
	public void setCust_No(String cust_No) {
		Cust_No = cust_No;
	}
	public String getCust_Emp_Ind() {
		return Cust_Emp_Ind;
	}
	public void setCust_Emp_Ind(String cust_Emp_Ind) {
		Cust_Emp_Ind = cust_Emp_Ind;
	}
	public String getPolitical_Exp_Prsn_Ind() {
		return Political_Exp_Prsn_Ind;
	}
	public void setPolitical_Exp_Prsn_Ind(String political_Exp_Prsn_Ind) {
		Political_Exp_Prsn_Ind = political_Exp_Prsn_Ind;
	}
	
	
}
