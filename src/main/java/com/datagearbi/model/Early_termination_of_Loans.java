package com.datagearbi.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Early_termination_of_Loans", schema = "dbo")
public class Early_termination_of_Loans {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "IdRow")
	private int IdRow;
private long percentageCloseAcct;
	public long getPercentageCloseAcct() {
	return percentageCloseAcct;
}
public void setPercentageCloseAcct(long percentageCloseAcct) {
	this.percentageCloseAcct = percentageCloseAcct;
}
	@Column(name = "Acct_Key")
	private int acct_Key;

	@Column(name = "Acct_Name")
	private String acct_Name;

	@Column(name = "Acct_No")
	private String acct_No;

	public int getIdRow() {
		return IdRow;
	}
	public void setIdRow(int idRow) {
		IdRow = idRow;
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
	public String getPolitical_Exp_Prsn_Ind() {
		return political_Exp_Prsn_Ind;
	}
	public void setPolitical_Exp_Prsn_Ind(String political_Exp_Prsn_Ind) {
		this.political_Exp_Prsn_Ind = political_Exp_Prsn_Ind;
	}
	public String getEmp_ind() {
		return Emp_ind;
	}
	public void setEmp_ind(String emp_ind) {
		Emp_ind = emp_ind;
	}
	public String getCust_Emp_Ind() {
		return Cust_Emp_Ind;
	}
	public void setCust_Emp_Ind(String cust_Emp_Ind) {
		Cust_Emp_Ind = cust_Emp_Ind;
	}
	public long getOrig_Loan_Amt() {
		return Orig_Loan_Amt;
	}
	public void setOrig_Loan_Amt(long orig_Loan_Amt) {
		Orig_Loan_Amt = orig_Loan_Amt;
	}
	public Date getAcct_Open_Date() {
		return Acct_Open_Date;
	}
	public void setAcct_Open_Date(Date acct_Open_Date) {
		Acct_Open_Date = acct_Open_Date;
	}
	public Date getAcct_Close_Date() {
		return Acct_Close_Date;
	}
	public void setAcct_Close_Date(Date acct_Close_Date) {
		Acct_Close_Date = acct_Close_Date;
	}
	public Date getMaturity_Date() {
		return Maturity_Date;
	}
	public void setMaturity_Date(Date maturity_Date) {
		Maturity_Date = maturity_Date;
	}
	@Column(name = "Acct_Type_Desc")
	private String acct_Type_Desc;

	@Column(name = "Cust_Key")
	private int cust_Key;

	@Column(name = "Cust_Name")
	private String cust_Name;

	@Column(name = "Cust_No")
	private String cust_No;

	@Column(name = "Cust_Type_Desc")
	private String cust_Type_Desc;

	@Column(name = "Political_Exp_Prsn_Ind")
	private String political_Exp_Prsn_Ind;

	private String Emp_ind;
	private String Cust_Emp_Ind;
	private long Orig_Loan_Amt;

	private Date Acct_Open_Date;
	private Date Acct_Close_Date;
	private Date Maturity_Date;

}
