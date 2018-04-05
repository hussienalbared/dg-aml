package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AC_ROUTINE_PARAMETER database table.
 * 
 */
@Entity
@Table(name="AC_ROUTINE_PARAMETER")
@NamedQuery(name="AcRoutineParameter.findAll", query="SELECT a FROM AcRoutineParameter a")
public class AcRoutineParameter implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcRoutineParameterPK id;

	@Column(name="parm_desc")
	private String parmDesc;

	@Column(name="parm_type_desc")
	private String parmTypeDesc;

	@Column(name="parm_value")
	private String parmValue;

	public AcRoutineParameter() {
	}

	public AcRoutineParameterPK getId() {
		return this.id;
	}

	public void setId(AcRoutineParameterPK id) {
		this.id = id;
	}

	public String getParmDesc() {
		return this.parmDesc;
	}

	public void setParmDesc(String parmDesc) {
		this.parmDesc = parmDesc;
	}

	public String getParmTypeDesc() {
		return this.parmTypeDesc;
	}

	public void setParmTypeDesc(String parmTypeDesc) {
		this.parmTypeDesc = parmTypeDesc;
	}

	public String getParmValue() {
		return this.parmValue;
	}

	public void setParmValue(String parmValue) {
		this.parmValue = parmValue;
	}

}