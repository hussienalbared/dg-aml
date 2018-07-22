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
 * The persistent class for the AC_List database table.
 * 
 */
@Entity
@NamedQuery(name="AC_List.findAll", query="SELECT a FROM AC_List a")
public class AC_List implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="List_Id")
	private long list_Id;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Del_Date")
	private Timestamp del_Date;

	@Column(name="Del_User_Id")
	private String del_User_Id;

	@Column(name="List_Categ_Id")
	private BigDecimal list_Categ_Id;

	@Column(name="List_Desc")
	private String list_Desc;

	@Column(name="List_Name")
	private String list_Name;

	@Column(name="Logic_Del_Ind")
	private String logic_Del_Ind;

	@Column(name="Valid_Type_Cd")
	private String valid_Type_Cd;

	public AC_List() {
	}

	public long getList_Id() {
		return this.list_Id;
	}

	public void setList_Id(long list_Id) {
		this.list_Id = list_Id;
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

	public Timestamp getDel_Date() {
		return this.del_Date;
	}

	public void setDel_Date(Timestamp del_Date) {
		this.del_Date = del_Date;
	}

	public String getDel_User_Id() {
		return this.del_User_Id;
	}

	public void setDel_User_Id(String del_User_Id) {
		this.del_User_Id = del_User_Id;
	}

	public BigDecimal getList_Categ_Id() {
		return this.list_Categ_Id;
	}

	public void setList_Categ_Id(BigDecimal list_Categ_Id) {
		this.list_Categ_Id = list_Categ_Id;
	}

	public String getList_Desc() {
		return this.list_Desc;
	}

	public void setList_Desc(String list_Desc) {
		this.list_Desc = list_Desc;
	}

	public String getList_Name() {
		return this.list_Name;
	}

	public void setList_Name(String list_Name) {
		this.list_Name = list_Name;
	}

	public String getLogic_Del_Ind() {
		return this.logic_Del_Ind;
	}

	public void setLogic_Del_Ind(String logic_Del_Ind) {
		this.logic_Del_Ind = logic_Del_Ind;
	}

	public String getValid_Type_Cd() {
		return this.valid_Type_Cd;
	}

	public void setValid_Type_Cd(String valid_Type_Cd) {
		this.valid_Type_Cd = valid_Type_Cd;
	}

}