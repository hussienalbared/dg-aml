package com.datagearbi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the DGAML001_TRANS_LOAN_X_TO_T database table.
 * 
 */
@Entity
@Table(name="DGAML001_TRANS_LOAN_X_TO_T",schema="DGAMLCORE")
@NamedQuery(name="Dgaml001TransLoanXToT.findAll", query="SELECT d FROM Dgaml001TransLoanXToT d")
public class Dgaml001TransLoanXToT implements Serializable {
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
	
	
	@Column(name="Acct_Emp_Ind")
	private String acct_Emp_Ind;
   
	@Column(name="Acct_Key")
	private int acctKey;

	@Column(name="Acct_Name")
	private String acct_Name;

	@Column(name="Acct_No")
	private String acct_No;

	@Column(name="Acct_Type_Desc")
	private String acct_Type_Desc;

	@Column(name="Branch_Key")
	private int branch_Key;

	@Column(name="Calendar_Date")
	private Date Calendar_Date;
	
	@Column(name="Acct_Open_Date")
	private Date Acct_Open_Date;
	
	@Column(name="Maturity_Date")
	private Date Maturity_Date;
	
	@Column(name="Date_Key")
	private int date_Key;
	
	@Column(name="Time_Key")
	private int time_Key;
	
	@Column(name="Cntry_Key")
	private int cntry_Key;
//
//	@Column(name="Cust_Emp_Ind")
//	private String cust_Emp_Ind;

	@Column(name="Cust_Key")
	private int cust_Key;

	@Column(name="Cust_Name")
	private String cust_Name;

	@Column(name="Cust_No")
	private String cust_No;
//
//	@Column(name="Cust_Type_Desc")
//	private String cust_Type_Desc;

	@Column(name="Political_Exp_Prsn_Ind")
	private String political_Exp_Prsn_Ind;

	@Column(name="Trans_Key")
	private int trans_Key;

	@Column(name="Trans_Status_Key")
	private int trans_Status_Key;

	@Column(name="Trans_Type_Key")
	private int trans_Type_Key;

	@Column(name="Trans_Cr_Db_Ind_Cd")
	private char Trans_Cr_Db_Ind_Cd;
	
	@Column(name="Prim_Med_Desc")
	private String Prim_Med_Desc;
	
	@Column(name="Sec_Med_Desc")
	private String Sec_Med_Desc;
	
	@Column(name="Cust_Type_Desc")
	private String Cust_Type_Desc;
	
	@Column(name="Cust_Emp_Ind")
	private String Cust_Emp_Ind;
	
	@Column(name="calculated_percentage")
	private float calculated_percentage;
	
	
	@Column(name="Transfer_Period_Date")
	private int Transfer_Period_Date;
	
	public int getTransfer_Period_Date() {
		return Transfer_Period_Date;
	}
	public void setTransfer_Period_Date(int transfer_Period_Date) {
		Transfer_Period_Date = transfer_Period_Date;
	}
	public int getAcctKey() {
		return acctKey;
	}
	public void setAcctKey(int acctKey) {
		this.acctKey = acctKey;
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
	public char getTrans_Cr_Db_Ind_Cd() {
		return Trans_Cr_Db_Ind_Cd;
	}
	public void setTrans_Cr_Db_Ind_Cd(char trans_Cr_Db_Ind_Cd) {
		Trans_Cr_Db_Ind_Cd = trans_Cr_Db_Ind_Cd;
	}
	public String getPrim_Med_Desc() {
		return Prim_Med_Desc;
	}
	public void setPrim_Med_Desc(String prim_Med_Desc) {
		Prim_Med_Desc = prim_Med_Desc;
	}
	public String getSec_Med_Desc() {
		return Sec_Med_Desc;
	}
	public void setSec_Med_Desc(String sec_Med_Desc) {
		Sec_Med_Desc = sec_Med_Desc;
	}
	public float getCalculated_percentage() {
		return calculated_percentage;
	}
	public void setCalculated_percentage(float calculated_percentage) {
		this.calculated_percentage = calculated_percentage;
	}
	public Dgaml001TransLoanXToT() {
	}

	public String getAcct_Emp_Ind() {
		return this.acct_Emp_Ind;
	}

	public void setAcct_Emp_Ind(String acct_Emp_Ind) {
		this.acct_Emp_Ind = acct_Emp_Ind;
	}

	public int getAcct_Key() {
		return this.acctKey;
	}

	public void setAcct_Key(int acct_Key) {
		this.acctKey = acct_Key;
	}

	public String getAcct_Name() {
		return this.acct_Name;
	}

	public void setAcct_Name(String acct_Name) {
		this.acct_Name = acct_Name;
	}

	public String getAcct_No() {
		return this.acct_No;
	}

	public void setAcct_No(String acct_No) {
		this.acct_No = acct_No;
	}

	public String getAcct_Type_Desc() {
		return this.acct_Type_Desc;
	}

	public void setAcct_Type_Desc(String acct_Type_Desc) {
		this.acct_Type_Desc = acct_Type_Desc;
	}

	public int getBranch_Key() {
		return this.branch_Key;
	}

	public void setBranch_Key(int branch_Key) {
		this.branch_Key = branch_Key;
	}

	public int getCntry_Key() {
		return this.cntry_Key;
	}

	public void setCntry_Key(int cntry_Key) {
		this.cntry_Key = cntry_Key;
	}

	public String getCust_Emp_Ind() {
		return this.Cust_Emp_Ind;
	}

	public void setCust_Emp_Ind(String cust_Emp_Ind) {
		this.Cust_Emp_Ind = cust_Emp_Ind;
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
		return this.Cust_Type_Desc;
	}

	public void setCust_Type_Desc(String cust_Type_Desc) {
		this.Cust_Type_Desc = cust_Type_Desc;
	}

	public int getDate_Key() {
		return this.date_Key;
	}

	public void setDate_Key(int date_Key) {
		this.date_Key = date_Key;
	}

	public String getPolitical_Exp_Prsn_Ind() {
		return this.political_Exp_Prsn_Ind;
	}

	public void setPolitical_Exp_Prsn_Ind(String political_Exp_Prsn_Ind) {
		this.political_Exp_Prsn_Ind = political_Exp_Prsn_Ind;
	}

	public int getTime_Key() {
		return this.time_Key;
	}

	public void setTime_Key(int time_Key) {
		this.time_Key = time_Key;
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