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
@NamedQuery(name = "RiskNotification.findAll", query = "SELECT a FROM RiskNotification a")
@Table(schema = "dbo")
@PrimaryKeyJoinColumn(name = "Notification_ID")

public class RiskNotification extends Notification implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "Notification_ID")
	private int Notification_ID;

	@Column(name = "risk_Assmnt_Id")
	private long risk_Assmnt_Id;


	
	@Column(name = "Cust_Name")
	private String Cust_Name;


	public int getNotification_ID() {
		return Notification_ID;
	}

	public void setNotification_ID(int notification_ID) {
		Notification_ID = notification_ID;
	}
	private String Target_Name;
	public String getTarget_Name() {
		return Target_Name;
	}

	public void setTarget_Name(String target_Name) {
		Target_Name = target_Name;
	}

	public String getCust_Name() {
		return Cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}


	public RiskNotification() {
	}

	

	public long getRisk_Assmnt_Id() {
		return risk_Assmnt_Id;
	}

	public void setRisk_Assmnt_Id(long risk_Assmnt_Id) {
		this.risk_Assmnt_Id = risk_Assmnt_Id;
	}




}