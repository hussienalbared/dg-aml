package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CORE_TIME_L database table.
 * 
 */
@Entity
@Table(name="CORE_TIME_L")
@NamedQuery(name="CoreTimeL.findAll", query="SELECT c FROM CoreTimeL c")
public class CoreTimeL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="time_key")
	private long timeKey;

	@Column(name="time_am_pm")
	private String timeAmPm;

	@Column(name="time_hh")
	private String timeHh;

	@Column(name="time_hhmmss")
	private String timeHhmmss;

	@Column(name="time_mm")
	private String timeMm;

	@Column(name="time_ss")
	private String timeSs;

	public CoreTimeL() {
	}

	public long getTimeKey() {
		return this.timeKey;
	}

	public void setTimeKey(long timeKey) {
		this.timeKey = timeKey;
	}

	public String getTimeAmPm() {
		return this.timeAmPm;
	}

	public void setTimeAmPm(String timeAmPm) {
		this.timeAmPm = timeAmPm;
	}

	public String getTimeHh() {
		return this.timeHh;
	}

	public void setTimeHh(String timeHh) {
		this.timeHh = timeHh;
	}

	public String getTimeHhmmss() {
		return this.timeHhmmss;
	}

	public void setTimeHhmmss(String timeHhmmss) {
		this.timeHhmmss = timeHhmmss;
	}

	public String getTimeMm() {
		return this.timeMm;
	}

	public void setTimeMm(String timeMm) {
		this.timeMm = timeMm;
	}

	public String getTimeSs() {
		return this.timeSs;
	}

	public void setTimeSs(String timeSs) {
		this.timeSs = timeSs;
	}

}