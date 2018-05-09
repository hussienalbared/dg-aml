package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Month_LKP database table.
 * 
 */
@Entity
@NamedQuery(name="Month_LKP.findAll", query="SELECT m FROM Month_LKP m")
public class Month_LKP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Month_Key")
	private int month_Key;

	@Column(name="Current_Month_Ind")
	private String current_Month_Ind;

	@Column(name="Month_And_Year")
	private String month_And_Year;

	@Column(name="Month_Name")
	private String month_Name;

	@Column(name="Month_Name_3C")
	private String month_Name_3C;

	@Column(name="Quarter_Name_2C")
	private String quarter_Name_2C;

	@Column(name="Quarter_Name_4C")
	private String quarter_Name_4C;

	@Column(name="Year_2C")
	private String year_2C;

	@Column(name="Year_4C")
	private String year_4C;

	public Month_LKP() {
	}

	public int getMonth_Key() {
		return this.month_Key;
	}

	public void setMonth_Key(int month_Key) {
		this.month_Key = month_Key;
	}

	public String getCurrent_Month_Ind() {
		return this.current_Month_Ind;
	}

	public void setCurrent_Month_Ind(String current_Month_Ind) {
		this.current_Month_Ind = current_Month_Ind;
	}

	public String getMonth_And_Year() {
		return this.month_And_Year;
	}

	public void setMonth_And_Year(String month_And_Year) {
		this.month_And_Year = month_And_Year;
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

	public String getQuarter_Name_2C() {
		return this.quarter_Name_2C;
	}

	public void setQuarter_Name_2C(String quarter_Name_2C) {
		this.quarter_Name_2C = quarter_Name_2C;
	}

	public String getQuarter_Name_4C() {
		return this.quarter_Name_4C;
	}

	public void setQuarter_Name_4C(String quarter_Name_4C) {
		this.quarter_Name_4C = quarter_Name_4C;
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