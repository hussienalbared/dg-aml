package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_JOB_CALENDAR database table.
 * 
 */
@Entity
@Table(name="AC_JOB_CALENDAR")
@NamedQuery(name="AcJobCalendar.findAll", query="SELECT a FROM AcJobCalendar a")
public class AcJobCalendar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="job_calendar_id")
	private long jobCalendarId;

	@Column(name="business_day_count")
	private BigDecimal businessDayCount;

	@Column(name="calendar_date")
	private Timestamp calendarDate;

	@Column(name="daily_rundate_ind")
	private String dailyRundateInd;

	@Column(name="monthly_rundate_ind")
	private String monthlyRundateInd;

	@Column(name="rundate_ind")
	private String rundateInd;

	@Column(name="status_ind")
	private String statusInd;

	@Column(name="weekly_rundate_ind")
	private String weeklyRundateInd;

	public AcJobCalendar() {
	}

	public long getJobCalendarId() {
		return this.jobCalendarId;
	}

	public void setJobCalendarId(long jobCalendarId) {
		this.jobCalendarId = jobCalendarId;
	}

	public BigDecimal getBusinessDayCount() {
		return this.businessDayCount;
	}

	public void setBusinessDayCount(BigDecimal businessDayCount) {
		this.businessDayCount = businessDayCount;
	}

	public Timestamp getCalendarDate() {
		return this.calendarDate;
	}

	public void setCalendarDate(Timestamp calendarDate) {
		this.calendarDate = calendarDate;
	}

	public String getDailyRundateInd() {
		return this.dailyRundateInd;
	}

	public void setDailyRundateInd(String dailyRundateInd) {
		this.dailyRundateInd = dailyRundateInd;
	}

	public String getMonthlyRundateInd() {
		return this.monthlyRundateInd;
	}

	public void setMonthlyRundateInd(String monthlyRundateInd) {
		this.monthlyRundateInd = monthlyRundateInd;
	}

	public String getRundateInd() {
		return this.rundateInd;
	}

	public void setRundateInd(String rundateInd) {
		this.rundateInd = rundateInd;
	}

	public String getStatusInd() {
		return this.statusInd;
	}

	public void setStatusInd(String statusInd) {
		this.statusInd = statusInd;
	}

	public String getWeeklyRundateInd() {
		return this.weeklyRundateInd;
	}

	public void setWeeklyRundateInd(String weeklyRundateInd) {
		this.weeklyRundateInd = weeklyRundateInd;
	}

}