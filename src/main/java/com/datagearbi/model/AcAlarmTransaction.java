package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_ALARM_TRANSACTION database table.
 * 
 */
@Entity
@Table(name="AC_ALARM_TRANSACTION")
@NamedQuery(name="AcAlarmTransaction.findAll", query="SELECT a FROM AcAlarmTransaction a")
public class AcAlarmTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ac_alarm_transaction_pk")
	private long acAlarmTransactionPk;

	@Column(name="account_number")
	private String accountNumber;

	@Column(name="alarm_id")
	private BigDecimal alarmId;

	@Column(name="alarmed_obj_key")
	private BigDecimal alarmedObjKey;

	@Column(name="alarmed_obj_level_code")
	private String alarmedObjLevelCode;

	@Column(name="associate_name")
	private String associateName;

	@Column(name="beneficiary_name")
	private String beneficiaryName;

	@Column(name="Branch_name")
	private String branch_name;

	@Column(name="created_timestamp")
	private Timestamp createdTimestamp;

	@Column(name="date_key")
	private BigDecimal dateKey;

	@Column(name="primary_medium_desc")
	private String primaryMediumDesc;

	@Column(name="secondary_medium_desc")
	private String secondaryMediumDesc;

	@Column(name="time_key")
	private BigDecimal timeKey;

	@Column(name="transaction_amt")
	private BigDecimal transactionAmt;

	@Column(name="transaction_cdi_desc")
	private String transactionCdiDesc;

	@Column(name="transaction_date")
	private Timestamp transactionDate;

	@Column(name="transaction_desc")
	private String transactionDesc;

	@Column(name="transaction_id")
	private String transactionId;

	@Column(name="transaction_mechanism")
	private String transactionMechanism;

	@Column(name="transaction_status")
	private String transactionStatus;

	@Column(name="triggering_indicator_cd")
	private String triggeringIndicatorCd;

	public AcAlarmTransaction() {
	}

	public long getAcAlarmTransactionPk() {
		return this.acAlarmTransactionPk;
	}

	public void setAcAlarmTransactionPk(long acAlarmTransactionPk) {
		this.acAlarmTransactionPk = acAlarmTransactionPk;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(BigDecimal alarmId) {
		this.alarmId = alarmId;
	}

	public BigDecimal getAlarmedObjKey() {
		return this.alarmedObjKey;
	}

	public void setAlarmedObjKey(BigDecimal alarmedObjKey) {
		this.alarmedObjKey = alarmedObjKey;
	}

	public String getAlarmedObjLevelCode() {
		return this.alarmedObjLevelCode;
	}

	public void setAlarmedObjLevelCode(String alarmedObjLevelCode) {
		this.alarmedObjLevelCode = alarmedObjLevelCode;
	}

	public String getAssociateName() {
		return this.associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public String getBeneficiaryName() {
		return this.beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getBranch_name() {
		return this.branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public Timestamp getCreatedTimestamp() {
		return this.createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public BigDecimal getDateKey() {
		return this.dateKey;
	}

	public void setDateKey(BigDecimal dateKey) {
		this.dateKey = dateKey;
	}

	public String getPrimaryMediumDesc() {
		return this.primaryMediumDesc;
	}

	public void setPrimaryMediumDesc(String primaryMediumDesc) {
		this.primaryMediumDesc = primaryMediumDesc;
	}

	public String getSecondaryMediumDesc() {
		return this.secondaryMediumDesc;
	}

	public void setSecondaryMediumDesc(String secondaryMediumDesc) {
		this.secondaryMediumDesc = secondaryMediumDesc;
	}

	public BigDecimal getTimeKey() {
		return this.timeKey;
	}

	public void setTimeKey(BigDecimal timeKey) {
		this.timeKey = timeKey;
	}

	public BigDecimal getTransactionAmt() {
		return this.transactionAmt;
	}

	public void setTransactionAmt(BigDecimal transactionAmt) {
		this.transactionAmt = transactionAmt;
	}

	public String getTransactionCdiDesc() {
		return this.transactionCdiDesc;
	}

	public void setTransactionCdiDesc(String transactionCdiDesc) {
		this.transactionCdiDesc = transactionCdiDesc;
	}

	public Timestamp getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionDesc() {
		return this.transactionDesc;
	}

	public void setTransactionDesc(String transactionDesc) {
		this.transactionDesc = transactionDesc;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionMechanism() {
		return this.transactionMechanism;
	}

	public void setTransactionMechanism(String transactionMechanism) {
		this.transactionMechanism = transactionMechanism;
	}

	public String getTransactionStatus() {
		return this.transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTriggeringIndicatorCd() {
		return this.triggeringIndicatorCd;
	}

	public void setTriggeringIndicatorCd(String triggeringIndicatorCd) {
		this.triggeringIndicatorCd = triggeringIndicatorCd;
	}

}