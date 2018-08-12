package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the DGAML018_Frequent_Change_Customer_Data database table.
 * 
 */
@Embeddable
@NamedQuery(name="DGAML018_Frequent_Change_Customer_Data.findAll", query="SELECT d FROM DGAML018_Frequent_Change_Customer_Data d")
public class DGAML018_Frequent_Change_Customer_Data implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Annual_Income_Amt")
	private BigDecimal annual_Income_Amt;

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

	@Column(name="Curr_Exch_Ind")
	private String curr_Exch_Ind;

	@Column(name="Cust_Brth_Date")
	private Timestamp cust_Brth_Date;

	@Column(name="Cust_Fname")
	private String cust_Fname;

	@Column(name="Cust_Gen")
	private String cust_Gen;

	@Column(name="Cust_Id_Cntry_Code")
	private String cust_Id_Cntry_Code;

	@Column(name="Cust_Id_State_Code")
	private String cust_Id_State_Code;

	@Column(name="Cust_Ident_Exp_Date")
	private Timestamp cust_Ident_Exp_Date;

	@Column(name="Cust_Ident_Id")
	private String cust_Ident_Id;

	@Column(name="Cust_Ident_Iss_Date")
	private Timestamp cust_Ident_Iss_Date;

	@Column(name="Cust_Ident_type_Desc")
	private String cust_Ident_type_Desc;

	@Column(name="Cust_Key")
	private int cust_Key;

	@Column(name="Cust_Lname")
	private String cust_Lname;

	@Column(name="Cust_Mname")
	private String cust_Mname;

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

	@Column(name="Do_Bus_As_Name")
	private String do_Bus_As_Name;

	@Column(name="E_Addr")
	private String e_Addr;

	@Column(name="Emp_Ind")
	private String emp_Ind;

	@Column(name="Emp_No")
	private String emp_No;

	@Column(name="Empr_Name")
	private String empr_Name;

	@Column(name="Empr_Tel_No")
	private String empr_Tel_No;

	@Column(name="Ext_Cust_Ind")
	private String ext_Cust_Ind;

	@Column(name="Frgn_consulate")
	private String frgn_consulate;

	@Column(name="Inds_Cd")
	private String inds_Cd;

	@Column(name="Inds_Cd_RR")
	private String inds_Cd_RR;

	@Column(name="Inds_Desc")
	private String inds_Desc;

	@Column(name="Internet_Gmblng_Ind")
	private String internet_Gmblng_Ind;

	@Column(name="Iss_Bears_Shares_Ind")
	private String iss_Bears_Shares_Ind;

	@Column(name="Last_Contact_Date")
	private Timestamp last_Contact_Date;

	@Column(name="Legal_Obj_Type")
	private String legal_Obj_Type;

	@Column(name="Lst_Cash_Trans_Report_Date")
	private Timestamp lst_Cash_Trans_Report_Date;

	@Column(name="Lst_Risk_Assmnt_Date")
	private Timestamp lst_Risk_Assmnt_Date;

	@Column(name="Lst_Susp_Act_Report_Date")
	private Timestamp lst_Susp_Act_Report_Date;

	@Column(name="Lst_update_Date")
	private Timestamp lst_update_Date;

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

	@Column(name="Marital_status_Desc")
	private String marital_status_Desc;

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

	@Column(name="Match_Cd_St_Addr")
	private String match_Cd_St_Addr;

	@Column(name="Match_Cd_St_Addr_Line")
	private String match_Cd_St_Addr_Line;

	@Column(name="Match_Cd_St_City")
	private String match_Cd_St_City;

	@Column(name="Match_Cd_St_Cntry")
	private String match_Cd_St_Cntry;

	@Column(name="Match_Cd_St_State")
	private String match_Cd_St_State;

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

	@Column(name="Parent_Name")
	private String parent_Name;

	@Column(name="Political_Exp_Prsn_Ind")
	private String political_Exp_Prsn_Ind;

	@Column(name="Prep_Card_Ind")
	private String prep_Card_Ind;

	@Column(name="Resid_Cntry_Cd")
	private String resid_Cntry_Cd;

	@Column(name="Resid_Cntry_Name")
	private String resid_Cntry_Name;

	@Column(name="Risk_Class")
	private BigDecimal risk_Class;

	@Column(name="St_Addr_1")
	private String st_Addr_1;

	@Column(name="St_Addr_2")
	private String st_Addr_2;

	@Column(name="St_City_Name")
	private String st_City_Name;

	@Column(name="St_Cntry_Cd")
	private String st_Cntry_Cd;

	@Column(name="St_Cntry_name")
	private String st_Cntry_name;

	@Column(name="St_Post_Cd")
	private String st_Post_Cd;

	@Column(name="St_State_Cd")
	private String st_State_Cd;

	@Column(name="St_State_Name")
	private String st_State_Name;

	@Column(name="Susp_Act_RPT_Count")
	private BigDecimal susp_Act_RPT_Count;

	@Column(name="Tel_No_1")
	private String tel_No_1;

	@Column(name="Tel_No_2")
	private String tel_No_2;

	@Column(name="Tel_No_3")
	private String tel_No_3;

	@Column(name="Trav_Chek_Ind")
	private String trav_Chek_Ind;

	@Column(name="Trust_Acct_Ind")
	private String trust_Acct_Ind;

	public DGAML018_Frequent_Change_Customer_Data() {
	}

	public BigDecimal getAnnual_Income_Amt() {
		return this.annual_Income_Amt;
	}

	public void setAnnual_Income_Amt(BigDecimal annual_Income_Amt) {
		this.annual_Income_Amt = annual_Income_Amt;
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

	public String getCurr_Exch_Ind() {
		return this.curr_Exch_Ind;
	}

	public void setCurr_Exch_Ind(String curr_Exch_Ind) {
		this.curr_Exch_Ind = curr_Exch_Ind;
	}

	public Timestamp getCust_Brth_Date() {
		return this.cust_Brth_Date;
	}

	public void setCust_Brth_Date(Timestamp cust_Brth_Date) {
		this.cust_Brth_Date = cust_Brth_Date;
	}

	public String getCust_Fname() {
		return this.cust_Fname;
	}

	public void setCust_Fname(String cust_Fname) {
		this.cust_Fname = cust_Fname;
	}

	public String getCust_Gen() {
		return this.cust_Gen;
	}

	public void setCust_Gen(String cust_Gen) {
		this.cust_Gen = cust_Gen;
	}

	public String getCust_Id_Cntry_Code() {
		return this.cust_Id_Cntry_Code;
	}

	public void setCust_Id_Cntry_Code(String cust_Id_Cntry_Code) {
		this.cust_Id_Cntry_Code = cust_Id_Cntry_Code;
	}

	public String getCust_Id_State_Code() {
		return this.cust_Id_State_Code;
	}

	public void setCust_Id_State_Code(String cust_Id_State_Code) {
		this.cust_Id_State_Code = cust_Id_State_Code;
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

	public String getCust_Ident_type_Desc() {
		return this.cust_Ident_type_Desc;
	}

	public void setCust_Ident_type_Desc(String cust_Ident_type_Desc) {
		this.cust_Ident_type_Desc = cust_Ident_type_Desc;
	}

	public int getCust_Key() {
		return this.cust_Key;
	}

	public void setCust_Key(int cust_Key) {
		this.cust_Key = cust_Key;
	}

	public String getCust_Lname() {
		return this.cust_Lname;
	}

	public void setCust_Lname(String cust_Lname) {
		this.cust_Lname = cust_Lname;
	}

	public String getCust_Mname() {
		return this.cust_Mname;
	}

	public void setCust_Mname(String cust_Mname) {
		this.cust_Mname = cust_Mname;
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

	public String getDo_Bus_As_Name() {
		return this.do_Bus_As_Name;
	}

	public void setDo_Bus_As_Name(String do_Bus_As_Name) {
		this.do_Bus_As_Name = do_Bus_As_Name;
	}

	public String getE_Addr() {
		return this.e_Addr;
	}

	public void setE_Addr(String e_Addr) {
		this.e_Addr = e_Addr;
	}

	public String getEmp_Ind() {
		return this.emp_Ind;
	}

	public void setEmp_Ind(String emp_Ind) {
		this.emp_Ind = emp_Ind;
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

	public String getExt_Cust_Ind() {
		return this.ext_Cust_Ind;
	}

	public void setExt_Cust_Ind(String ext_Cust_Ind) {
		this.ext_Cust_Ind = ext_Cust_Ind;
	}

	public String getFrgn_consulate() {
		return this.frgn_consulate;
	}

	public void setFrgn_consulate(String frgn_consulate) {
		this.frgn_consulate = frgn_consulate;
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

	public Timestamp getLast_Contact_Date() {
		return this.last_Contact_Date;
	}

	public void setLast_Contact_Date(Timestamp last_Contact_Date) {
		this.last_Contact_Date = last_Contact_Date;
	}

	public String getLegal_Obj_Type() {
		return this.legal_Obj_Type;
	}

	public void setLegal_Obj_Type(String legal_Obj_Type) {
		this.legal_Obj_Type = legal_Obj_Type;
	}

	public Timestamp getLst_Cash_Trans_Report_Date() {
		return this.lst_Cash_Trans_Report_Date;
	}

	public void setLst_Cash_Trans_Report_Date(Timestamp lst_Cash_Trans_Report_Date) {
		this.lst_Cash_Trans_Report_Date = lst_Cash_Trans_Report_Date;
	}

	public Timestamp getLst_Risk_Assmnt_Date() {
		return this.lst_Risk_Assmnt_Date;
	}

	public void setLst_Risk_Assmnt_Date(Timestamp lst_Risk_Assmnt_Date) {
		this.lst_Risk_Assmnt_Date = lst_Risk_Assmnt_Date;
	}

	public Timestamp getLst_Susp_Act_Report_Date() {
		return this.lst_Susp_Act_Report_Date;
	}

	public void setLst_Susp_Act_Report_Date(Timestamp lst_Susp_Act_Report_Date) {
		this.lst_Susp_Act_Report_Date = lst_Susp_Act_Report_Date;
	}

	public Timestamp getLst_update_Date() {
		return this.lst_update_Date;
	}

	public void setLst_update_Date(Timestamp lst_update_Date) {
		this.lst_update_Date = lst_update_Date;
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

	public String getMarital_status_Desc() {
		return this.marital_status_Desc;
	}

	public void setMarital_status_Desc(String marital_status_Desc) {
		this.marital_status_Desc = marital_status_Desc;
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

	public String getMatch_Cd_St_Addr() {
		return this.match_Cd_St_Addr;
	}

	public void setMatch_Cd_St_Addr(String match_Cd_St_Addr) {
		this.match_Cd_St_Addr = match_Cd_St_Addr;
	}

	public String getMatch_Cd_St_Addr_Line() {
		return this.match_Cd_St_Addr_Line;
	}

	public void setMatch_Cd_St_Addr_Line(String match_Cd_St_Addr_Line) {
		this.match_Cd_St_Addr_Line = match_Cd_St_Addr_Line;
	}

	public String getMatch_Cd_St_City() {
		return this.match_Cd_St_City;
	}

	public void setMatch_Cd_St_City(String match_Cd_St_City) {
		this.match_Cd_St_City = match_Cd_St_City;
	}

	public String getMatch_Cd_St_Cntry() {
		return this.match_Cd_St_Cntry;
	}

	public void setMatch_Cd_St_Cntry(String match_Cd_St_Cntry) {
		this.match_Cd_St_Cntry = match_Cd_St_Cntry;
	}

	public String getMatch_Cd_St_State() {
		return this.match_Cd_St_State;
	}

	public void setMatch_Cd_St_State(String match_Cd_St_State) {
		this.match_Cd_St_State = match_Cd_St_State;
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

	public String getPrep_Card_Ind() {
		return this.prep_Card_Ind;
	}

	public void setPrep_Card_Ind(String prep_Card_Ind) {
		this.prep_Card_Ind = prep_Card_Ind;
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

	public String getSt_Addr_1() {
		return this.st_Addr_1;
	}

	public void setSt_Addr_1(String st_Addr_1) {
		this.st_Addr_1 = st_Addr_1;
	}

	public String getSt_Addr_2() {
		return this.st_Addr_2;
	}

	public void setSt_Addr_2(String st_Addr_2) {
		this.st_Addr_2 = st_Addr_2;
	}

	public String getSt_City_Name() {
		return this.st_City_Name;
	}

	public void setSt_City_Name(String st_City_Name) {
		this.st_City_Name = st_City_Name;
	}

	public String getSt_Cntry_Cd() {
		return this.st_Cntry_Cd;
	}

	public void setSt_Cntry_Cd(String st_Cntry_Cd) {
		this.st_Cntry_Cd = st_Cntry_Cd;
	}

	public String getSt_Cntry_name() {
		return this.st_Cntry_name;
	}

	public void setSt_Cntry_name(String st_Cntry_name) {
		this.st_Cntry_name = st_Cntry_name;
	}

	public String getSt_Post_Cd() {
		return this.st_Post_Cd;
	}

	public void setSt_Post_Cd(String st_Post_Cd) {
		this.st_Post_Cd = st_Post_Cd;
	}

	public String getSt_State_Cd() {
		return this.st_State_Cd;
	}

	public void setSt_State_Cd(String st_State_Cd) {
		this.st_State_Cd = st_State_Cd;
	}

	public String getSt_State_Name() {
		return this.st_State_Name;
	}

	public void setSt_State_Name(String st_State_Name) {
		this.st_State_Name = st_State_Name;
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