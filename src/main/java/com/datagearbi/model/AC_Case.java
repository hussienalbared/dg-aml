package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the AC_Case database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Case.findAll", query="SELECT a FROM AC_Case a")
public class AC_Case implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Case_Id")
	private long case_Id;

	@Column(name="Agg_Amt")
	private BigDecimal agg_Amt;

	@Column(name="Case_Categ_Cd")
	private String case_Categ_Cd;

	@Column(name="Case_Close_Rsn_Cd")
	private String case_Close_Rsn_Cd;

	@Column(name="Case_Desc")
	private String case_Desc;

	@Column(name="Case_Priority_Categ_Cd")
	private String case_Priority_Categ_Cd;

	@Column(name="Case_Status_Cd")
	private String case_Status_Cd;

	@Column(name="Case_Sub_Categ_Cd")
	private String case_Sub_Categ_Cd;

	@Column(name="Case_Summary")
	private String case_Summary;

	@Column(name="Case_Type_Cd")
	private String case_Type_Cd;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Emp_Ind")
	private String emp_Ind;

	@Column(name="First_Trans_Date")
	private Timestamp first_Trans_Date;

	@Column(name="Last_Trans_Date")
	private Timestamp last_Trans_Date;

	@Column(name="Last_Update_Date")
	private Timestamp last_Update_Date;

	@Column(name="Last_Update_User_Id")
	private String last_Update_User_Id;

	@Column(name="Le_Contact_Agency")
	private String le_Contact_Agency;

	@Column(name="Le_Contact_Date")
	private Timestamp le_Contact_Date;

	@Column(name="Le_Contact_Ind")
	private String le_Contact_Ind;

	@Column(name="Le_Contact_Name")
	private String le_Contact_Name;

	@Column(name="Le_Contact_Phone")
	private String le_Contact_Phone;

	@Column(name="Le_Contact_Phone_Ext")
	private String le_Contact_Phone_Ext;

	@Column(name="Logic_Del_Ind")
	private String logic_Del_Ind;

	@Column(name="Modify_Ind")
	private String modify_Ind;

	@Column(name="Open_Ind")
	private String open_Ind;

	@Column(name="Owner_User_Long_Id")
	private String owner_User_Long_Id;

	@Column(name="Ver_No")
	private int ver_No;

	public AC_Case() {
	}

	public long getCase_Id() {
		return this.case_Id;
	}

	public void setCase_Id(long case_Id) {
		this.case_Id = case_Id;
	}

	public BigDecimal getAgg_Amt() {
		return this.agg_Amt;
	}

	public void setAgg_Amt(BigDecimal agg_Amt) {
		this.agg_Amt = agg_Amt;
	}

	public String getCase_Categ_Cd() {
		return this.case_Categ_Cd;
	}

	public void setCase_Categ_Cd(String case_Categ_Cd) {
		this.case_Categ_Cd = case_Categ_Cd;
	}

	public String getCase_Close_Rsn_Cd() {
		return this.case_Close_Rsn_Cd;
	}

	public void setCase_Close_Rsn_Cd(String case_Close_Rsn_Cd) {
		this.case_Close_Rsn_Cd = case_Close_Rsn_Cd;
	}

	public String getCase_Desc() {
		return this.case_Desc;
	}

	public void setCase_Desc(String case_Desc) {
		this.case_Desc = case_Desc;
	}

	public String getCase_Priority_Categ_Cd() {
		return this.case_Priority_Categ_Cd;
	}

	public void setCase_Priority_Categ_Cd(String case_Priority_Categ_Cd) {
		this.case_Priority_Categ_Cd = case_Priority_Categ_Cd;
	}

	public String getCase_Status_Cd() {
		return this.case_Status_Cd;
	}

	public void setCase_Status_Cd(String case_Status_Cd) {
		this.case_Status_Cd = case_Status_Cd;
	}

	public String getCase_Sub_Categ_Cd() {
		return this.case_Sub_Categ_Cd;
	}

	public void setCase_Sub_Categ_Cd(String case_Sub_Categ_Cd) {
		this.case_Sub_Categ_Cd = case_Sub_Categ_Cd;
	}

	public String getCase_Summary() {
		return this.case_Summary;
	}

	public void setCase_Summary(String case_Summary) {
		this.case_Summary = case_Summary;
	}

	public String getCase_Type_Cd() {
		return this.case_Type_Cd;
	}

	public void setCase_Type_Cd(String case_Type_Cd) {
		this.case_Type_Cd = case_Type_Cd;
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

	public String getEmp_Ind() {
		return this.emp_Ind;
	}

	public void setEmp_Ind(String emp_Ind) {
		this.emp_Ind = emp_Ind;
	}

	public Timestamp getFirst_Trans_Date() {
		return this.first_Trans_Date;
	}

	public void setFirst_Trans_Date(Timestamp first_Trans_Date) {
		this.first_Trans_Date = first_Trans_Date;
	}

	public Timestamp getLast_Trans_Date() {
		return this.last_Trans_Date;
	}

	public void setLast_Trans_Date(Timestamp last_Trans_Date) {
		this.last_Trans_Date = last_Trans_Date;
	}

	public Timestamp getLast_Update_Date() {
		return this.last_Update_Date;
	}

	public void setLast_Update_Date(Timestamp last_Update_Date) {
		this.last_Update_Date = last_Update_Date;
	}

	public String getLast_Update_User_Id() {
		return this.last_Update_User_Id;
	}

	public void setLast_Update_User_Id(String last_Update_User_Id) {
		this.last_Update_User_Id = last_Update_User_Id;
	}

	public String getLe_Contact_Agency() {
		return this.le_Contact_Agency;
	}

	public void setLe_Contact_Agency(String le_Contact_Agency) {
		this.le_Contact_Agency = le_Contact_Agency;
	}

	public Timestamp getLe_Contact_Date() {
		return this.le_Contact_Date;
	}

	public void setLe_Contact_Date(Timestamp le_Contact_Date) {
		this.le_Contact_Date = le_Contact_Date;
	}

	public String getLe_Contact_Ind() {
		return this.le_Contact_Ind;
	}

	public void setLe_Contact_Ind(String le_Contact_Ind) {
		this.le_Contact_Ind = le_Contact_Ind;
	}

	public String getLe_Contact_Name() {
		return this.le_Contact_Name;
	}

	public void setLe_Contact_Name(String le_Contact_Name) {
		this.le_Contact_Name = le_Contact_Name;
	}

	public String getLe_Contact_Phone() {
		return this.le_Contact_Phone;
	}

	public void setLe_Contact_Phone(String le_Contact_Phone) {
		this.le_Contact_Phone = le_Contact_Phone;
	}

	public String getLe_Contact_Phone_Ext() {
		return this.le_Contact_Phone_Ext;
	}

	public void setLe_Contact_Phone_Ext(String le_Contact_Phone_Ext) {
		this.le_Contact_Phone_Ext = le_Contact_Phone_Ext;
	}

	public String getLogic_Del_Ind() {
		return this.logic_Del_Ind;
	}

	public void setLogic_Del_Ind(String logic_Del_Ind) {
		this.logic_Del_Ind = logic_Del_Ind;
	}

	public String getModify_Ind() {
		return this.modify_Ind;
	}

	public void setModify_Ind(String modify_Ind) {
		this.modify_Ind = modify_Ind;
	}

	public String getOpen_Ind() {
		return this.open_Ind;
	}

	public void setOpen_Ind(String open_Ind) {
		this.open_Ind = open_Ind;
	}

	public String getOwner_User_Long_Id() {
		return this.owner_User_Long_Id;
	}

	public void setOwner_User_Long_Id(String owner_User_Long_Id) {
		this.owner_User_Long_Id = owner_User_Long_Id;
	}

	public int getVer_No() {
		return this.ver_No;
	}

	public void setVer_No(int ver_No) {
		this.ver_No = ver_No;
	}

}