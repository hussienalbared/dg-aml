package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_RISK_CLASSIFIER database table.
 * 
 */
@Entity
@Table(name="AC_RISK_CLASSIFIER")
@NamedQuery(name="AcRiskClassifier.findAll", query="SELECT a FROM AcRiskClassifier a")
public class AcRiskClassifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="risk_classifier_id")
	private long riskClassifierId;

	@Column(name="active_ind")
	private String activeInd;

	@Column(name="classifier_fact_column")
	private String classifierFactColumn;

	@Column(name="classifier_threshold")
	private BigDecimal classifierThreshold;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user_id")
	private String createUserId;

	@Column(name="current_ind")
	private String currentInd;

	@Column(name="end_date")
	private Timestamp endDate;

	@Column(name="end_user_id")
	private String endUserId;

	@Column(name="list_id")
	private BigDecimal listId;

	@Column(name="locked_ind")
	private String lockedInd;

	@Column(name="logical_delete_ind")
	private String logicalDeleteInd;

	@Column(name="operator_desc")
	private String operatorDesc;

	@Column(name="risk_classifier_category_id")
	private BigDecimal riskClassifierCategoryId;

	@Column(name="risk_classifier_desc")
	private String riskClassifierDesc;

	@Column(name="risk_classifier_name")
	private String riskClassifierName;

	@Column(name="risk_classifier_short_desc")
	private String riskClassifierShortDesc;

	@Column(name="risk_classifier_type_code")
	private String riskClassifierTypeCode;

	@Column(name="source_column")
	private String sourceColumn;

	@Column(name="source_table")
	private String sourceTable;

	@Column(name="source_value")
	private String sourceValue;

	@Column(name="version_number")
	private BigDecimal versionNumber;

	private BigDecimal weight;

	public AcRiskClassifier() {
	}

	public long getRiskClassifierId() {
		return this.riskClassifierId;
	}

	public void setRiskClassifierId(long riskClassifierId) {
		this.riskClassifierId = riskClassifierId;
	}

	public String getActiveInd() {
		return this.activeInd;
	}

	public void setActiveInd(String activeInd) {
		this.activeInd = activeInd;
	}

	public String getClassifierFactColumn() {
		return this.classifierFactColumn;
	}

	public void setClassifierFactColumn(String classifierFactColumn) {
		this.classifierFactColumn = classifierFactColumn;
	}

	public BigDecimal getClassifierThreshold() {
		return this.classifierThreshold;
	}

	public void setClassifierThreshold(BigDecimal classifierThreshold) {
		this.classifierThreshold = classifierThreshold;
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

	public String getCurrentInd() {
		return this.currentInd;
	}

	public void setCurrentInd(String currentInd) {
		this.currentInd = currentInd;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
	}

	public BigDecimal getListId() {
		return this.listId;
	}

	public void setListId(BigDecimal listId) {
		this.listId = listId;
	}

	public String getLockedInd() {
		return this.lockedInd;
	}

	public void setLockedInd(String lockedInd) {
		this.lockedInd = lockedInd;
	}

	public String getLogicalDeleteInd() {
		return this.logicalDeleteInd;
	}

	public void setLogicalDeleteInd(String logicalDeleteInd) {
		this.logicalDeleteInd = logicalDeleteInd;
	}

	public String getOperatorDesc() {
		return this.operatorDesc;
	}

	public void setOperatorDesc(String operatorDesc) {
		this.operatorDesc = operatorDesc;
	}

	public BigDecimal getRiskClassifierCategoryId() {
		return this.riskClassifierCategoryId;
	}

	public void setRiskClassifierCategoryId(BigDecimal riskClassifierCategoryId) {
		this.riskClassifierCategoryId = riskClassifierCategoryId;
	}

	public String getRiskClassifierDesc() {
		return this.riskClassifierDesc;
	}

	public void setRiskClassifierDesc(String riskClassifierDesc) {
		this.riskClassifierDesc = riskClassifierDesc;
	}

	public String getRiskClassifierName() {
		return this.riskClassifierName;
	}

	public void setRiskClassifierName(String riskClassifierName) {
		this.riskClassifierName = riskClassifierName;
	}

	public String getRiskClassifierShortDesc() {
		return this.riskClassifierShortDesc;
	}

	public void setRiskClassifierShortDesc(String riskClassifierShortDesc) {
		this.riskClassifierShortDesc = riskClassifierShortDesc;
	}

	public String getRiskClassifierTypeCode() {
		return this.riskClassifierTypeCode;
	}

	public void setRiskClassifierTypeCode(String riskClassifierTypeCode) {
		this.riskClassifierTypeCode = riskClassifierTypeCode;
	}

	public String getSourceColumn() {
		return this.sourceColumn;
	}

	public void setSourceColumn(String sourceColumn) {
		this.sourceColumn = sourceColumn;
	}

	public String getSourceTable() {
		return this.sourceTable;
	}

	public void setSourceTable(String sourceTable) {
		this.sourceTable = sourceTable;
	}

	public String getSourceValue() {
		return this.sourceValue;
	}

	public void setSourceValue(String sourceValue) {
		this.sourceValue = sourceValue;
	}

	public BigDecimal getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(BigDecimal versionNumber) {
		this.versionNumber = versionNumber;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

}