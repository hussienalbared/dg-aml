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
@NamedQuery(name="RiskNotification.findAll", query="SELECT a FROM RiskNotification a")
@Table(schema="dbo")
@PrimaryKeyJoinColumn(name = "id")

public class RiskNotification extends Notification  implements Serializable {
	private static final long serialVersionUID = 1L;
@Id
	@Column(name="id")
	private int id;

	@Column(name="risk_Assmnt_Id")
	private long risk_Assmnt_Id;

	@Column(name="risk_Class_Id")
	private long risk_Class_Id;

	@Column(name="action")
	private String action;

	public RiskNotification() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getRisk_Assmnt_Id() {
		return risk_Assmnt_Id;
	}

	public void setRisk_Assmnt_Id(long risk_Assmnt_Id) {
		this.risk_Assmnt_Id = risk_Assmnt_Id;
	}

	public long getRisk_Class_Id() {
		return risk_Class_Id;
	}

	public void setRisk_Class_Id(long risk_Class_Id) {
		this.risk_Class_Id = risk_Class_Id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}