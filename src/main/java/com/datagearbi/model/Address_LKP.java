package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Address_LKP database table.
 * 
 */
@Entity
@NamedQuery(name="Address_LKP.findAll", query="SELECT a FROM Address_LKP a")
public class Address_LKP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Addr_Key")
	private int addr_Key;

	@Column(name="Addr_Line_1_Txt")
	private String addr_Line_1_Txt;

	@Column(name="Addr_Line_2_Txt")
	private String addr_Line_2_Txt;

	@Column(name="Addr_Type_Cd")
	private String addr_Type_Cd;

	@Column(name="Chg_Begin_Date")
	private Timestamp chg_Begin_Date;

	@Column(name="Chg_Current_Ind")
	private String chg_Current_Ind;

	@Column(name="Chg_End_Date")
	private Timestamp chg_End_Date;

	@Column(name="City_Name")
	private String city_Name;

	@Column(name="Cntry_Cd")
	private String cntry_Cd;

	@Column(name="Cntry_Name")
	private String cntry_Name;

	@Column(name="Match_Cd_Addr")
	private String match_Cd_Addr;

	@Column(name="Match_Cd_addr_Lines")
	private String match_Cd_addr_Lines;

	@Column(name="Match_Cd_City")
	private String match_Cd_City;

	@Column(name="Match_Cd_Cntry")
	private String match_Cd_Cntry;

	@Column(name="Match_Cd_State")
	private String match_Cd_State;

	@Column(name="Post_Cd")
	private String post_Cd;

	@Column(name="Prim_Obj_level_Cd")
	private String prim_Obj_level_Cd;

	@Column(name="Prim_Obj_No")
	private String prim_Obj_No;

	@Column(name="State_Cd")
	private String state_Cd;

	@Column(name="State_Name")
	private String state_Name;

	public Address_LKP() {
	}

	public int getAddr_Key() {
		return this.addr_Key;
	}

	public void setAddr_Key(int addr_Key) {
		this.addr_Key = addr_Key;
	}

	public String getAddr_Line_1_Txt() {
		return this.addr_Line_1_Txt;
	}

	public void setAddr_Line_1_Txt(String addr_Line_1_Txt) {
		this.addr_Line_1_Txt = addr_Line_1_Txt;
	}

	public String getAddr_Line_2_Txt() {
		return this.addr_Line_2_Txt;
	}

	public void setAddr_Line_2_Txt(String addr_Line_2_Txt) {
		this.addr_Line_2_Txt = addr_Line_2_Txt;
	}

	public String getAddr_Type_Cd() {
		return this.addr_Type_Cd;
	}

	public void setAddr_Type_Cd(String addr_Type_Cd) {
		this.addr_Type_Cd = addr_Type_Cd;
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

	public String getMatch_Cd_Addr() {
		return this.match_Cd_Addr;
	}

	public void setMatch_Cd_Addr(String match_Cd_Addr) {
		this.match_Cd_Addr = match_Cd_Addr;
	}

	public String getMatch_Cd_addr_Lines() {
		return this.match_Cd_addr_Lines;
	}

	public void setMatch_Cd_addr_Lines(String match_Cd_addr_Lines) {
		this.match_Cd_addr_Lines = match_Cd_addr_Lines;
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

	public String getPrim_Obj_level_Cd() {
		return this.prim_Obj_level_Cd;
	}

	public void setPrim_Obj_level_Cd(String prim_Obj_level_Cd) {
		this.prim_Obj_level_Cd = prim_Obj_level_Cd;
	}

	public String getPrim_Obj_No() {
		return this.prim_Obj_No;
	}

	public void setPrim_Obj_No(String prim_Obj_No) {
		this.prim_Obj_No = prim_Obj_No;
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

}