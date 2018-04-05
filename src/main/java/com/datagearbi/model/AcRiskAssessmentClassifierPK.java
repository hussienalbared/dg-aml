package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AC_RISK_ASSESSMENT_CLASSIFIER database table.
 * 
 */
@Embeddable
public class AcRiskAssessmentClassifierPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="risk_assessment_id")
	private long riskAssessmentId;

	@Column(name="risk_classifier_id")
	private long riskClassifierId;

	public AcRiskAssessmentClassifierPK() {
	}
	public long getRiskAssessmentId() {
		return this.riskAssessmentId;
	}
	public void setRiskAssessmentId(long riskAssessmentId) {
		this.riskAssessmentId = riskAssessmentId;
	}
	public long getRiskClassifierId() {
		return this.riskClassifierId;
	}
	public void setRiskClassifierId(long riskClassifierId) {
		this.riskClassifierId = riskClassifierId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcRiskAssessmentClassifierPK)) {
			return false;
		}
		AcRiskAssessmentClassifierPK castOther = (AcRiskAssessmentClassifierPK)other;
		return 
			(this.riskAssessmentId == castOther.riskAssessmentId)
			&& (this.riskClassifierId == castOther.riskClassifierId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.riskAssessmentId ^ (this.riskAssessmentId >>> 32)));
		hash = hash * prime + ((int) (this.riskClassifierId ^ (this.riskClassifierId >>> 32)));
		
		return hash;
	}
}