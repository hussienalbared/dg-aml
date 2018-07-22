package com.datagearbi.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the AC_Alarm_Event database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Alarm_Event.findAll", query="SELECT a FROM AC_Alarm_Event a")
@Table(name="AC_Alarm_Event",schema="AC")
public class AC_Alarm_Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Alarm_Id")
	private long alarm_Id;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Event_Desc")
	private String event_Desc;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Event_Id")
	private long event_Id;

	@Column(name="Event_Type_Cd")
	private String event_Type_Cd;

	public AC_Alarm_Event() {
	}

	public long getAlarm_Id() {
		return this.alarm_Id;
	}

	public void setAlarm_Id(long alarm_Id) {
		this.alarm_Id = alarm_Id;
	}

	public Timestamp getCreate_Date() {
		return this.create_Date;
	}

	public void setCreate_Date(Timestamp create_Date) {
		this.create_Date = create_Date;
	}

	public String getCreate_User_Id() {
		return this.create_User_Id;
	}

	public void setCreate_User_Id(String create_User_Id) {
		this.create_User_Id = create_User_Id;
	}

	public String getEvent_Desc() {
		return this.event_Desc;
	}

	public void setEvent_Desc(String event_Desc) {
		this.event_Desc = event_Desc;
	}

	public long getEvent_Id() {
		return this.event_Id;
	}

	public void setEvent_Id(long event_Id) {
		this.event_Id = event_Id;
	}

	public String getEvent_Type_Cd() {
		return this.event_Type_Cd;
	}

	public void setEvent_Type_Cd(String event_Type_Cd) {
		this.event_Type_Cd = event_Type_Cd;
	}

}