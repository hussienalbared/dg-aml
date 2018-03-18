package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class SuspectedObjectId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8155240383805841252L;

	private String obj_level_code;
	
	private int obj_key;// [decimal](12, 0) NOT NULL

	public SuspectedObjectId() {
		
	}
	
	public SuspectedObjectId(int key, String levelCode) {
		obj_key=key;
		obj_level_code=levelCode;
	}

	public String getObj_level_code() {
		return obj_level_code;
	}

	public void setObj_level_code(String obj_level_code) {
		this.obj_level_code = obj_level_code;
	}

	public int getObj_key() {
		return obj_key;
	}

	public void setObj_key(int obj_key) {
		this.obj_key = obj_key;
	}
	
}
