package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Date_LKP database table.
 * 
 */
@Entity
@NamedQuery(name="Date_LKP.findAll", query="SELECT d FROM Date_LKP d")
public class Date_LKP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Date_Key")
	private int date_Key;

	@Column(name="Calendar_Date")
	private Timestamp calendar_Date;

	@Column(name="Calendar_Dt_Dmy")
	private String calendar_Dt_Dmy;

	@Column(name="Calendar_Dt_SAS")
	private int calendar_Dt_SAS;

	@Column(name="Day_Name")
	private String day_Name;

	@Column(name="Day_Name_Short")
	private String day_Name_Short;

	@Column(name="Day_No_In_Month")
	private int day_No_In_Month;

	@Column(name="Day_No_In_Year")
	private int day_No_In_Year;

	@Column(name="Eco_Event_Desc")
	private String eco_Event_Desc;

	@Column(name="Eco_Release_Desc")
	private String eco_Release_Desc;

	@Column(name="End_Month_Ind")
	private String end_Month_Ind;

	@Column(name="Holiday_Ind")
	private String holiday_Ind;

	@Column(name="Holiday_Name")
	private String holiday_Name;

	@Column(name="Month_And_Year")
	private String month_And_Year;

	@Column(name="Month_Key")
	private int month_Key;

	@Column(name="Month_Name")
	private String month_Name;

	@Column(name="Month_Name_3C")
	private String month_Name_3C;

	@Column(name="Month_Name_Short")
	private String month_Name_Short;

	@Column(name="Month_No_In_Year")
	private int month_No_In_Year;

	@Column(name="Quart_And_Year")
	private String quart_And_Year;

	@Column(name="Quart_Name")
	private String quart_Name;

	@Column(name="Quart_Name_2C")
	private String quart_Name_2C;

	@Column(name="Quart_Name_4C")
	private String quart_Name_4C;

	@Column(name="Week_Day_Ind")
	private String week_Day_Ind;

	@Column(name="Week_No_In_Month")
	private int week_No_In_Month;

	@Column(name="Week_No_In_Year")
	private int week_No_In_Year;

	@Column(name="Year_2C")
	private String year_2C;

	@Column(name="Year_4C")
	private String year_4C;

	public Date_LKP() {
	}

	public int getDate_Key() {
		return this.date_Key;
	}

	public void setDate_Key(int date_Key) {
		this.date_Key = date_Key;
	}

	public Timestamp getCalendar_Date() {
		return this.calendar_Date;
	}

	public void setCalendar_Date(Timestamp calendar_Date) {
		this.calendar_Date = calendar_Date;
	}

	public String getCalendar_Dt_Dmy() {
		return this.calendar_Dt_Dmy;
	}

	public void setCalendar_Dt_Dmy(String calendar_Dt_Dmy) {
		this.calendar_Dt_Dmy = calendar_Dt_Dmy;
	}

	public int getCalendar_Dt_SAS() {
		return this.calendar_Dt_SAS;
	}

	public void setCalendar_Dt_SAS(int calendar_Dt_SAS) {
		this.calendar_Dt_SAS = calendar_Dt_SAS;
	}

	public String getDay_Name() {
		return this.day_Name;
	}

	public void setDay_Name(String day_Name) {
		this.day_Name = day_Name;
	}

	public String getDay_Name_Short() {
		return this.day_Name_Short;
	}

	public void setDay_Name_Short(String day_Name_Short) {
		this.day_Name_Short = day_Name_Short;
	}

	public int getDay_No_In_Month() {
		return this.day_No_In_Month;
	}

	public void setDay_No_In_Month(int day_No_In_Month) {
		this.day_No_In_Month = day_No_In_Month;
	}

	public int getDay_No_In_Year() {
		return this.day_No_In_Year;
	}

	public void setDay_No_In_Year(int day_No_In_Year) {
		this.day_No_In_Year = day_No_In_Year;
	}

	public String getEco_Event_Desc() {
		return this.eco_Event_Desc;
	}

	public void setEco_Event_Desc(String eco_Event_Desc) {
		this.eco_Event_Desc = eco_Event_Desc;
	}

	public String getEco_Release_Desc() {
		return this.eco_Release_Desc;
	}

	public void setEco_Release_Desc(String eco_Release_Desc) {
		this.eco_Release_Desc = eco_Release_Desc;
	}

	public String getEnd_Month_Ind() {
		return this.end_Month_Ind;
	}

	public void setEnd_Month_Ind(String end_Month_Ind) {
		this.end_Month_Ind = end_Month_Ind;
	}

	public String getHoliday_Ind() {
		return this.holiday_Ind;
	}

	public void setHoliday_Ind(String holiday_Ind) {
		this.holiday_Ind = holiday_Ind;
	}

	public String getHoliday_Name() {
		return this.holiday_Name;
	}

	public void setHoliday_Name(String holiday_Name) {
		this.holiday_Name = holiday_Name;
	}

	public String getMonth_And_Year() {
		return this.month_And_Year;
	}

	public void setMonth_And_Year(String month_And_Year) {
		this.month_And_Year = month_And_Year;
	}

	public int getMonth_Key() {
		return this.month_Key;
	}

	public void setMonth_Key(int month_Key) {
		this.month_Key = month_Key;
	}

	public String getMonth_Name() {
		return this.month_Name;
	}

	public void setMonth_Name(String month_Name) {
		this.month_Name = month_Name;
	}

	public String getMonth_Name_3C() {
		return this.month_Name_3C;
	}

	public void setMonth_Name_3C(String month_Name_3C) {
		this.month_Name_3C = month_Name_3C;
	}

	public String getMonth_Name_Short() {
		return this.month_Name_Short;
	}

	public void setMonth_Name_Short(String month_Name_Short) {
		this.month_Name_Short = month_Name_Short;
	}

	public int getMonth_No_In_Year() {
		return this.month_No_In_Year;
	}

	public void setMonth_No_In_Year(int month_No_In_Year) {
		this.month_No_In_Year = month_No_In_Year;
	}

	public String getQuart_And_Year() {
		return this.quart_And_Year;
	}

	public void setQuart_And_Year(String quart_And_Year) {
		this.quart_And_Year = quart_And_Year;
	}

	public String getQuart_Name() {
		return this.quart_Name;
	}

	public void setQuart_Name(String quart_Name) {
		this.quart_Name = quart_Name;
	}

	public String getQuart_Name_2C() {
		return this.quart_Name_2C;
	}

	public void setQuart_Name_2C(String quart_Name_2C) {
		this.quart_Name_2C = quart_Name_2C;
	}

	public String getQuart_Name_4C() {
		return this.quart_Name_4C;
	}

	public void setQuart_Name_4C(String quart_Name_4C) {
		this.quart_Name_4C = quart_Name_4C;
	}

	public String getWeek_Day_Ind() {
		return this.week_Day_Ind;
	}

	public void setWeek_Day_Ind(String week_Day_Ind) {
		this.week_Day_Ind = week_Day_Ind;
	}

	public int getWeek_No_In_Month() {
		return this.week_No_In_Month;
	}

	public void setWeek_No_In_Month(int week_No_In_Month) {
		this.week_No_In_Month = week_No_In_Month;
	}

	public int getWeek_No_In_Year() {
		return this.week_No_In_Year;
	}

	public void setWeek_No_In_Year(int week_No_In_Year) {
		this.week_No_In_Year = week_No_In_Year;
	}

	public String getYear_2C() {
		return this.year_2C;
	}

	public void setYear_2C(String year_2C) {
		this.year_2C = year_2C;
	}

	public String getYear_4C() {
		return this.year_4C;
	}

	public void setYear_4C(String year_4C) {
		this.year_4C = year_4C;
	}

}