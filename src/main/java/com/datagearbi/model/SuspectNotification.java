package com.datagearbi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class SuspectNotification extends Notification {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	private String alarmed_obj_name;

	private String target_user_name;
	private String commentdecription;
	public String getAlarmed_obj_name() {
		return alarmed_obj_name;
	}
	public void setAlarmed_obj_name(String alarmed_obj_name) {
		this.alarmed_obj_name = alarmed_obj_name;
	}
	public String getTarget_user_name() {
		return target_user_name;
	}
	public void setTarget_user_name(String target_user_name) {
		this.target_user_name = target_user_name;
	}
	public String getCommentdecription() {
		return commentdecription;
	}
	public void setCommentdecription(String commentdecription) {
		this.commentdecription = commentdecription;
	}
	
	
}
