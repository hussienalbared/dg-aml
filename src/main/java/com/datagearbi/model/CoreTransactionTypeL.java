package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CORE_TRANSACTION_TYPE_L database table.
 * 
 */
@Entity
@Table(name="CORE_TRANSACTION_TYPE_L")
@NamedQuery(name="CoreTransactionTypeL.findAll", query="SELECT c FROM CoreTransactionTypeL c")
public class CoreTransactionTypeL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_type_key")
	private long transactionTypeKey;

	@Column(name="funds_securities_code")
	private String fundsSecuritiesCode;

	@Column(name="funds_securities_desc")
	private String fundsSecuritiesDesc;

	@Column(name="mechanism_desc")
	private String mechanismDesc;

	@Column(name="primary_medium_desc")
	private String primaryMediumDesc;

	@Column(name="secondary_medium_desc")
	private String secondaryMediumDesc;

	@Column(name="tertiary_medium_desc")
	private String tertiaryMediumDesc;

	@Column(name="transaction_cdi_code")
	private String transactionCdiCode;

	@Column(name="transaction_cdi_desc")
	private String transactionCdiDesc;

	public CoreTransactionTypeL() {
	}

	public long getTransactionTypeKey() {
		return this.transactionTypeKey;
	}

	public void setTransactionTypeKey(long transactionTypeKey) {
		this.transactionTypeKey = transactionTypeKey;
	}

	public String getFundsSecuritiesCode() {
		return this.fundsSecuritiesCode;
	}

	public void setFundsSecuritiesCode(String fundsSecuritiesCode) {
		this.fundsSecuritiesCode = fundsSecuritiesCode;
	}

	public String getFundsSecuritiesDesc() {
		return this.fundsSecuritiesDesc;
	}

	public void setFundsSecuritiesDesc(String fundsSecuritiesDesc) {
		this.fundsSecuritiesDesc = fundsSecuritiesDesc;
	}

	public String getMechanismDesc() {
		return this.mechanismDesc;
	}

	public void setMechanismDesc(String mechanismDesc) {
		this.mechanismDesc = mechanismDesc;
	}

	public String getPrimaryMediumDesc() {
		return this.primaryMediumDesc;
	}

	public void setPrimaryMediumDesc(String primaryMediumDesc) {
		this.primaryMediumDesc = primaryMediumDesc;
	}

	public String getSecondaryMediumDesc() {
		return this.secondaryMediumDesc;
	}

	public void setSecondaryMediumDesc(String secondaryMediumDesc) {
		this.secondaryMediumDesc = secondaryMediumDesc;
	}

	public String getTertiaryMediumDesc() {
		return this.tertiaryMediumDesc;
	}

	public void setTertiaryMediumDesc(String tertiaryMediumDesc) {
		this.tertiaryMediumDesc = tertiaryMediumDesc;
	}

	public String getTransactionCdiCode() {
		return this.transactionCdiCode;
	}

	public void setTransactionCdiCode(String transactionCdiCode) {
		this.transactionCdiCode = transactionCdiCode;
	}

	public String getTransactionCdiDesc() {
		return this.transactionCdiDesc;
	}

	public void setTransactionCdiDesc(String transactionCdiDesc) {
		this.transactionCdiDesc = transactionCdiDesc;
	}

}