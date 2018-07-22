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

	private int  id;

	@Column(name="userId")
	private int userId;

	@Column(name="notificationId")
	private int notificationId;

	@Column(name="isSeen")
	private String  isSeen;
public UserNotifications() {
	// TODO Auto-generated constructor stub
}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public String getIsSeen() {
		return isSeen;
	}

	public void setIsSeen(String isSeen) {
		this.isSeen = isSeen;
	}

}