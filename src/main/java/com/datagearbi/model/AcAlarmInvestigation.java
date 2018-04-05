package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_ALARM_INVESTIGATION database table.
 * 
 */
@Entity
@Table(name="AC_ALARM_INVESTIGATION")
@NamedQuery(name="AcAlarmInvestigation.findAll", query="SELECT a FROM AcAlarmInvestigation a")
public class AcAlarmInvestigation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcAlarmInvestigationPK id;

	@Column(name="lstupdate_date")
	private Timestamp lstupdateDate;

	@Column(name="lstupdate_user_id")
	private String lstupdateUserId;

	@Column(name="version_number")
	private BigDecimal versionNumber;

	public AcAlarmInvestigation() {
	}

	public AcAlarmInvestigationPK getId() {
		return this.id;
	}

	public void setId(AcAlarmInvestigationPK id) {
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

	public BigDecimal getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(BigDecimal versionNumber) {
		this.versionNumber = versionNumber;
	}

}