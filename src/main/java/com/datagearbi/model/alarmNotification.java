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
@PrimaryKeyJoinColumn(name = "id")

public class alarmNotification extends Notification implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "alarmId")
	private long alarmId;

	@Column(name = "action")
	private String action;
	@Column(name = "alarmed_obj_name")
	private String alarmed_obj_name;
	
	public String getAlarmed_obj_name() {
		return alarmed_obj_name;
	}

	public void setAlarmed_obj_name(String alarmed_obj_name) {
		this.alarmed_obj_name = alarmed_obj_name;
	}

	public alarmNotification() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAlarmId() {
		return alarmId;
	}

	public void setAlarmId(long alarmId) {
		this.alarmId = alarmId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}



}