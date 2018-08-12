package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the AC_Key_Value database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Key_Value.findAll", query="SELECT a FROM AC_Key_Value a")
public class AC_Key_Value implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AC_Key_ValuePK id;

	@Column(name="Act_Flag")
	private String act_Flag;

	@Column(name="Kval_Sort_Position_No")
	private int kval_Sort_Position_No;

	@Column(name="Kval_Type_Desc")
	private String kval_Type_Desc;

	public AC_Key_Value() {
	}

	public AC_Key_ValuePK getId() {
		return this.id;
	}

	public void setId(AC_Key_ValuePK id) {
		this.id = id;
	}

	public String getAct_Flag() {
		return this.act_Flag;
	}

	public void setAct_Flag(String act_Flag) {
		this.act_Flag = act_Flag;
	}

	public int getKval_Sort_Position_No() {
		return this.kval_Sort_Position_No;
	}

	public void setKval_Sort_Position_No(int kval_Sort_Position_No) {
		this.kval_Sort_Position_No = kval_Sort_Position_No;
	}

	public String getKval_Type_Desc() {
		return this.kval_Type_Desc;
	}

	public void setKval_Type_Desc(String kval_Type_Desc) {
		this.kval_Type_Desc = kval_Type_Desc;
	}

}