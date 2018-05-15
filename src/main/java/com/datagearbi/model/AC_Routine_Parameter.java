package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AC_Routine_Parameter database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Routine_Parameter.findAll", query="SELECT a FROM AC_Routine_Parameter a")
public class AC_Routine_Parameter implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AC_Routine_ParameterPK id;

	@Column(name="Parm_Desc")
	private String parm_Desc;

	@Column(name="Parm_Type_Desc")
	private String parm_Type_Desc;

	@Column(name="Parm_Value")
	private String parm_Value;

	public AC_Routine_Parameter() {
	}

	public AC_Routine_ParameterPK getId() {
		return this.id;
	}

	public void setId(AC_Routine_ParameterPK id) {
		this.id = id;
	}

	public String getParm_Desc() {
		return this.parm_Desc;
	}

	public void setParm_Desc(String parm_Desc) {
		this.parm_Desc = parm_Desc;
	}

	public String getParm_Type_Desc() {
		return this.parm_Type_Desc;
	}

	public void setParm_Type_Desc(String parm_Type_Desc) {
		this.parm_Type_Desc = parm_Type_Desc;
	}

	public String getParm_Value() {
		return this.parm_Value;
	}

	public void setParm_Value(String parm_Value) {
		this.parm_Value = parm_Value;
	}

}