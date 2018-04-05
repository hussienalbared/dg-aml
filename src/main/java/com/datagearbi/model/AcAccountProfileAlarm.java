package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the AC_ACCOUNT_PROFILE_ALARM database table.
 * 
 */
@Entity
@Table(name="AC_ACCOUNT_PROFILE_ALARM")
@NamedQuery(name="AcAccountProfileAlarm.findAll", query="SELECT a FROM AcAccountProfileAlarm a")
public class AcAccountProfileAlarm implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcAccountProfileAlarmPK id;

	@Column(name="account_value_amount")
	private BigDecimal accountValueAmount;

	@Column(name="average_daily_balance_amount")
	private BigDecimal averageDailyBalanceAmount;

	@Column(name="avg_account_value_amount")
	private BigDecimal avgAccountValueAmount;

	@Column(name="beginning_balance_amount")
	private BigDecimal beginningBalanceAmount;

	@Column(name="cash_transactions_count")
	private BigDecimal cashTransactionsCount;

	@Column(name="cust_initiated_trans_count")
	private BigDecimal custInitiatedTransCount;

	@Column(name="deposits_count")
	private BigDecimal depositsCount;

	@Column(name="ending_cash_balance_amount")
	private BigDecimal endingCashBalanceAmount;

	@Column(name="largest_credit_amount")
	private BigDecimal largestCreditAmount;

	@Column(name="largest_debit_amount")
	private BigDecimal largestDebitAmount;

	@Column(name="max_account_value_amount")
	private BigDecimal maxAccountValueAmount;

	@Column(name="min_account_value_amount")
	private BigDecimal minAccountValueAmount;

	@Column(name="total_cash_credits_amount")
	private BigDecimal totalCashCreditsAmount;

	@Column(name="total_cash_debits_amount")
	private BigDecimal totalCashDebitsAmount;

	@Column(name="total_credits_amount")
	private BigDecimal totalCreditsAmount;

	@Column(name="total_debits_amount")
	private BigDecimal totalDebitsAmount;

	@Column(name="total_transactions_amount")
	private BigDecimal totalTransactionsAmount;

	@Column(name="total_wire_credits_amount")
	private BigDecimal totalWireCreditsAmount;

	@Column(name="total_wire_debits_amount")
	private BigDecimal totalWireDebitsAmount;

	@Column(name="transactions_count")
	private BigDecimal transactionsCount;

	@Column(name="wires_count")
	private BigDecimal wiresCount;

	@Column(name="withdrawals_count")
	private BigDecimal withdrawalsCount;

	public AcAccountProfileAlarm() {
	}

	public AcAccountProfileAlarmPK getId() {
		return this.id;
	}

	public void setId(AcAccountProfileAlarmPK id) {
		this.id = id;
	}

	public BigDecimal getAccountValueAmount() {
		return this.accountValueAmount;
	}

	public void setAccountValueAmount(BigDecimal accountValueAmount) {
		this.accountValueAmount = accountValueAmount;
	}

	public BigDecimal getAverageDailyBalanceAmount() {
		return this.averageDailyBalanceAmount;
	}

	public void setAverageDailyBalanceAmount(BigDecimal averageDailyBalanceAmount) {
		this.averageDailyBalanceAmount = averageDailyBalanceAmount;
	}

	public BigDecimal getAvgAccountValueAmount() {
		return this.avgAccountValueAmount;
	}

	public void setAvgAccountValueAmount(BigDecimal avgAccountValueAmount) {
		this.avgAccountValueAmount = avgAccountValueAmount;
	}

	public BigDecimal getBeginningBalanceAmount() {
		return this.beginningBalanceAmount;
	}

	public void setBeginningBalanceAmount(BigDecimal beginningBalanceAmount) {
		this.beginningBalanceAmount = beginningBalanceAmount;
	}

	public BigDecimal getCashTransactionsCount() {
		return this.cashTransactionsCount;
	}

	public void setCashTransactionsCount(BigDecimal cashTransactionsCount) {
		this.cashTransactionsCount = cashTransactionsCount;
	}

	public BigDecimal getCustInitiatedTransCount() {
		return this.custInitiatedTransCount;
	}

	public void setCustInitiatedTransCount(BigDecimal custInitiatedTransCount) {
		this.custInitiatedTransCount = custInitiatedTransCount;
	}

	public BigDecimal getDepositsCount() {
		return this.depositsCount;
	}

	public void setDepositsCount(BigDecimal depositsCount) {
		this.depositsCount = depositsCount;
	}

	public BigDecimal getEndingCashBalanceAmount() {
		return this.endingCashBalanceAmount;
	}

	public void setEndingCashBalanceAmount(BigDecimal endingCashBalanceAmount) {
		this.endingCashBalanceAmount = endingCashBalanceAmount;
	}

	public BigDecimal getLargestCreditAmount() {
		return this.largestCreditAmount;
	}

	public void setLargestCreditAmount(BigDecimal largestCreditAmount) {
		this.largestCreditAmount = largestCreditAmount;
	}

	public BigDecimal getLargestDebitAmount() {
		return this.largestDebitAmount;
	}

	public void setLargestDebitAmount(BigDecimal largestDebitAmount) {
		this.largestDebitAmount = largestDebitAmount;
	}

	public BigDecimal getMaxAccountValueAmount() {
		return this.maxAccountValueAmount;
	}

	public void setMaxAccountValueAmount(BigDecimal maxAccountValueAmount) {
		this.maxAccountValueAmount = maxAccountValueAmount;
	}

	public BigDecimal getMinAccountValueAmount() {
		return this.minAccountValueAmount;
	}

	public void setMinAccountValueAmount(BigDecimal minAccountValueAmount) {
		this.minAccountValueAmount = minAccountValueAmount;
	}

	public BigDecimal getTotalCashCreditsAmount() {
		return this.totalCashCreditsAmount;
	}

	public void setTotalCashCreditsAmount(BigDecimal totalCashCreditsAmount) {
		this.totalCashCreditsAmount = totalCashCreditsAmount;
	}

	public BigDecimal getTotalCashDebitsAmount() {
		return this.totalCashDebitsAmount;
	}

	public void setTotalCashDebitsAmount(BigDecimal totalCashDebitsAmount) {
		this.totalCashDebitsAmount = totalCashDebitsAmount;
	}

	public BigDecimal getTotalCreditsAmount() {
		return this.totalCreditsAmount;
	}

	public void setTotalCreditsAmount(BigDecimal totalCreditsAmount) {
		this.totalCreditsAmount = totalCreditsAmount;
	}

	public BigDecimal getTotalDebitsAmount() {
		return this.totalDebitsAmount;
	}

	public void setTotalDebitsAmount(BigDecimal totalDebitsAmount) {
		this.totalDebitsAmount = totalDebitsAmount;
	}

	public BigDecimal getTotalTransactionsAmount() {
		return this.totalTransactionsAmount;
	}

	public void setTotalTransactionsAmount(BigDecimal totalTransactionsAmount) {
		this.totalTransactionsAmount = totalTransactionsAmount;
	}

	public BigDecimal getTotalWireCreditsAmount() {
		return this.totalWireCreditsAmount;
	}

	public void setTotalWireCreditsAmount(BigDecimal totalWireCreditsAmount) {
		this.totalWireCreditsAmount = totalWireCreditsAmount;
	}

	public BigDecimal getTotalWireDebitsAmount() {
		return this.totalWireDebitsAmount;
	}

	public void setTotalWireDebitsAmount(BigDecimal totalWireDebitsAmount) {
		this.totalWireDebitsAmount = totalWireDebitsAmount;
	}

	public BigDecimal getTransactionsCount() {
		return this.transactionsCount;
	}

	public void setTransactionsCount(BigDecimal transactionsCount) {
		this.transactionsCount = transactionsCount;
	}

	public BigDecimal getWiresCount() {
		return this.wiresCount;
	}

	public void setWiresCount(BigDecimal wiresCount) {
		this.wiresCount = wiresCount;
	}

	public BigDecimal getWithdrawalsCount() {
		return this.withdrawalsCount;
	}

	public void setWithdrawalsCount(BigDecimal withdrawalsCount) {
		this.withdrawalsCount = withdrawalsCount;
	}

}