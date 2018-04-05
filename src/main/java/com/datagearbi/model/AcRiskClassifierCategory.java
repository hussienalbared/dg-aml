package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_RISK_CLASSIFIER_CATEGORY database table.
 * 
 */
@Entity
@Table(name="AC_RISK_CLASSIFIER_CATEGORY")
@NamedQuery(name="AcRiskClassifierCategory.findAll", query="SELECT a FROM AcRiskClassifierCategory a")
public class AcRiskClassifierCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="risk_classifier_category_id")
	private long riskClassifierCategoryId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user_id")
	private String createUserId;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user_id")
	private String deleteUserId;

	@Column(name="logical_delete_ind")
	private String logicalDeleteInd;

	@Column(name="risk_classifier_category_desc")
	private String riskClassifierCategoryDesc;

	@Column(name="risk_classifier_category_name")
	private String riskClassifierCategoryName;

	public AcRiskClassifierCategory() {
	}

	public long getRiskClassifierCategoryId() {
		return this.riskClassifierCategoryId;
	}

	public void setRiskClassifierCategoryId(long riskClassifierCategoryId) {
		this.riskClassifierCategoryId = riskClassifierCategoryId;
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

	public Timestamp getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(Timestamp deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getDeleteUserId() {
		return this.deleteUserId;
	}

	public void setDeleteUserId(String deleteUserId) {
		this.deleteUserId = deleteUserId;
	}

	public String getLogicalDeleteInd() {
		return this.logicalDeleteInd;
	}

	public void setLogicalDeleteInd(String logicalDeleteInd) {
		this.logicalDeleteInd = logicalDeleteInd;
	}

	public String getRiskClassifierCategoryDesc() {
		return this.riskClassifierCategoryDesc;
	}

	public void setRiskClassifierCategoryDesc(String riskClassifierCategoryDesc) {
		this.riskClassifierCategoryDesc = riskClassifierCategoryDesc;
	}

	public String getRiskClassifierCategoryName() {
		return this.riskClassifierCategoryName;
	}

	public void setRiskClassifierCategoryName(String riskClassifierCategoryName) {
		this.riskClassifierCategoryName = riskClassifierCategoryName;
	}

}