package com.datagearbi.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the AC_List_Category database table.
 * 
 */
@Entity
@NamedQuery(name="AC_List_Category.findAll", query="SELECT a FROM AC_List_Category a")
public class AC_List_Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="List_Categ_Id")
	private long list_Categ_Id;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Del_Date")
	private Timestamp del_Date;

	@Column(name="Del_User_Id")
	private String del_User_Id;

	@Column(name="List_Categ_Desc")
	private String list_Categ_Desc;

	@Column(name="List_Categ_Name")
	private String list_Categ_Name;

	@Column(name="Logic_Del_Ind")
	private String logic_Del_Ind;

	public AC_List_Category() {
	}

	public long getList_Categ_Id() {
		return this.list_Categ_Id;
	}

	public void setList_Categ_Id(long list_Categ_Id) {
		this.list_Categ_Id = list_Categ_Id;
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

	public String getList_Categ_Desc() {
		return this.list_Categ_Desc;
	}

	public void setList_Categ_Desc(String list_Categ_Desc) {
		this.list_Categ_Desc = list_Categ_Desc;
	}

	public String getList_Categ_Name() {
		return this.list_Categ_Name;
	}

	public void setList_Categ_Name(String list_Categ_Name) {
		this.list_Categ_Name = list_Categ_Name;
	}

	public String getLogic_Del_Ind() {
		return this.logic_Del_Ind;
	}

	public void setLogic_Del_Ind(String logic_Del_Ind) {
		this.logic_Del_Ind = logic_Del_Ind;
	}

}