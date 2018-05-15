package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_Risk_Assessment database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Risk_Assessment.findAll", query="SELECT a FROM AC_Risk_Assessment a")
public class AC_Risk_Assessment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Risk_Assmnt_Id")
	private long risk_Assmnt_Id;

	@Column(name="Assmnt_Categ_Cd")
	private String assmnt_Categ_Cd;

	@Column(name="Assmnt_SubCateg_Cd")
	private String assmnt_SubCateg_Cd;

	@Column(name="Assmnt_Type_Cd")
	private String assmnt_Type_Cd;

	@Column(name="Begin_Month_Key")
	private int begin_Month_Key;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Cust_Key")
	private BigDecimal cust_Key;

	@Column(name="Cust_Name")
	private String cust_Name;

	@Column(name="Cust_No")
	private String cust_No;

	@Column(name="Emp_Ind")
	private String emp_Ind;

	@Column(name="Logic_Del_Ind")
	private String logic_Del_Ind;

	@Column(name="Owner_User_Long_Id")
	private String owner_User_Long_Id;

	@Column(name="Proposed_Risk_Class")
	private int proposed_Risk_Class;

	@Column(name="Risk_Assmnt_Dur")
	private int risk_Assmnt_Dur;

	@Column(name="Risk_Assmnt_Status_Cd")
	private String risk_Assmnt_Status_Cd;

	@Column(name="Risk_Class")
	private int risk_Class;

	@Column(name="Ver_No")
	private int ver_No;

	public AC_Risk_Assessment() {
	}

	public long getRisk_Assmnt_Id() {
		return this.risk_Assmnt_Id;
	}

	public void setRisk_Assmnt_Id(long risk_Assmnt_Id) {
		this.risk_Assmnt_Id = risk_Assmnt_Id;
	}

	public String getAssmnt_Categ_Cd() {
		return this.assmnt_Categ_Cd;
	}

	public void setAssmnt_Categ_Cd(String assmnt_Categ_Cd) {
		this.assmnt_Categ_Cd = assmnt_Categ_Cd;
	}

	public String getAssmnt_SubCateg_Cd() {
		return this.assmnt_SubCateg_Cd;
	}

	public void setAssmnt_SubCateg_Cd(String assmnt_SubCateg_Cd) {
		this.assmnt_SubCateg_Cd = assmnt_SubCateg_Cd;
	}

	public String getAssmnt_Type_Cd() {
		return this.assmnt_Type_Cd;
	}

	public void setAssmnt_Type_Cd(String assmnt_Type_Cd) {
		this.assmnt_Type_Cd = assmnt_Type_Cd;
	}

	public int getBegin_Month_Key() {
		return this.begin_Month_Key;
	}

	public void setBegin_Month_Key(int begin_Month_Key) {
		this.begin_Month_Key = begin_Month_Key;
	}

	public Timestamp getCreate_Date() {
		return this.create_Date;
	}

	public void setCreate_Date(Timestamp create_Date) {
		this.create_Date = create_Date;
	}

	public String getCreate_User_Id() {
		return this.create_User_Id;
	}

	public void setCreate_User_Id(String create_User_Id) {
		this.create_User_Id = create_User_Id;
	}

	public BigDecimal getCust_Key() {
		return this.cust_Key;
	}

	public void setCust_Key(BigDecimal cust_Key) {
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

	public String getEmp_Ind() {
		return this.emp_Ind;
	}

	public void setEmp_Ind(String emp_Ind) {
		this.emp_Ind = emp_Ind;
	}

	public String getLogic_Del_Ind() {
		return this.logic_Del_Ind;
	}

	public void setLogic_Del_Ind(String logic_Del_Ind) {
		this.logic_Del_Ind = logic_Del_Ind;
	}

	public String getOwner_User_Long_Id() {
		return this.owner_User_Long_Id;
	}

	public void setOwner_User_Long_Id(String owner_User_Long_Id) {
		this.owner_User_Long_Id = owner_User_Long_Id;
	}

	public int getProposed_Risk_Class() {
		return this.proposed_Risk_Class;
	}

	public void setProposed_Risk_Class(int proposed_Risk_Class) {
		this.proposed_Risk_Class = proposed_Risk_Class;
	}

	public int getRisk_Assmnt_Dur() {
		return this.risk_Assmnt_Dur;
	}

	public void setRisk_Assmnt_Dur(int risk_Assmnt_Dur) {
		this.risk_Assmnt_Dur = risk_Assmnt_Dur;
	}

	public String getRisk_Assmnt_Status_Cd() {
		return this.risk_Assmnt_Status_Cd;
	}

	public void setRisk_Assmnt_Status_Cd(String risk_Assmnt_Status_Cd) {
		this.risk_Assmnt_Status_Cd = risk_Assmnt_Status_Cd;
	}

	public int getRisk_Class() {
		return this.risk_Class;
	}

	public void setRisk_Class(int risk_Class) {
		this.risk_Class = risk_Class;
	}

	public int getVer_No() {
		return this.ver_No;
	}

	public void setVer_No(int ver_No) {
		this.ver_No = ver_No;
	}

}