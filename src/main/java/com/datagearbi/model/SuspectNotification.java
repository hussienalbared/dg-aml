package com.datagearbi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "Notification_ID")
public class SuspectNotification extends Notification {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "Notification_ID")
	private int Notification_ID;

	@Column(name = "Action")
	private String Action;
	
	@Column(name = "Alarmed_Obj_level_Cd")
	private String Alarmed_Obj_level_Cd;
	
	public int getNotification_ID() {
		return Notification_ID;
	}

	public void setNotification_ID(int notification_ID) {
		Notification_ID = notification_ID;
	}

	@Column(name = "Alarmed_Obj_Key")
	private int Alarmed_Obj_Key;
	
	@Column(name = "Alarmed_Obj_Name")
	private String Alarmed_Obj_Name;
	
	@Column(name = "Target_User_Name")
	private String Target_User_Name;
	
	@Column(name = "Comment_Decription")
	private String Comment_Decription;


	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
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

	public String getAlarmed_Obj_Name() {
		return Alarmed_Obj_Name;
	}

	public void setAlarmed_Obj_Name(String alarmed_Obj_Name) {
		Alarmed_Obj_Name = alarmed_Obj_Name;
	}

	public String getTarget_User_Name() {
		return Target_User_Name;
	}

	public void setTarget_User_Name(String target_User_Name) {
		Target_User_Name = target_User_Name;
	}

	public String getComment_Decription() {
		return Comment_Decription;
	}

	public void setComment_Decription(String comment_Decription) {
		Comment_Decription = comment_Decription;
	}

}
