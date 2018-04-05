package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the AC_ACCOUNT_EVENT_ALARM database table.
 * 
 */
@Entity
@Table(name="AC_ACCOUNT_EVENT_ALARM")
@NamedQuery(name="AcAccountEventAlarm.findAll", query="SELECT a FROM AcAccountEventAlarm a")
public class AcAccountEventAlarm implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcAccountEventAlarmPK id;

	@Column(name="account_key")
	private BigDecimal accountKey;

	@Column(name="branch_key")
	private BigDecimal branchKey;

	@Column(name="country_key")
	private BigDecimal countryKey;

	@Column(name="date_key")
	private BigDecimal dateKey;

	@Column(name="time_key")
	private BigDecimal timeKey;

	@Column(name="transaction_status_key")
	private BigDecimal transactionStatusKey;

	@Column(name="transaction_type_key")
	private BigDecimal transactionTypeKey;

	@Column(name="trigger_ind")
	private String triggerInd;

	public AcAccountEventAlarm() {
	}

	public AcAccountEventAlarmPK getId() {
		return this.id;
	}

	public void setId(AcAccountEventAlarmPK id) {
		this.id = id;
	}

	public BigDecimal getAccountKey() {
		return this.accountKey;
	}

	public void setAccountKey(BigDecimal accountKey) {
		this.accountKey = accountKey;
	}

	public BigDecimal getBranchKey() {
		return this.branchKey;
	}

	public void setBranchKey(BigDecimal branchKey) {
		this.branchKey = branchKey;
	}

	public BigDecimal getCountryKey() {
		return this.countryKey;
	}

	public void setCountryKey(BigDecimal countryKey) {
		this.countryKey = countryKey;
	}

	public BigDecimal getDateKey() {
		return this.dateKey;
	}

	public void setDateKey(BigDecimal dateKey) {
		this.dateKey = dateKey;
	}

	public BigDecimal getTimeKey() {
		return this.timeKey;
	}

	public void setTimeKey(BigDecimal timeKey) {
		this.timeKey = timeKey;
	}

	public BigDecimal getTransactionStatusKey() {
		return this.transactionStatusKey;
	}

	public void setTransactionStatusKey(BigDecimal transactionStatusKey) {
		this.transactionStatusKey = transactionStatusKey;
	}

	public BigDecimal getTransactionTypeKey() {
		return this.transactionTypeKey;
	}

	public void setTransactionTypeKey(BigDecimal transactionTypeKey) {
		this.transactionTypeKey = transactionTypeKey;
	}

	public String getTriggerInd() {
		return this.triggerInd;
	}

	public void setTriggerInd(String triggerInd) {
		this.triggerInd = triggerInd;
	}

}