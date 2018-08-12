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
	private BigDecimal amountNumber;
	private String accountNumber;
	private String accountBranch;
	private String customerId;
	private String customerName;
	private String bank;
	private String reportingPersonName;
	private String reportingPersonPhone;
	private String reportingPersonAddress;
	private String writtenAmount;
	private int transactionKey;
	private String Branch_Name;
	private String Branch_Type_Desc;
	private int Cust_Key;
	private String Cust_No;
	private String primMedDesc;

	public String getBranch_Name() {
		return Branch_Name;
	}

	public void setBranch_Name(String branch_Name) {
		Branch_Name = branch_Name;
	}

	public String getBranch_Type_Desc() {
		return Branch_Type_Desc;
	}

	public void setBranch_Type_Desc(String branch_Type_Desc) {
		Branch_Type_Desc = branch_Type_Desc;
	}

	public int getCust_Key() {
		return Cust_Key;
	}

	public void setCust_Key(int cust_Key) {
		Cust_Key = cust_Key;
	}

	public String getCust_No() {
		return Cust_No;
	}

	public void setCust_No(String cust_No) {
		Cust_No = cust_No;
	}

	public int getTransactionKey() {
		return transactionKey;
	}

	public void setTransactionKey(int transactionKey) {
		this.transactionKey = transactionKey;
	}

	public String getReportingPersonName() {
		return reportingPersonName;
	}

	public void setReportingPersonName(String reportingPersonName) {
		this.reportingPersonName = reportingPersonName;
	}

	public String getReportingPersonPhone() {
		return reportingPersonPhone;
	}

	public void setReportingPersonPhone(String reportingPersonPhone) {
		this.reportingPersonPhone = reportingPersonPhone;
	}

	public String getReportingPersonAddress() {
		return reportingPersonAddress;
	}

	public void setReportingPersonAddress(String reportingPersonAddress) {
		this.reportingPersonAddress = reportingPersonAddress;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public BigDecimal getAmountNumber() {
		return amountNumber;
	}

	public void setAmountNumber(BigDecimal amountNumber) {
		this.amountNumber = amountNumber;
	}

	public String getWrittenAmount() {
		return writtenAmount;
	}

	public void setWrittenAmount(String writtenAmount) {
		this.writtenAmount = writtenAmount;
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

	public String getPrimMedDesc() {
		return primMedDesc;
	}

	public void setPrimMedDesc(String primMedDesc) {
		this.primMedDesc = primMedDesc;
	}

	// @Override
	// public String toString() {
	// return "SAMAReportDTO [reportingEntityName=" + reportingEntityName + ",
	// reportingEntityType="
	// + reportingEntityType + ", reportingEntityCity=" + reportingEntityCity + ",
	// reportingEntityBranch="
	// + reportingEntityBranch + ", reportingEntityPhone=" + reportingEntityPhone +
	// ", depositType="
	// + depositType + ", withdrawType=" + withdrawType + "]";
	// }

}
