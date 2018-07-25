package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the AC_Acct_Event_Alarm database table.
 * 
 */
@Entity
@NamedQuery(name="UserNotifications.findAll", query="SELECT a FROM UserNotifications a")
public class UserNotifications implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int  ID;

	@Column(name="User_Id")
	private int User_Id;

	@Column(name="Notification_ID")
	private int Notification_ID;

	@Column(name="Is_Seen")
	private String  Is_Seen;
public UserNotifications() {
	// TODO Auto-generated constructor stub
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public int getUser_Id() {
	return User_Id;
}
public void setUser_Id(int user_Id) {
	User_Id = user_Id;
}
public void setNotification_ID(int notification_ID) {
	Notification_ID = notification_ID;
}
public int getNotification_ID() {
	return Notification_ID;
}
public String getIs_Seen() {
	return Is_Seen;
}
public void setIs_Seen(String is_Seen) {
	Is_Seen = is_Seen;
}
	
}