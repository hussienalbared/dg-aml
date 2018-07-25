package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the AC_Job_Calendar database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Job_Calendar.findAll", query="SELECT a FROM AC_Job_Calendar a")
public class AC_Job_Calendar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Job_Calendar_Id")
	private int job_Calendar_Id;

	@Column(name="Business_Day_Count")
	private BigDecimal business_Day_Count;

	@Column(name="Calendar_Date")
	private Timestamp calendar_Date;

	@Column(name="Daily_Run_Date_Ind")
	private String daily_Run_Date_Ind;

	@Column(name="Monthly_Run_Date_Ind")
	private String monthly_Run_Date_Ind;

	@Column(name="Run_Date_Ind")
	private String run_Date_Ind;

	@Column(name="Status_Ind")
	private String status_Ind;

	@Column(name="Weekly_Run_Date_Ind")
	private String weekly_Run_Date_Ind;

	public AC_Job_Calendar() {
	}

	public int getJob_Calendar_Id() {
		return this.job_Calendar_Id;
	}

	public void setJob_Calendar_Id(int job_Calendar_Id) {
		this.job_Calendar_Id = job_Calendar_Id;
	}

	public BigDecimal getBusiness_Day_Count() {
		return this.business_Day_Count;
	}

	public void setBusiness_Day_Count(BigDecimal business_Day_Count) {
		this.business_Day_Count = business_Day_Count;
	}

	public Timestamp getCalendar_Date() {
		return this.calendar_Date;
	}

	public void setCalendar_Date(Timestamp calendar_Date) {
		this.calendar_Date = calendar_Date;
	}

	public String getDaily_Run_Date_Ind() {
		return this.daily_Run_Date_Ind;
	}

	public void setDaily_Run_Date_Ind(String daily_Run_Date_Ind) {
		this.daily_Run_Date_Ind = daily_Run_Date_Ind;
	}

	public String getMonthly_Run_Date_Ind() {
		return this.monthly_Run_Date_Ind;
	}

	public void setMonthly_Run_Date_Ind(String monthly_Run_Date_Ind) {
		this.monthly_Run_Date_Ind = monthly_Run_Date_Ind;
	}

	public String getRun_Date_Ind() {
		return this.run_Date_Ind;
	}

	public void setRun_Date_Ind(String run_Date_Ind) {
		this.run_Date_Ind = run_Date_Ind;
	}

	public String getStatus_Ind() {
		return this.status_Ind;
	}

	public void setStatus_Ind(String status_Ind) {
		this.status_Ind = status_Ind;
	}

	public String getWeekly_Run_Date_Ind() {
		return this.weekly_Run_Date_Ind;
	}

	public void setWeekly_Run_Date_Ind(String weekly_Run_Date_Ind) {
		this.weekly_Run_Date_Ind = weekly_Run_Date_Ind;
	}

}