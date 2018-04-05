package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the CORE_DATE_L database table.
 * 
 */
@Entity
@Table(name="CORE_DATE_L")
@NamedQuery(name="CoreDateL.findAll", query="SELECT c FROM CoreDateL c")
public class CoreDateL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="date_key")
	private long dateKey;

	@Column(name="calendar_date")
	private Timestamp calendarDate;

	@Column(name="calendar_date_dmy")
	private String calendarDateDmy;

	@Column(name="calendar_date_sas")
	private BigDecimal calendarDateSas;

	@Column(name="day_name")
	private String dayName;

	@Column(name="day_name_short")
	private String dayNameShort;

	@Column(name="day_number_in_month")
	private BigDecimal dayNumberInMonth;

	@Column(name="day_number_in_year")
	private BigDecimal dayNumberInYear;

	@Column(name="economic_event_desc")
	private String economicEventDesc;

	@Column(name="economic_release_desc")
	private String economicReleaseDesc;

	@Column(name="end_of_month_ind")
	private String endOfMonthInd;

	@Column(name="holiday_ind")
	private String holidayInd;

	@Column(name="holiday_name")
	private String holidayName;

	@Column(name="month_and_year")
	private String monthAndYear;

	@Column(name="month_key")
	private BigDecimal monthKey;

	@Column(name="month_name")
	private String monthName;

	@Column(name="month_name_3c")
	private String monthName3c;

	@Column(name="month_name_short")
	private String monthNameShort;

	@Column(name="month_number_in_year")
	private BigDecimal monthNumberInYear;

	@Column(name="quarter_and_year")
	private String quarterAndYear;

	@Column(name="quarter_name")
	private String quarterName;

	@Column(name="quarter_name_2c")
	private String quarterName2c;

	@Column(name="quarter_name_4c")
	private String quarterName4c;

	@Column(name="week_day_ind")
	private String weekDayInd;

	@Column(name="week_number_in_month")
	private BigDecimal weekNumberInMonth;

	@Column(name="week_number_in_year")
	private BigDecimal weekNumberInYear;

	@Column(name="year_2c")
	private String year2c;

	@Column(name="year_4c")
	private String year4c;

	public CoreDateL() {
	}

	public long getDateKey() {
		return this.dateKey;
	}

	public void setDateKey(long dateKey) {
		this.dateKey = dateKey;
	}

	public Timestamp getCalendarDate() {
		return this.calendarDate;
	}

	public void setCalendarDate(Timestamp calendarDate) {
		this.calendarDate = calendarDate;
	}

	public String getCalendarDateDmy() {
		return this.calendarDateDmy;
	}

	public void setCalendarDateDmy(String calendarDateDmy) {
		this.calendarDateDmy = calendarDateDmy;
	}

	public BigDecimal getCalendarDateSas() {
		return this.calendarDateSas;
	}

	public void setCalendarDateSas(BigDecimal calendarDateSas) {
		this.calendarDateSas = calendarDateSas;
	}

	public String getDayName() {
		return this.dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public String getDayNameShort() {
		return this.dayNameShort;
	}

	public void setDayNameShort(String dayNameShort) {
		this.dayNameShort = dayNameShort;
	}

	public BigDecimal getDayNumberInMonth() {
		return this.dayNumberInMonth;
	}

	public void setDayNumberInMonth(BigDecimal dayNumberInMonth) {
		this.dayNumberInMonth = dayNumberInMonth;
	}

	public BigDecimal getDayNumberInYear() {
		return this.dayNumberInYear;
	}

	public void setDayNumberInYear(BigDecimal dayNumberInYear) {
		this.dayNumberInYear = dayNumberInYear;
	}

	public String getEconomicEventDesc() {
		return this.economicEventDesc;
	}

	public void setEconomicEventDesc(String economicEventDesc) {
		this.economicEventDesc = economicEventDesc;
	}

	public String getEconomicReleaseDesc() {
		return this.economicReleaseDesc;
	}

	public void setEconomicReleaseDesc(String economicReleaseDesc) {
		this.economicReleaseDesc = economicReleaseDesc;
	}

	public String getEndOfMonthInd() {
		return this.endOfMonthInd;
	}

	public void setEndOfMonthInd(String endOfMonthInd) {
		this.endOfMonthInd = endOfMonthInd;
	}

	public String getHolidayInd() {
		return this.holidayInd;
	}

	public void setHolidayInd(String holidayInd) {
		this.holidayInd = holidayInd;
	}

	public String getHolidayName() {
		return this.holidayName;
	}

	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}

	public String getMonthAndYear() {
		return this.monthAndYear;
	}

	public void setMonthAndYear(String monthAndYear) {
		this.monthAndYear = monthAndYear;
	}

	public BigDecimal getMonthKey() {
		return this.monthKey;
	}

	public void setMonthKey(BigDecimal monthKey) {
		this.monthKey = monthKey;
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

	public String getMonthNameShort() {
		return this.monthNameShort;
	}

	public void setMonthNameShort(String monthNameShort) {
		this.monthNameShort = monthNameShort;
	}

	public BigDecimal getMonthNumberInYear() {
		return this.monthNumberInYear;
	}

	public void setMonthNumberInYear(BigDecimal monthNumberInYear) {
		this.monthNumberInYear = monthNumberInYear;
	}

	public String getQuarterAndYear() {
		return this.quarterAndYear;
	}

	public void setQuarterAndYear(String quarterAndYear) {
		this.quarterAndYear = quarterAndYear;
	}

	public String getQuarterName() {
		return this.quarterName;
	}

	public void setQuarterName(String quarterName) {
		this.quarterName = quarterName;
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

	public String getWeekDayInd() {
		return this.weekDayInd;
	}

	public void setWeekDayInd(String weekDayInd) {
		this.weekDayInd = weekDayInd;
	}

	public BigDecimal getWeekNumberInMonth() {
		return this.weekNumberInMonth;
	}

	public void setWeekNumberInMonth(BigDecimal weekNumberInMonth) {
		this.weekNumberInMonth = weekNumberInMonth;
	}

	public BigDecimal getWeekNumberInYear() {
		return this.weekNumberInYear;
	}

	public void setWeekNumberInYear(BigDecimal weekNumberInYear) {
		this.weekNumberInYear = weekNumberInYear;
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