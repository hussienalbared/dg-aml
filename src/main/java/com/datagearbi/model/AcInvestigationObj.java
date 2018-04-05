package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_INVESTIGATION_OBJ database table.
 * 
 */
@Entity
@Table(name="AC_INVESTIGATION_OBJ")
@NamedQuery(name="AcInvestigationObj.findAll", query="SELECT a FROM AcInvestigationObj a")
public class AcInvestigationObj implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcInvestigationObjPK id;

	@Column(name="lstupdate_date")
	private Timestamp lstupdateDate;

	@Column(name="lstupdate_user_id")
	private String lstupdateUserId;

	@Column(name="obj_name")
	private String objName;

	@Column(name="obj_number")
	private String objNumber;

	@Column(name="primary_suspect_ind")
	private String primarySuspectInd;

	@Column(name="relation_description")
	private String relationDescription;

	@Column(name="rr_ind")
	private String rrInd;

	@Column(name="version_number")
	private BigDecimal versionNumber;

	public AcInvestigationObj() {
	}

	public AcInvestigationObjPK getId() {
		return this.id;
	}

	public void setId(AcInvestigationObjPK id) {
		this.id = id;
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

	public String getPrimarySuspectInd() {
		return this.primarySuspectInd;
	}

	public void setPrimarySuspectInd(String primarySuspectInd) {
		this.primarySuspectInd = primarySuspectInd;
	}

	public String getRelationDescription() {
		return this.relationDescription;
	}

	public void setRelationDescription(String relationDescription) {
		this.relationDescription = relationDescription;
	}

	public String getRrInd() {
		return this.rrInd;
	}

	public void setRrInd(String rrInd) {
		this.rrInd = rrInd;
	}

	public BigDecimal getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(BigDecimal versionNumber) {
		this.versionNumber = versionNumber;
	}

}