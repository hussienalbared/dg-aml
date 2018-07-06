package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_Alarm_Case database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Alarm_Case.findAll", query="SELECT a FROM AC_Alarm_Case a")
public class AC_Alarm_Case implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AC_Alarm_CasePK id;

	@Column(name="Last_Update_Date")
	private Timestamp last_Update_Date;

	@Column(name="Last_Update_User_Id")
	private String last_Update_User_Id;

	@Column(name="Ver_No")
	private int ver_No;

	public AC_Alarm_Case() {
	}

	public AC_Alarm_CasePK getId() {
		return this.id;
	}

	public void setId(AC_Alarm_CasePK id) {
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

	public int getVer_No() {
		return this.ver_No;
	}

	public void setVer_No(int ver_No) {
		this.ver_No = ver_No;
	}

}