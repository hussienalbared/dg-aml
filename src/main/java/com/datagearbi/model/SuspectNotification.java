package com.datagearbi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class SuspectNotification extends Notification {
	@Id
	@Column(name="id")
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="action")
	private String action ;
	@Column(name="Alarmed_Obj_level_Cd")
	private String Alarmed_Obj_level_Cd ;
	@Column(name="Alarmed_Obj_Key")
	private int Alarmed_Obj_Key  ;
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAlarmed_Obj_level_Cd() {
		return Alarmed_Obj_level_Cd;
	}
	public void setAlarmed_Obj_level_Cd(String alarmed_Obj_level_Cd) {
		Alarmed_Obj_level_Cd = alarmed_Obj_level_Cd;
	}
	public int getAlarmed_Obj_Key() {
		return Alarmed_Obj_Key;
	}
	public void setAlarmed_Obj_Key(int alarmed_Obj_Key) {
		Alarmed_Obj_Key = alarmed_Obj_Key;
	}
	
}
