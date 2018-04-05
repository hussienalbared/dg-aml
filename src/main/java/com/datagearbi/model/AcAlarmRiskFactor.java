package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AC_ALARM_RISK_FACTOR database table.
 * 
 */
@Entity
@Table(name="AC_ALARM_RISK_FACTOR")
@NamedQuery(name="AcAlarmRiskFactor.findAll", query="SELECT a FROM AcAlarmRiskFactor a")
public class AcAlarmRiskFactor implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcAlarmRiskFactorPK id;

	@Column(name="actual_values_text")
	private String actualValuesText;

	@Column(name="obj_level_code")
	private String objLevelCode;

	public AcAlarmRiskFactor() {
	}

	public AcAlarmRiskFactorPK getId() {
		return this.id;
	}

	public void setId(AcAlarmRiskFactorPK id) {
		this.id = id;
	}

	public String getActualValuesText() {
		return this.actualValuesText;
	}

	public void setActualValuesText(String actualValuesText) {
		this.actualValuesText = actualValuesText;
	}

	public String getObjLevelCode() {
		return this.objLevelCode;
	}

	public void setObjLevelCode(String objLevelCode) {
		this.objLevelCode = objLevelCode;
	}

}