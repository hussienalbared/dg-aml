package com.datagearbi.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the ac_suspected_objs database table.
 * 
 */
@Entity
@Table(name = "ac_suspected_objs")
@NamedQuery(name = "AcSuspectedObj.findAll", query = "SELECT a FROM AcSuspectedObj a")
public class AcSuspectedObj implements Serializable {
	private static final long serialVersionUID = 1L;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="acSuspectedObj")
	private Set<AcAlarm> acAlarm;

	@EmbeddedId
	private AcSuspectedObjPK id;

	@Column(name = "alert_count")
	private int alertCount;

	@Column(name = "compliance_userid")
	private String complianceUserid;

	@Column(name = "created_on")
	private Date createdOn;

	@Column(name = "employee_ind")
	private String employeeInd;

	@Column(name = "money_laundering_score")
	private int moneyLaunderingScore;

	@Column(name = "obj_name")
	private String objName;

	@Column(name = "obj_number")
	private String objNumber;

	@Column(name = "oldest_alert")
	private int oldestAlert;

	@Column(name = "pep_ind")
	private String pepInd;

	@Column(name = "risk_classification_code")
	private String riskClassificationCode;

	@Column(name = "total_amount")
	private double totalAmount;

	@Column(name = "transactions_count")
	private int transactionsCount;

	public AcSuspectedObj() {
	}

	public AcSuspectedObjPK getId() {
		return this.id;
	}

	public void setId(AcSuspectedObjPK id) {
		this.id = id;
	}

	public int getAlertCount() {
		return this.alertCount;
	}

	public void setAlertCount(int alertCount) {
		this.alertCount = alertCount;
	}

	public String getComplianceUserid() {
		return this.complianceUserid;
	}

	public void setComplianceUserid(String complianceUserid) {
		this.complianceUserid = complianceUserid;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getEmployeeInd() {
		return this.employeeInd;
	}

	public void setEmployeeInd(String employeeInd) {
		this.employeeInd = employeeInd;
	}

	public int getMoneyLaunderingScore() {
		return this.moneyLaunderingScore;
	}

	public void setMoneyLaunderingScore(int moneyLaunderingScore) {
		this.moneyLaunderingScore = moneyLaunderingScore;
	}

	public String getObjName() {
		return this.objName;
	}

	public void setObjName(String objName) {
		this.objName = objName;
	}

	public String getObjNumber() {
		return this.objNumber;
	}

	public void setObjNumber(String objNumber) {
		this.objNumber = objNumber;
	}

	public int getOldestAlert() {
		return this.oldestAlert;
	}

	public void setOldestAlert(int oldestAlert) {
		this.oldestAlert = oldestAlert;
	}

	public String getPepInd() {
		return this.pepInd;
	}

	public void setPepInd(String pepInd) {
		this.pepInd = pepInd;
	}

	public String getRiskClassificationCode() {
		return this.riskClassificationCode;
	}

	public void setRiskClassificationCode(String riskClassificationCode) {
		this.riskClassificationCode = riskClassificationCode;
	}

	public double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getTransactionsCount() {
		return this.transactionsCount;
	}

	public void setTransactionsCount(int transactionsCount) {
		this.transactionsCount = transactionsCount;
	}

	public Set<AcAlarm> getAcAlarm() {
		return acAlarm;
	}

	public void setAcAlarm(Set<AcAlarm> acAlarm) {
		this.acAlarm = acAlarm;
	}
}