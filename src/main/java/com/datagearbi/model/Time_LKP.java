package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the Time_LKP database table.
 * 
 */
@Entity
@NamedQuery(name="Time_LKP.findAll", query="SELECT t FROM Time_LKP t")
public class Time_LKP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Time_Key")
	private int time_Key;

	@Column(name="Time_AM_PM")
	private String time_AM_PM;

	@Column(name="Time_HH")
	private String time_HH;

	@Column(name="Time_HHMMSS")
	private String time_HHMMSS;

	@Column(name="Time_MM")
	private String time_MM;

	@Column(name="Time_SS")
	private String time_SS;

	public Time_LKP() {
	}

	public int getTime_Key() {
		return this.time_Key;
	}

	public void setTime_Key(int time_Key) {
		this.time_Key = time_Key;
	}

	public String getTime_AM_PM() {
		return this.time_AM_PM;
	}

	public void setTime_AM_PM(String time_AM_PM) {
		this.time_AM_PM = time_AM_PM;
	}

	public String getTime_HH() {
		return this.time_HH;
	}

	public void setTime_HH(String time_HH) {
		this.time_HH = time_HH;
	}

	public String getTime_HHMMSS() {
		return this.time_HHMMSS;
	}

	public void setTime_HHMMSS(String time_HHMMSS) {
		this.time_HHMMSS = time_HHMMSS;
	}

	public String getTime_MM() {
		return this.time_MM;
	}

	public void setTime_MM(String time_MM) {
		this.time_MM = time_MM;
	}

	public String getTime_SS() {
		return this.time_SS;
	}

	public void setTime_SS(String time_SS) {
		this.time_SS = time_SS;
	}

}