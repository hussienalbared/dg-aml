package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AC_Alarm_Risk_Factor database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Alarm_Risk_Factor.findAll", query="SELECT a FROM AC_Alarm_Risk_Factor a")
public class AC_Alarm_Risk_Factor implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AC_Alarm_Risk_FactorPK id;

	@Column(name="Actual_Value_Txt")
	private String actual_Value_Txt;

	@Column(name="Obj_Level_Cd")
	private String obj_Level_Cd;

	public AC_Alarm_Risk_Factor() {
	}

	public AC_Alarm_Risk_FactorPK getId() {
		return this.id;
	}

	public void setId(AC_Alarm_Risk_FactorPK id) {
		this.id = id;
	}

	public String getActual_Value_Txt() {
		return this.actual_Value_Txt;
	}

	public void setActual_Value_Txt(String actual_Value_Txt) {
		this.actual_Value_Txt = actual_Value_Txt;
	}

	public String getObj_Level_Cd() {
		return this.obj_Level_Cd;
	}

	public void setObj_Level_Cd(String obj_Level_Cd) {
		this.obj_Level_Cd = obj_Level_Cd;
	}

}