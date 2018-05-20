package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the Account database table.
 * 
 */
@Entity
@Table(name="Account",schema="DGAMLCORE")
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")

public class Account implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@OneToMany
	@JoinColumn(name="acct_Key")
	private List<Customer_X_Account> CutomerAccounts;
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="Acct_Key")
		private int acct_Key;

	@Column(name="Acct_Ccy_Cd")
	private String acct_Ccy_Cd;

	public List<Customer_X_Account> getCutomerAccounts() {
		return CutomerAccounts;
	}

	public void setCutomerAccounts(List<Customer_X_Account> cutomerAccounts) {
		CutomerAccounts = cutomerAccounts;
	}

	@Column(name="Acct_Ccy_Name")
	private String acct_Ccy_Name;

	@Column(name="Acct_Close_Date")
	private Timestamp acct_Close_Date;
  

	@Column(name="Acct_Name")
	private String acct_Name;

	@Column(name="Acct_No")
	private String acct_No;
	

	@Column(name="Acct_Open_Date")
	private Timestamp acct_Open_Date;

	@Column(name="Acct_Prim_Branch_Name")
	private String acct_Prim_Branch_Name;

	@Column(name="Acct_Reg_Name")
	private String acct_Reg_Name;

	@Column(name="Acct_Reg_Type_Desc")
	private String acct_Reg_Type_Desc;

	@Column(name="Acct_Status_Desc")
	private String acct_Status_Desc;

	@Column(name="Acct_Tax_Id")
	private String acct_Tax_Id;

	@Column(name="Acct_Tax_Id_Type_Cd")
	private String acct_Tax_Id_Type_Cd;

	@Column(name="Acct_Tax_State_Cd")
	private String acct_Tax_State_Cd;

	@Column(name="Acct_Type_Desc")
	private String acct_Type_Desc;

	@Column(name="Alt_Name")
	private String alt_Name;

	@Column(name="Cash_Ints_Bus_Ind")
	private String cash_Ints_Bus_Ind;

	@Column(name="Ccy_Based_Acct_Ind")
	private String ccy_Based_Acct_Ind;

	@Column(name="Chg_Begin_Date")
	private Timestamp chg_Begin_Date;

	@Column(name="Chg_Current_Ind")
	private String chg_Current_Ind;

	@Column(name="Chg_End_Date")
	private Timestamp chg_End_Date;

	@Column(name="Coltrl_Type_Cd")
	private String coltrl_Type_Cd;

	@Column(name="Coltrl_Type_Desc")
	private String coltrl_Type_Desc;

	@Column(name="Dorm_Ind")
	private String dorm_Ind;

	@Column(name="Emp_Ind")
	private String emp_Ind;

	@Column(name="Insur_Amt")
	private BigDecimal insur_Amt;

	@Column(name="Letter_Cr_Onfile_Ind")
	private String letter_Cr_Onfile_Ind;

	@Column(name="Line_Bus_Name")
	private String line_Bus_Name;

	@Column(name="Mail_Addr_1")
	private String mail_Addr_1;

	@Column(name="Mail_Addr_2")
	private String mail_Addr_2;

	@Column(name="Mail_City_Name")
	private String mail_City_Name;

	@Column(name="Mail_Cntry_Cd")
	private String mail_Cntry_Cd;

	@Column(name="Mail_Cntry_Name")
	private String mail_Cntry_Name;

	@Column(name="Mail_Post_Cd")
	private String mail_Post_Cd;

	@Column(name="Mail_State_Cd")
	private String mail_State_Cd;

	@Column(name="Mail_State_Name")
	private String mail_State_Name;

	@Column(name="Maturity_Date")
	private Timestamp maturity_Date;

	@Column(name="Orig_Loan_Amt")
	private BigDecimal orig_Loan_Amt;

	@Column(name="Prod_Categ_Name")
	private String prod_Categ_Name;

	@Column(name="Prod_Line_Name")
	private String prod_Line_Name;

	@Column(name="Prod_Name")
	private String prod_Name;

	@Column(name="Prod_No")
	private String prod_No;

	@Column(name="Prod_Type_Name")
	private String prod_Type_Name;

	@Column(name="Trade_Fin_Ind")
	private String trade_Fin_Ind;

	public Account() {
	}

	public String getAcct_Ccy_Cd() {
		return this.acct_Ccy_Cd;
	}

	public void setAcct_Ccy_Cd(String acct_Ccy_Cd) {
		this.acct_Ccy_Cd = acct_Ccy_Cd;
	}

	public String getAcct_Ccy_Name() {
		return this.acct_Ccy_Name;
	}

	public void setAcct_Ccy_Name(String acct_Ccy_Name) {
		this.acct_Ccy_Name = acct_Ccy_Name;
	}

	public Timestamp getAcct_Close_Date() {
		return this.acct_Close_Date;
	}

	public void setAcct_Close_Date(Timestamp acct_Close_Date) {
		this.acct_Close_Date = acct_Close_Date;
	}

	public int getAcct_Key() {
		return this.acct_Key;
	}

	public void setAcct_Key(int acct_Key) {
		this.acct_Key = acct_Key;
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

	public Timestamp getAcct_Open_Date() {
		return this.acct_Open_Date;
	}

	public void setAcct_Open_Date(Timestamp acct_Open_Date) {
		this.acct_Open_Date = acct_Open_Date;
	}

	public String getAcct_Prim_Branch_Name() {
		return this.acct_Prim_Branch_Name;
	}

	public void setAcct_Prim_Branch_Name(String acct_Prim_Branch_Name) {
		this.acct_Prim_Branch_Name = acct_Prim_Branch_Name;
	}

	public String getAcct_Reg_Name() {
		return this.acct_Reg_Name;
	}

	public void setAcct_Reg_Name(String acct_Reg_Name) {
		this.acct_Reg_Name = acct_Reg_Name;
	}

	public String getAcct_Reg_Type_Desc() {
		return this.acct_Reg_Type_Desc;
	}

	public void setAcct_Reg_Type_Desc(String acct_Reg_Type_Desc) {
		this.acct_Reg_Type_Desc = acct_Reg_Type_Desc;
	}

	public String getAcct_Status_Desc() {
		return this.acct_Status_Desc;
	}

	public void setAcct_Status_Desc(String acct_Status_Desc) {
		this.acct_Status_Desc = acct_Status_Desc;
	}

	public String getAcct_Tax_Id() {
		return this.acct_Tax_Id;
	}

	public void setAcct_Tax_Id(String acct_Tax_Id) {
		this.acct_Tax_Id = acct_Tax_Id;
	}

	public String getAcct_Tax_Id_Type_Cd() {
		return this.acct_Tax_Id_Type_Cd;
	}

	public void setAcct_Tax_Id_Type_Cd(String acct_Tax_Id_Type_Cd) {
		this.acct_Tax_Id_Type_Cd = acct_Tax_Id_Type_Cd;
	}

	public String getAcct_Tax_State_Cd() {
		return this.acct_Tax_State_Cd;
	}

	public void setAcct_Tax_State_Cd(String acct_Tax_State_Cd) {
		this.acct_Tax_State_Cd = acct_Tax_State_Cd;
	}

	public String getAcct_Type_Desc() {
		return this.acct_Type_Desc;
	}

	public void setAcct_Type_Desc(String acct_Type_Desc) {
		this.acct_Type_Desc = acct_Type_Desc;
	}

	public String getAlt_Name() {
		return this.alt_Name;
	}

	public void setAlt_Name(String alt_Name) {
		this.alt_Name = alt_Name;
	}

	public String getCash_Ints_Bus_Ind() {
		return this.cash_Ints_Bus_Ind;
	}

	public void setCash_Ints_Bus_Ind(String cash_Ints_Bus_Ind) {
		this.cash_Ints_Bus_Ind = cash_Ints_Bus_Ind;
	}

	public String getCcy_Based_Acct_Ind() {
		return this.ccy_Based_Acct_Ind;
	}

	public void setCcy_Based_Acct_Ind(String ccy_Based_Acct_Ind) {
		this.ccy_Based_Acct_Ind = ccy_Based_Acct_Ind;
	}

	public Timestamp getChg_Begin_Date() {
		return this.chg_Begin_Date;
	}

	public void setChg_Begin_Date(Timestamp chg_Begin_Date) {
		this.chg_Begin_Date = chg_Begin_Date;
	}

	public String getChg_Current_Ind() {
		return this.chg_Current_Ind;
	}

	public void setChg_Current_Ind(String chg_Current_Ind) {
		this.chg_Current_Ind = chg_Current_Ind;
	}

	public Timestamp getChg_End_Date() {
		return this.chg_End_Date;
	}

	public void setChg_End_Date(Timestamp chg_End_Date) {
		this.chg_End_Date = chg_End_Date;
	}

	public String getColtrl_Type_Cd() {
		return this.coltrl_Type_Cd;
	}

	public void setColtrl_Type_Cd(String coltrl_Type_Cd) {
		this.coltrl_Type_Cd = coltrl_Type_Cd;
	}

	public String getColtrl_Type_Desc() {
		return this.coltrl_Type_Desc;
	}

	public void setColtrl_Type_Desc(String coltrl_Type_Desc) {
		this.coltrl_Type_Desc = coltrl_Type_Desc;
	}

	public String getDorm_Ind() {
		return this.dorm_Ind;
	}

	public void setDorm_Ind(String dorm_Ind) {
		this.dorm_Ind = dorm_Ind;
	}

	public String getEmp_Ind() {
		return this.emp_Ind;
	}

	public void setEmp_Ind(String emp_Ind) {
		this.emp_Ind = emp_Ind;
	}

	public BigDecimal getInsur_Amt() {
		return this.insur_Amt;
	}

	public void setInsur_Amt(BigDecimal insur_Amt) {
		this.insur_Amt = insur_Amt;
	}

	public String getLetter_Cr_Onfile_Ind() {
		return this.letter_Cr_Onfile_Ind;
	}

	public void setLetter_Cr_Onfile_Ind(String letter_Cr_Onfile_Ind) {
		this.letter_Cr_Onfile_Ind = letter_Cr_Onfile_Ind;
	}

	public String getLine_Bus_Name() {
		return this.line_Bus_Name;
	}

	public void setLine_Bus_Name(String line_Bus_Name) {
		this.line_Bus_Name = line_Bus_Name;
	}

	public String getMail_Addr_1() {
		return this.mail_Addr_1;
	}

	public void setMail_Addr_1(String mail_Addr_1) {
		this.mail_Addr_1 = mail_Addr_1;
	}

	public String getMail_Addr_2() {
		return this.mail_Addr_2;
	}

	public void setMail_Addr_2(String mail_Addr_2) {
		this.mail_Addr_2 = mail_Addr_2;
	}

	public String getMail_City_Name() {
		return this.mail_City_Name;
	}

	public void setMail_City_Name(String mail_City_Name) {
		this.mail_City_Name = mail_City_Name;
	}

	public String getMail_Cntry_Cd() {
		return this.mail_Cntry_Cd;
	}

	public void setMail_Cntry_Cd(String mail_Cntry_Cd) {
		this.mail_Cntry_Cd = mail_Cntry_Cd;
	}

	public String getMail_Cntry_Name() {
		return this.mail_Cntry_Name;
	}

	public void setMail_Cntry_Name(String mail_Cntry_Name) {
		this.mail_Cntry_Name = mail_Cntry_Name;
	}

	public String getMail_Post_Cd() {
		return this.mail_Post_Cd;
	}

	public void setMail_Post_Cd(String mail_Post_Cd) {
		this.mail_Post_Cd = mail_Post_Cd;
	}

	public String getMail_State_Cd() {
		return this.mail_State_Cd;
	}

	public void setMail_State_Cd(String mail_State_Cd) {
		this.mail_State_Cd = mail_State_Cd;
	}

	public String getMail_State_Name() {
		return this.mail_State_Name;
	}

	public void setMail_State_Name(String mail_State_Name) {
		this.mail_State_Name = mail_State_Name;
	}

	public Timestamp getMaturity_Date() {
		return this.maturity_Date;
	}

	public void setMaturity_Date(Timestamp maturity_Date) {
		this.maturity_Date = maturity_Date;
	}

	public BigDecimal getOrig_Loan_Amt() {
		return this.orig_Loan_Amt;
	}

	public void setOrig_Loan_Amt(BigDecimal orig_Loan_Amt) {
		this.orig_Loan_Amt = orig_Loan_Amt;
	}

	public String getProd_Categ_Name() {
		return this.prod_Categ_Name;
	}

	public void setProd_Categ_Name(String prod_Categ_Name) {
		this.prod_Categ_Name = prod_Categ_Name;
	}

	public String getProd_Line_Name() {
		return this.prod_Line_Name;
	}

	public void setProd_Line_Name(String prod_Line_Name) {
		this.prod_Line_Name = prod_Line_Name;
	}

	public String getProd_Name() {
		return this.prod_Name;
	}

	public void setProd_Name(String prod_Name) {
		this.prod_Name = prod_Name;
	}

	public String getProd_No() {
		return this.prod_No;
	}

	public void setProd_No(String prod_No) {
		this.prod_No = prod_No;
	}

	public String getProd_Type_Name() {
		return this.prod_Type_Name;
	}

	public void setProd_Type_Name(String prod_Type_Name) {
		this.prod_Type_Name = prod_Type_Name;
	}

	public String getTrade_Fin_Ind() {
		return this.trade_Fin_Ind;
	}

	public void setTrade_Fin_Ind(String trade_Fin_Ind) {
		this.trade_Fin_Ind = trade_Fin_Ind;
	}

}