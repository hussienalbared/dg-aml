package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AC_Preference database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Preference.findAll", query="SELECT a FROM AC_Preference a")
public class AC_Preference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Preferance_Name")
	private String preferance_Name;

	@Column(name="Preferance_Type")
	private String preferance_Type;

	@Column(name="Preferance_Value")
	private String preferance_Value;

	@Column(name="Preferance_Value_Def")
	private String preferance_Value_Def;

	public AC_Preference() {
	}

	public String getPreferance_Name() {
		return this.preferance_Name;
	}

	public void setPreferance_Name(String preferance_Name) {
		this.preferance_Name = preferance_Name;
	}

	public String getPreferance_Type() {
		return this.preferance_Type;
	}

	public void setPreferance_Type(String preferance_Type) {
		this.preferance_Type = preferance_Type;
	}

	public String getPreferance_Value() {
		return this.preferance_Value;
	}

	public void setPreferance_Value(String preferance_Value) {
		this.preferance_Value = preferance_Value;
	}

	public String getPreferance_Value_Def() {
		return this.preferance_Value_Def;
	}

	public void setPreferance_Value_Def(String preferance_Value_Def) {
		this.preferance_Value_Def = preferance_Value_Def;
	}

}