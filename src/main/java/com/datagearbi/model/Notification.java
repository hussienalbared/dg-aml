package com.datagearbi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "Notification.findAll", query = "SELECT c FROM Notification c")
@Table(schema = "AC")
@Inheritance(strategy = InheritanceType.JOINED)
public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "Notification_Summary")
	private String Notification_Summary;
	@Column(name = "Create_User_Name")
	private String Create_User_Name;
	@Column(name = "Action")
	private String Action;
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Notification_ID")
	private int Notification_ID;
	@Column(name = "Create_User_Id")
	private long Create_User_Id;
	@Column(name = "Notification_Date")
	private Date Notification_Date;
	public String getNotification_Summary() {
		return Notification_Summary;
	}
	public void setNotification_Summary(String notification_Summary) {
		Notification_Summary = notification_Summary;
	}
	public String getCreate_User_Name() {
		return Create_User_Name;
	}
	public void setCreate_User_Name(String create_User_Name) {
		Create_User_Name = create_User_Name;
	}
	public int getNotification_ID() {
		return Notification_ID;
	}
	public void setNotification_ID(int notification_ID) {
		Notification_ID = notification_ID;
	}
	public long getCreate_User_Id() {
		return Create_User_Id;
	}
	public void setCreate_User_Id(long create_User_Id) {
		Create_User_Id = create_User_Id;
	}
	public Date getNotification_Date() {
		return Notification_Date;
	}
	public void setNotification_Date(Date notification_Date) {
		Notification_Date = notification_Date;
	}

	
}
