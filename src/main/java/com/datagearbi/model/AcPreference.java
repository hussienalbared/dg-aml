package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AC_PREFERENCE database table.
 * 
 */
@Entity
@Table(name="AC_PREFERENCE")
@NamedQuery(name="AcPreference.findAll", query="SELECT a FROM AcPreference a")
public class AcPreference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pref_name")
	private String prefName;

	@Column(name="pref_type")
	private String prefType;

	@Column(name="pref_value")
	private String prefValue;

	@Column(name="pref_value_default")
	private String prefValueDefault;

	public AcPreference() {
	}

	public String getPrefName() {
		return this.prefName;
	}

	public void setPrefName(String prefName) {
		this.prefName = prefName;
	}

	public String getPrefType() {
		return this.prefType;
	}

	public void setPrefType(String prefType) {
		this.prefType = prefType;
	}

	public String getPrefValue() {
		return this.prefValue;
	}

	public void setPrefValue(String prefValue) {
		this.prefValue = prefValue;
	}

	public String getPrefValueDefault() {
		return this.prefValueDefault;
	}

	public void setPrefValueDefault(String prefValueDefault) {
		this.prefValueDefault = prefValueDefault;
	}

}