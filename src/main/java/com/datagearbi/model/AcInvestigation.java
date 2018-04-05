package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_INVESTIGATION database table.
 * 
 */
@Entity
@Table(name="AC_INVESTIGATION")
@NamedQuery(name="AcInvestigation.findAll", query="SELECT a FROM AcInvestigation a")
public class AcInvestigation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="investigation_id")
	private long investigationId;

	@Column(name="aggregate_amt")
	private BigDecimal aggregateAmt;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user_id")
	private String createUserId;

	@Column(name="employee_ind")
	private String employeeInd;

	@Column(name="first_transaction_date")
	private Timestamp firstTransactionDate;

	@Column(name="investigation_category_code")
	private String investigationCategoryCode;

	@Column(name="investigation_close_reason_code")
	private String investigationCloseReasonCode;

	@Column(name="investigation_description")
	private String investigationDescription;

	@Column(name="investigation_priority_code")
	private String investigationPriorityCode;

	@Column(name="investigation_status_code")
	private String investigationStatusCode;

	@Column(name="investigation_sub_category_code")
	private String investigationSubCategoryCode;

	@Column(name="investigation_summary")
	private String investigationSummary;

	@Column(name="investigation_type_code")
	private String investigationTypeCode;

	@Column(name="last_transaction_date")
	private Timestamp lastTransactionDate;

	@Column(name="le_contact_agency")
	private String leContactAgency;

	@Column(name="le_contact_date")
	private Timestamp leContactDate;

	@Column(name="le_contact_name")
	private String leContactName;

	@Column(name="le_contact_phone")
	private String leContactPhone;

	@Column(name="le_contact_phone_ext")
	private String leContactPhoneExt;

	@Column(name="le_contacted_ind")
	private String leContactedInd;

	@Column(name="logical_delete_ind")
	private String logicalDeleteInd;

	@Column(name="lstupdate_date")
	private Timestamp lstupdateDate;

	@Column(name="lstupdate_user_id")
	private String lstupdateUserId;

	@Column(name="modified_ind")
	private String modifiedInd;

	@Column(name="opened_ind")
	private String openedInd;

	@Column(name="owner_user_long_id")
	private String ownerUserLongId;

	@Column(name="version_number")
	private BigDecimal versionNumber;

	public AcInvestigation() {
	}

	public long getInvestigationId() {
		return this.investigationId;
	}

	public void setInvestigationId(long investigationId) {
		this.investigationId = investigationId;
	}

	public BigDecimal getAggregateAmt() {
		return this.aggregateAmt;
	}

	public void setAggregateAmt(BigDecimal aggregateAmt) {
		this.aggregateAmt = aggregateAmt;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getEmployeeInd() {
		return this.employeeInd;
	}

	public void setEmployeeInd(String employeeInd) {
		this.employeeInd = employeeInd;
	}

	public Timestamp getFirstTransactionDate() {
		return this.firstTransactionDate;
	}

	public void setFirstTransactionDate(Timestamp firstTransactionDate) {
		this.firstTransactionDate = firstTransactionDate;
	}

	public String getInvestigationCategoryCode() {
		return this.investigationCategoryCode;
	}

	public void setInvestigationCategoryCode(String investigationCategoryCode) {
		this.investigationCategoryCode = investigationCategoryCode;
	}

	public String getInvestigationCloseReasonCode() {
		return this.investigationCloseReasonCode;
	}

	public void setInvestigationCloseReasonCode(String investigationCloseReasonCode) {
		this.investigationCloseReasonCode = investigationCloseReasonCode;
	}

	public String getInvestigationDescription() {
		return this.investigationDescription;
	}

	public void setInvestigationDescription(String investigationDescription) {
		this.investigationDescription = investigationDescription;
	}

	public String getInvestigationPriorityCode() {
		return this.investigationPriorityCode;
	}

	public void setInvestigationPriorityCode(String investigationPriorityCode) {
		this.investigationPriorityCode = investigationPriorityCode;
	}

	public String getInvestigationStatusCode() {
		return this.investigationStatusCode;
	}

	public void setInvestigationStatusCode(String investigationStatusCode) {
		this.investigationStatusCode = investigationStatusCode;
	}

	public String getInvestigationSubCategoryCode() {
		return this.investigationSubCategoryCode;
	}

	public void setInvestigationSubCategoryCode(String investigationSubCategoryCode) {
		this.investigationSubCategoryCode = investigationSubCategoryCode;
	}

	public String getInvestigationSummary() {
		return this.investigationSummary;
	}

	public void setInvestigationSummary(String investigationSummary) {
		this.investigationSummary = investigationSummary;
	}

	public String getInvestigationTypeCode() {
		return this.investigationTypeCode;
	}

	public void setInvestigationTypeCode(String investigationTypeCode) {
		this.investigationTypeCode = investigationTypeCode;
	}

	public Timestamp getLastTransactionDate() {
		return this.lastTransactionDate;
	}

	public void setLastTransactionDate(Timestamp lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}

	public String getLeContactAgency() {
		return this.leContactAgency;
	}

	public void setLeContactAgency(String leContactAgency) {
		this.leContactAgency = leContactAgency;
	}

	public Timestamp getLeContactDate() {
		return this.leContactDate;
	}

	public void setLeContactDate(Timestamp leContactDate) {
		this.leContactDate = leContactDate;
	}

	public String getLeContactName() {
		return this.leContactName;
	}

	public void setLeContactName(String leContactName) {
		this.leContactName = leContactName;
	}

	public String getLeContactPhone() {
		return this.leContactPhone;
	}

	public void setLeContactPhone(String leContactPhone) {
		this.leContactPhone = leContactPhone;
	}

	public String getLeContactPhoneExt() {
		return this.leContactPhoneExt;
	}

	public void setLeContactPhoneExt(String leContactPhoneExt) {
		this.leContactPhoneExt = leContactPhoneExt;
	}

	public String getLeContactedInd() {
		return this.leContactedInd;
	}

	public void setLeContactedInd(String leContactedInd) {
		this.leContactedInd = leContactedInd;
	}

	public String getLogicalDeleteInd() {
		return this.logicalDeleteInd;
	}

	public void setLogicalDeleteInd(String logicalDeleteInd) {
		this.logicalDeleteInd = logicalDeleteInd;
	}

	public Timestamp getLstupdateDate() {
		return this.lstupdateDate;
	}

	public void setLstupdateDate(Timestamp lstupdateDate) {
		this.lstupdateDate = lstupdateDate;
	}

	public String getLstupdateUserId() {
		return this.lstupdateUserId;
	}

	public void setLstupdateUserId(String lstupdateUserId) {
		this.lstupdateUserId = lstupdateUserId;
	}

	public String getModifiedInd() {
		return this.modifiedInd;
	}

	public void setModifiedInd(String modifiedInd) {
		this.modifiedInd = modifiedInd;
	}

	public String getOpenedInd() {
		return this.openedInd;
	}

	public void setOpenedInd(String openedInd) {
		this.openedInd = openedInd;
	}

	public String getOwnerUserLongId() {
		return this.ownerUserLongId;
	}

	public void setOwnerUserLongId(String ownerUserLongId) {
		this.ownerUserLongId = ownerUserLongId;
	}

	public BigDecimal getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(BigDecimal versionNumber) {
		this.versionNumber = versionNumber;
	}

}