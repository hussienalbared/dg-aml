package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the AC_UI_Availability database table.
 * 
 */
@Embeddable
@NamedQuery(name="AC_UI_Availability.findAll", query="SELECT a FROM AC_UI_Availability a")
public class AC_UI_Availability implements Serializable {
	private static final long serialVersionUID = 1L;

	private String UI_Available_Ind;

	public AC_UI_Availability() {
	}

	public String getUI_Available_Ind() {
		return this.UI_Available_Ind;
	}

	public void setUI_Available_Ind(String UI_Available_Ind) {
		this.UI_Available_Ind = UI_Available_Ind;
	}

}