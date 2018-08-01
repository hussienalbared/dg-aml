package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DEV_Report_Properties database table.
 * 
 */
@Entity
@Table(name="DEV_Report_Properties")
@NamedQuery(name="DEV_Report_Property.findAll", query="SELECT d FROM DEV_Report_Property d")
public class DEV_Report_Property implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name="description")
	private String description;
	@Id
	@Column(name="DEV_Report_Properties_ID")
	private int DEV_Report_Properties_ID;

	@Column(name="property_key")
	private String propertyKey;

	@Column(name="property_value")
	private String propertyValue;

	public DEV_Report_Property() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDEV_Report_Properties_ID() {
		return this.DEV_Report_Properties_ID;
	}

	public void setDEV_Report_Properties_ID(int DEV_Report_Properties_ID) {
		this.DEV_Report_Properties_ID = DEV_Report_Properties_ID;
	}

	public String getPropertyKey() {
		return this.propertyKey;
	}

	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
	}

	public String getPropertyValue() {
		return this.propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

}