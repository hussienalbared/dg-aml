package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_Risk_Classifier database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Risk_Classifier.findAll", query="SELECT a FROM AC_Risk_Classifier a")
@Table(name="AC_Risk_Classifier",schema="AC")
public class AC_Risk_Classifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Risk_Class_Id")
	private long risk_Class_Id;

	@Column(name="Act_Ind")
	private String act_Ind;

	@Column(name="Class_Fact_Col")
	private String class_Fact_Col;

	@Column(name="Class_Limit")
	private int class_Limit;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Current_Ind")
	private String current_Ind;

	@Column(name="End_Date")
	private Timestamp end_Date;

	@Column(name="End_User_Id")
	private String end_User_Id;

	@Column(name="List_Id")
	private BigDecimal list_Id;

	@Column(name="Lock_Ind")
	private String lock_Ind;

	@Column(name="Logic_Del_Ind")
	private String logic_Del_Ind;

	@Column(name="Opr_Desc")
	private String opr_Desc;

	@Column(name="Risk_Class_Categ_Id")
	private BigDecimal risk_Class_Categ_Id;

	@Column(name="Risk_Class_Desc")
	private String risk_Class_Desc;

	@Column(name="Risk_Class_Name")
	private String risk_Class_Name;

	@Column(name="Risk_Class_Short_Desc")
	private String risk_Class_Short_Desc;

	@Column(name="Risk_Class_Type_Cd")
	private String risk_Class_Type_Cd;

	@Column(name="Src_Col")
	private String src_Col;

	@Column(name="Src_Table")
	private String src_Table;

	@Column(name="Src_Value")
	private String src_Value;

	@Column(name="Ver_No")
	private int ver_No;

	@Column(name="Weight")
	private int weight;

	public AC_Risk_Classifier() {
	}

	public long getRisk_Class_Id() {
		return this.risk_Class_Id;
	}

	public void setRisk_Class_Id(long risk_Class_Id) {
		this.risk_Class_Id = risk_Class_Id;
	}

	public String getAct_Ind() {
		return this.act_Ind;
	}

	public void setAct_Ind(String act_Ind) {
		this.act_Ind = act_Ind;
	}

	public String getClass_Fact_Col() {
		return this.class_Fact_Col;
	}

	public void setClass_Fact_Col(String class_Fact_Col) {
		this.class_Fact_Col = class_Fact_Col;
	}

	public int getClass_Limit() {
		return this.class_Limit;
	}

	public void setClass_Limit(int class_Limit) {
		this.class_Limit = class_Limit;
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

	public String getCurrent_Ind() {
		return this.current_Ind;
	}

	public void setCurrent_Ind(String current_Ind) {
		this.current_Ind = current_Ind;
	}

	public Timestamp getEnd_Date() {
		return this.end_Date;
	}

	public void setEnd_Date(Timestamp end_Date) {
		this.end_Date = end_Date;
	}

	public String getEnd_User_Id() {
		return this.end_User_Id;
	}

	public void setEnd_User_Id(String end_User_Id) {
		this.end_User_Id = end_User_Id;
	}

	public BigDecimal getList_Id() {
		return this.list_Id;
	}

	public void setList_Id(BigDecimal list_Id) {
		this.list_Id = list_Id;
	}

	public String getLock_Ind() {
		return this.lock_Ind;
	}

	public void setLock_Ind(String lock_Ind) {
		this.lock_Ind = lock_Ind;
	}

	public String getLogic_Del_Ind() {
		return this.logic_Del_Ind;
	}

	public void setLogic_Del_Ind(String logic_Del_Ind) {
		this.logic_Del_Ind = logic_Del_Ind;
	}

	public String getOpr_Desc() {
		return this.opr_Desc;
	}

	public void setOpr_Desc(String opr_Desc) {
		this.opr_Desc = opr_Desc;
	}

	public BigDecimal getRisk_Class_Categ_Id() {
		return this.risk_Class_Categ_Id;
	}

	public void setRisk_Class_Categ_Id(BigDecimal risk_Class_Categ_Id) {
		this.risk_Class_Categ_Id = risk_Class_Categ_Id;
	}

	public String getRisk_Class_Desc() {
		return this.risk_Class_Desc;
	}

	public void setRisk_Class_Desc(String risk_Class_Desc) {
		this.risk_Class_Desc = risk_Class_Desc;
	}

	public String getRisk_Class_Name() {
		return this.risk_Class_Name;
	}

	public void setRisk_Class_Name(String risk_Class_Name) {
		this.risk_Class_Name = risk_Class_Name;
	}

	public String getRisk_Class_Short_Desc() {
		return this.risk_Class_Short_Desc;
	}

	public void setRisk_Class_Short_Desc(String risk_Class_Short_Desc) {
		this.risk_Class_Short_Desc = risk_Class_Short_Desc;
	}

	public String getRisk_Class_Type_Cd() {
		return this.risk_Class_Type_Cd;
	}

	public void setRisk_Class_Type_Cd(String risk_Class_Type_Cd) {
		this.risk_Class_Type_Cd = risk_Class_Type_Cd;
	}

	public String getSrc_Col() {
		return this.src_Col;
	}

	public void setSrc_Col(String src_Col) {
		this.src_Col = src_Col;
	}

	public String getSrc_Table() {
		return this.src_Table;
	}

	public void setSrc_Table(String src_Table) {
		this.src_Table = src_Table;
	}

	public String getSrc_Value() {
		return this.src_Value;
	}

	public void setSrc_Value(String src_Value) {
		this.src_Value = src_Value;
	}

	public int getVer_No() {
		return this.ver_No;
	}

	public void setVer_No(int ver_No) {
		this.ver_No = ver_No;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}