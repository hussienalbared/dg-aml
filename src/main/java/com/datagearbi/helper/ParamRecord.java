package com.datagearbi.helper;

import java.io.Serializable;

public class ParamRecord implements Serializable{
	private long routine_Id;
	private String parm_Name;
	private String parm_Value;
	private String parm_Type_Desc;
	private String parm_Desc;
	public long getRoutine_Id() {
		return routine_Id;
	}
	public ParamRecord(long routine_Id, String parm_Name, String parm_Value, String parm_Type_Desc, String parm_Desc) {
		super();
		this.routine_Id = routine_Id;
		this.parm_Name = parm_Name;
		this.parm_Value = parm_Value;
		this.parm_Type_Desc = parm_Type_Desc;
		this.parm_Desc = parm_Desc;
	}
	public void setRoutine_Id(long routine_Id) {
		this.routine_Id = routine_Id;
	}
	public String getParm_Name() {
		return parm_Name;
	}
	public void setParm_Name(String parm_Name) {
		this.parm_Name = parm_Name;
	}
	public String getParm_Value() {
		return parm_Value;
	}
	public void setParm_Value(String parm_Value) {
		this.parm_Value = parm_Value;
	}
	public String getParm_Type_Desc() {
		return parm_Type_Desc;
	}
	public void setParm_Type_Desc(String parm_Type_Desc) {
		this.parm_Type_Desc = parm_Type_Desc;
	}
	public String getParm_Desc() {
		return parm_Desc;
	}
	public void setParm_Desc(String parm_Desc) {
		this.parm_Desc = parm_Desc;
	}
	
}
