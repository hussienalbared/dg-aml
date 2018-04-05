package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CORE_CURRENCY_L database table.
 * 
 */
@Entity
@Table(name="CORE_CURRENCY_L")
@NamedQuery(name="CoreCurrencyL.findAll", query="SELECT c FROM CoreCurrencyL c")
public class CoreCurrencyL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="currency_key")
	private long currencyKey;

	@Column(name="currency_code")
	private String currencyCode;

	@Column(name="currency_name")
	private String currencyName;

	public CoreCurrencyL() {
	}

	public long getCurrencyKey() {
		return this.currencyKey;
	}

	public void setCurrencyKey(long currencyKey) {
		this.currencyKey = currencyKey;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyName() {
		return this.currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

}