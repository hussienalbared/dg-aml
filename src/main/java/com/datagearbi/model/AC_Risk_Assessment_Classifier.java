package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AC_Risk_Assessment_Classifier database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Risk_Assessment_Classifier.findAll", query="SELECT a FROM AC_Risk_Assessment_Classifier a")
public class AC_Risk_Assessment_Classifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AC_Risk_Assessment_ClassifierPK id;

	public AC_Risk_Assessment_Classifier() {
	}

	public AC_Risk_Assessment_ClassifierPK getId() {
		return this.id;
	}

	public void setId(AC_Risk_Assessment_ClassifierPK id) {
		this.id = id;
	}

}