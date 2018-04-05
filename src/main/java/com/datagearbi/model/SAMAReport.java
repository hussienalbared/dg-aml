package com.datagearbi.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SAMA_report_V")
public class SAMAReport {
	
	@Id
	@Column(name ="")
	private Integer id;

	@Column(name ="Primary_medium_desc")
	private String primaryMediumDescription;
	
	@Column(name ="BRTYDESC")
	private String withdrawType;
	
	@Column(name ="Secondery_medium_desc")
	private String secondaryMediumDescription;

	@Column(name ="Create_dt")
	private Date creationDate;
	
	@Column(name ="CFCURRAMT")
	private BigDecimal amount;
	
	@Column(name ="currency_name")
	private String currencyName;
	
	@Column(name ="ACCTNO")
	private String accountNumber;
	
	@Column(name ="ACCTBNM")
	private String branchName;

	@Column(name ="PID")
	private String customerId;
	
	@Column(name ="PNM")
	private String customerName;

	@Column(name ="PCZCONM")
	private String nationality;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrimaryMediumDescription() {
		return primaryMediumDescription;
	}

	public void setPrimaryMediumDescription(String primaryMediumDescription) {
		this.primaryMediumDescription = primaryMediumDescription;
	}

	public String getWithdrawType() {
		return withdrawType;
	}

	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
	}

	public String getSecondaryMediumDescription() {
		return secondaryMediumDescription;
	}

	public void setSecondaryMediumDescription(String secondaryMediumDescription) {
		this.secondaryMediumDescription = secondaryMediumDescription;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
}
