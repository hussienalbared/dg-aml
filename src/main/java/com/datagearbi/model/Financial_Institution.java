package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Financial_Institution database table.
 * 
 */
@Entity
@NamedQuery(name="Financial_Institution.findAll", query="SELECT f FROM Financial_Institution f")
public class Financial_Institution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int FI_Key;

	@Column(name="Chg_Begin_Date")
	private Timestamp chg_Begin_Date;

	@Column(name="Chg_Current_Ind")
	private String chg_Current_Ind;

	@Column(name="Chg_End_Date")
	private Timestamp chg_End_Date;

	private String FI_Addr_1;

	private String FI_Addr_2;

	private String FI_Chips_No;

	private String FI_City_Name;

	private String FI_Cntry_Cd;

	private String FI_Cntry_Name;

	private String FI_Name;

	private String FI_No;

	private String FI_Post_Cd;

	private String FI_State_Cd;

	private String FI_State_Name;

	private String FI_Swift_No;

	private String FI_Tel_No;

	public Financial_Institution() {
	}

	public int getFI_Key() {
		return this.FI_Key;
	}

	public void setFI_Key(int FI_Key) {
		this.FI_Key = FI_Key;
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

	public String getFI_Addr_1() {
		return this.FI_Addr_1;
	}

	public void setFI_Addr_1(String FI_Addr_1) {
		this.FI_Addr_1 = FI_Addr_1;
	}

	public String getFI_Addr_2() {
		return this.FI_Addr_2;
	}

	public void setFI_Addr_2(String FI_Addr_2) {
		this.FI_Addr_2 = FI_Addr_2;
	}

	public String getFI_Chips_No() {
		return this.FI_Chips_No;
	}

	public void setFI_Chips_No(String FI_Chips_No) {
		this.FI_Chips_No = FI_Chips_No;
	}

	public String getFI_City_Name() {
		return this.FI_City_Name;
	}

	public void setFI_City_Name(String FI_City_Name) {
		this.FI_City_Name = FI_City_Name;
	}

	public String getFI_Cntry_Cd() {
		return this.FI_Cntry_Cd;
	}

	public void setFI_Cntry_Cd(String FI_Cntry_Cd) {
		this.FI_Cntry_Cd = FI_Cntry_Cd;
	}

	public String getFI_Cntry_Name() {
		return this.FI_Cntry_Name;
	}

	public void setFI_Cntry_Name(String FI_Cntry_Name) {
		this.FI_Cntry_Name = FI_Cntry_Name;
	}

	public String getFI_Name() {
		return this.FI_Name;
	}

	public void setFI_Name(String FI_Name) {
		this.FI_Name = FI_Name;
	}

	public String getFI_No() {
		return this.FI_No;
	}

	public void setFI_No(String FI_No) {
		this.FI_No = FI_No;
	}

	public String getFI_Post_Cd() {
		return this.FI_Post_Cd;
	}

	public void setFI_Post_Cd(String FI_Post_Cd) {
		this.FI_Post_Cd = FI_Post_Cd;
	}

	public String getFI_State_Cd() {
		return this.FI_State_Cd;
	}

	public void setFI_State_Cd(String FI_State_Cd) {
		this.FI_State_Cd = FI_State_Cd;
	}

	public String getFI_State_Name() {
		return this.FI_State_Name;
	}

	public void setFI_State_Name(String FI_State_Name) {
		this.FI_State_Name = FI_State_Name;
	}

	public String getFI_Swift_No() {
		return this.FI_Swift_No;
	}

	public void setFI_Swift_No(String FI_Swift_No) {
		this.FI_Swift_No = FI_Swift_No;
	}

	public String getFI_Tel_No() {
		return this.FI_Tel_No;
	}

	public void setFI_Tel_No(String FI_Tel_No) {
		this.FI_Tel_No = FI_Tel_No;
	}

}