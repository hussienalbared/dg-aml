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
	private String finalDescription;
	private String userName;
	
	public String getFinalDescription() {
		return finalDescription;
	}
	public void setFinalDescription(String finalDescription) {
		this.finalDescription = finalDescription;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public Date getNotificationDate() {
		return NotificationDate;
	}
	public void setNotificationDate(Date notificationDate) {
		NotificationDate = notificationDate;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "userId")
	private long userId;
	@Column(name = "NotificationDate")
	private Date NotificationDate;

	
}
