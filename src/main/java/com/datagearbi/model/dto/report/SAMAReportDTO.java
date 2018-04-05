package com.datagearbi.model.dto.report;

public class SAMAReportDTO {

	private String reportingEntityName;
	private String reportingEntityType;
	private String reportingEntityCity;
	private String reportingEntityBranch;
	private String reportingEntityPhone;
	private String depositType;
	private String withdrawType;
	
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
	public String getDepositType() {
		return depositType;
	}
	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}
	public String getWithdrawType() {
		return withdrawType;
	}
	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
	}
	@Override
	public String toString() {
		return "SAMAReportDTO [reportingEntityName=" + reportingEntityName + ", reportingEntityType="
				+ reportingEntityType + ", reportingEntityCity=" + reportingEntityCity + ", reportingEntityBranch="
				+ reportingEntityBranch + ", reportingEntityPhone=" + reportingEntityPhone + ", depositType="
				+ depositType + ", withdrawType=" + withdrawType + "]";
	}
	
}
