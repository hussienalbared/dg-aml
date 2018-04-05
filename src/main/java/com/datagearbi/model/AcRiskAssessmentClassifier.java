package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AC_RISK_ASSESSMENT_CLASSIFIER database table.
 * 
 */
@Entity
@Table(name="AC_RISK_ASSESSMENT_CLASSIFIER")
@NamedQuery(name="AcRiskAssessmentClassifier.findAll", query="SELECT a FROM AcRiskAssessmentClassifier a")
public class AcRiskAssessmentClassifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcRiskAssessmentClassifierPK id;

	public AcRiskAssessmentClassifier() {
	}

	public AcRiskAssessmentClassifierPK getId() {
		return this.id;
	}

	public void setId(AcRiskAssessmentClassifierPK id) {
		this.id = id;
	}

}