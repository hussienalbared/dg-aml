package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_INVESTIGATION_TRANSACTION database table.
 * 
 */
@Entity
@Table(name="AC_INVESTIGATION_TRANSACTION")
@NamedQuery(name="AcInvestigationTransaction.findAll", query="SELECT a FROM AcInvestigationTransaction a")
public class AcInvestigationTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcInvestigationTransactionPK id;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="ALARMED_OBJ_KEY")
	private BigDecimal alarmedObjKey;

	@Column(name="ALARMED_OBJ_LEVEL_CODE")
	private String alarmedObjLevelCode;

	@Column(name="ASSOCIATE_NAME")
	private String associateName;

	@Column(name="BENEFICIARY_NAME")
	private String beneficiaryName;

	@Column(name="BRANCH_NAME")
	private String branchName;

	@Column(name="CREATED_TIMESTAMP")
	private Timestamp createdTimestamp;

	@Column(name="DATE_KEY")
	private BigDecimal dateKey;

	@Column(name="PRIMARY_MEDIUM_DESC")
	private String primaryMediumDesc;

	@Column(name="SECONDARY_MEDIUM_DESC")
	private String secondaryMediumDesc;

	@Column(name="TIME_KEY")
	private BigDecimal timeKey;

	@Column(name="TRANSACTION_AMT")
	private BigDecimal transactionAmt;

	@Column(name="TRANSACTION_CDI_DESC")
	private String transactionCdiDesc;

	@Column(name="TRANSACTION_DATE")
	private Timestamp transactionDate;

	@Column(name="TRANSACTION_DESC")
	private String transactionDesc;

	@Column(name="TRANSACTION_MECHANISM")
	private String transactionMechanism;

	@Column(name="TRANSACTION_STATUS")
	private String transactionStatus;

	@Column(name="TRIGGERING_INDICATOR_CD")
	private String triggeringIndicatorCd;

	public AcInvestigationTransaction() {
	}

	public AcInvestigationTransactionPK getId() {
		return this.id;
	}

	public void setId(AcInvestigationTransactionPK id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
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