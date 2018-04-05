package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CORE_COUNTRY_L database table.
 * 
 */
@Entity
@Table(name="CORE_COUNTRY_L")
@NamedQuery(name="CoreCountryL.findAll", query="SELECT c FROM CoreCountryL c")
public class CoreCountryL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="country_key")
	private long countryKey;

	@Column(name="country_code_2")
	private String countryCode2;

	@Column(name="country_code_3")
	private String countryCode3;

	@Column(name="country_name")
	private String countryName;

	public CoreCountryL() {
	}

	public long getCountryKey() {
		return this.countryKey;
	}

	public void setCountryKey(long countryKey) {
		this.countryKey = countryKey;
	}

	public String getCountryCode2() {
		return this.countryCode2;
	}

	public void setCountryCode2(String countryCode2) {
		this.countryCode2 = countryCode2;
	}

	public String getCountryCode3() {
		return this.countryCode3;
	}

	public void setCountryCode3(String countryCode3) {
		this.countryCode3 = countryCode3;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}