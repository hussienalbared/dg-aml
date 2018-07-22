package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the DGAML017_Multiple_Branch_Usage database table.
 * 
 */
@Embeddable
@NamedQuery(name="DGAML017_Multiple_Branch_Usage.findAll", query="SELECT d FROM DGAML017_Multiple_Branch_Usage d")
public class DGAML017_Multiple_Branch_Usage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Acct_Ccy_Cd")
	private String acct_Ccy_Cd;

	@Column(name="Acct_Ccy_Name")
	private String acct_Ccy_Name;

	@Column(name="Acct_Close_Date")
	private Timestamp acct_Close_Date;

	@Column(name="Acct_Key")
	private int acct_Key;

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

	@Column(name="Addr_1")
	private String addr_1;

	@Column(name="Addr_2")
	private String addr_2;

	@Column(name="Alt_Name")
	private String alt_Name;

	@Column(name="Annual_Income_Amt")
	private BigDecimal annual_Income_Amt;

	@Column(name="Benef_Ext_Cust_Key")
	private int benef_Ext_Cust_Key;

	@Column(name="Branch_Key")
	private int branch_Key;

	@Column(name="Branch_Name")
	private String branch_Name;

	@Column(name="Branch_No")
	private String branch_No;

	@Column(name="Branch_Type_Desc")
	private String branch_Type_Desc;

	@Column(name="Cash_Ints_Bus_Ind")
	private String cash_Ints_Bus_Ind;

	@Column(name="Ccy_Amt")
	private BigDecimal ccy_Amt;

	@Column(name="Ccy_Amt_In_Acct_Ccy")
	private BigDecimal ccy_Amt_In_Acct_Ccy;

	@Column(name="Ccy_Amt_In_Trans_Ccy")
	private BigDecimal ccy_Amt_In_Trans_Ccy;

	@Column(name="Ccy_Based_Acct_Ind")
	private String ccy_Based_Acct_Ind;

	@Column(name="Ccy_Exch_Ind")
	private String ccy_Exch_Ind;

	@Column(name="Check_Casher_Ind")
	private String check_Casher_Ind;

	@Column(name="Chg_Begin_Date")
	private Timestamp chg_Begin_Date;

	@Column(name="Chg_Current_Ind")
	private String chg_Current_Ind;

	@Column(name="Chg_End_Date")
	private Timestamp chg_End_Date;

	@Column(name="Citizen_Cntry_Cd")
	private String citizen_Cntry_Cd;

	@Column(name="Citizen_Cntry_Name")
	private String citizen_Cntry_Name;

	@Column(name="City_Name")
	private String city_Name;

	@Column(name="Cntry_Cd")
	private String cntry_Cd;

	@Column(name="Cntry_Key")
	private int cntry_Key;

	@Column(name="Cntry_name")
	private String cntry_name;

	@Column(name="Coltrl_Type_Cd")
	private String coltrl_Type_Cd;

	@Column(name="Coltrl_Type_Desc")
	private String coltrl_Type_Desc;

	@Column(name="Cust_Birth_Date")
	private Timestamp cust_Birth_Date;

	@Column(name="Cust_FName")
	private String cust_FName;

	@Column(name="Cust_Gen")
	private String cust_Gen;

	@Column(name="Cust_Id_Cntry_Cd")
	private String cust_Id_Cntry_Cd;

	@Column(name="Cust_Id_State_Cd")
	private String cust_Id_State_Cd;

	@Column(name="Cust_Ident_Exp_Date")
	private Timestamp cust_Ident_Exp_Date;

	@Column(name="Cust_Ident_Id")
	private String cust_Ident_Id;

	@Column(name="Cust_Ident_Iss_Date")
	private Timestamp cust_Ident_Iss_Date;

	@Column(name="Cust_Ident_Type_Desc")
	private String cust_Ident_Type_Desc;

	@Column(name="Cust_Key")
	private int cust_Key;

	@Column(name="Cust_LName")
	private String cust_LName;

	@Column(name="Cust_MName")
	private String cust_MName;

	@Column(name="Cust_Name")
	private String cust_Name;

	@Column(name="Cust_No")
	private String cust_No;

	@Column(name="Cust_Since_Date")
	private Timestamp cust_Since_Date;

	@Column(name="Cust_Status_Desc")
	private String cust_Status_Desc;

	@Column(name="Cust_Tax_Id")
	private String cust_Tax_Id;

	@Column(name="Cust_Tax_Id_Type_Cd")
	private String cust_Tax_Id_Type_Cd;

	@Column(name="Cust_Type_Desc")
	private String cust_Type_Desc;

	@Column(name="Date_Key")
	private int date_Key;

	@Column(name="Delta_Ccy_Amt")
	private String delta_Ccy_Amt;

	@Column(name="Do_Bus_As_Name")
	private String do_Bus_As_Name;

	@Column(name="Dorm_Ind")
	private String dorm_Ind;

	@Column(name="Email_Addr")
	private String email_Addr;

	@Column(name="Emp_Ind")
	private String emp_Ind;

	@Column(name="Emp_Key")
	private int emp_Key;

	@Column(name="Emp_No")
	private String emp_No;

	@Column(name="Empr_Name")
	private String empr_Name;

	@Column(name="Empr_Tel_No")
	private String empr_Tel_No;

	@Column(name="Exec_Cust_Key")
	private int exec_Cust_Key;

	@Column(name="Exec_Ext_Cust_Key")
	private int exec_Ext_Cust_Key;

	@Column(name="Expr1")
	private int expr1;

	@Column(name="Expr10")
	private String expr10;

	@Column(name="Expr11")
	private String expr11;

	@Column(name="Expr12")
	private String expr12;

	@Column(name="Expr13")
	private String expr13;

	@Column(name="Expr14")
	private String expr14;

	@Column(name="Expr15")
	private String expr15;

	@Column(name="Expr16")
	private String expr16;

	@Column(name="Expr17")
	private Timestamp expr17;

	@Column(name="Expr18")
	private Timestamp expr18;

	@Column(name="Expr19")
	private String expr19;

	@Column(name="Expr2")
	private String expr2;

	@Column(name="Expr20")
	private int expr20;

	@Column(name="Expr21")
	private int expr21;

	@Column(name="Expr22")
	private String expr22;

	@Column(name="Expr23")
	private String expr23;

	@Column(name="Expr24")
	private String expr24;

	@Column(name="Expr25")
	private String expr25;

	@Column(name="Expr26")
	private String expr26;

	@Column(name="Expr27")
	private String expr27;

	@Column(name="Expr28")
	private String expr28;

	@Column(name="Expr29")
	private String expr29;

	@Column(name="Expr3")
	private Timestamp expr3;

	@Column(name="Expr4")
	private Timestamp expr4;

	@Column(name="Expr5")
	private String expr5;

	@Column(name="Expr6")
	private int expr6;

	@Column(name="Expr7")
	private String expr7;

	@Column(name="Expr8")
	private String expr8;

	@Column(name="Expr9")
	private String expr9;

	@Column(name="Ext_Cust_Ind")
	private String ext_Cust_Ind;

	@Column(name="Frgn_Consulate")
	private String frgn_Consulate;

	@Column(name="Inds_Cd")
	private String inds_Cd;

	@Column(name="Inds_Cd_RR")
	private String inds_Cd_RR;

	@Column(name="Inds_Desc")
	private String inds_Desc;

	@Column(name="Insur_Amt")
	private BigDecimal insur_Amt;

	@Column(name="Internet_Gmblng_Ind")
	private String internet_Gmblng_Ind;

	@Column(name="Iss_Bears_Shares_Ind")
	private String iss_Bears_Shares_Ind;

	@Column(name="Last_Cash_Trans_Report_Date")
	private Timestamp last_Cash_Trans_Report_Date;

	@Column(name="Last_Contact_Date")
	private Timestamp last_Contact_Date;

	@Column(name="Last_Risk_Assmnt_Date")
	private Timestamp last_Risk_Assmnt_Date;

	@Column(name="Last_Susp_Act_Report_Date")
	private Timestamp last_Susp_Act_Report_Date;

	@Column(name="Last_Update_Date")
	private Timestamp last_Update_Date;

	@Column(name="Legal_Obj_Type")
	private String legal_Obj_Type;

	@Column(name="Letter_Cr_Onfile_Ind")
	private String letter_Cr_Onfile_Ind;

	@Column(name="Line_Bus_Name")
	private String line_Bus_Name;

	@Column(name="Mach_Cd_Mail_Addr_Line")
	private String mach_Cd_Mail_Addr_Line;

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

	@Column(name="Marital_Status_Desc")
	private String marital_Status_Desc;

	@Column(name="Match_Cd_Addr")
	private String match_Cd_Addr;

	@Column(name="Match_Cd_Addr_Line")
	private String match_Cd_Addr_Line;

	@Column(name="Match_Cd_City")
	private String match_Cd_City;

	@Column(name="Match_Cd_Cntry")
	private String match_Cd_Cntry;

	@Column(name="Match_Cd_Indv")
	private String match_Cd_Indv;

	@Column(name="Match_Cd_Mail_Addr")
	private String match_Cd_Mail_Addr;

	@Column(name="Match_Cd_Mail_City")
	private String match_Cd_Mail_City;

	@Column(name="Match_Cd_Mail_Cntry")
	private String match_Cd_Mail_Cntry;

	@Column(name="Match_Cd_Mail_State")
	private String match_Cd_Mail_State;

	@Column(name="Match_Cd_Org")
	private String match_Cd_Org;

	@Column(name="Match_Cd_State")
	private String match_Cd_State;

	@Column(name="Maturity_Date")
	private Timestamp maturity_Date;

	@Column(name="Money_Order_Ind")
	private String money_Order_Ind;

	@Column(name="Money_Service_Bus_Ind")
	private String money_Service_Bus_Ind;

	@Column(name="Money_Transmtr_Ind")
	private String money_Transmtr_Ind;

	@Column(name="Negtv_News_Ind")
	private String negtv_News_Ind;

	@Column(name="Net_Worth_Amt")
	private BigDecimal net_Worth_Amt;

	@Column(name="Non_Profit_Org_Ind")
	private String non_Profit_Org_Ind;

	@Column(name="Occup_Desc")
	private String occup_Desc;

	@Column(name="Org_Cntry_of_Bus_Cd")
	private String org_Cntry_of_Bus_Cd;

	@Column(name="Org_Cntry_of_Bus_Name")
	private String org_Cntry_of_Bus_Name;

	@Column(name="Orig_Loan_Amt")
	private BigDecimal orig_Loan_Amt;

	@Column(name="Parent_Name")
	private String parent_Name;

	@Column(name="Political_Exp_Prsn_Ind")
	private String political_Exp_Prsn_Ind;

	@Column(name="Post_Cd")
	private String post_Cd;

	@Column(name="Post_Date_Key")
	private int post_Date_Key;

	@Column(name="Prep_Card_Ind")
	private String prep_Card_Ind;

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

	@Column(name="Relate_Ind")
	private String relate_Ind;

	@Column(name="Remit_Ext_Cust_Key")
	private int remit_Ext_Cust_Key;

	@Column(name="Resid_Cntry_Cd")
	private String resid_Cntry_Cd;

	@Column(name="Resid_Cntry_Name")
	private String resid_Cntry_Name;

	@Column(name="Risk_Class")
	private BigDecimal risk_Class;

	@Column(name="Role_Desc")
	private String role_Desc;

	@Column(name="Role_Key")
	private int role_Key;

	@Column(name="Sec_Acct_Key")
	private int sec_Acct_Key;

	@Column(name="State_Cd")
	private String state_Cd;

	@Column(name="State_Name")
	private String state_Name;

	@Column(name="Susp_Act_RPT_Count")
	private BigDecimal susp_Act_RPT_Count;

	@Column(name="Tel_No_1")
	private String tel_No_1;

	@Column(name="Tel_No_2")
	private String tel_No_2;

	@Column(name="Tel_No_3")
	private String tel_No_3;

	@Column(name="Third_Cust_Ind")
	private String third_Cust_Ind;

	@Column(name="Time_Key")
	private int time_Key;

	@Column(name="Trade_Fin_Ind")
	private String trade_Fin_Ind;

	@Column(name="Trans_Ccy_Key")
	private int trans_Ccy_Key;

	@Column(name="Trans_Key")
	private int trans_Key;

	@Column(name="Trans_Status_Key")
	private int trans_Status_Key;

	@Column(name="Trans_Type_Key")
	private int trans_Type_Key;

	@Column(name="Trav_Chek_Ind")
	private String trav_Chek_Ind;

	@Column(name="Trust_Acct_Ind")
	private String trust_Acct_Ind;

	public DGAML017_Multiple_Branch_Usage() {
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

	public String getAddr_1() {
		return this.addr_1;
	}

	public void setAddr_1(String addr_1) {
		this.addr_1 = addr_1;
	}

	public String getAddr_2() {
		return this.addr_2;
	}

	public void setAddr_2(String addr_2) {
		this.addr_2 = addr_2;
	}

	public String getAlt_Name() {
		return this.alt_Name;
	}

	public void setAlt_Name(String alt_Name) {
		this.alt_Name = alt_Name;
	}

	public BigDecimal getAnnual_Income_Amt() {
		return this.annual_Income_Amt;
	}

	public void setAnnual_Income_Amt(BigDecimal annual_Income_Amt) {
		this.annual_Income_Amt = annual_Income_Amt;
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

	public String getBranch_Type_Desc() {
		return this.branch_Type_Desc;
	}

	public void setBranch_Type_Desc(String branch_Type_Desc) {
		this.branch_Type_Desc = branch_Type_Desc;
	}

	public String getCash_Ints_Bus_Ind() {
		return this.cash_Ints_Bus_Ind;
	}

	public void setCash_Ints_Bus_Ind(String cash_Ints_Bus_Ind) {
		this.cash_Ints_Bus_Ind = cash_Ints_Bus_Ind;
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

	public String getCcy_Based_Acct_Ind() {
		return this.ccy_Based_Acct_Ind;
	}

	public void setCcy_Based_Acct_Ind(String ccy_Based_Acct_Ind) {
		this.ccy_Based_Acct_Ind = ccy_Based_Acct_Ind;
	}

	public String getCcy_Exch_Ind() {
		return this.ccy_Exch_Ind;
	}

	public void setCcy_Exch_Ind(String ccy_Exch_Ind) {
		this.ccy_Exch_Ind = ccy_Exch_Ind;
	}

	public String getCheck_Casher_Ind() {
		return this.check_Casher_Ind;
	}

	public void setCheck_Casher_Ind(String check_Casher_Ind) {
		this.check_Casher_Ind = check_Casher_Ind;
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

	public String getCitizen_Cntry_Cd() {
		return this.citizen_Cntry_Cd;
	}

	public void setCitizen_Cntry_Cd(String citizen_Cntry_Cd) {
		this.citizen_Cntry_Cd = citizen_Cntry_Cd;
	}

	public String getCitizen_Cntry_Name() {
		return this.citizen_Cntry_Name;
	}

	public void setCitizen_Cntry_Name(String citizen_Cntry_Name) {
		this.citizen_Cntry_Name = citizen_Cntry_Name;
	}

	public String getCity_Name() {
		return this.city_Name;
	}

	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}

	public String getCntry_Cd() {
		return this.cntry_Cd;
	}

	public void setCntry_Cd(String cntry_Cd) {
		this.cntry_Cd = cntry_Cd;
	}

	public int getCntry_Key() {
		return this.cntry_Key;
	}

	public void setCntry_Key(int cntry_Key) {
		this.cntry_Key = cntry_Key;
	}

	public String getCntry_name() {
		return this.cntry_name;
	}

	public void setCntry_name(String cntry_name) {
		this.cntry_name = cntry_name;
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

	public Timestamp getCust_Birth_Date() {
		return this.cust_Birth_Date;
	}

	public void setCust_Birth_Date(Timestamp cust_Birth_Date) {
		this.cust_Birth_Date = cust_Birth_Date;
	}

	public String getCust_FName() {
		return this.cust_FName;
	}

	public void setCust_FName(String cust_FName) {
		this.cust_FName = cust_FName;
	}

	public String getCust_Gen() {
		return this.cust_Gen;
	}

	public void setCust_Gen(String cust_Gen) {
		this.cust_Gen = cust_Gen;
	}

	public String getCust_Id_Cntry_Cd() {
		return this.cust_Id_Cntry_Cd;
	}

	public void setCust_Id_Cntry_Cd(String cust_Id_Cntry_Cd) {
		this.cust_Id_Cntry_Cd = cust_Id_Cntry_Cd;
	}

	public String getCust_Id_State_Cd() {
		return this.cust_Id_State_Cd;
	}

	public void setCust_Id_State_Cd(String cust_Id_State_Cd) {
		this.cust_Id_State_Cd = cust_Id_State_Cd;
	}

	public Timestamp getCust_Ident_Exp_Date() {
		return this.cust_Ident_Exp_Date;
	}

	public void setCust_Ident_Exp_Date(Timestamp cust_Ident_Exp_Date) {
		this.cust_Ident_Exp_Date = cust_Ident_Exp_Date;
	}

	public String getCust_Ident_Id() {
		return this.cust_Ident_Id;
	}

	public void setCust_Ident_Id(String cust_Ident_Id) {
		this.cust_Ident_Id = cust_Ident_Id;
	}

	public Timestamp getCust_Ident_Iss_Date() {
		return this.cust_Ident_Iss_Date;
	}

	public void setCust_Ident_Iss_Date(Timestamp cust_Ident_Iss_Date) {
		this.cust_Ident_Iss_Date = cust_Ident_Iss_Date;
	}

	public String getCust_Ident_Type_Desc() {
		return this.cust_Ident_Type_Desc;
	}

	public void setCust_Ident_Type_Desc(String cust_Ident_Type_Desc) {
		this.cust_Ident_Type_Desc = cust_Ident_Type_Desc;
	}

	public int getCust_Key() {
		return this.cust_Key;
	}

	public void setCust_Key(int cust_Key) {
		this.cust_Key = cust_Key;
	}

	public String getCust_LName() {
		return this.cust_LName;
	}

	public void setCust_LName(String cust_LName) {
		this.cust_LName = cust_LName;
	}

	public String getCust_MName() {
		return this.cust_MName;
	}

	public void setCust_MName(String cust_MName) {
		this.cust_MName = cust_MName;
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

	public Timestamp getCust_Since_Date() {
		return this.cust_Since_Date;
	}

	public void setCust_Since_Date(Timestamp cust_Since_Date) {
		this.cust_Since_Date = cust_Since_Date;
	}

	public String getCust_Status_Desc() {
		return this.cust_Status_Desc;
	}

	public void setCust_Status_Desc(String cust_Status_Desc) {
		this.cust_Status_Desc = cust_Status_Desc;
	}

	public String getCust_Tax_Id() {
		return this.cust_Tax_Id;
	}

	public void setCust_Tax_Id(String cust_Tax_Id) {
		this.cust_Tax_Id = cust_Tax_Id;
	}

	public String getCust_Tax_Id_Type_Cd() {
		return this.cust_Tax_Id_Type_Cd;
	}

	public void setCust_Tax_Id_Type_Cd(String cust_Tax_Id_Type_Cd) {
		this.cust_Tax_Id_Type_Cd = cust_Tax_Id_Type_Cd;
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

	public String getDelta_Ccy_Amt() {
		return this.delta_Ccy_Amt;
	}

	public void setDelta_Ccy_Amt(String delta_Ccy_Amt) {
		this.delta_Ccy_Amt = delta_Ccy_Amt;
	}

	public String getDo_Bus_As_Name() {
		return this.do_Bus_As_Name;
	}

	public void setDo_Bus_As_Name(String do_Bus_As_Name) {
		this.do_Bus_As_Name = do_Bus_As_Name;
	}

	public String getDorm_Ind() {
		return this.dorm_Ind;
	}

	public void setDorm_Ind(String dorm_Ind) {
		this.dorm_Ind = dorm_Ind;
	}

	public String getEmail_Addr() {
		return this.email_Addr;
	}

	public void setEmail_Addr(String email_Addr) {
		this.email_Addr = email_Addr;
	}

	public String getEmp_Ind() {
		return this.emp_Ind;
	}

	public void setEmp_Ind(String emp_Ind) {
		this.emp_Ind = emp_Ind;
	}

	public int getEmp_Key() {
		return this.emp_Key;
	}

	public void setEmp_Key(int emp_Key) {
		this.emp_Key = emp_Key;
	}

	public String getEmp_No() {
		return this.emp_No;
	}

	public void setEmp_No(String emp_No) {
		this.emp_No = emp_No;
	}

	public String getEmpr_Name() {
		return this.empr_Name;
	}

	public void setEmpr_Name(String empr_Name) {
		this.empr_Name = empr_Name;
	}

	public String getEmpr_Tel_No() {
		return this.empr_Tel_No;
	}

	public void setEmpr_Tel_No(String empr_Tel_No) {
		this.empr_Tel_No = empr_Tel_No;
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

	public int getExpr1() {
		return this.expr1;
	}

	public void setExpr1(int expr1) {
		this.expr1 = expr1;
	}

	public String getExpr10() {
		return this.expr10;
	}

	public void setExpr10(String expr10) {
		this.expr10 = expr10;
	}

	public String getExpr11() {
		return this.expr11;
	}

	public void setExpr11(String expr11) {
		this.expr11 = expr11;
	}

	public String getExpr12() {
		return this.expr12;
	}

	public void setExpr12(String expr12) {
		this.expr12 = expr12;
	}

	public String getExpr13() {
		return this.expr13;
	}

	public void setExpr13(String expr13) {
		this.expr13 = expr13;
	}

	public String getExpr14() {
		return this.expr14;
	}

	public void setExpr14(String expr14) {
		this.expr14 = expr14;
	}

	public String getExpr15() {
		return this.expr15;
	}

	public void setExpr15(String expr15) {
		this.expr15 = expr15;
	}

	public String getExpr16() {
		return this.expr16;
	}

	public void setExpr16(String expr16) {
		this.expr16 = expr16;
	}

	public Timestamp getExpr17() {
		return this.expr17;
	}

	public void setExpr17(Timestamp expr17) {
		this.expr17 = expr17;
	}

	public Timestamp getExpr18() {
		return this.expr18;
	}

	public void setExpr18(Timestamp expr18) {
		this.expr18 = expr18;
	}

	public String getExpr19() {
		return this.expr19;
	}

	public void setExpr19(String expr19) {
		this.expr19 = expr19;
	}

	public String getExpr2() {
		return this.expr2;
	}

	public void setExpr2(String expr2) {
		this.expr2 = expr2;
	}

	public int getExpr20() {
		return this.expr20;
	}

	public void setExpr20(int expr20) {
		this.expr20 = expr20;
	}

	public int getExpr21() {
		return this.expr21;
	}

	public void setExpr21(int expr21) {
		this.expr21 = expr21;
	}

	public String getExpr22() {
		return this.expr22;
	}

	public void setExpr22(String expr22) {
		this.expr22 = expr22;
	}

	public String getExpr23() {
		return this.expr23;
	}

	public void setExpr23(String expr23) {
		this.expr23 = expr23;
	}

	public String getExpr24() {
		return this.expr24;
	}

	public void setExpr24(String expr24) {
		this.expr24 = expr24;
	}

	public String getExpr25() {
		return this.expr25;
	}

	public void setExpr25(String expr25) {
		this.expr25 = expr25;
	}

	public String getExpr26() {
		return this.expr26;
	}

	public void setExpr26(String expr26) {
		this.expr26 = expr26;
	}

	public String getExpr27() {
		return this.expr27;
	}

	public void setExpr27(String expr27) {
		this.expr27 = expr27;
	}

	public String getExpr28() {
		return this.expr28;
	}

	public void setExpr28(String expr28) {
		this.expr28 = expr28;
	}

	public String getExpr29() {
		return this.expr29;
	}

	public void setExpr29(String expr29) {
		this.expr29 = expr29;
	}

	public Timestamp getExpr3() {
		return this.expr3;
	}

	public void setExpr3(Timestamp expr3) {
		this.expr3 = expr3;
	}

	public Timestamp getExpr4() {
		return this.expr4;
	}

	public void setExpr4(Timestamp expr4) {
		this.expr4 = expr4;
	}

	public String getExpr5() {
		return this.expr5;
	}

	public void setExpr5(String expr5) {
		this.expr5 = expr5;
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

	public String getExpr8() {
		return this.expr8;
	}

	public void setExpr8(String expr8) {
		this.expr8 = expr8;
	}

	public String getExpr9() {
		return this.expr9;
	}

	public void setExpr9(String expr9) {
		this.expr9 = expr9;
	}

	public String getExt_Cust_Ind() {
		return this.ext_Cust_Ind;
	}

	public void setExt_Cust_Ind(String ext_Cust_Ind) {
		this.ext_Cust_Ind = ext_Cust_Ind;
	}

	public String getFrgn_Consulate() {
		return this.frgn_Consulate;
	}

	public void setFrgn_Consulate(String frgn_Consulate) {
		this.frgn_Consulate = frgn_Consulate;
	}

	public String getInds_Cd() {
		return this.inds_Cd;
	}

	public void setInds_Cd(String inds_Cd) {
		this.inds_Cd = inds_Cd;
	}

	public String getInds_Cd_RR() {
		return this.inds_Cd_RR;
	}

	public void setInds_Cd_RR(String inds_Cd_RR) {
		this.inds_Cd_RR = inds_Cd_RR;
	}

	public String getInds_Desc() {
		return this.inds_Desc;
	}

	public void setInds_Desc(String inds_Desc) {
		this.inds_Desc = inds_Desc;
	}

	public BigDecimal getInsur_Amt() {
		return this.insur_Amt;
	}

	public void setInsur_Amt(BigDecimal insur_Amt) {
		this.insur_Amt = insur_Amt;
	}

	public String getInternet_Gmblng_Ind() {
		return this.internet_Gmblng_Ind;
	}

	public void setInternet_Gmblng_Ind(String internet_Gmblng_Ind) {
		this.internet_Gmblng_Ind = internet_Gmblng_Ind;
	}

	public String getIss_Bears_Shares_Ind() {
		return this.iss_Bears_Shares_Ind;
	}

	public void setIss_Bears_Shares_Ind(String iss_Bears_Shares_Ind) {
		this.iss_Bears_Shares_Ind = iss_Bears_Shares_Ind;
	}

	public Timestamp getLast_Cash_Trans_Report_Date() {
		return this.last_Cash_Trans_Report_Date;
	}

	public void setLast_Cash_Trans_Report_Date(Timestamp last_Cash_Trans_Report_Date) {
		this.last_Cash_Trans_Report_Date = last_Cash_Trans_Report_Date;
	}

	public Timestamp getLast_Contact_Date() {
		return this.last_Contact_Date;
	}

	public void setLast_Contact_Date(Timestamp last_Contact_Date) {
		this.last_Contact_Date = last_Contact_Date;
	}

	public Timestamp getLast_Risk_Assmnt_Date() {
		return this.last_Risk_Assmnt_Date;
	}

	public void setLast_Risk_Assmnt_Date(Timestamp last_Risk_Assmnt_Date) {
		this.last_Risk_Assmnt_Date = last_Risk_Assmnt_Date;
	}

	public Timestamp getLast_Susp_Act_Report_Date() {
		return this.last_Susp_Act_Report_Date;
	}

	public void setLast_Susp_Act_Report_Date(Timestamp last_Susp_Act_Report_Date) {
		this.last_Susp_Act_Report_Date = last_Susp_Act_Report_Date;
	}

	public Timestamp getLast_Update_Date() {
		return this.last_Update_Date;
	}

	public void setLast_Update_Date(Timestamp last_Update_Date) {
		this.last_Update_Date = last_Update_Date;
	}

	public String getLegal_Obj_Type() {
		return this.legal_Obj_Type;
	}

	public void setLegal_Obj_Type(String legal_Obj_Type) {
		this.legal_Obj_Type = legal_Obj_Type;
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

	public String getMach_Cd_Mail_Addr_Line() {
		return this.mach_Cd_Mail_Addr_Line;
	}

	public void setMach_Cd_Mail_Addr_Line(String mach_Cd_Mail_Addr_Line) {
		this.mach_Cd_Mail_Addr_Line = mach_Cd_Mail_Addr_Line;
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

	public String getMarital_Status_Desc() {
		return this.marital_Status_Desc;
	}

	public void setMarital_Status_Desc(String marital_Status_Desc) {
		this.marital_Status_Desc = marital_Status_Desc;
	}

	public String getMatch_Cd_Addr() {
		return this.match_Cd_Addr;
	}

	public void setMatch_Cd_Addr(String match_Cd_Addr) {
		this.match_Cd_Addr = match_Cd_Addr;
	}

	public String getMatch_Cd_Addr_Line() {
		return this.match_Cd_Addr_Line;
	}

	public void setMatch_Cd_Addr_Line(String match_Cd_Addr_Line) {
		this.match_Cd_Addr_Line = match_Cd_Addr_Line;
	}

	public String getMatch_Cd_City() {
		return this.match_Cd_City;
	}

	public void setMatch_Cd_City(String match_Cd_City) {
		this.match_Cd_City = match_Cd_City;
	}

	public String getMatch_Cd_Cntry() {
		return this.match_Cd_Cntry;
	}

	public void setMatch_Cd_Cntry(String match_Cd_Cntry) {
		this.match_Cd_Cntry = match_Cd_Cntry;
	}

	public String getMatch_Cd_Indv() {
		return this.match_Cd_Indv;
	}

	public void setMatch_Cd_Indv(String match_Cd_Indv) {
		this.match_Cd_Indv = match_Cd_Indv;
	}

	public String getMatch_Cd_Mail_Addr() {
		return this.match_Cd_Mail_Addr;
	}

	public void setMatch_Cd_Mail_Addr(String match_Cd_Mail_Addr) {
		this.match_Cd_Mail_Addr = match_Cd_Mail_Addr;
	}

	public String getMatch_Cd_Mail_City() {
		return this.match_Cd_Mail_City;
	}

	public void setMatch_Cd_Mail_City(String match_Cd_Mail_City) {
		this.match_Cd_Mail_City = match_Cd_Mail_City;
	}

	public String getMatch_Cd_Mail_Cntry() {
		return this.match_Cd_Mail_Cntry;
	}

	public void setMatch_Cd_Mail_Cntry(String match_Cd_Mail_Cntry) {
		this.match_Cd_Mail_Cntry = match_Cd_Mail_Cntry;
	}

	public String getMatch_Cd_Mail_State() {
		return this.match_Cd_Mail_State;
	}

	public void setMatch_Cd_Mail_State(String match_Cd_Mail_State) {
		this.match_Cd_Mail_State = match_Cd_Mail_State;
	}

	public String getMatch_Cd_Org() {
		return this.match_Cd_Org;
	}

	public void setMatch_Cd_Org(String match_Cd_Org) {
		this.match_Cd_Org = match_Cd_Org;
	}

	public String getMatch_Cd_State() {
		return this.match_Cd_State;
	}

	public void setMatch_Cd_State(String match_Cd_State) {
		this.match_Cd_State = match_Cd_State;
	}

	public Timestamp getMaturity_Date() {
		return this.maturity_Date;
	}

	public void setMaturity_Date(Timestamp maturity_Date) {
		this.maturity_Date = maturity_Date;
	}

	public String getMoney_Order_Ind() {
		return this.money_Order_Ind;
	}

	public void setMoney_Order_Ind(String money_Order_Ind) {
		this.money_Order_Ind = money_Order_Ind;
	}

	public String getMoney_Service_Bus_Ind() {
		return this.money_Service_Bus_Ind;
	}

	public void setMoney_Service_Bus_Ind(String money_Service_Bus_Ind) {
		this.money_Service_Bus_Ind = money_Service_Bus_Ind;
	}

	public String getMoney_Transmtr_Ind() {
		return this.money_Transmtr_Ind;
	}

	public void setMoney_Transmtr_Ind(String money_Transmtr_Ind) {
		this.money_Transmtr_Ind = money_Transmtr_Ind;
	}

	public String getNegtv_News_Ind() {
		return this.negtv_News_Ind;
	}

	public void setNegtv_News_Ind(String negtv_News_Ind) {
		this.negtv_News_Ind = negtv_News_Ind;
	}

	public BigDecimal getNet_Worth_Amt() {
		return this.net_Worth_Amt;
	}

	public void setNet_Worth_Amt(BigDecimal net_Worth_Amt) {
		this.net_Worth_Amt = net_Worth_Amt;
	}

	public String getNon_Profit_Org_Ind() {
		return this.non_Profit_Org_Ind;
	}

	public void setNon_Profit_Org_Ind(String non_Profit_Org_Ind) {
		this.non_Profit_Org_Ind = non_Profit_Org_Ind;
	}

	public String getOccup_Desc() {
		return this.occup_Desc;
	}

	public void setOccup_Desc(String occup_Desc) {
		this.occup_Desc = occup_Desc;
	}

	public String getOrg_Cntry_of_Bus_Cd() {
		return this.org_Cntry_of_Bus_Cd;
	}

	public void setOrg_Cntry_of_Bus_Cd(String org_Cntry_of_Bus_Cd) {
		this.org_Cntry_of_Bus_Cd = org_Cntry_of_Bus_Cd;
	}

	public String getOrg_Cntry_of_Bus_Name() {
		return this.org_Cntry_of_Bus_Name;
	}

	public void setOrg_Cntry_of_Bus_Name(String org_Cntry_of_Bus_Name) {
		this.org_Cntry_of_Bus_Name = org_Cntry_of_Bus_Name;
	}

	public BigDecimal getOrig_Loan_Amt() {
		return this.orig_Loan_Amt;
	}

	public void setOrig_Loan_Amt(BigDecimal orig_Loan_Amt) {
		this.orig_Loan_Amt = orig_Loan_Amt;
	}

	public String getParent_Name() {
		return this.parent_Name;
	}

	public void setParent_Name(String parent_Name) {
		this.parent_Name = parent_Name;
	}

	public String getPolitical_Exp_Prsn_Ind() {
		return this.political_Exp_Prsn_Ind;
	}

	public void setPolitical_Exp_Prsn_Ind(String political_Exp_Prsn_Ind) {
		this.political_Exp_Prsn_Ind = political_Exp_Prsn_Ind;
	}

	public String getPost_Cd() {
		return this.post_Cd;
	}

	public void setPost_Cd(String post_Cd) {
		this.post_Cd = post_Cd;
	}

	public int getPost_Date_Key() {
		return this.post_Date_Key;
	}

	public void setPost_Date_Key(int post_Date_Key) {
		this.post_Date_Key = post_Date_Key;
	}

	public String getPrep_Card_Ind() {
		return this.prep_Card_Ind;
	}

	public void setPrep_Card_Ind(String prep_Card_Ind) {
		this.prep_Card_Ind = prep_Card_Ind;
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

	public String getResid_Cntry_Cd() {
		return this.resid_Cntry_Cd;
	}

	public void setResid_Cntry_Cd(String resid_Cntry_Cd) {
		this.resid_Cntry_Cd = resid_Cntry_Cd;
	}

	public String getResid_Cntry_Name() {
		return this.resid_Cntry_Name;
	}

	public void setResid_Cntry_Name(String resid_Cntry_Name) {
		this.resid_Cntry_Name = resid_Cntry_Name;
	}

	public BigDecimal getRisk_Class() {
		return this.risk_Class;
	}

	public void setRisk_Class(BigDecimal risk_Class) {
		this.risk_Class = risk_Class;
	}

	public String getRole_Desc() {
		return this.role_Desc;
	}

	public void setRole_Desc(String role_Desc) {
		this.role_Desc = role_Desc;
	}

	public int getRole_Key() {
		return this.role_Key;
	}

	public void setRole_Key(int role_Key) {
		this.role_Key = role_Key;
	}

	public int getSec_Acct_Key() {
		return this.sec_Acct_Key;
	}

	public void setSec_Acct_Key(int sec_Acct_Key) {
		this.sec_Acct_Key = sec_Acct_Key;
	}

	public String getState_Cd() {
		return this.state_Cd;
	}

	public void setState_Cd(String state_Cd) {
		this.state_Cd = state_Cd;
	}

	public String getState_Name() {
		return this.state_Name;
	}

	public void setState_Name(String state_Name) {
		this.state_Name = state_Name;
	}

	public BigDecimal getSusp_Act_RPT_Count() {
		return this.susp_Act_RPT_Count;
	}

	public void setSusp_Act_RPT_Count(BigDecimal susp_Act_RPT_Count) {
		this.susp_Act_RPT_Count = susp_Act_RPT_Count;
	}

	public String getTel_No_1() {
		return this.tel_No_1;
	}

	public void setTel_No_1(String tel_No_1) {
		this.tel_No_1 = tel_No_1;
	}

	public String getTel_No_2() {
		return this.tel_No_2;
	}

	public void setTel_No_2(String tel_No_2) {
		this.tel_No_2 = tel_No_2;
	}

	public String getTel_No_3() {
		return this.tel_No_3;
	}

	public void setTel_No_3(String tel_No_3) {
		this.tel_No_3 = tel_No_3;
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

	public String getTrade_Fin_Ind() {
		return this.trade_Fin_Ind;
	}

	public void setTrade_Fin_Ind(String trade_Fin_Ind) {
		this.trade_Fin_Ind = trade_Fin_Ind;
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

	public String getTrav_Chek_Ind() {
		return this.trav_Chek_Ind;
	}

	public void setTrav_Chek_Ind(String trav_Chek_Ind) {
		this.trav_Chek_Ind = trav_Chek_Ind;
	}

	public String getTrust_Acct_Ind() {
		return this.trust_Acct_Ind;
	}

	public void setTrust_Acct_Ind(String trust_Acct_Ind) {
		this.trust_Acct_Ind = trust_Acct_Ind;
	}

}