package com.datagearbi.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the External_Customer database table.
 * 
 */
@Entity
@NamedQuery(name="External_Customer.findAll", query="SELECT e FROM External_Customer e")
@Table(name="External_Customer",schema="DGAMLCORE")
public class External_Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Acct_No")
	private String acct_No;

	@Column(name="Addr_1")
	private String addr_1;

	@Column(name="Addr_2")
	private String addr_2;

	@Column(name="Branch_Name")
	private String branch_Name;

	@Column(name="Branch_No")
	private String branch_No;

	@Column(name="Citizen_Cntry_Cd")
	private String citizen_Cntry_Cd;

	@Column(name="Citizen_Cntry_Name")
	private String citizen_Cntry_Name;

	@Column(name="City_Name")
	private String city_Name;

	@Column(name="Cntry_Cd")
	private String cntry_Cd;

	@Column(name="Cntry_Name")
	private String cntry_Name;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Cust_Tax_Id")
	private String cust_Tax_Id;

	@Column(name="Cust_Tax_Id_Type_Cd")
	private String cust_Tax_Id_Type_Cd;

	@Column(name="Ext_Birth_Date")
	private Timestamp ext_Birth_Date;
    @Id
	@Column(name="Ext_Cust_Acct_Key")
	private int ext_Cust_Acct_Key;

	@Column(name="Ext_Cust_No")
	private String ext_Cust_No;

	@Column(name="Ext_Cust_Type_Desc")
	private String ext_Cust_Type_Desc;

	@Column(name="Ext_FName")
	private String ext_FName;

	@Column(name="Ext_Full_Name")
	private String ext_Full_Name;

	@Column(name="Ext_LName")
	private String ext_LName;

	@Column(name="Ext_MName")
	private String ext_MName;

	private String FI_No;

	@Column(name="Ident_Cntry_Cd")
	private String ident_Cntry_Cd;

	@Column(name="Ident_Cntry_Name")
	private String ident_Cntry_Name;

	@Column(name="Ident_Id")
	private String ident_Id;

	@Column(name="Ident_State_Cd")
	private String ident_State_Cd;

	@Column(name="Ident_Type_Desc")
	private String ident_Type_Desc;

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

	@Column(name="Match_Cd_Org")
	private String match_Cd_Org;

	@Column(name="Match_Cd_State")
	private String match_Cd_State;

	@Column(name="Post_Cd")
	private String post_Cd;

	@Column(name="Resid_Cntry_Cd")
	private String resid_Cntry_Cd;

	@Column(name="Resid_Cntry_Name")
	private String resid_Cntry_Name;

	@Column(name="State_Cd")
	private String state_Cd;

	@Column(name="State_Name")
	private String state_Name;

	@Column(name="Tel_No_1")
	private String tel_No_1;

	@Column(name="Tel_No_2")
	private String tel_No_2;

	public External_Customer() {
	}

	public String getAcct_No() {
		return this.acct_No;
	}

	public void setAcct_No(String acct_No) {
		this.acct_No = acct_No;
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

	public String getCntry_Name() {
		return this.cntry_Name;
	}

	public void setCntry_Name(String cntry_Name) {
		this.cntry_Name = cntry_Name;
	}

	public Timestamp getCreate_Date() {
		return this.create_Date;
	}

	public void setCreate_Date(Timestamp create_Date) {
		this.create_Date = create_Date;
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

	public Timestamp getExt_Birth_Date() {
		return this.ext_Birth_Date;
	}

	public void setExt_Birth_Date(Timestamp ext_Birth_Date) {
		this.ext_Birth_Date = ext_Birth_Date;
	}

	public int getExt_Cust_Acct_Key() {
		return this.ext_Cust_Acct_Key;
	}

	public void setExt_Cust_Acct_Key(int ext_Cust_Acct_Key) {
		this.ext_Cust_Acct_Key = ext_Cust_Acct_Key;
	}

	public String getExt_Cust_No() {
		return this.ext_Cust_No;
	}

	public void setExt_Cust_No(String ext_Cust_No) {
		this.ext_Cust_No = ext_Cust_No;
	}

	public String getExt_Cust_Type_Desc() {
		return this.ext_Cust_Type_Desc;
	}

	public void setExt_Cust_Type_Desc(String ext_Cust_Type_Desc) {
		this.ext_Cust_Type_Desc = ext_Cust_Type_Desc;
	}

	public String getExt_FName() {
		return this.ext_FName;
	}

	public void setExt_FName(String ext_FName) {
		this.ext_FName = ext_FName;
	}

	public String getExt_Full_Name() {
		return this.ext_Full_Name;
	}

	public void setExt_Full_Name(String ext_Full_Name) {
		this.ext_Full_Name = ext_Full_Name;
	}

	public String getExt_LName() {
		return this.ext_LName;
	}

	public void setExt_LName(String ext_LName) {
		this.ext_LName = ext_LName;
	}

	public String getExt_MName() {
		return this.ext_MName;
	}

	public void setExt_MName(String ext_MName) {
		this.ext_MName = ext_MName;
	}

	public String getFI_No() {
		return this.FI_No;
	}

	public void setFI_No(String FI_No) {
		this.FI_No = FI_No;
	}

	public String getIdent_Cntry_Cd() {
		return this.ident_Cntry_Cd;
	}

	public void setIdent_Cntry_Cd(String ident_Cntry_Cd) {
		this.ident_Cntry_Cd = ident_Cntry_Cd;
	}

	public String getIdent_Cntry_Name() {
		return this.ident_Cntry_Name;
	}

	public void setIdent_Cntry_Name(String ident_Cntry_Name) {
		this.ident_Cntry_Name = ident_Cntry_Name;
	}

	public String getIdent_Id() {
		return this.ident_Id;
	}

	public void setIdent_Id(String ident_Id) {
		this.ident_Id = ident_Id;
	}

	public String getIdent_State_Cd() {
		return this.ident_State_Cd;
	}

	public void setIdent_State_Cd(String ident_State_Cd) {
		this.ident_State_Cd = ident_State_Cd;
	}

	public String getIdent_Type_Desc() {
		return this.ident_Type_Desc;
	}

	public void setIdent_Type_Desc(String ident_Type_Desc) {
		this.ident_Type_Desc = ident_Type_Desc;
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

	public String getPost_Cd() {
		return this.post_Cd;
	}

	public void setPost_Cd(String post_Cd) {
		this.post_Cd = post_Cd;
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

}