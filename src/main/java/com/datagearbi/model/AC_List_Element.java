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
 * The persistent class for the AC_List_Element database table.
 * 
 */
@Entity
@NamedQuery(name="AC_List_Element.findAll", query="SELECT a FROM AC_List_Element a")
public class AC_List_Element implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="List_Elem_Id")
	private long list_Elem_Id;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Del_Date")
	private Timestamp del_Date;

	@Column(name="Del_User_Id")
	private String del_User_Id;

	@Column(name="List_Elem_Desc")
	private String list_Elem_Desc;

	@Column(name="List_Elem_Value")
	private String list_Elem_Value;

	@Column(name="List_Id")
	private BigDecimal list_Id;

	@Column(name="Logic_Del_Ind")
	private String logic_Del_Ind;

	public AC_List_Element() {
	}

	public long getList_Elem_Id() {
		return this.list_Elem_Id;
	}

	public void setList_Elem_Id(long list_Elem_Id) {
		this.list_Elem_Id = list_Elem_Id;
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

	public String getList_Elem_Desc() {
		return this.list_Elem_Desc;
	}

	public void setList_Elem_Desc(String list_Elem_Desc) {
		this.list_Elem_Desc = list_Elem_Desc;
	}

	public String getList_Elem_Value() {
		return this.list_Elem_Value;
	}

	public void setList_Elem_Value(String list_Elem_Value) {
		this.list_Elem_Value = list_Elem_Value;
	}

	public BigDecimal getList_Id() {
		return this.list_Id;
	}

	public void setList_Id(BigDecimal list_Id) {
		this.list_Id = list_Id;
	}

	public String getLogic_Del_Ind() {
		return this.logic_Del_Ind;
	}

	public void setLogic_Del_Ind(String logic_Del_Ind) {
		this.logic_Del_Ind = logic_Del_Ind;
	}

}