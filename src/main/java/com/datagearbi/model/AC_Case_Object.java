package com.datagearbi.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the AC_Case_Object database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Case_Object.findAll", query="SELECT a FROM AC_Case_Object a")
public class AC_Case_Object implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AC_Case_ObjectPK id;

	@Column(name="Last_Update_Date")
	private Timestamp last_Update_Date;

	@Column(name="Last_Update_User_Id")
	private String last_Update_User_Id;

	@Column(name="Obj_Name")
	private String obj_Name;

	@Column(name="Obj_No")
	private String obj_No;

	@Column(name="Prim_Susp_Ind")
	private String prim_Susp_Ind;

	@Column(name="Rel_Desc")
	private String rel_Desc;

	@Column(name="Rr_Ind")
	private String rr_Ind;

	@Column(name="Ver_No")
	private int ver_No;

	public AC_Case_Object() {
	}

	public AC_Case_ObjectPK getId() {
		return this.id;
	}

	public void setId(AC_Case_ObjectPK id) {
		this.id = id;
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

	public String getObj_Name() {
		return this.obj_Name;
	}

	public void setObj_Name(String obj_Name) {
		this.obj_Name = obj_Name;
	}

	public String getObj_No() {
		return this.obj_No;
	}

	public void setObj_No(String obj_No) {
		this.obj_No = obj_No;
	}

	public String getPrim_Susp_Ind() {
		return this.prim_Susp_Ind;
	}

	public void setPrim_Susp_Ind(String prim_Susp_Ind) {
		this.prim_Susp_Ind = prim_Susp_Ind;
	}

	public String getRel_Desc() {
		return this.rel_Desc;
	}

	public void setRel_Desc(String rel_Desc) {
		this.rel_Desc = rel_Desc;
	}

	public String getRr_Ind() {
		return this.rr_Ind;
	}

	public void setRr_Ind(String rr_Ind) {
		this.rr_Ind = rr_Ind;
	}

	public int getVer_No() {
		return this.ver_No;
	}

	public void setVer_No(int ver_No) {
		this.ver_No = ver_No;
	}

}