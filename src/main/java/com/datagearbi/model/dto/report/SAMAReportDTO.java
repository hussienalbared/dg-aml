package com.datagearbi.model.dto.report;

import java.math.BigDecimal;
import java.util.Date;

public class SAMAReportDTO {

	private String reportingEntityName;
	private String reportingEntityType;
	private String reportingEntityCity;
	private String reportingEntityBranch;
	private String reportingEntityPhone;
	private int depositType;
	private int withdrawType;
	private int transferType;
	private Date creationDate;
	private String nationality;
	private String currencyName;
	private BigDecimal amount;
	private String accountNumber;
	private String accountBranch;
	private String customerId;
	private String customerName;
	
	
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountBranch() {
		return accountBranch;
	}
	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
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
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getTransferType() {
		return transferType;
	}
	public void setTransferType(int transferType) {
		this.transferType = transferType;
	}
	public String getReportingEntityName() {
		return reportingEntityName;
	}
	public void setReportingEntityName(String reportingEntityName) {
		this.reportingEntityName = reportingEntityName;
	}
	public String getReportingEntityType() {
		return reportingEntityType;
	}
	public void setReportingEntityType(String reportingEntityType) {
		this.reportingEntityType = reportingEntityType;
	}
	public String getReportingEntityCity() {
		return reportingEntityCity;
	}
	public void setReportingEntityCity(String reportingEntityCity) {
		this.reportingEntityCity = reportingEntityCity;
	}
	public String getReportingEntityBranch() {
		return reportingEntityBranch;
	}
	public void setReportingEntityBranch(String reportingEntityBranch) {
		this.reportingEntityBranch = reportingEntityBranch;
	}
	public String getReportingEntityPhone() {
		return reportingEntityPhone;
	}
	public void setReportingEntityPhone(String reportingEntityPhone) {
		this.reportingEntityPhone = reportingEntityPhone;
	}
	public int getDepositType() {
		return depositType;
	}
	public void setDepositType(int depositType) {
		this.depositType = depositType;
	}
	public int getWithdrawType() {
		return withdrawType;
	}
	public void setWithdrawType(int withdrawType) {
		this.withdrawType = withdrawType;
	}
//	@Override
//	public String toString() {
//		return "SAMAReportDTO [reportingEntityName=" + reportingEntityName + ", reportingEntityType="
//				+ reportingEntityType + ", reportingEntityCity=" + reportingEntityCity + ", reportingEntityBranch="
//				+ reportingEntityBranch + ", reportingEntityPhone=" + reportingEntityPhone + ", depositType="
//				+ depositType + ", withdrawType=" + withdrawType + "]";
//	}
	
}
