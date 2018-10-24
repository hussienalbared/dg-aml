package com.datagearbi.helper;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonFormat(shape=JsonFormat.Shape.ARRAY)
public class Key_ValueHelper implements Serializable {
	private static final long serialVersionUID = 1L;
	
	 @JsonProperty("param_Name")
	private String param_Name;
	 @JsonProperty("param_Value")
	private String param_Value;
	public String getParam_Name() {
		return param_Name;
	}
	public void setParam_Name(String param_Name) {
		this.param_Name = param_Name;
	}
	public String getParam_Value() {
		return param_Value;
	}
	public void setParam_Value(String param_Value) {
		this.param_Value = param_Value;
	}
	
	public Key_ValueHelper() {
		
	}
	
}
