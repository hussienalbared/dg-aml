package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_RISK_ASSESSMENT database table.
 * 
 */
@Entity
@Table(name="AC_RISK_ASSESSMENT")
@NamedQuery(name="AcRiskAssessment.findAll", query="SELECT a FROM AcRiskAssessment a")
public class AcRiskAssessment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="risk_assessment_id")
	private long riskAssessmentId;

	@Column(name="assessment_category_cd")
	private String assessmentCategoryCd;

	@Column(name="assessment_subcategory_cd")
	private String assessmentSubcategoryCd;

	@Column(name="assessment_type_cd")
	private String assessmentTypeCd;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user_id")
	private String createUserId;

	@Column(name="employee_ind")
	private String employeeInd;

	@Column(name="logical_delete_ind")
	private String logicalDeleteInd;

	@Column(name="owner_user_long_id")
	private String ownerUserLongId;

	@Column(name="party_key")
	private BigDecimal partyKey;

	@Column(name="party_name")
	private String partyName;

	@Column(name="party_number")
	private String partyNumber;

	@Column(name="proposed_risk_classification")
	private BigDecimal proposedRiskClassification;

	@Column(name="risk_assessment_duration")
	private BigDecimal riskAssessmentDuration;

	@Column(name="risk_assessment_status_code")
	private String riskAssessmentStatusCode;

	@Column(name="risk_classification")
	private BigDecimal riskClassification;

	@Column(name="starting_month_key")
	private BigDecimal startingMonthKey;

	@Column(name="version_number")
	private BigDecimal versionNumber;

	public AcRiskAssessment() {
	}

	public long getRiskAssessmentId() {
		return this.riskAssessmentId;
	}

	public void setRiskAssessmentId(long riskAssessmentId) {
		this.riskAssessmentId = riskAssessmentId;
	}

	public String getAssessmentCategoryCd() {
		return this.assessmentCategoryCd;
	}

	public void setAssessmentCategoryCd(String assessmentCategoryCd) {
		this.assessmentCategoryCd = assessmentCategoryCd;
	}

	public String getAssessmentSubcategoryCd() {
		return this.assessmentSubcategoryCd;
	}

	public void setAssessmentSubcategoryCd(String assessmentSubcategoryCd) {
		this.assessmentSubcategoryCd = assessmentSubcategoryCd;
	}

	public String getAssessmentTypeCd() {
		return this.assessmentTypeCd;
	}

	public void setAssessmentTypeCd(String assessmentTypeCd) {
		this.assessmentTypeCd = assessmentTypeCd;
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

	public String getLogicalDeleteInd() {
		return this.logicalDeleteInd;
	}

	public void setLogicalDeleteInd(String logicalDeleteInd) {
		this.logicalDeleteInd = logicalDeleteInd;
	}

	public String getOwnerUserLongId() {
		return this.ownerUserLongId;
	}

	public void setOwnerUserLongId(String ownerUserLongId) {
		this.ownerUserLongId = ownerUserLongId;
	}

	public BigDecimal getPartyKey() {
		return this.partyKey;
	}

	public void setPartyKey(BigDecimal partyKey) {
		this.partyKey = partyKey;
	}

	public String getPartyName() {
		return this.partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartyNumber() {
		return this.partyNumber;
	}

	public void setPartyNumber(String partyNumber) {
		this.partyNumber = partyNumber;
	}

	public BigDecimal getProposedRiskClassification() {
		return this.proposedRiskClassification;
	}

	public void setProposedRiskClassification(BigDecimal proposedRiskClassification) {
		this.proposedRiskClassification = proposedRiskClassification;
	}

	public BigDecimal getRiskAssessmentDuration() {
		return this.riskAssessmentDuration;
	}

	public void setRiskAssessmentDuration(BigDecimal riskAssessmentDuration) {
		this.riskAssessmentDuration = riskAssessmentDuration;
	}

	public String getRiskAssessmentStatusCode() {
		return this.riskAssessmentStatusCode;
	}

	public void setRiskAssessmentStatusCode(String riskAssessmentStatusCode) {
		this.riskAssessmentStatusCode = riskAssessmentStatusCode;
	}

	public BigDecimal getRiskClassification() {
		return this.riskClassification;
	}

	public void setRiskClassification(BigDecimal riskClassification) {
		this.riskClassification = riskClassification;
	}

	public BigDecimal getStartingMonthKey() {
		return this.startingMonthKey;
	}

	public void setStartingMonthKey(BigDecimal startingMonthKey) {
		this.startingMonthKey = startingMonthKey;
	}

	public BigDecimal getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(BigDecimal versionNumber) {
		this.versionNumber = versionNumber;
	}

}