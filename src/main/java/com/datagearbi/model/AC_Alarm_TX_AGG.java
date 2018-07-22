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
 * The persistent class for the AC_Alarm_TX_AGG database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Alarm_TX_AGG.findAll", query="SELECT a FROM AC_Alarm_TX_AGG a")
public class AC_Alarm_TX_AGG implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Alarm_Tx_Agg_Pk")
	private long alarm_Tx_Agg_Pk;

	@Column(name="Agg_amt")
	private BigDecimal agg_amt;

	@Column(name="Agg_Type_Cd")
	private String agg_Type_Cd;

	@Column(name="Alarm_Id")
	private BigDecimal alarm_Id;

	@Column(name="Create_Timestamp")
	private Timestamp create_Timestamp;

	@Column(name="Grp_Code")
	private String grp_Code;

	@Column(name="Grp_Desc")
	private String grp_Desc;

	public AC_Alarm_TX_AGG() {
	}

	public long getAlarm_Tx_Agg_Pk() {
		return this.alarm_Tx_Agg_Pk;
	}

	public void setAlarm_Tx_Agg_Pk(long alarm_Tx_Agg_Pk) {
		this.alarm_Tx_Agg_Pk = alarm_Tx_Agg_Pk;
	}

	public BigDecimal getAgg_amt() {
		return this.agg_amt;
	}

	public void setAgg_amt(BigDecimal agg_amt) {
		this.agg_amt = agg_amt;
	}

	public String getAgg_Type_Cd() {
		return this.agg_Type_Cd;
	}

	public void setAgg_Type_Cd(String agg_Type_Cd) {
		this.agg_Type_Cd = agg_Type_Cd;
	}

	public BigDecimal getAlarm_Id() {
		return this.alarm_Id;
	}

	public void setAlarm_Id(BigDecimal alarm_Id) {
		this.alarm_Id = alarm_Id;
	}

	public Timestamp getCreate_Timestamp() {
		return this.create_Timestamp;
	}

	public void setCreate_Timestamp(Timestamp create_Timestamp) {
		this.create_Timestamp = create_Timestamp;
	}

	public String getGrp_Code() {
		return this.grp_Code;
	}

	public void setGrp_Code(String grp_Code) {
		this.grp_Code = grp_Code;
	}

	public String getGrp_Desc() {
		return this.grp_Desc;
	}

	public void setGrp_Desc(String grp_Desc) {
		this.grp_Desc = grp_Desc;
	}

}