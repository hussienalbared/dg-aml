package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the AC_Acct_Event_Alarm database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Acct_Event_Alarm.findAll", query="SELECT a FROM AC_Acct_Event_Alarm a")
public class AC_Acct_Event_Alarm implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AC_Acct_Event_AlarmPK id;

	@Column(name="Acct_Key")
	private BigDecimal acct_Key;

	@Column(name="Branch_Key")
	private BigDecimal branch_Key;

	@Column(name="Cntry_Key")
	private int cntry_Key;

	@Column(name="Date_Key")
	private int date_Key;

	@Column(name="Time_Key")
	private int time_Key;

	@Column(name="Trans_Status_Key")
	private int trans_Status_Key;

	@Column(name="Trans_Type_Key")
	private BigDecimal trans_Type_Key;

	@Column(name="Trig_Ind")
	private String trig_Ind;

	public AC_Acct_Event_Alarm() {
	}

	public AC_Acct_Event_AlarmPK getId() {
		return this.id;
	}

	public void setId(AC_Acct_Event_AlarmPK id) {
		this.id = id;
	}

	public BigDecimal getAcct_Key() {
		return this.acct_Key;
	}

	public void setAcct_Key(BigDecimal acct_Key) {
		this.acct_Key = acct_Key;
	}

	public BigDecimal getBranch_Key() {
		return this.branch_Key;
	}

	public void setBranch_Key(BigDecimal branch_Key) {
		this.branch_Key = branch_Key;
	}

	public int getCntry_Key() {
		return this.cntry_Key;
	}

	public void setCntry_Key(int cntry_Key) {
		this.cntry_Key = cntry_Key;
	}

	public int getDate_Key() {
		return this.date_Key;
	}

	public void setDate_Key(int date_Key) {
		this.date_Key = date_Key;
	}

	public int getTime_Key() {
		return this.time_Key;
	}

	public void setTime_Key(int time_Key) {
		this.time_Key = time_Key;
	}

	public int getTrans_Status_Key() {
		return this.trans_Status_Key;
	}

	public void setTrans_Status_Key(int trans_Status_Key) {
		this.trans_Status_Key = trans_Status_Key;
	}

	public BigDecimal getTrans_Type_Key() {
		return this.trans_Type_Key;
	}

	public void setTrans_Type_Key(BigDecimal trans_Type_Key) {
		this.trans_Type_Key = trans_Type_Key;
	}

	public String getTrig_Ind() {
		return this.trig_Ind;
	}

	public void setTrig_Ind(String trig_Ind) {
		this.trig_Ind = trig_Ind;
	}

}