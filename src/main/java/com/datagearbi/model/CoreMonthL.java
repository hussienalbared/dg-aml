package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CORE_MONTH_L database table.
 * 
 */
@Entity
@Table(name="CORE_MONTH_L")
@NamedQuery(name="CoreMonthL.findAll", query="SELECT c FROM CoreMonthL c")
public class CoreMonthL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="month_key")
	private long monthKey;

	@Column(name="current_month_ind")
	private String currentMonthInd;

	@Column(name="month_and_year")
	private String monthAndYear;

	@Column(name="month_name")
	private String monthName;

	@Column(name="month_name_3c")
	private String monthName3c;

	@Column(name="quarter_name_2c")
	private String quarterName2c;

	@Column(name="quarter_name_4c")
	private String quarterName4c;

	@Column(name="year_2c")
	private String year2c;

	@Column(name="year_4c")
	private String year4c;

	public CoreMonthL() {
	}

	public long getMonthKey() {
		return this.monthKey;
	}

	public void setMonthKey(long monthKey) {
		this.monthKey = monthKey;
	}

	public String getCurrentMonthInd() {
		return this.currentMonthInd;
	}

	public void setCurrentMonthInd(String currentMonthInd) {
		this.currentMonthInd = currentMonthInd;
	}

	public String getMonthAndYear() {
		return this.monthAndYear;
	}

	public void setMonthAndYear(String monthAndYear) {
		this.monthAndYear = monthAndYear;
	}

	public String getMonthName() {
		return this.monthName;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	public String getMonthName3c() {
		return this.monthName3c;
	}

	public void setMonthName3c(String monthName3c) {
		this.monthName3c = monthName3c;
	}

	public String getQuarterName2c() {
		return this.quarterName2c;
	}

	public void setQuarterName2c(String quarterName2c) {
		this.quarterName2c = quarterName2c;
	}

	public String getQuarterName4c() {
		return this.quarterName4c;
	}

	public void setQuarterName4c(String quarterName4c) {
		this.quarterName4c = quarterName4c;
	}

	public String getYear2c() {
		return this.year2c;
	}

	public void setYear2c(String year2c) {
		this.year2c = year2c;
	}

	public String getYear4c() {
		return this.year4c;
	}

	public void setYear4c(String year4c) {
		this.year4c = year4c;
	}

}