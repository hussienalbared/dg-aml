package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * The persistent class for the AC_Alarm_Case database table.
 * 
 */
@Entity
@NamedQuery(name = "alarmNotification.findAll", query = "SELECT a FROM alarmNotification a")
@Table(schema = "dbo")
@PrimaryKeyJoinColumn(name = "Notification_ID")

public class alarmNotification extends Notification implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "Notification_ID")
	private int Notification_ID;

	public int getNotification_ID() {
		return Notification_ID;
	}

	public void setNotification_ID(int notification_ID) {
		Notification_ID = notification_ID;
	}

	@Column(name = "Alarm_Id")
	private long Alarm_Id;

	@Column(name = "Action")
	private String Action;
	
	@Column(name = "Alarmed_Obj_Name")
	private String alarmed_obj_name;



	public long getAlarm_Id() {
		return Alarm_Id;
	}

	public void setAlarm_Id(long alarm_Id) {
		Alarm_Id = alarm_Id;
	}

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}

	public String getAlarmed_obj_name() {
		return alarmed_obj_name;
	}

	public void setAlarmed_obj_name(String alarmed_obj_name) {
		this.alarmed_obj_name = alarmed_obj_name;
	}
	

}